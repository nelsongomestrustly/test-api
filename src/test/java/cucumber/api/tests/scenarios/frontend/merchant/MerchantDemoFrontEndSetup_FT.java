package cucumber.api.tests.scenarios.frontend.merchant;

import cucumber.api.tests.CucumberTest;
import cucumber.api.tests.common.predicates.GenericPredicates;
import cucumber.api.tests.test.frontend.actions.FrontEndHttpActions;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;

import static cucumber.api.tests.configurations.resttemplate.common.enums.StatefulRestTemplateInterceptorKeyEnums.FRONT_END_INTERCEPTOR_MAP_KEY;

@Slf4j
public class MerchantDemoFrontEndSetup_FT extends CucumberTest {

    //Need a Token
    //http://192.168.1.49:10000/frontend/setup
    @When("The user access Merchant Demo Front End and Setup Bank Panel and Expect Http Status (\\d+)$")
    public void theUserAccessMerchantDemoFrontEndAndBuildInformation(int expectMerchantDemoFrontEndHttpStatus) {

        String htmlBody = FrontEndHttpActions.setupPanelInMerchantDemo(expectMerchantDemoFrontEndHttpStatus, FRONT_END_INTERCEPTOR_MAP_KEY);

        Assertions.assertFalse(GenericPredicates.checkIfNullOrEmpty.test(htmlBody));

    }

}
