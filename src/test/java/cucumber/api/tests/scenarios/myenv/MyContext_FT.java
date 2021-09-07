package cucumber.api.tests.scenarios.myenv;

import cucumber.api.tests.CucumberTest;
import cucumber.api.tests.common.predicates.GenericPredicates;
import cucumber.api.tests.configurations.resttemplate.RestTemplateSupplier;
import cucumber.api.tests.configurations.resttemplate.interceptors.StatefulRestTemplateInterceptor;
import cucumber.api.tests.data.context.MyTestContext;
import cucumber.api.tests.test.login.actions.LoginHttpActions;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;

import java.util.HashMap;

import static cucumber.api.tests.configurations.resttemplate.common.enums.StatefulRestTemplateInterceptorKeyEnums.ADMIN_CONSOLE_INTERCEPTOR_MAP_KEY;
import static cucumber.api.tests.test.login.connectors.LoginEndpoint.ADMIN_CONSOLE_LOGOUT_ENDPOINT;

public class MyContext_FT extends CucumberTest {

    @Then("Reset Test Context With Cookies")
    public void resetTestContextWithCookies() {

        //Reset Test Context
        MyTestContext.resetMyTestContext();

        //Reset Rest Controller
        new RestTemplateSupplier();

        //MyTestContext Validation
        Assertions.assertNotNull(MyTestContext.getMyTestContext());

        //MyTestContext Inside Lists
        Assertions.assertTrue(GenericPredicates.checkIfNullOrEmpty.test(MyTestContext.getMyTestContext().adminConsoleTransactionsManager.getAdminConsoleSearchResultsTransactionsDTOList()));
        Assertions.assertEquals(MyTestContext.getMyTestContext().testParticipantDTOManagers.getSize(), 0);

        //MyTestContext Inside Objects
        Assertions.assertFalse(MyTestContext.getMyTestContext().loginDTOManager.isLoggedAdminConsole());

    }


    @Then("Reset Test Context")
    public void resetTestContext() {

        //Reset Test Context
        MyTestContext.resetMyTestContext();

        //Reset Rest Controller
        RestTemplateSupplier teste = new RestTemplateSupplier();

        //MyTestContext Validation
        Assertions.assertNotNull(MyTestContext.getMyTestContext());

        //MyTestContext Inside Lists
        Assertions.assertTrue(GenericPredicates.checkIfNullOrEmpty.test(MyTestContext.getMyTestContext().adminConsoleTransactionsManager.getAdminConsoleSearchResultsTransactionsDTOList()));
        Assertions.assertEquals(MyTestContext.getMyTestContext().testParticipantDTOManagers.getSize(), 0);

        //MyTestContext Inside Objects
        Assertions.assertFalse(MyTestContext.getMyTestContext().loginDTOManager.isLoggedAdminConsole());

    }


    @Then("Reset Test Cookies")
    public void resetTestCookies() {

        StatefulRestTemplateInterceptor statefulRestTemplateInterceptor = new StatefulRestTemplateInterceptor();
        statefulRestTemplateInterceptor.setCookieMap(new HashMap<>());

    }


}
