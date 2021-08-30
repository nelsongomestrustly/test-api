package cucumber.api.tests.test.login.tests;

import cucumber.api.tests.CucumberTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;
import cucumber.api.tests.test.login.actions.LoginHttpActions;
import cucumber.api.tests.test.login.validations.LoginValidations;
import org.junit.jupiter.api.Assertions;
import cucumber.api.tests.support.cucumber.context.MyTestContext;
import cucumber.api.tests.support.common.users.data.TestParticipantDTO;
import cucumber.api.tests.support.common.users.services.TestParticipantServices;
import java.io.IOException;

import static cucumber.api.tests.configurations.resttemplate.common.enums.StatefulRestTemplateInterceptorKeyEnums.ADMIN_CONSOLE_INTERCEPTOR_MAP_KEY;
import static cucumber.api.tests.test.admconsole.connectors.AdmConEndpoint.ADM_CON_TRANSACTIONS_ENDPOINT;
import static cucumber.api.tests.test.login.connectors.LoginEndpoint.ADMIN_CONSOLE_LOGIN_ENDPOINT;
import static cucumber.api.tests.test.login.connectors.LoginEndpoint.ADMIN_CONSOLE_LOGOUT_ENDPOINT;

@Slf4j
public class LoginAdmCon_FT extends CucumberTest {


    /**
     * 
     * LOG IN PROCESS
     *
     */

    @Given("The following {string}")
    public void theFollowing(String testParticipantName) {

        TestParticipantDTO testParticipantDTO = TestParticipantServices.getTestParticipant(testParticipantName);

        MyTestContext.getMyTestContext().testParticipantDTOManagers.add(testParticipantDTO);

    }


    @Then("The Test Participant Should be Valid")
    public void theParticipantShouldBeValid() {

        TestParticipantDTO testParticipantDTO = MyTestContext.getMyTestContext().testParticipantDTOManagers.getFirst();
        LoginValidations.isTestParticipantDTOValid(testParticipantDTO);

    }


    @When("The user is not logged in Admin Console should receive in HtmlBody {string} and Http Status {string}")
    public void theUserIsNotLoggedInAdmConShouldReceiveInHtmlBodyAndHttpStatus(String notLoggedInAdminConsoleHtmlBody, String httpStatusNotLogged) throws IOException {

        //Get Values From DataTable
        boolean theUserLoggedInAdminConsole = LoginHttpActions.isTheUserLogged(Integer.parseInt(httpStatusNotLogged), notLoggedInAdminConsoleHtmlBody, ADM_CON_TRANSACTIONS_ENDPOINT, ADMIN_CONSOLE_INTERCEPTOR_MAP_KEY);

        //For the used considered logged, he needs to have a cookie, and the session should not be Expired
        MyTestContext.getMyTestContext().loginDTOManager.setLoggedAdminConsole(theUserLoggedInAdminConsole);

    }


    @Then("The user should be able to Login in Admin Console and receive Http Status (\\d+)$")
    public void theUserShouldBeAbleToLoginInAdmConAndReceiveHttpStatus(int httpStatusLogin) throws IOException {

        //Need to Log if the User is Not Logged or Don´t have a Cookie
        if (!MyTestContext.getMyTestContext().loginDTOManager.isLoggedAdminConsole()) {

            //Login In
            LoginHttpActions.logIn(MyTestContext.getMyTestContext().testParticipantDTOManagers.getFirst(), httpStatusLogin, ADMIN_CONSOLE_LOGIN_ENDPOINT, ADMIN_CONSOLE_INTERCEPTOR_MAP_KEY);

        }

    }

    @And("The user should be able to access Admin Console Home Page and not receive in HtmlBody {string} and Http Status {string}")
    public void theUserShouldBeAbleToAccessAdmConHomePageAndNotReceiveInHtmlBodyAndHttpStatus(String notLoggedInAdminConsoleHtmlBody, String httpStatusLogged) throws IOException {

        Assertions.assertTrue(LoginHttpActions.isTheUserLogged(Integer.parseInt(httpStatusLogged), notLoggedInAdminConsoleHtmlBody, ADM_CON_TRANSACTIONS_ENDPOINT, ADMIN_CONSOLE_INTERCEPTOR_MAP_KEY));

    }

    /**
     *
     *
     * BACKGROUND TEST
     * Group of All Tasks
     * To Make it Easier to import in other feature files
     *
     *
     */

    @Then("the user logs in Admin Console with {string} , Login Html Body {string} , and Http Status {string} , {string} , {string}")
    public void theUserLogsInAdminConsoleWithLoginHtmlBodyAndHttpStatus(
            String testParticipant,
            String notLoggedInAdminConsoleHtmlBody,
            String httpStatusNotLogged,
            String httpStatusLogin,
            String httpStatusLogged) throws IOException {

        //Given
        theFollowing(testParticipant);
        //Then
        theParticipantShouldBeValid();
        //When
        theUserIsNotLoggedInAdmConShouldReceiveInHtmlBodyAndHttpStatus(notLoggedInAdminConsoleHtmlBody, httpStatusNotLogged);
        //Then
        theUserShouldBeAbleToLoginInAdmConAndReceiveHttpStatus(Integer.parseInt(httpStatusLogin));
        //And
        theUserShouldBeAbleToAccessAdmConHomePageAndNotReceiveInHtmlBodyAndHttpStatus(notLoggedInAdminConsoleHtmlBody, httpStatusLogged);

    }

    /**
     * LOG OUT PROCESS
     */

    @Then("the user logout from Admin Console and receive a Http Status (\\d+)$")
    public void theUserLogoutFromAdmConAndReceiveAHttpStatus(int httpStatusLogout) {

        LoginHttpActions.logout(httpStatusLogout, ADMIN_CONSOLE_LOGOUT_ENDPOINT, ADMIN_CONSOLE_INTERCEPTOR_MAP_KEY);

    }

}