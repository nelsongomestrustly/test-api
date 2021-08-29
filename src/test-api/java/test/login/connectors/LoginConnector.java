package test.login.connectors;

import org.springframework.http.ResponseEntity;
import support.common.connectors.resttemplate.RestTemplateHttpConnector;
import support.common.users.data.TestParticipantDTO;

import java.io.IOException;
import java.util.List;

import static test.login.connectors.LoginEndpoint.ADMIN_CONSOLE_TRANSACTIONS_ENDPOINT;

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
