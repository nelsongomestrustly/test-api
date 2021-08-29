package test.login.actions;





import org.springframework.http.ResponseEntity;
import support.common.users.data.TestParticipantDTO;
import test.login.connectors.LoginConnector;
import test.login.connectors.LoginEndpoint;
import test.login.validations.LoginValidations;
import validations.resttemplate.RestTemplateValidations;

import java.io.IOException;


public class LoginHttpActions {


    public static boolean isTheUserSessionExpired(
            Integer expectedStatus,
            String sessionExpired,
            LoginEndpoint loginEndpoint) throws IOException {

        ResponseEntity<String> responseEntity = LoginConnector.isTheUserSessionExpired(loginEndpoint);

        RestTemplateValidations.validateStatus(expectedStatus, responseEntity);

        return LoginValidations.isTheUserLogSessionExpired(responseEntity, sessionExpired);


    }



    public static boolean isTheUserLogged(
            Integer expectedStatus,
            String notLoggedInAdminConsoleHtmlBody,
            LoginEndpoint loginEndpoint) throws IOException {

        ResponseEntity<String> responseEntity = LoginConnector.canAccess(loginEndpoint);

        RestTemplateValidations.validateStatus(expectedStatus, responseEntity);

        return LoginValidations.isTheUserLoggedIn(responseEntity, notLoggedInAdminConsoleHtmlBody);


    }


    public static void logIn(
            TestParticipantDTO testParticipantDTO,
            Integer expectedStatus,
            LoginEndpoint loginEndpoint) throws IOException {

        ResponseEntity<String> responseEntity = LoginConnector.loginAdminConsole(loginEndpoint, testParticipantDTO);

        RestTemplateValidations.validateStatus(expectedStatus, responseEntity);

    }





}
