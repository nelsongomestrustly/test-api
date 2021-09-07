package cucumber.api.tests.scenarios.paymentpanel;

import cucumber.api.tests.CucumberTest;
import cucumber.api.tests.common.enums.TokenEnv;
import cucumber.api.tests.data.dto.merchantdemo.MerchantCreateSignatureDTO;
import cucumber.api.tests.data.dto.paymentpanel.PaymentPanelCreateWidgetDTO;
import cucumber.api.tests.data.dto.token.TokenDTO;
import cucumber.api.tests.data.context.MyTestContext;
import cucumber.api.tests.test.merchantdemo.common.suppliers.html.CreateSignatureSupplier;
import cucumber.api.tests.test.paymentpanel.actions.PaymentPanelActions;
import io.cucumber.java.en.Then;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;

import java.io.IOException;

import static cucumber.api.tests.configurations.resttemplate.common.enums.StatefulRestTemplateInterceptorKeyEnums.PAYMENT_PANEL_INTERCEPTOR_MAP_KEY;

@Slf4j
public class PaymentPanelSelectBank_FT extends CucumberTest {

    //payment-panel
    //HomeController
    //SelectBankController
    //Index
    @Then("The user opens {string} and Expect Http Status {string}")
    public void paymentPanelUpAndRunningAndWeAreUsingWidgetExpectHttpStatus(String bankName, String expectPaymentPanelHttpStatus) throws IOException {

        MerchantCreateSignatureDTO merchantCreateSignatureDTO = CreateSignatureSupplier.populateMerchantCreateSignatureDTOWithPaymentProviderId(bankName);
        PaymentPanelCreateWidgetDTO firstPaymentPanelCreateWidgetDTO = MyTestContext.getMyTestContext().paymentPanelManager.getFirstPaymentPanelCreateWidgetDTO();

        TokenDTO merchantTransactionToken = PaymentPanelActions.getMerchantTransactionToken(
                merchantCreateSignatureDTO,
                firstPaymentPanelCreateWidgetDTO,
                Integer.parseInt(expectPaymentPanelHttpStatus),
                PAYMENT_PANEL_INTERCEPTOR_MAP_KEY);

        merchantTransactionToken.setTokenEnv(TokenEnv.MERCHANT_DEMO_FRONT_END_SETUP);

        MyTestContext.getMyTestContext().tokenManager.addTokenDTO(merchantTransactionToken);

    }

    @Then("The user should have a Valid Token")
    public void theUserShouldHaveAValidSignature() {

        Assertions.assertTrue(MyTestContext.getMyTestContext().tokenManager.getTokenDTOList()
                .stream()
                        .anyMatch(env -> env.getTokenEnv().equals(TokenEnv.MERCHANT_DEMO_FRONT_END_SETUP)));

    }



}