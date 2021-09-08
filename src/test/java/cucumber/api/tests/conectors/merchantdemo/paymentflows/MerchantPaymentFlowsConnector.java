package cucumber.api.tests.conectors.merchantdemo.paymentflows;

import cucumber.api.tests.configurations.resttemplate.common.enums.StatefulRestTemplateInterceptorKeyEnums;
import cucumber.api.tests.support.common.connectors.resttemplate.RestTemplateHttpConnector;
import org.springframework.http.ResponseEntity;

import static cucumber.api.tests.conectors.merchantdemo.MerchantDemoEndpoint.MERCHANT_DEMO_GET_PAYMENT_FLOWS_ENDPOINT;

public class MerchantPaymentFlowsConnector {


    protected static ResponseEntity<String> getMerchantPaymentFlows(
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) {

        return RestTemplateHttpConnector.httpPost(
                MERCHANT_DEMO_GET_PAYMENT_FLOWS_ENDPOINT.getEndpoint(),
                statefulRestTemplateInterceptorKeyEnums);


    }



}
