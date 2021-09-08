package cucumber.api.tests.scenarios.admconsole;

import cucumber.api.tests.CucumberTest;
import cucumber.api.tests.data.context.MyTestContext;
import cucumber.api.tests.conectors.admconsole.AdmConHttpActions;
import cucumber.api.tests.common.admconsole.suppliers.dto.AdmConSearchTransactionsSuppliers;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

@Slf4j
public class AdmConSearchTransactions_FT extends CucumberTest {

    //TODO IMPROVE BECAUSE THIS INFORMATION IS NOT IN THE FRONT END TO BE GET
    @When("Search for All Customer Name Transactions in Admin Console and Expect Http Status (\\d+)$")
    public void searchForCustomerNameTransactionsInAdminConsoleUsingSampleFileAndExpectHttpStatus(Integer expectHttpStatus) throws IOException {

        //Admin Console Html Search Result Body
        String resultHTMLBody = AdmConHttpActions.getAdminConsoleAllTransactions(expectHttpStatus);

        String numberOfResults = AdmConSearchTransactionsSuppliers.getNumberOfResults(resultHTMLBody);

        //Adding List to Context to be Validated in the next step
        MyTestContext.getMyTestContext().adminConsoleTransactionsManager.setNumberOfResults(Integer.parseInt(numberOfResults));
        MyTestContext.getMyTestContext().adminConsoleTransactionsManager.setAdminConsoleHtmlSearchResultsBodyTransactions(resultHTMLBody);

    }

}