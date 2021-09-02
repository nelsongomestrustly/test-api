package cucumber.api.tests.scenarios.frontend.merchant;

import cucumber.api.tests.CucumberTest;
import cucumber.api.tests.test.frontend.actions.FrontEndHttpActions;
import cucumber.api.tests.test.merchantdemo.actions.get.merchantdemo.MerchantDemoGetHttpActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

import static cucumber.api.tests.configurations.resttemplate.common.enums.StatefulRestTemplateInterceptorKeyEnums.FRONT_END_INTERCEPTOR_MAP_KEY;
import static cucumber.api.tests.configurations.resttemplate.common.enums.StatefulRestTemplateInterceptorKeyEnums.MERCHANT_DEMO_INTERCEPTOR_MAP_KEY;

@Slf4j
public class MerchantDemoFrontEndSetup_FT extends CucumberTest {

    //Need a Token
    //http://192.168.1.49:10000/frontend/setup
    @When("The user access Merchant Demo Front End and Setup Information and Expect Http Status (\\d+)$")
    public void theUserAccessMerchantDemoFrontEndAndSetupInformation(int expectMerchantDemoFrontEndHttpStatus) {

        FrontEndHttpActions.setupMerchantDemo(expectMerchantDemoFrontEndHttpStatus, FRONT_END_INTERCEPTOR_MAP_KEY);

    }

}
