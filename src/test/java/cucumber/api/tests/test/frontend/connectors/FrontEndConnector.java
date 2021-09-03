package cucumber.api.tests.test.frontend.connectors;

import cucumber.api.tests.common.suppliers.GenericSuppliers;
import cucumber.api.tests.configurations.resttemplate.common.enums.StatefulRestTemplateInterceptorKeyEnums;
import cucumber.api.tests.support.common.connectors.apache.ApacheConnectionManager;
import cucumber.api.tests.support.common.connectors.apache.ApacheHttpConnector;
import cucumber.api.tests.support.common.connectors.resttemplate.RestTemplateHttpConnector;
import cucumber.api.tests.support.cucumber.context.MyTestContext;
import cucumber.api.tests.test.login.common.suppliers.LoginSuppliers;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;

import static cucumber.api.tests.support.common.connectors.resttemplate.RestTemplateConnectionManager.getConnection;
import static cucumber.api.tests.support.common.connectors.utils.HttpConnectorsUtils.getHttpEntityRequest;
import static cucumber.api.tests.test.frontend.connectors.FrontEndEndpoint.FRONT_END_ENDPOINT_SETUP2;
import static java.nio.charset.StandardCharsets.UTF_8;

@Slf4j
public class FrontEndConnector {

    //Adding Front End Info Object
    public static ResponseEntity<String> buildBankPanelInMerchantDemo(
            FrontEndEndpoint frontEndEndpoint,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) {

        String url = GenericSuppliers.getStringFormatted(frontEndEndpoint.getEndpoint(), MyTestContext.getMyTestContext().tokenManager.getFirstTokenDTO().getToken());

        return RestTemplateHttpConnector.httpGet_Return_String(url, statefulRestTemplateInterceptorKeyEnums);

    }



    public static ResponseEntity<String> setupBankPanelInMerchantDemo(
            FrontEndEndpoint frontEndEndpoint,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) {

        String url = GenericSuppliers.getStringFormatted(frontEndEndpoint.getEndpoint(), MyTestContext.getMyTestContext().tokenManager.getFirstTokenDTO().getToken());

        ApacheHttpConnector apacheHttpConnector = new ApacheHttpConnector();

        log.info(url);



        return RestTemplateHttpConnector.httpPostWithToken(
                url,
                statefulRestTemplateInterceptorKeyEnums);

    }

    private static MultiValueMap<String, String> teste() {

        MultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();
        map.add("token", MyTestContext.getMyTestContext().tokenManager.getFirstTokenDTO().getToken());
        map.add("cancelUrl", "");
        map.add("lt", "");

        return map;

    }



}
