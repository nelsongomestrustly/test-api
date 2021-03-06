package cucumber.api.tests.conectors.login;





import cucumber.api.tests.configurations.resttemplate.common.enums.StatefulRestTemplateInterceptorKeyEnums;
import cucumber.api.tests.conectors.admconsole.endpoints.AdmConEndpoint;
import org.springframework.http.ResponseEntity;
import cucumber.api.tests.support.common.users.data.TestParticipantDTO;
import cucumber.api.tests.validations.login.LoginValidations;
import cucumber.api.tests.validations.resttemplate.RestTemplateValidations;

import java.io.IOException;


public class LoginHttpActions {


    public static boolean isTheUserSessionExpired(
            Integer expectedStatus,
            String sessionExpired,
            LoginAdmConsoleEndpoint loginAdmConsoleEndpoint,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums)  {

        ResponseEntity<String> responseEntity = LoginAdmConsoleConnector.isTheUserSessionExpired(loginAdmConsoleEndpoint, statefulRestTemplateInterceptorKeyEnums);

        RestTemplateValidations.validateStatus(expectedStatus, responseEntity);

        return LoginValidations.isTheUserLogSessionExpired(responseEntity, sessionExpired);


    }



    public static boolean isTheUserLogged(
            Integer expectedStatus,
            String notLoggedInAdminConsoleHtmlBody,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) {

        ResponseEntity<String> responseEntity = LoginAdmConsoleConnector.canAccess(statefulRestTemplateInterceptorKeyEnums);

        RestTemplateValidations.validateStatus(expectedStatus, responseEntity);

        return LoginValidations.isTheUserLoggedIn(responseEntity, notLoggedInAdminConsoleHtmlBody);


    }


    public static void logIn(
            TestParticipantDTO testParticipantDTO,
            Integer expectedStatus,
            LoginAdmConsoleEndpoint loginAdmConsoleEndpoint,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) throws IOException {

        ResponseEntity<String> responseEntity = LoginAdmConsoleConnector.login(loginAdmConsoleEndpoint, testParticipantDTO, statefulRestTemplateInterceptorKeyEnums);

        RestTemplateValidations.validateStatus(expectedStatus, responseEntity);

    }


    public static void logout(
            Integer expectedStatus,
            LoginAdmConsoleEndpoint loginAdmConsoleEndpoint,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) {

        ResponseEntity<String> responseEntity = LoginAdmConsoleConnector.logout(loginAdmConsoleEndpoint, statefulRestTemplateInterceptorKeyEnums);

        RestTemplateValidations.validateStatus(expectedStatus, responseEntity);

    }


}
