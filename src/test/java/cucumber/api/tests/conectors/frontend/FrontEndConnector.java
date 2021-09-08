package cucumber.api.tests.conectors.frontend;

import cucumber.api.tests.common.suppliers.StringSuppliers;
import cucumber.api.tests.conectors.frontend.endpoints.FrontEndBuildEndpoint;
import cucumber.api.tests.conectors.frontend.endpoints.FrontEndEndpoint;
import cucumber.api.tests.configurations.resttemplate.common.enums.StatefulRestTemplateInterceptorKeyEnums;
import cucumber.api.tests.support.common.connectors.apache.ApacheConnectionManager;
import cucumber.api.tests.support.common.connectors.resttemplate.RestTemplateHttpConnector;
import cucumber.api.tests.data.context.MyTestContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;

import java.io.IOException;

import static cucumber.api.tests.conectors.frontend.endpoints.FrontEndBuildEndpoint.FRONT_END_ENDPOINT_BUILD;
import static cucumber.api.tests.conectors.frontend.endpoints.FrontEndSetupEndpoint.FRONT_END_ENDPOINT_SETUP_TOKEN;

@Slf4j
public class FrontEndConnector {

    //Adding Front End Info Object
    protected static ResponseEntity<String> buildBankPanelInMerchantDemo(
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) {

        String url = StringSuppliers.getStringFormatted(FRONT_END_ENDPOINT_BUILD.getEndpoint(), MyTestContext.getMyTestContext().tokenManager.getFirstTokenDTO().getToken());

        return RestTemplateHttpConnector.httpGet_Return_String(url, statefulRestTemplateInterceptorKeyEnums);

    }



    protected static String setupBankPanelInMerchantDemo() throws IOException {

        String url = StringSuppliers.getStringFormatted(FRONT_END_ENDPOINT_SETUP_TOKEN.getEndpoint(), MyTestContext.getMyTestContext().tokenManager.getFirstTokenDTO().getToken());
        return ApacheConnectionManager.getConnection().httpPostForEntityString(url);

    }





}
