package cucumber.api.tests.scenarios.frontend.merchantdemo;

import cucumber.api.tests.CucumberTest;
import cucumber.api.tests.data.context.MyTestContext;
import cucumber.api.tests.data.dto.frontend.FrontEndSetupDTO;
import cucumber.api.tests.conectors.frontend.FrontEndHttpActions;
import cucumber.api.tests.validations.frontend.FrontEndValidations;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

@Slf4j
public class MerchantDemoFrontEndSetup_FT extends CucumberTest {

    //Need a Token
    //http://192.168.1.49:10000/frontend/setup
    @When("The user access Merchant Demo Front End Setup and Receive Transactions Information (\\d+)$")
    public void theUserAccessMerchantDemoFrontEndAndBuildInformation(Integer expectHttpStatus) throws IOException {

        FrontEndSetupDTO frontEndSetupDTO = FrontEndHttpActions.setupPanelInMerchantDemo(expectHttpStatus);

        MyTestContext.getMyTestContext().frontEndManager.addFrontEndSetupDTO(frontEndSetupDTO);

    }


    @Then("The user should have a Valid Transaction Id and a Transaction PP Id")
    public void theUserShouldHaveAValidTransactionIdAndATransactionPPId() {

        FrontEndSetupDTO firstTokenDTO = MyTestContext.getMyTestContext().frontEndManager.getFirstFrontEndSetupDTO();

        FrontEndValidations.validateFrontEndSetupDTO.accept(firstTokenDTO);

    }

}
