package cucumber.api.tests.scenarios.merchantdemo.merchantdemo;

import cucumber.api.tests.CucumberTest;
import cucumber.api.tests.conectors.merchantdemo.merchantdemo.MerchantDemoHttpActions;
import io.cucumber.java.en.Given;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

import static cucumber.api.tests.configurations.resttemplate.common.enums.StatefulRestTemplateInterceptorKeyEnums.MERCHANT_DEMO_INTERCEPTOR_MAP_KEY;

@Slf4j
public class MerchantDemo_FT extends CucumberTest {

    //frontend-panel
    //SetupController
    @Given("Merchant Demo up and running and Expect Http Status (\\d+)$")
    public void merchantDemoUpAndRunningAndExpectHttpStatus(int expectMerchantDemoHttpStatus) throws IOException {

        //MerchantGlobexStartDTO merchantGlobexStartDTO = MerchantDemoBasicInfoDTOSampleSupplier.getSampleMerchantBasicInfoDTO(MERCHANT_GLOBEX_START);

        MerchantDemoHttpActions.getMerchantDemo(
                expectMerchantDemoHttpStatus,
                MERCHANT_DEMO_INTERCEPTOR_MAP_KEY);

    }


}
