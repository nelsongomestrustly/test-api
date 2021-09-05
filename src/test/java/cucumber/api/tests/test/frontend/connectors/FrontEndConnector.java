package cucumber.api.tests.test.frontend.connectors;

import cucumber.api.tests.common.suppliers.StringSuppliers;
import cucumber.api.tests.configurations.resttemplate.common.enums.StatefulRestTemplateInterceptorKeyEnums;
import cucumber.api.tests.support.common.connectors.apache.ApacheConnectionManager;
import cucumber.api.tests.support.common.connectors.resttemplate.RestTemplateHttpConnector;
import cucumber.api.tests.data.context.MyTestContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import java.io.IOException;

@Slf4j
public class FrontEndConnector {

    //Adding Front End Info Object
    public static ResponseEntity<String> buildBankPanelInMerchantDemo(
            FrontEndEndpoint frontEndEndpoint,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) {

        String url = StringSuppliers.getStringFormatted(frontEndEndpoint.getEndpoint(), MyTestContext.getMyTestContext().tokenManager.getFirstTokenDTO().getToken());

        return RestTemplateHttpConnector.httpGet_Return_String(url, statefulRestTemplateInterceptorKeyEnums);

    }



    public static String setupBankPanelInMerchantDemo(
            FrontEndEndpoint frontEndEndpoint,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) {


        String url = StringSuppliers.getStringFormatted(frontEndEndpoint.getEndpoint(), MyTestContext.getMyTestContext().tokenManager.getFirstTokenDTO().getToken());

        try {
            return ApacheConnectionManager.getConnection().httpPostForEntityString(url);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "error";

    }

    private static MultiValueMap<String, String> teste() {

        MultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();
        map.add("token", MyTestContext.getMyTestContext().tokenManager.getFirstTokenDTO().getToken());
        map.add("cancelUrl", "");
        map.add("lt", "");

        return map;

    }




}
