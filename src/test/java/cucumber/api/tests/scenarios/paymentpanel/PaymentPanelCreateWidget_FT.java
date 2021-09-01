package cucumber.api.tests.scenarios.paymentpanel;

import cucumber.api.tests.CucumberTest;
import cucumber.api.tests.common.predicates.GenericPredicates;
import cucumber.api.tests.support.cucumber.context.MyTestContext;
import cucumber.api.tests.test.merchantdemo.actions.get.merchantdemo.MerchantDemoGetHttpActions;
import cucumber.api.tests.test.merchantdemo.data.dto.MerchantSignatureDTO;
import cucumber.api.tests.test.paymentpanel.actions.PaymentPanelActions;
import cucumber.api.tests.test.paymentpanel.common.enums.dto.CreatePaymentWidgetDTOSameSupplier;
import cucumber.api.tests.test.paymentpanel.common.enums.html.CreatePaymentPanelWidgetSupplier;
import cucumber.api.tests.test.paymentpanel.data.dto.PaymentPanelCreateWidgetDTO;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;

import java.io.IOException;

import static cucumber.api.tests.configurations.resttemplate.common.enums.StatefulRestTemplateInterceptorKeyEnums.MERCHANT_DEMO_INTERCEPTOR_MAP_KEY;

@Slf4j
public class PaymentPanelCreateWidget_FT extends CucumberTest {

    //payment-panel
    //SelectBankController
    //widget()
    @When("The user access Payment Panel Widget Endpoint should get Widget {string} Info information and Expect Http Status {string}")
    public void theUserAccessMerchantDemoShouldGetWidgetInfoInformationAndExpectHttpStatus(String fileName, String payWidHttpSta) throws IOException {

        //Get AdminConsoleSearchTransactionsDTO from Sample Files
        PaymentPanelCreateWidgetDTO paymentPanelCreateWidgetDTO
                = CreatePaymentWidgetDTOSameSupplier.getSampleAdminConsoleSearchTransactionsDTO(fileName);

        PaymentPanelCreateWidgetDTO paymentPanelWidget = PaymentPanelActions.getPaymentPanelWidget(
                paymentPanelCreateWidgetDTO,
                Integer.parseInt(payWidHttpSta),
                MERCHANT_DEMO_INTERCEPTOR_MAP_KEY);

        MyTestContext.getMyTestContext().paymentPanelManager.addPaymentPanelCreateWidgetDTO(paymentPanelWidget);

    }

    @Then("The user should have a Valid Widget Object")
    public void theUserShouldHaveAValidWidgetObject() {

        Assertions.assertFalse(GenericPredicates.checkIfNullOrEmpty.test(MyTestContext.getMyTestContext().paymentPanelManager.getPaymentPanelCreateWidgetDTOList()));

    }

}