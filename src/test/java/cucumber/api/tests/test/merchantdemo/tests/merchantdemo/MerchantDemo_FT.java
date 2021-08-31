package cucumber.api.tests.test.merchantdemo.tests.merchantdemo;

import cucumber.api.tests.CucumberTest;
import cucumber.api.tests.test.merchantdemo.actions.get.merchantdemo.MerchantDemoGetHttpActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;

import static cucumber.api.tests.configurations.resttemplate.common.enums.StatefulRestTemplateInterceptorKeyEnums.MERCHANT_DEMO_INTERCEPTOR_MAP_KEY;

@Slf4j
public class MerchantDemo_FT extends CucumberTest {

    @Given("Merchant Demo up and running and Expect Http Status (\\d+)$")
    public void merchantDemoUpAndRunningAndExpectHttpStatus(int expectMerchantDemoHttpStatus) {

        MerchantDemoGetHttpActions.getMerchantDemo(expectMerchantDemoHttpStatus, MERCHANT_DEMO_INTERCEPTOR_MAP_KEY);

    }

    //Merchant-Demo
    //GlobexDemoController
    //createSignature
    @When("Access Merchant Demo and Create a Valid Signature (\\d+)$")
    public void accessMerchantDemoAndCreateAValidSignatureExpectMerchantDemoCreateSignatureHttpStatus(int expectMerchantDemoCreateSignatureHttpStatus) {

        String merchantDemoSignature = MerchantDemoGetHttpActions.getMerchantDemoSignature(expectMerchantDemoCreateSignatureHttpStatus, MERCHANT_DEMO_INTERCEPTOR_MAP_KEY);

        log.info("");

    }

    @Then("The user should have a Valid Signature")
    public void theUserShouldHaveAValidSignature() {
    }


}
