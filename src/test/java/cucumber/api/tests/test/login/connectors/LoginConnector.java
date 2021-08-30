package cucumber.api.tests.test.login.connectors;

import cucumber.api.tests.configurations.resttemplate.common.enums.StatefulRestTemplateInterceptorKeyEnums;
import cucumber.api.tests.test.admconsole.connectors.AdmConEndpoint;
import org.springframework.http.ResponseEntity;
import cucumber.api.tests.support.common.connectors.resttemplate.RestTemplateHttpConnector;
import cucumber.api.tests.support.common.users.data.TestParticipantDTO;

import java.io.IOException;

public class LoginConnector {

    public static ResponseEntity<String> login(
            LoginEndpoint loginEndpoint,
            TestParticipantDTO testParticipantDTO,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) throws IOException {

        String url = loginEndpoint.getEndpoint();
        return RestTemplateHttpConnector.httpPostLogin(url, testParticipantDTO, statefulRestTemplateInterceptorKeyEnums);

    }


    public static ResponseEntity<String> logout(
            LoginEndpoint loginEndpoint,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) {

        String url = loginEndpoint.getEndpoint();
        return RestTemplateHttpConnector.httpGet_Return_String(url, statefulRestTemplateInterceptorKeyEnums);

    }


    public static ResponseEntity<String> isTheUserSessionExpired(
            LoginEndpoint loginEndpoint,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) {

        String url = loginEndpoint.getEndpoint();
        return RestTemplateHttpConnector.httpGet_Return_String(url, statefulRestTemplateInterceptorKeyEnums);

    }


    public static ResponseEntity<String> canAccess(
            AdmConEndpoint adminConsoleEndpoint,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) {

        String url = adminConsoleEndpoint.getEndpoint();
        return RestTemplateHttpConnector.httpGet_Return_String(url, statefulRestTemplateInterceptorKeyEnums);

    }



}
