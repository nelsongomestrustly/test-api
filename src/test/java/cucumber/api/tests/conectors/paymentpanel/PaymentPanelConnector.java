package cucumber.api.tests.conectors.paymentpanel;

import cucumber.api.tests.common.enums.headers.HttpHeadersEnum;
import cucumber.api.tests.common.enums.queries.QueryParametersEnum;
import cucumber.api.tests.configurations.resttemplate.common.enums.StatefulRestTemplateInterceptorKeyEnums;
import cucumber.api.tests.data.dto.frontend.FrontEndSetupDTO;
import cucumber.api.tests.data.dto.merchantdemo.MerchantCreateSignatureDTO;
import cucumber.api.tests.data.dto.token.TokenDTO;
import cucumber.api.tests.support.common.connectors.resttemplate.RestTemplateHttpConnector;
import cucumber.api.tests.common.paymentpanel.supplier.html.PaymentPanelCreateWidgetQueryParamSupplier;
import cucumber.api.tests.common.paymentpanel.supplier.html.PaymentPanelGetPaymentPanelSupplier;
import cucumber.api.tests.common.paymentpanel.supplier.html.PaymentPanelSelectSelectBankQueryParamSupplier;
import cucumber.api.tests.data.dto.paymentpanel.PaymentPanelCreateWidgetDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.List;

import static cucumber.api.tests.conectors.paymentpanel.PaymentPanelEndpoint.PAYMENT_PANEL_SELECT_BANK_ENDPOINT;
import static cucumber.api.tests.conectors.paymentpanel.PaymentPanelEndpoint.PAYMENT_PANEL_SELECT_BANK_SELECT_BANK_ENDPOINT;
import static cucumber.api.tests.conectors.paymentpanel.PaymentPanelEndpoint.PAYMENT_PANEL_SELECT_BANK_WIDGET_ENDPOINT;

@Slf4j
public class PaymentPanelConnector {


    public static ResponseEntity<String> getSelectBankRedirectUrl(
            MerchantCreateSignatureDTO merchantCreateSignatureDTO,
            FrontEndSetupDTO frontEndSetupDTO,
            TokenDTO tokenDTO,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) {

        HashMap<QueryParametersEnum, String> loginMultiValueMapForHttpRequest
                = PaymentPanelSelectSelectBankQueryParamSupplier.getLoginMultiValueMapForHttpRequest(
                        merchantCreateSignatureDTO,
                        frontEndSetupDTO,
                        tokenDTO);

        return RestTemplateHttpConnector.httpPost(
                PAYMENT_PANEL_SELECT_BANK_SELECT_BANK_ENDPOINT.getEndpoint(),
                loginMultiValueMapForHttpRequest,
                List.of(HttpHeadersEnum.ACCEPT_APPLICATION_JSON_APP_REACT),
                statefulRestTemplateInterceptorKeyEnums);

    }


    public static ResponseEntity<String> getPaymentPanelWidget(
            PaymentPanelCreateWidgetDTO paymentPanelCreateWidgetDTO,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) {

        HashMap<QueryParametersEnum, String> loginMultiValueMapForHttpRequest = PaymentPanelCreateWidgetQueryParamSupplier.getLoginMultiValueMapForHttpRequest(paymentPanelCreateWidgetDTO);

        return RestTemplateHttpConnector.httpPost(
                PAYMENT_PANEL_SELECT_BANK_WIDGET_ENDPOINT.getEndpoint(),
                loginMultiValueMapForHttpRequest,
                List.of(HttpHeadersEnum.ACCEPT_APPLICATION_JSON_APP_REACT),
                statefulRestTemplateInterceptorKeyEnums);

    }


    //Creates de Transaction
    public static ResponseEntity<String> getPaymentPanel(
            MerchantCreateSignatureDTO merchantCreateSignatureDTO,
            PaymentPanelCreateWidgetDTO firstPaymentPanelCreateWidgetDTO,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) {

        HashMap<QueryParametersEnum, String> loginMultiValueMapForHttpRequest =
                PaymentPanelGetPaymentPanelSupplier.getMultiValueMapForHttpRequest(
                        firstPaymentPanelCreateWidgetDTO,
                        merchantCreateSignatureDTO);

        return RestTemplateHttpConnector.httpPost(
                PAYMENT_PANEL_SELECT_BANK_ENDPOINT.getEndpoint(),
                loginMultiValueMapForHttpRequest,
                //List.of(HttpHeadersEnum.ACCEPT_APPLICATION_JSON_APP_REACT),
                statefulRestTemplateInterceptorKeyEnums);

    }

}
