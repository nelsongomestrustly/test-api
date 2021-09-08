package cucumber.api.tests.conectors.frontend;

import cucumber.api.tests.common.suppliers.StringSuppliers;
import cucumber.api.tests.configurations.resttemplate.common.enums.StatefulRestTemplateInterceptorKeyEnums;
import cucumber.api.tests.support.common.connectors.apache.ApacheConnectionManager;
import cucumber.api.tests.support.common.connectors.resttemplate.RestTemplateHttpConnector;
import cucumber.api.tests.data.context.MyTestContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;

import java.io.IOException;

import static cucumber.api.tests.conectors.frontend.FrontEndEndpoint.FRONT_END_ENDPOINT_SETUP;

@Slf4j
public class FrontEndConnector {

    //Adding Front End Info Object
    public static ResponseEntity<String> buildBankPanelInMerchantDemo(
            FrontEndEndpoint frontEndEndpoint,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) {

        String url = StringSuppliers.getStringFormatted(frontEndEndpoint.getEndpoint(), MyTestContext.getMyTestContext().tokenManager.getFirstTokenDTO().getToken());

        return RestTemplateHttpConnector.httpGet_Return_String(url, statefulRestTemplateInterceptorKeyEnums);

    }



    public static String setupBankPanelInMerchantDemo() throws IOException {

        String url = StringSuppliers.getStringFormatted(FRONT_END_ENDPOINT_SETUP.getEndpoint(), MyTestContext.getMyTestContext().tokenManager.getFirstTokenDTO().getToken());
        return ApacheConnectionManager.getConnection().httpPostForEntityString(url);

    }





}
