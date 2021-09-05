package cucumber.api.tests.test.paymentpanel.connectors;

import cucumber.api.tests.common.enums.queries.QueryParametersEnum;
import cucumber.api.tests.configurations.resttemplate.common.enums.StatefulRestTemplateInterceptorKeyEnums;
import cucumber.api.tests.data.dto.merchantdemo.MerchantCreateSignatureDTO;
import cucumber.api.tests.support.common.connectors.resttemplate.RestTemplateHttpConnector;
import cucumber.api.tests.test.merchantdemo.common.suppliers.html.CreateSignatureSupplier;
import cucumber.api.tests.test.paymentpanel.common.supplier.html.PaymentPanelCreateWidgetQueryParamSupplier;
import cucumber.api.tests.test.paymentpanel.common.supplier.html.PaymentPanelSelectBankQueryParamSupplier;
import cucumber.api.tests.data.dto.paymentpanel.PaymentPanelCreateWidgetDTO;
import cucumber.api.tests.data.dto.paymentpanel.PaymentPanelSelectBankDTO;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;

import static cucumber.api.tests.test.paymentpanel.connectors.PaymentPanelEndpoint.PAYMENT_PANEL_SELECT_BANK_ENDPOINT;
import static cucumber.api.tests.test.paymentpanel.connectors.PaymentPanelEndpoint.PAYMENT_PANEL_SELECT_BANK_WIDGET_ENDPOINT;

public class PaymentPanelConnector {


    public static ResponseEntity<String> getSelectBankRedirectUrl(
            MerchantCreateSignatureDTO merchantCreateSignatureDTO,
            PaymentPanelSelectBankDTO paymentPanelSelectBankDTO,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) {

        HashMap<QueryParametersEnum, String> loginMultiValueMapForHttpRequest
                = PaymentPanelSelectBankQueryParamSupplier.getLoginMultiValueMapForHttpRequest(
                        merchantCreateSignatureDTO,
                        paymentPanelSelectBankDTO);

        return RestTemplateHttpConnector.httpPost(
                PAYMENT_PANEL_SELECT_BANK_ENDPOINT.getEndpoint(),
                loginMultiValueMapForHttpRequest,
                statefulRestTemplateInterceptorKeyEnums);

    }


    public static ResponseEntity<String> getPaymentPanelWidget(
            PaymentPanelCreateWidgetDTO paymentPanelCreateWidgetDTO,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) {

        HashMap<QueryParametersEnum, String> loginMultiValueMapForHttpRequest = PaymentPanelCreateWidgetQueryParamSupplier.getLoginMultiValueMapForHttpRequest(paymentPanelCreateWidgetDTO);

        return RestTemplateHttpConnector.httpPost(
                PAYMENT_PANEL_SELECT_BANK_WIDGET_ENDPOINT.getEndpoint(),
                loginMultiValueMapForHttpRequest,
                statefulRestTemplateInterceptorKeyEnums);

    }


    //Creates de Transaction
    public static ResponseEntity<String> getPaymentPanel(
            MerchantCreateSignatureDTO merchantCreateSignatureDTO,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) {

        HashMap<QueryParametersEnum, String> loginMultiValueMapForHttpRequest = CreateSignatureSupplier.getLoginMultiValueMapForHttpRequest(merchantCreateSignatureDTO);

        return RestTemplateHttpConnector.httpPost(
                PAYMENT_PANEL_SELECT_BANK_ENDPOINT.getEndpoint(),
                loginMultiValueMapForHttpRequest,
                statefulRestTemplateInterceptorKeyEnums);

    }

}
