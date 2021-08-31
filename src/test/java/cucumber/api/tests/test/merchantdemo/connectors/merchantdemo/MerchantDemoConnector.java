package cucumber.api.tests.test.merchantdemo.connectors.merchantdemo;

import cucumber.api.tests.configurations.resttemplate.common.enums.StatefulRestTemplateInterceptorKeyEnums;
import cucumber.api.tests.support.common.connectors.resttemplate.RestTemplateHttpConnector;
import org.springframework.http.ResponseEntity;

import static cucumber.api.tests.test.merchantdemo.connectors.MerchantDemoEndpoint.MERCHANT_DEMO_ENDPOINT;

public class MerchantDemoConnector {

    public static ResponseEntity<String> getMerchantDemo(
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) {

        return RestTemplateHttpConnector.httpGet_Return_String(MERCHANT_DEMO_ENDPOINT.getEndpoint(), statefulRestTemplateInterceptorKeyEnums);

    }


}
