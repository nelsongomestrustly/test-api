package cucumber.api.tests.test.paymentpanel.connectors;

import cucumber.api.tests.common.enums.PaymentProviderEnum;
import cucumber.api.tests.common.enums.queries.QueryParametersEnum;
import cucumber.api.tests.common.predicates.GenericPredicates;
import cucumber.api.tests.configurations.resttemplate.common.enums.StatefulRestTemplateInterceptorKeyEnums;
import cucumber.api.tests.support.common.connectors.resttemplate.RestTemplateHttpConnector;
import cucumber.api.tests.support.cucumber.context.MyTestContext;
import cucumber.api.tests.test.merchantdemo.common.suppliers.html.CreateSignatureQueryParamSupplier;
import cucumber.api.tests.test.merchantdemo.data.dto.MerchantCreateSignatureDTO;
import cucumber.api.tests.test.paymentpanel.common.enums.html.CreatePaymentPanelWidgetSupplier;
import cucumber.api.tests.test.paymentpanel.data.dto.PaymentPanelCreateWidgetDTO;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

import static cucumber.api.tests.test.paymentpanel.connectors.PaymentPanelEndpoint.PAYMENT_PANEL_SELECT_BANK_ENDPOINT;
import static cucumber.api.tests.test.paymentpanel.connectors.PaymentPanelEndpoint.PAYMENT_PANEL_SELECT_BANK_SELECT_BANK_ENDPOINT;
import static cucumber.api.tests.test.paymentpanel.connectors.PaymentPanelEndpoint.PAYMENT_PANEL_SELECT_BANK_WIDGET_ENDPOINT;

public class PaymentPanelConnector {


    public static ResponseEntity<String> getSelectBankRedirectUrl(
            PaymentProviderEnum paymentProviderEnum,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) {

        return RestTemplateHttpConnector.httpPost(
                PAYMENT_PANEL_SELECT_BANK_ENDPOINT.getEndpoint(),
                Map.of(paymentProviderEnum.getKey(), paymentProviderEnum.getId()),
                statefulRestTemplateInterceptorKeyEnums);

    }


    public static ResponseEntity<String> getPaymentPanelWidget(
            PaymentPanelCreateWidgetDTO paymentPanelCreateWidgetDTO,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) {

        HashMap<QueryParametersEnum, String> loginMultiValueMapForHttpRequest = CreatePaymentPanelWidgetSupplier.getLoginMultiValueMapForHttpRequest(paymentPanelCreateWidgetDTO);

        return RestTemplateHttpConnector.httpPost(
                PAYMENT_PANEL_SELECT_BANK_WIDGET_ENDPOINT.getEndpoint(),
                loginMultiValueMapForHttpRequest,
                statefulRestTemplateInterceptorKeyEnums);

    }


    public static ResponseEntity<String> getPaymentPanel(
            MerchantCreateSignatureDTO merchantCreateSignatureDTO,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) {

        HashMap<QueryParametersEnum, String> loginMultiValueMapForHttpRequest = CreateSignatureQueryParamSupplier.getLoginMultiValueMapForHttpRequest(merchantCreateSignatureDTO);

        //401 accessing merchant gateway
        loginMultiValueMapForHttpRequest.put(QueryParametersEnum.REQUEST_SIGNATURE, MyTestContext.getMyTestContext().merchantDemoManager.getMerchantCreateSignatureDTOList().get(0).getSignature());
        loginMultiValueMapForHttpRequest.put(QueryParametersEnum.REFERER, "http://localhost:7000/");
        //loginMultiValueMapForHttpRequest.put(QueryParametersEnum.PAYMENT_PROVIDER_ID, "200005501");
        //loginMultiValueMapForHttpRequest.put(QueryParametersEnum.AUTH_TOKEN, "O2z4XFIEfj35QNJXMpra54n66mc3hafDI8wMjoMxZT+WCfTnpqOspgcXX6NCds3uTQ9LXSI/7Af0jkgmffWGsT8r+x76CycjYaZWmnbTFjMpmGZyuIry8ya8eKCbMPmPUssqd02YOetlL6MoMRnlxIff7eOYR2JLORuMH/rFk286OBh/qKHNoXvqk2D0yQkQRM/ocA85gbnzzJR/YffBx3Ej/jYQrky8YVGVLIDJwgtvUKfNshT5waRz0r1xrfTkQLUfxnjHKtm517mFHSYW3/SguzZV4bkSXfXeKlXMZNOaGu/rwRF0YSCCvpa6cqo/u7FwTQ9R5RlTRITf+XrkjJdEbollbUxbKLaIhXWEpymgw2Syd1pK5UGFPh3sXeOM37RU+Enbo1L0e9yERHlVRB+17sJDVALuE1ee37BBSMW1SWbfOZeugkUnq+5sYQQs");
        //loginMultiValueMapForHttpRequest.put(QueryParametersEnum.PP_TRANSACTION_ID, "ptx-F-N0vdS4i41eMi2iYnZ3YGV4-NAG");
        //loginMultiValueMapForHttpRequest.put(QueryParametersEnum.DEVICE_TYPE, "desktop:macintel:web");
        //loginMultiValueMapForHttpRequest.put(QueryParametersEnum.TRANSACTION_ID, "1001152710");

        return RestTemplateHttpConnector.httpPost(
                PAYMENT_PANEL_SELECT_BANK_ENDPOINT.getEndpoint(),
                loginMultiValueMapForHttpRequest,
                statefulRestTemplateInterceptorKeyEnums);

    }

           // return RestTemplateHttpConnector.httpPost(
            //        PAYMENT_PANEL_SELECT_BANK_SELECT_BANK_ENDPOINT.getEndpoint(),
    //loginMultiValueMapForHttpRequest,
    //statefulRestTemplateInterceptorKeyEnums);
}
