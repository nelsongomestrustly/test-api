package cucumber.api.tests.test.admconsole.tests;

import cucumber.api.tests.CucumberTest;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import cucumber.api.tests.samplefiles.common.suppliers.adminconsole.AdmConSearchTransactionsDTOSameSupplier;
import cucumber.api.tests.support.cucumber.context.MyTestContext;
import cucumber.api.tests.test.admconsole.actions.AdmConHttpActions;
import cucumber.api.tests.test.admconsole.data.dto.AdmConSearchTransactionsDTO;
import cucumber.api.tests.test.admconsole.validations.AdmConSearchTransactionsValidations;

import java.io.IOException;

import static cucumber.api.tests.test.admconsole.common.constants.AdmConSearchTransactionsConstants.ADM_CON_SEARCH_TRANSACTIONS_NO_RESULTS_FOUND;

@Slf4j
public class AdmConSearchTransactions_FT extends CucumberTest {

    @When("Search for Customer Name Transactions in Admin Console using Sample File {string} and Expect Http Status {string}")
    public void searchForCustomerNameTransactionsInAdminConsoleUsingSampleFileAndExpectHttpStatus(String fileName, String expectHttpStatus) throws IOException {

       //Get AdminConsoleSearchTransactionsDTO from Sample Files
        AdmConSearchTransactionsDTO sampleAdmConSearchTransactionsDTO4
                = AdmConSearchTransactionsDTOSameSupplier.getSampleAdminConsoleSearchTransactionsDTO(fileName);

       //Admin Console Html Search Result Body
       String resultHTMLBody = AdmConHttpActions.getAdminConsoleTransactionsByName(
               sampleAdmConSearchTransactionsDTO4,
                Integer.valueOf(expectHttpStatus));

        //Adding List to Context to be Validated in the next step
        MyTestContext.getMyTestContext().adminConsoleTransactionsManager.setAdminConsoleHtmlSearchResultsBodyTransactions(resultHTMLBody);

    }

    @Then("Admin Console Transactions Search should return {string} results")
    public void searchShouldReturnResults(String numberOfExpectSearchResults) {

        String resultHTMLBody = MyTestContext.getMyTestContext().adminConsoleTransactionsManager.getAdminConsoleHtmlSearchResultsBodyTransactions();

        AdmConSearchTransactionsValidations.validateNumberOfSearchResults(resultHTMLBody, numberOfExpectSearchResults);

    }

    @Then("Admin Console Transactions Search should return more than {string} results")
    public void searchShouldReturnMoreThanResults(String numberOfExpectSearchResults) {

        String resultHTMLBody = MyTestContext.getMyTestContext().adminConsoleTransactionsManager.getAdminConsoleHtmlSearchResultsBodyTransactions();

        AdmConSearchTransactionsValidations.validateMoreThanNumberOfSearchResults(resultHTMLBody, numberOfExpectSearchResults);

    }

    @Then("Admin Console Transactions Search should return no results")
    public void adminConsoleTransactionsSearchShouldReturnNoResults() {

        Assertions.assertTrue(
                MyTestContext.getMyTestContext().adminConsoleTransactionsManager.getAdminConsoleHtmlSearchResultsBodyTransactions().contains(ADM_CON_SEARCH_TRANSACTIONS_NO_RESULTS_FOUND));

    }
}