package cucumber.api.tests.test.merchantdemo.tests.merchantinfo;

import cucumber.api.tests.CucumberTest;
import cucumber.api.tests.common.enums.MerchantTypeEnum;
import cucumber.api.tests.support.common.users.data.TestParticipantDTO;
import cucumber.api.tests.support.common.users.services.TestParticipantServices;
import cucumber.api.tests.support.cucumber.context.MyTestContext;
import cucumber.api.tests.test.merchantdemo.actions.get.merchantinfo.MerchantInfoGetHttpActions;
import cucumber.api.tests.test.merchantdemo.actions.get.paymentflows.PaymentFlowsGetHttpActions;
import cucumber.api.tests.test.merchantdemo.data.dto.MerchantInfoDTO;
import cucumber.api.tests.test.merchantdemo.data.dto.PaymentFlowDTO;
import cucumber.api.tests.test.merchantdemo.data.dto.PaymentFlowsDTO;
import cucumber.api.tests.validations.object.GenericObjectValidations;
import io.cucumber.java.en.Given;
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

        List<MerchantInfoDTO> merchantInfoDTOList = MerchantInfoGetHttpActions.getMerchantsInfo(merchantTypeEnum, Integer.parseInt(expectMerchantInfoHttpStatus), MERCHANT_DEMO_INTERCEPTOR_MAP_KEY);

        MyTestContext.getMyTestContext().merchantDemoManager.addAllMerchantInfoDTO(merchantInfoDTOList);

    }

    @Then("The user should have a Not Empty and Not Null Merchant Info List Object")
    public void theUserShouldHaveANotEmptyAndNotNullMerchantInfoListObject() {

        List<MerchantInfoDTO> merchantInfoDTOList = MyTestContext.getMyTestContext().merchantDemoManager.getMerchantInfoDTOList();

        GenericObjectValidations.validateIfAllFieldAreNotNullNotEmpty(merchantInfoDTOList);

    }

}
