package cucumber.api.tests.scenarios.paymentpanel;

import cucumber.api.tests.CucumberTest;
import cucumber.api.tests.data.dto.bankpanel.BankPanelRedirectUrlDTO;
import cucumber.api.tests.data.dto.frontend.FrontEndSetupDTO;
import cucumber.api.tests.data.dto.merchantdemo.MerchantCreateSignatureDTO;
import cucumber.api.tests.data.context.MyTestContext;
import cucumber.api.tests.data.dto.token.TokenDTO;
import cucumber.api.tests.conectors.paymentpanel.PaymentPanelActions;
import cucumber.api.tests.validations.bank.BankPanelValidation;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

import static cucumber.api.tests.configurations.resttemplate.common.enums.StatefulRestTemplateInterceptorKeyEnums.PAYMENT_PANEL_INTERCEPTOR_MAP_KEY;

@Slf4j
public class PaymentPanelSelectBankRedirectUrl_FT extends CucumberTest {

    /**
     *
     * Payment Panel
     * SelectBankController
     * selectBank()
     *
     * Expect
     * "ppTransactionId" -> {String[1]@8024} ["ptx-Z2KgxR0sg9S..."]
     * "merchantId" -> {String[1]@8026} ["110005514"]
     * "orderId" -> {String[1]@8028} [""]
     * "showManualEntryReason" -> {String[1]@8030} [""]
     * "lt" -> {String[1]@8032} [""]
     * "lang" -> {String[1]@8034} ["en"]
     * "paymentProviderId" -> {String[1]@8036} ["200005501"]
     * "transactionId" -> {String[1]@8038} ["1001156981"]
     *
     *
     */
    @Then("The user access Payment Panel should get Bank Redirect Url and Expect Http Status {string}")
    public void theUserAccessPaymentPanelAndSelectBankShouldGetBankRedirectUrlAndExpectHttpStatus(String expectMerchantInfoHttpStatus) throws IOException {

        MerchantCreateSignatureDTO merchantCreateSignatureDTO
                = MyTestContext.getMyTestContext().merchantDemoManager.getFirstMerchantCreateSignatureDTO();

        FrontEndSetupDTO frontEndSetupDTO
                = MyTestContext.getMyTestContext().frontEndManager.getFirstFrontEndSetupDTO();

        TokenDTO tokenDTO
                = MyTestContext.getMyTestContext().tokenManager.getFirstTokenDTO();

        //Process
        BankPanelRedirectUrlDTO bankPanelRedirectUrlDTO = PaymentPanelActions.getSelectBankRedirectUrl
                (merchantCreateSignatureDTO, frontEndSetupDTO, tokenDTO, Integer.parseInt(expectMerchantInfoHttpStatus), PAYMENT_PANEL_INTERCEPTOR_MAP_KEY);

        MyTestContext.getMyTestContext().bankManager.addBankRedirectUrlDTO(bankPanelRedirectUrlDTO);

    }


    @And("The user should have a Valid Bank Redirect Url")
    public void theUserShouldHaveAValidBankRedirectUrl() {

        BankPanelRedirectUrlDTO firstBankPanelRedirectUrlDTO = MyTestContext.getMyTestContext().bankManager.getFirstBankRedirectUrlDTO();

        BankPanelValidation.validateBankRedirectUrlDTO.accept(firstBankPanelRedirectUrlDTO);

    }

}