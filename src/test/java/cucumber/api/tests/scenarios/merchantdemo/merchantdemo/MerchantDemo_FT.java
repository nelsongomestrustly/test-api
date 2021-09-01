package cucumber.api.tests.scenarios.merchantdemo.merchantdemo;

import cucumber.api.tests.CucumberTest;
import cucumber.api.tests.test.merchantdemo.actions.get.merchantdemo.MerchantDemoGetHttpActions;
import cucumber.api.tests.test.merchantdemo.common.suppliers.dto.MerchantDemoGoblexStartDTOSameSupplier;
import cucumber.api.tests.test.merchantdemo.data.dto.MerchantGlobexStartDTO;
import io.cucumber.java.en.Given;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

import static cucumber.api.tests.configurations.resttemplate.common.enums.StatefulRestTemplateInterceptorKeyEnums.MERCHANT_DEMO_INTERCEPTOR_MAP_KEY;
import static cucumber.api.tests.samplefiles.common.constants.merchantdemo.MerchantDemoGlobexStart.MERCHANT_GLOBEX_START;

@Slf4j
public class MerchantDemo_FT extends CucumberTest {

    @Given("Merchant Demo up and running and Expect Http Status (\\d+)$")
    public void merchantDemoUpAndRunningAndExpectHttpStatus(int expectMerchantDemoHttpStatus) throws IOException {

        MerchantGlobexStartDTO merchantGlobexStartDTO = MerchantDemoGoblexStartDTOSameSupplier.getSampleMerchantGlobexStartDTO(MERCHANT_GLOBEX_START);

        MerchantDemoGetHttpActions.getMerchantDemo(
                merchantGlobexStartDTO,
                expectMerchantDemoHttpStatus,
                MERCHANT_DEMO_INTERCEPTOR_MAP_KEY);

    }


}
