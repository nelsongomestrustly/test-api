package cucumber.api.tests.scenarios.merchantdemo.paymentflows;

import cucumber.api.tests.CucumberTest;
import cucumber.api.tests.data.context.MyTestContext;
import cucumber.api.tests.conectors.merchantdemo.paymentflows.MerchantDemoPaymentFlowsGetHttpActions;
import cucumber.api.tests.data.dto.paymentflows.PaymentFlowsDTO;
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

        List<PaymentFlowsDTO> merchantPaymentFlows = MerchantDemoPaymentFlowsGetHttpActions.getMerchantPaymentFlows(expectPaymentFlowsHttpStatus, MERCHANT_DEMO_INTERCEPTOR_MAP_KEY);

        MyTestContext.getMyTestContext().merchantDemoManager.addAllPaymentFlowsDTO(merchantPaymentFlows);

    }

    @Then("The user should have a Not Empty and Not Null Payment Flows List Object")
    public void theUserShouldHaveANotEmptyAndNotNullPaymentFlowsListObject() {

        List<PaymentFlowsDTO> paymentFlowsDTOS = MyTestContext.getMyTestContext().merchantDemoManager.getPaymentFlowsDTOList();

        GenericObjectValidations.validateIfAllFieldAreNotNullNotEmpty(paymentFlowsDTOS);

    }


}
