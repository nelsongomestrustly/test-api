package cucumber.api.tests.test.bankpanel.connectors;


import cucumber.api.tests.common.enums.headers.HttpHeadersEnum;
import cucumber.api.tests.common.enums.queries.QueryParametersEnum;
import cucumber.api.tests.common.suppliers.StringSuppliers;
import cucumber.api.tests.configurations.resttemplate.common.enums.StatefulRestTemplateInterceptorKeyEnums;
import cucumber.api.tests.data.dto.bankpanel.BankPanelRedirectUrlDTO;
import cucumber.api.tests.data.dto.bankpanel.login.BankPanelLoginInfoDTO;
import cucumber.api.tests.data.dto.frontend.FrontEndSetupDTO;
import cucumber.api.tests.data.dto.merchantdemo.MerchantCreateSignatureDTO;
import cucumber.api.tests.support.common.connectors.apache.ApacheConnectionManager;
import cucumber.api.tests.support.common.connectors.resttemplate.RestTemplateHttpConnector;
import cucumber.api.tests.test.bankpanel.common.suppliers.BankPanelLoginAccountsSupplier;
import cucumber.api.tests.test.bankpanel.common.suppliers.BankPanelSelectAccountsSupplier;
import cucumber.api.tests.test.merchantdemo.common.suppliers.html.CreateSignatureSupplier;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.List;

import static cucumber.api.tests.test.bankpanel.connectors.BankPanelEndpoint.BANK_PANEL_ENDPOINT_ACCOUNT_AUTHORIZE;
import static cucumber.api.tests.test.bankpanel.connectors.BankPanelEndpoint.BANK_PANEL_ENDPOINT_AUTHENTICATION_AUTHENTICATION;

@Slf4j
public class BankPanelConnector {

    public static ResponseEntity<String> getBankPanelLoginInfoDTO(
            BankPanelRedirectUrlDTO bankRedirectUrlDT,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) {

        return RestTemplateHttpConnector.httpPost(
                bankRedirectUrlDT.getRedirectURL(),
                List.of(HttpHeadersEnum.ACCEPT_APPLICATION_JSON_APP_REACT),
                statefulRestTemplateInterceptorKeyEnums);

    }

    public static ResponseEntity<String> getBankPanelLoginHomePageDTO(
            BankPanelRedirectUrlDTO bankRedirectUrlDT,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) {

        return RestTemplateHttpConnector.httpPost(
                bankRedirectUrlDT.getRedirectURL(),
                statefulRestTemplateInterceptorKeyEnums);

    }


    //In this step you are going to login and them get Bank Accounts
    public static ResponseEntity<String> getBankPanelAccountLoginDTO(
            String username,
            String password,
            BankPanelLoginInfoDTO bankPanelLoginInfoDTO,
            FrontEndSetupDTO frontEndSetupDTO,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) throws IOException, URISyntaxException {

        HashMap<QueryParametersEnum, String> loginMultiValueMapForHttpRequest =
                BankPanelLoginAccountsSupplier.getLoginMultiValueMapForHttpRequest(
                        username,
                        password,
                        bankPanelLoginInfoDTO,
                        frontEndSetupDTO);

        return RestTemplateHttpConnector.httpPost(
                StringSuppliers.getStringFormatted(BANK_PANEL_ENDPOINT_AUTHENTICATION_AUTHENTICATION.getEndpoint(), frontEndSetupDTO.getTransaction().getBankId()),
                loginMultiValueMapForHttpRequest,
                List.of(HttpHeadersEnum.ACCEPT_APPLICATION_JSON_APP_REACT),
                statefulRestTemplateInterceptorKeyEnums);

    }


    //In this step you are going to select an account and finaly finish the transaction
    public static ResponseEntity<String> selectAnAccountAndConfirmTransaction(
            Integer selectedAccount,
            BankPanelLoginInfoDTO bankPanelLoginInfoDTO,
            FrontEndSetupDTO frontEndSetupDTO,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) throws IOException, URISyntaxException {

        HashMap<QueryParametersEnum, String> loginMultiValueMapForHttpRequest =
                BankPanelSelectAccountsSupplier.getLoginMultiValueMapForHttpRequest(
                        selectedAccount,
                        bankPanelLoginInfoDTO,
                        frontEndSetupDTO);

        return RestTemplateHttpConnector.httpPost(
                StringSuppliers.getStringFormatted(BANK_PANEL_ENDPOINT_ACCOUNT_AUTHORIZE.getEndpoint(), frontEndSetupDTO.getTransaction().getBankId()),
                loginMultiValueMapForHttpRequest,
                List.of(HttpHeadersEnum.ACCEPT_APPLICATION_JSON_APP_REACT),
                statefulRestTemplateInterceptorKeyEnums);

    }


}
