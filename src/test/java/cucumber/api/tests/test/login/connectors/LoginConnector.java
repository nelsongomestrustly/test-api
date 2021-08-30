package cucumber.api.tests.test.login.connectors;

import org.springframework.http.ResponseEntity;
import cucumber.api.tests.support.common.connectors.resttemplate.RestTemplateHttpConnector;
import cucumber.api.tests.support.common.users.data.TestParticipantDTO;

import java.io.IOException;

public class LoginConnector {

    public static ResponseEntity<String> loginAdminConsole(
            LoginEndpoint loginEndpoint,
            TestParticipantDTO testParticipantDTO) throws IOException {

        String url = loginEndpoint.getEndpoint();
        return RestTemplateHttpConnector.httpPostLogin(url, testParticipantDTO);

    }


    public static ResponseEntity<String> isTheUserSessionExpired(LoginEndpoint loginEndpoint) throws IOException {

        String url = loginEndpoint.getEndpoint();
        return RestTemplateHttpConnector.httpGet_Return_String(url);

    }


    public static ResponseEntity<String> canAccess(LoginEndpoint loginEndpoint) throws IOException {

        String url = loginEndpoint.getEndpoint();
        return RestTemplateHttpConnector.httpGet_Return_String(url);

    }



}
