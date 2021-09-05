package cucumber.api.tests.scenarios.paymentpanel;

import cucumber.api.tests.CucumberTest;
import cucumber.api.tests.common.predicates.GenericPredicates;
import cucumber.api.tests.data.dto.merchantdemo.MerchantCreateSignatureDTO;
import cucumber.api.tests.data.context.MyTestContext;
import cucumber.api.tests.test.merchantdemo.common.suppliers.html.CreateSignatureSupplier;
import cucumber.api.tests.test.paymentpanel.actions.PaymentPanelActions;
import cucumber.api.tests.test.paymentpanel.common.supplier.dto.PaymentPanelCreateSelectBankDTO;
import cucumber.api.tests.data.dto.paymentpanel.PaymentPanelSelectBankDTO;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;

import java.io.IOException;

import static cucumber.api.tests.configurations.resttemplate.common.enums.StatefulRestTemplateInterceptorKeyEnums.PAYMENT_PANEL_INTERCEPTOR_MAP_KEY;

@Slf4j
public class PaymentPanelSelectBankRedirectUrl_FT extends CucumberTest {

    //SelectBankController
    @When("The user access Payment Panel and Select Bank {string} - should get Bank Redirect Url and Expect Http Status {string}")
    public void theUserAccessPaymentPanelAndSelectBankShouldGetBankRedirectUrlAndExpectHttpStatus(String bankName,
                                                                                                  String expectMerchantInfoHttpStatus) throws IOException {

        //Getting Objects
        MerchantCreateSignatureDTO merchantCreateSignatureDTO
                = CreateSignatureSupplier.populateMerchantCreateSignatureDTOWithPaymentProviderId(bankName);

        PaymentPanelSelectBankDTO paymentPanelSelectBankDTO
                = PaymentPanelCreateSelectBankDTO.getPaymentPanelSelectBankDTO(merchantCreateSignatureDTO);

        //Process
        String redirectUrl = PaymentPanelActions.getSelectBankRedirectUrl
                (merchantCreateSignatureDTO, paymentPanelSelectBankDTO, Integer.parseInt(expectMerchantInfoHttpStatus), PAYMENT_PANEL_INTERCEPTOR_MAP_KEY);

        MyTestContext.getMyTestContext().paymentPanelManager.setBankRedirectUrl(redirectUrl);

    }


    @Then("The user should have a Valid Bank Redirect Url")
    public void theUserShouldHaveAValidBankRedirectUrl() {

        String redirectUrl = MyTestContext.getMyTestContext().paymentPanelManager.getBankRedirectUrl();

        Assertions.assertFalse(GenericPredicates.checkIfNullOrEmpty.test(redirectUrl));

    }

}