package cucumber.api.tests.scenarios.paymentpanel;

import cucumber.api.tests.CucumberTest;
import cucumber.api.tests.common.enums.TokenEnv;
import cucumber.api.tests.common.predicates.GenericPredicates;
import cucumber.api.tests.common.security.TokenDTO;
import cucumber.api.tests.scenarios.myenv.MyContext_FT;
import cucumber.api.tests.support.cucumber.context.MyTestContext;
import cucumber.api.tests.support.cucumber.managers.TokenManager;
import cucumber.api.tests.test.merchantdemo.common.suppliers.dto.signature.MerchantDemoCreateSignatureDTOSameSupplier;
import cucumber.api.tests.test.merchantdemo.data.dto.MerchantCreateSignatureDTO;
import cucumber.api.tests.test.paymentpanel.actions.PaymentPanelActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;

import static cucumber.api.tests.configurations.resttemplate.common.enums.StatefulRestTemplateInterceptorKeyEnums.PAYMENT_PANEL_INTERCEPTOR_MAP_KEY;

@Slf4j
public class PaymentPanelSelectBank_FT extends CucumberTest {

    //payment-panel
    //HomeController
    //SelectBankController
    @SneakyThrows
    @Given("Payment Panel up and running and We are using Merchant Signature {string} Expect Http Status {string}")
    public void paymentPanelUpAndRunningAndWeAreUsingWidgetExpectHttpStatus(String fileName, String expectPaymentPanelHttpStatus) {

        MerchantCreateSignatureDTO merchantCreateSignatureDTO
                = MerchantDemoCreateSignatureDTOSameSupplier.getSampleMerchantCreateSignatureDTO(fileName);

        TokenDTO merchantTransactionToken = PaymentPanelActions.getMerchantTransactionToken(
                merchantCreateSignatureDTO,
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