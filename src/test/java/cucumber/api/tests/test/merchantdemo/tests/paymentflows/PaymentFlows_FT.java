package cucumber.api.tests.test.merchantdemo.tests.paymentflows;

import cucumber.api.tests.CucumberTest;
import cucumber.api.tests.support.cucumber.context.MyTestContext;
import cucumber.api.tests.test.merchantdemo.actions.get.merchantinfo.MerchantInfoGetHttpActions;
import cucumber.api.tests.test.merchantdemo.actions.get.paymentflows.PaymentFlowsGetHttpActions;
import cucumber.api.tests.test.merchantdemo.data.dto.MerchantInfoDTO;
import cucumber.api.tests.test.merchantdemo.data.dto.PaymentFlowDTO;
import cucumber.api.tests.test.merchantdemo.data.dto.PaymentFlowsDTO;
import cucumber.api.tests.validations.object.GenericObjectValidations;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.util.List;

import static cucumber.api.tests.configurations.resttemplate.common.enums.StatefulRestTemplateInterceptorKeyEnums.MERCHANT_DEMO_INTERCEPTOR_MAP_KEY;

@Slf4j
public class PaymentFlows_FT extends CucumberTest {


    @When("The user access Merchant Demo should get Payment Flows information and Expect Http Status (\\d+)$")
    public void theUserAccessMerchantDemoShouldGetPaymentFlowsInformationAndExpectHttpStatusExpectPaymentFlowHttpStatus(int expectPaymentFlowsHttpStatus) throws IOException {

        List<PaymentFlowsDTO> merchantPaymentFlows = PaymentFlowsGetHttpActions.getMerchantPaymentFlows(expectPaymentFlowsHttpStatus, MERCHANT_DEMO_INTERCEPTOR_MAP_KEY);

        MyTestContext.getMyTestContext().merchantDemoManager.addAllPaymentFlowsDTO(merchantPaymentFlows);

    }

    @Then("The user should have a Not Empty and Not Null Payment Flows List Object")
    public void theUserShouldHaveANotEmptyAndNotNullPaymentFlowsListObject() {

        List<PaymentFlowsDTO> paymentFlowsDTOS = MyTestContext.getMyTestContext().merchantDemoManager.getPaymentFlowsDTOList();

        GenericObjectValidations.validateIfAllFieldAreNotNullNotEmpty(paymentFlowsDTOS);

    }

}
