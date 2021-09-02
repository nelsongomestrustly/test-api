package cucumber.api.tests.test.frontend.connectors;

import cucumber.api.tests.common.suppliers.GenericSuppliers;
import cucumber.api.tests.configurations.resttemplate.common.enums.StatefulRestTemplateInterceptorKeyEnums;
import cucumber.api.tests.support.common.connectors.resttemplate.RestTemplateHttpConnector;
import org.springframework.http.ResponseEntity;

public class FrontEndConnector {

    //Adding Front End Info Object
    public static ResponseEntity<String> setupMerchantDemo(
            FrontEndEndpoint frontEndEndpoint,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) {

        String url = GenericSuppliers.getStringFormatted(frontEndEndpoint.getEndpoint(), "token", "cancelUrl", "It");

        return RestTemplateHttpConnector.httpPostWithFormData(url, null, statefulRestTemplateInterceptorKeyEnums);

    }

}
