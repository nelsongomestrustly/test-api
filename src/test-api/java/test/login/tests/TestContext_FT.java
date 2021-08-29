package test.login.tests;

import cucumber.api.tests.CucumberTest;
import cucumber.api.tests.common.predicates.GenericPredicates;
import cucumber.api.tests.configurations.resttemplate.interceptors.StatefulRestTemplateInterceptor;
import io.cucumber.java.en.Then;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import samplefiles.common.suppliers.adminconsole.AdminConsoleSearchTransactionsDTOSameSupplier;
import support.cucumber.context.MyTestContext;
import test.admconsole.data.dto.AdminConsoleSearchTransactionsDTO;

import java.io.IOException;

import static samplefiles.common.constants.adminconsole.AdminConsoleSearchTransactions.SEARCH_ADMIN_CONSOLE_TRANSACTIONS_FILE_NAME_BY_CUSTOMER_NAME_EMPTY;
import static samplefiles.common.constants.adminconsole.AdminConsoleSearchTransactions.SEARCH_ADMIN_CONSOLE_TRANSACTIONS_FILE_NAME_BY_CUSTOMER_NAME_INVALID;
import static samplefiles.common.constants.adminconsole.AdminConsoleSearchTransactions.SEARCH_ADMIN_CONSOLE_TRANSACTIONS_FILE_NAME_BY_CUSTOMER_NAME_VALID_1;
import static samplefiles.common.constants.adminconsole.AdminConsoleSearchTransactions.SEARCH_ADMIN_CONSOLE_TRANSACTIONS_FILE_NAME_BY_CUSTOMER_NAME_VALID_2;
import static samplefiles.common.constants.adminconsole.AdminConsoleSearchTransactions.SEARCH_ADMIN_CONSOLE_TRANSACTIONS_FILE_NAME_BY_CUSTOMER_NAME_VALID_3;

@Slf4j
public class TestContext_FT extends CucumberTest {

    @Then("Reset Test Context")
    public void resetTestContext() {

        //Reset Test Context
        MyTestContext.resetMyTestContext();

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
        statefulRestTemplateInterceptor.setCookie(null);

    }

}
