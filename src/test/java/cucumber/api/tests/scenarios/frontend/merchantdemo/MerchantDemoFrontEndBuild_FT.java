package cucumber.api.tests.scenarios.frontend.merchantdemo;

import cucumber.api.tests.CucumberTest;
import cucumber.api.tests.common.predicates.GenericPredicates;
import cucumber.api.tests.conectors.frontend.FrontEndHttpActions;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;

import static cucumber.api.tests.configurations.resttemplate.common.enums.StatefulRestTemplateInterceptorKeyEnums.FRONT_END_INTERCEPTOR_MAP_KEY;

@Slf4j
public class MerchantDemoFrontEndBuild_FT extends CucumberTest {

    //Need a Token
    //http://192.168.1.49:10000/frontend/setup
    @When("The user access Merchant Demo Front End and Build Bank Panel and Expect Http Status (\\d+)$")
    public void theUserAccessMerchantDemoFrontEndAndBuildInformation(int expectMerchantDemoFrontEndHttpStatus) {

        String htmlBody = FrontEndHttpActions.buildBankPanelInMerchantDemo(expectMerchantDemoFrontEndHttpStatus, FRONT_END_INTERCEPTOR_MAP_KEY);

        Assertions.assertFalse(GenericPredicates.checkIfNullOrEmpty.test(htmlBody));

    }

}
