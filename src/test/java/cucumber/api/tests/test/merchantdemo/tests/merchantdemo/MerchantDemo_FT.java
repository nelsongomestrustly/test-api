package cucumber.api.tests.test.merchantdemo.tests.merchantdemo;

import cucumber.api.tests.CucumberTest;
import cucumber.api.tests.test.merchantdemo.actions.get.merchantdemo.MerchantDemoGetHttpActions;
import io.cucumber.java.en.Given;

import static cucumber.api.tests.configurations.resttemplate.common.enums.StatefulRestTemplateInterceptorKeyEnums.MERCHANT_DEMO_INTERCEPTOR_MAP_KEY;

public class MerchantDemo_FT extends CucumberTest {

    @Given("Merchant Demo up and running and Expect Http Status (\\d+)$")
    public void merchantDemoUpAndRunningAndExpectHttpStatus(int expectMerchantDemoHttpStatus) {

        MerchantDemoGetHttpActions.getMerchantDemo(expectMerchantDemoHttpStatus, MERCHANT_DEMO_INTERCEPTOR_MAP_KEY);

    }

}
