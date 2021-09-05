package cucumber.api.tests.scenarios.frontend.merchant;

import com.fasterxml.jackson.core.JsonProcessingException;
import cucumber.api.tests.CucumberTest;
import cucumber.api.tests.data.context.MyTestContext;
import cucumber.api.tests.data.dto.frontend.FrontEndSetupDTO;
import cucumber.api.tests.test.frontend.actions.FrontEndHttpActions;
import cucumber.api.tests.validations.frontend.FrontEndValidations;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;

import static cucumber.api.tests.configurations.resttemplate.common.enums.StatefulRestTemplateInterceptorKeyEnums.FRONT_END_INTERCEPTOR_MAP_KEY;

@Slf4j
public class MerchantDemoFrontEndSetup_FT extends CucumberTest {

    //Need a Token
    //http://192.168.1.49:10000/frontend/setup
    @When("The user access Merchant Demo Front End Setup and Receive Transactions Information")
    public void theUserAccessMerchantDemoFrontEndAndBuildInformation() throws JsonProcessingException {

        FrontEndSetupDTO frontEndSetupDTO = FrontEndHttpActions.setupPanelInMerchantDemo(FRONT_END_INTERCEPTOR_MAP_KEY);

        MyTestContext.getMyTestContext().frontEndManager.addTokenDTO(frontEndSetupDTO);

    }


    @Then("The user should have a Valid Transaction Id and a Transaction PP Id")
    public void theUserShouldHaveAValidTransactionIdAndATransactionPPId() {

        FrontEndSetupDTO firstTokenDTO = MyTestContext.getMyTestContext().frontEndManager.getFirstTokenDTO();

        FrontEndValidations.validateFrontEndSetupDTO.accept(firstTokenDTO);

    }

}
