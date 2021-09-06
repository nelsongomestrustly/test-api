package cucumber.api.tests.test.bankpanel.actions;

import cucumber.api.tests.common.enums.headers.HttpHeadersEnum;
import cucumber.api.tests.common.enums.queries.QueryParametersEnum;
import cucumber.api.tests.common.mappers.HttpMappers;
import cucumber.api.tests.common.suppliers.StringSuppliers;
import cucumber.api.tests.configurations.resttemplate.common.enums.StatefulRestTemplateInterceptorKeyEnums;
import cucumber.api.tests.data.dto.bankpanel.BankPanelRedirectUrlDTO;
import cucumber.api.tests.data.dto.bankpanel.accounts.BankPanelAccountLoginDTO;
import cucumber.api.tests.data.dto.bankpanel.login.BankPanelLoginHomePageDTO;
import cucumber.api.tests.data.dto.bankpanel.login.BankPanelLoginInfoDTO;
import cucumber.api.tests.data.dto.frontend.FrontEndSetupDTO;
import cucumber.api.tests.data.dto.merchantdemo.MerchantCreateSignatureDTO;
import cucumber.api.tests.support.common.connectors.resttemplate.RestTemplateHttpConnector;
import cucumber.api.tests.test.bankpanel.common.suppliers.BankPanelSelectAccountsSupplier;
import cucumber.api.tests.test.bankpanel.connectors.BankPanelConnector;
import cucumber.api.tests.validations.resttemplate.RestTemplateValidations;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.List;

import static cucumber.api.tests.test.bankpanel.connectors.BankPanelEndpoint.BANK_PANEL_ENDPOINT_ACCOUNT_AUTHORIZE;


@Slf4j
public class BankPanelHttpActions {

    /**
     * Login Info - Bank Panel
     */

    public static BankPanelLoginInfoDTO getBankPanelLoginInfoDTO(
            BankPanelRedirectUrlDTO bankPanelRedirectUrlDTO,
            Integer expectHttpStatus,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) throws IOException {

        ResponseEntity<String> responseEntity = BankPanelConnector.getBankPanelLoginInfoDTO(bankPanelRedirectUrlDTO, statefulRestTemplateInterceptorKeyEnums);

        RestTemplateValidations.validateStatus(expectHttpStatus, responseEntity);

        return HttpMappers.readResponse(responseEntity, BankPanelLoginInfoDTO.class);

    }


    /**
     * Login Home Page  - Bank Panel
     */

    public static BankPanelLoginHomePageDTO getBankPanelLoginHomePageDTO(
            BankPanelRedirectUrlDTO bankPanelRedirectUrlDTO,
            Integer expectHttpStatus,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) throws IOException {

        ResponseEntity<String> responseEntity = BankPanelConnector.getBankPanelLoginHomePageDTO(bankPanelRedirectUrlDTO, statefulRestTemplateInterceptorKeyEnums);

        RestTemplateValidations.validateStatus(expectHttpStatus, responseEntity);

        return BankPanelLoginHomePageDTO
                .builder()
                .bankPanelLoginHomePage(responseEntity.getBody())
                .build();

    }


    /**
     * Login Info - Bank Panel
     */

    public static BankPanelAccountLoginDTO getBankPanelAccountLoginDTO(
            String username,
            String password,
            BankPanelLoginInfoDTO bankPanelLoginInfoDTO,
            FrontEndSetupDTO frontEndSetupDTO,
            Integer expectHttpStatus,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) throws IOException, URISyntaxException {

        ResponseEntity<String> responseEntity = BankPanelConnector.getBankPanelAccountLoginDTO(
                username,
                password,
                bankPanelLoginInfoDTO,
                frontEndSetupDTO,
                statefulRestTemplateInterceptorKeyEnums);

        RestTemplateValidations.validateStatus(expectHttpStatus, responseEntity);

        return HttpMappers.readResponse(responseEntity, BankPanelAccountLoginDTO.class);

    }


    /**
     * Bank Panel Select Account and Confirm Transaction
     */

    public static void selectAnAccountAndConfirmTransaction(
            Integer selectedAccount,
            BankPanelLoginInfoDTO bankPanelLoginInfoDTO,
            FrontEndSetupDTO frontEndSetupDTO,
            Integer expectHttpStatus,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) throws IOException, URISyntaxException {

        ResponseEntity<String> responseEntity = BankPanelConnector.selectAnAccountAndConfirmTransaction(
                selectedAccount,
                bankPanelLoginInfoDTO,
                frontEndSetupDTO,
                statefulRestTemplateInterceptorKeyEnums);

        RestTemplateValidations.validateStatus(expectHttpStatus, responseEntity);

    }


}
