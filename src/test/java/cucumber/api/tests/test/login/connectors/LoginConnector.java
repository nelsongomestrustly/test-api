package cucumber.api.tests.test.login.connectors;

import cucumber.api.tests.test.admconsole.connectors.AdminConsoleEndpoint;
import org.springframework.http.ResponseEntity;
import cucumber.api.tests.support.common.connectors.resttemplate.RestTemplateHttpConnector;
import cucumber.api.tests.support.common.users.data.TestParticipantDTO;

import java.io.IOException;

public class LoginConnector {

    public static ResponseEntity<String> login(
            LoginEndpoint loginEndpoint,
            TestParticipantDTO testParticipantDTO) throws IOException {

        String url = loginEndpoint.getEndpoint();
        return RestTemplateHttpConnector.httpPostLogin(url, testParticipantDTO);

    }


    public static ResponseEntity<String> logout(LoginEndpoint loginEndpoint) {

        String url = loginEndpoint.getEndpoint();
        return RestTemplateHttpConnector.httpGet_Return_String(url);

    }


    public static ResponseEntity<String> isTheUserSessionExpired(LoginEndpoint loginEndpoint) {

        String url = loginEndpoint.getEndpoint();
        return RestTemplateHttpConnector.httpGet_Return_String(url);

    }


    public static ResponseEntity<String> canAccess(AdminConsoleEndpoint adminConsoleEndpoint) {

        String url = adminConsoleEndpoint.getEndpoint();
        return RestTemplateHttpConnector.httpGet_Return_String(url);

    }



}
