package cucumber.api.tests.test.login.actions;





import cucumber.api.tests.test.admconsole.connectors.AdmConEndpoint;
import org.springframework.http.ResponseEntity;
import cucumber.api.tests.support.common.users.data.TestParticipantDTO;
import cucumber.api.tests.test.login.connectors.LoginConnector;
import cucumber.api.tests.test.login.connectors.LoginEndpoint;
import cucumber.api.tests.test.login.validations.LoginValidations;
import cucumber.api.tests.validations.resttemplate.RestTemplateValidations;

import java.io.IOException;


public class LoginHttpActions {


    public static boolean isTheUserSessionExpired(
            Integer expectedStatus,
            String sessionExpired,
            LoginEndpoint loginEndpoint)  {

        ResponseEntity<String> responseEntity = LoginConnector.isTheUserSessionExpired(loginEndpoint);

        RestTemplateValidations.validateStatus(expectedStatus, responseEntity);

        return LoginValidations.isTheUserLogSessionExpired(responseEntity, sessionExpired);


    }



    public static boolean isTheUserLogged(
            Integer expectedStatus,
            String notLoggedInAdminConsoleHtmlBody,
            AdmConEndpoint adminConsoleEndpoint) {

        ResponseEntity<String> responseEntity = LoginConnector.canAccess(adminConsoleEndpoint);

        RestTemplateValidations.validateStatus(expectedStatus, responseEntity);

        return LoginValidations.isTheUserLoggedIn(responseEntity, notLoggedInAdminConsoleHtmlBody);


    }


    public static void logIn(
            TestParticipantDTO testParticipantDTO,
            Integer expectedStatus,
            LoginEndpoint loginEndpoint) throws IOException {

        ResponseEntity<String> responseEntity = LoginConnector.login(loginEndpoint, testParticipantDTO);

        RestTemplateValidations.validateStatus(expectedStatus, responseEntity);

    }


    public static void logout(
            Integer expectedStatus,
            LoginEndpoint loginEndpoint) {

        ResponseEntity<String> responseEntity = LoginConnector.logout(loginEndpoint);

        RestTemplateValidations.validateStatus(expectedStatus, responseEntity);

    }


}
