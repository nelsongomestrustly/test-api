package cucumber.api.tests.scenarios.admconsole;

import cucumber.api.tests.CucumberTest;
import cucumber.api.tests.data.context.MyTestContext;
import cucumber.api.tests.data.dto.frontend.FrontEndSetupDTO;
import cucumber.api.tests.test.admconsole.actions.AdmConHttpActions;
import cucumber.api.tests.test.admconsole.common.suppliers.dto.AdmConSearchTransactionsSuppliers;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;

import java.io.IOException;
import java.util.List;

@Slf4j
public class AdmConSearchForATransaction_FT extends CucumberTest {

    @Then("Validate if the Transaction has really been created and is visible in AdminConsole")
    public void validateIfTheTransactionHasReallyBeenCreatedAndIsVisibleInAdminConsole() {

        String adminConsoleHtmlSearchResultsBodyTransactions = MyTestContext.getMyTestContext().adminConsoleTransactionsManager.getAdminConsoleHtmlSearchResultsBodyTransactions();
        ;
        FrontEndSetupDTO frontEndSetupDTOList = MyTestContext.getMyTestContext().frontEndManager.getFirstFrontEndSetupDTO();

        Assert.assertTrue(adminConsoleHtmlSearchResultsBodyTransactions.contains(frontEndSetupDTOList.getTransaction().getPpId()));
        Assert.assertTrue(adminConsoleHtmlSearchResultsBodyTransactions.contains(frontEndSetupDTOList.getTransaction().getId()));


    }


}