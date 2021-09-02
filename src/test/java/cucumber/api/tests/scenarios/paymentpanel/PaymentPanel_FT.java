package cucumber.api.tests.scenarios.paymentpanel;

import cucumber.api.tests.CucumberTest;
import cucumber.api.tests.test.merchantdemo.common.suppliers.dto.signature.MerchantDemoCreateSignatureDTOSameSupplier;
import cucumber.api.tests.test.merchantdemo.data.dto.MerchantCreateSignatureDTO;
import cucumber.api.tests.test.paymentpanel.actions.PaymentPanelActions;
import io.cucumber.java.en.Given;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

import static cucumber.api.tests.configurations.resttemplate.common.enums.StatefulRestTemplateInterceptorKeyEnums.PAYMENT_PANEL_INTERCEPTOR_MAP_KEY;

@Slf4j
public class PaymentPanel_FT extends CucumberTest {

    //payment-panel
    //HomeController
    //SelectBankController
    @SneakyThrows
    @Given("Payment Panel up and running and We are using Merchant Signature {string} Expect Http Status {string}")
    public void paymentPanelUpAndRunningAndWeAreUsingWidgetExpectHttpStatus(String fileName, String expectPaymentPanelHttpStatus) {

        MerchantCreateSignatureDTO merchantCreateSignatureDTO
                = MerchantDemoCreateSignatureDTOSameSupplier.getSampleMerchantCreateSignatureDTO(fileName);

        PaymentPanelActions.getPaymentPanel(
                merchantCreateSignatureDTO,
                Integer.parseInt(expectPaymentPanelHttpStatus),
                PAYMENT_PANEL_INTERCEPTOR_MAP_KEY);

    }

}