package cucumber.api.tests.scenarios.merchantdemo.merchantinfo;

import cucumber.api.tests.CucumberTest;
import cucumber.api.tests.common.enums.MerchantTypeEnum;
import cucumber.api.tests.data.dto.merchantdemo.MerchantBasicInfoDTO;
import cucumber.api.tests.support.cucumber.context.MyTestContext;
import cucumber.api.tests.test.merchantdemo.actions.get.merchantinfo.MerchantInfoGetHttpActions;
import cucumber.api.tests.validations.object.GenericObjectValidations;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;
import java.util.List;

import static cucumber.api.tests.configurations.resttemplate.common.enums.StatefulRestTemplateInterceptorKeyEnums.MERCHANT_DEMO_INTERCEPTOR_MAP_KEY;

public class MerchantInfo_FT extends CucumberTest {

    //GlobexDemoController
    @When("The user access Merchant Demo should get Merchant {string} Info information and Expect Http Status {string}")
    public void theUserAccessMerchantDemoShouldGetMerchantInfoInformationAndExpectHttpStatusExpectMerchantInfoHttpStatus(
            String merchantName,
            String expectMerchantInfoHttpStatus) throws IOException {

        MerchantTypeEnum merchantTypeEnum = MerchantTypeEnum.valueOf(merchantName);

        List<MerchantBasicInfoDTO> merchantBasicInfoDTOList = MerchantInfoGetHttpActions.getMerchantsInfo(merchantTypeEnum, Integer.parseInt(expectMerchantInfoHttpStatus), MERCHANT_DEMO_INTERCEPTOR_MAP_KEY);

        //MyTestContext.getMyTestContext().merchantDemoManager.addAllMerchantInfoDTO(merchantBasicInfoDTOList);

    }

    @Then("The user should have a Not Empty and Not Null Merchant Info List Object")
    public void theUserShouldHaveANotEmptyAndNotNullMerchantInfoListObject() {

        List<MerchantBasicInfoDTO> merchantBasicInfoDTOList = MyTestContext.getMyTestContext().merchantDemoManager.getMerchantBasicInfoDTOList();

        GenericObjectValidations.validateIfAllFieldAreNotNullNotEmpty(merchantBasicInfoDTOList);

    }

}
