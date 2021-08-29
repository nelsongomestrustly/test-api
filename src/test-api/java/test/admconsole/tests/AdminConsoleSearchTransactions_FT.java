package test.admconsole.tests;

import cucumber.api.tests.CucumberTest;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import samplefiles.common.suppliers.adminconsole.AdminConsoleSearchTransactionsDTOSameSupplier;
import support.cucumber.context.MyTestContext;
import support.cucumber.datatable.DataTableUtils;
import test.admconsole.actions.AdmConsoleHttpActions;
import test.admconsole.data.dto.AdminConsoleSearchTransactionsDTO;
import test.admconsole.validations.AdminConsoleSearchTransactionsValidations;

import java.io.IOException;
import java.util.List;

import static samplefiles.common.constants.adminconsole.AdminConsoleSearchTransactions.SEARCH_ADMIN_CONSOLE_TRANSACTIONS_FILE_NAME_BY_CUSTOMER_NAME_VALID_3;
import static support.cucumber.common.DataTableEnum.ADMIN_CONSOLE_FILENAME;
import static support.cucumber.common.DataTableEnum.SEARCH_NUMBER_RESULT;
import static test.admconsole.common.constants.AdminConsoleSearchTransactionsConstants.ADMIN_CONSOLE_SEARCH_TRANSACTIONS_NO_RESULTS_FOUND;

@Slf4j
public class AdminConsoleSearchTransactions_FT extends CucumberTest {

    @When("Search for Customer Name Transactions in Admin Console using Sample File {string} and Expect Http Status {string}")
    public void searchForCustomerNameTransactionsInAdminConsoleUsingSampleFileAndExpectHttpStatus(String fileName, String expectHttpStatus) throws IOException {

       //Get AdminConsoleSearchTransactionsDTO from Sample Files
        AdminConsoleSearchTransactionsDTO sampleAdminConsoleSearchTransactionsDTO4
                = AdminConsoleSearchTransactionsDTOSameSupplier.getSampleAdminConsoleSearchTransactionsDTO(fileName);

       //Admin Console Html Search Result Body
       String resultHTMLBody = AdmConsoleHttpActions.getAdminConsoleTransactionsByName(
                sampleAdminConsoleSearchTransactionsDTO4,
                Integer.valueOf(expectHttpStatus));

        //Adding List to Context to be Validated in the next step
        MyTestContext.getMyTestContext().adminConsoleTransactionsManager.setAdminConsoleHtmlSearchResultsBodyTransactions(resultHTMLBody);

    }

    @Then("Admin Console Transactions Search should return {string} results")
    public void searchShouldReturnResults(String numberOfExpectSearchResults) {

        String resultHTMLBody = MyTestContext.getMyTestContext().adminConsoleTransactionsManager.getAdminConsoleHtmlSearchResultsBodyTransactions();

        AdminConsoleSearchTransactionsValidations.validateNumberOfSearchResults(resultHTMLBody, numberOfExpectSearchResults);

    }

    @Then("Admin Console Transactions Search should return more than {string} results")
    public void searchShouldReturnMoreThanResults(String numberOfExpectSearchResults) {

        String resultHTMLBody = MyTestContext.getMyTestContext().adminConsoleTransactionsManager.getAdminConsoleHtmlSearchResultsBodyTransactions();

        AdminConsoleSearchTransactionsValidations.validateMoreThanNumberOfSearchResults(resultHTMLBody, numberOfExpectSearchResults);

    }

    @Then("Admin Console Transactions Search should return no results")
    public void adminConsoleTransactionsSearchShouldReturnNoResults() {

        Assertions.assertTrue(
                MyTestContext.getMyTestContext().adminConsoleTransactionsManager.getAdminConsoleHtmlSearchResultsBodyTransactions().contains(ADMIN_CONSOLE_SEARCH_TRANSACTIONS_NO_RESULTS_FOUND));

    }
}