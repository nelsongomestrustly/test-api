package test.login.tests;

import cucumber.api.tests.CucumberTest;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;
import samplefiles.common.suppliers.adminconsole.AdminConsoleSearchTransactionsDTOSameSupplier;
import test.admconsole.data.dto.AdminConsoleSearchTransactionsDTO;
import test.login.actions.LoginHttpActions;
import test.login.validations.LoginValidations;
import org.junit.jupiter.api.Assertions;
import support.cucumber.context.MyTestContext;
import support.cucumber.datatable.DataTableUtils;
import support.common.users.data.TestParticipantDTO;
import support.common.users.services.TestParticipantServices;
import java.io.IOException;

import static samplefiles.common.constants.adminconsole.AdminConsoleSearchTransactions.SEARCH_ADMIN_CONSOLE_TRANSACTIONS_FILE_NAME_BY_CUSTOMER_NAME_EMPTY;
import static samplefiles.common.constants.adminconsole.AdminConsoleSearchTransactions.SEARCH_ADMIN_CONSOLE_TRANSACTIONS_FILE_NAME_BY_CUSTOMER_NAME_INVALID;
import static samplefiles.common.constants.adminconsole.AdminConsoleSearchTransactions.SEARCH_ADMIN_CONSOLE_TRANSACTIONS_FILE_NAME_BY_CUSTOMER_NAME_VALID_1;
import static samplefiles.common.constants.adminconsole.AdminConsoleSearchTransactions.SEARCH_ADMIN_CONSOLE_TRANSACTIONS_FILE_NAME_BY_CUSTOMER_NAME_VALID_2;
import static samplefiles.common.constants.adminconsole.AdminConsoleSearchTransactions.SEARCH_ADMIN_CONSOLE_TRANSACTIONS_FILE_NAME_BY_CUSTOMER_NAME_VALID_3;
import static support.cucumber.common.DataTableEnum.NOT_LOGGED_IN_ADMIN_CONSOLE_HTML_BODY;
import static support.cucumber.common.DataTableEnum.TEST_PARTICIPANT;
import static test.login.connectors.LoginEndpoint.ADMIN_CONSOLE_LOGIN_ENDPOINT;
import static test.login.connectors.LoginEndpoint.ADMIN_CONSOLE_TRANSACTIONS_ENDPOINT;

@Slf4j
public class LoginAdminConsole_FT extends CucumberTest {


    /**
     * 
     * 
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
    public void theUserIsNotLoggedInAdminConsoleShouldReceiveInHtmlBodyAndHttpStatus(String notLoggedInAdminConsoleHtmlBody, String httpStatusNotLogged) throws IOException {

        //Get Values From DataTable
        boolean theUserLoggedInAdminConsole = LoginHttpActions.isTheUserLogged(Integer.parseInt(httpStatusNotLogged), notLoggedInAdminConsoleHtmlBody, ADMIN_CONSOLE_TRANSACTIONS_ENDPOINT);

        //For the used considered logged, he needs to have a cookie, and the session should not be Expired
        MyTestContext.getMyTestContext().loginDTOManager.setLoggedAdminConsole(theUserLoggedInAdminConsole);

    }


    @Then("The user should be able to Login in Admin Console and receive Http Status (\\d+)$")
    public void theUserShouldBeAbleToLoginInAdminConsoleAndReceiveHttpStatus(int httpStatusLogin) throws IOException {

        //Need to Log if the User is Not Logged or Don´t have a Cookie
        if (!MyTestContext.getMyTestContext().loginDTOManager.isLoggedAdminConsole()) {

            //Login In
            LoginHttpActions.logIn(MyTestContext.getMyTestContext().testParticipantDTOManagers.getFirst(), httpStatusLogin, ADMIN_CONSOLE_LOGIN_ENDPOINT);

        }

    }

    @And("The user should be able to access Admin Console Home Page and not receive in HtmlBody {string} and Http Status {string}")
    public void theUserShouldBeAbleToAccessAdminConsoleHomePageAndNotReceiveInHtmlBodyAndHttpStatus(String notLoggedInAdminConsoleHtmlBody, String httpStatusLogged) throws IOException {

        Assertions.assertTrue(LoginHttpActions.isTheUserLogged(Integer.parseInt(httpStatusLogged), notLoggedInAdminConsoleHtmlBody, ADMIN_CONSOLE_TRANSACTIONS_ENDPOINT));

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
        theUserIsNotLoggedInAdminConsoleShouldReceiveInHtmlBodyAndHttpStatus(notLoggedInAdminConsoleHtmlBody, httpStatusNotLogged);
        //Then
        theUserShouldBeAbleToLoginInAdminConsoleAndReceiveHttpStatus(Integer.parseInt(httpStatusLogin));
        //And
        theUserShouldBeAbleToAccessAdminConsoleHomePageAndNotReceiveInHtmlBodyAndHttpStatus(notLoggedInAdminConsoleHtmlBody, httpStatusLogged);

    }


}