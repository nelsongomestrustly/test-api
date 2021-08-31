package cucumber.api.tests.test.merchantdemo.connectors.paymentflows;

import cucumber.api.tests.configurations.resttemplate.common.enums.StatefulRestTemplateInterceptorKeyEnums;
import cucumber.api.tests.support.common.connectors.resttemplate.RestTemplateHttpConnector;
import cucumber.api.tests.test.merchantdemo.data.dto.PaymentFlowsDTO;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;
import java.util.stream.Collectors;

import static cucumber.api.tests.test.merchantdemo.connectors.MerchantDemoEndpoint.MERCHANT_DEMO_GET_MERCHANT_LIST_ENDPOINT;
import static cucumber.api.tests.test.merchantdemo.connectors.MerchantDemoEndpoint.MERCHANT_DEMO_GET_PAYMENT_FLOWS_ENDPOINT;

public class MerchantPaymentFlowsConnector {


    public static ResponseEntity<String> getMerchantPaymentFlows(
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) {

        return RestTemplateHttpConnector.httpPostForObject(
                MERCHANT_DEMO_GET_PAYMENT_FLOWS_ENDPOINT.getEndpoint(),
                statefulRestTemplateInterceptorKeyEnums);


    }



}
