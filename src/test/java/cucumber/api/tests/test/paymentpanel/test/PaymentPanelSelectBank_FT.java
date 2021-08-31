package cucumber.api.tests.test.paymentpanel.test;

import cucumber.api.tests.CucumberTest;
import cucumber.api.tests.common.enums.MerchantTypeEnum;
import cucumber.api.tests.common.enums.PaymentProviderEnum;
import cucumber.api.tests.common.predicates.GenericPredicates;
import cucumber.api.tests.samplefiles.common.suppliers.adminconsole.AdmConSearchTransactionsDTOSameSupplier;
import cucumber.api.tests.support.cucumber.context.MyTestContext;
import cucumber.api.tests.test.admconsole.actions.AdmConHttpActions;
import cucumber.api.tests.test.admconsole.data.dto.AdmConSearchTransactionsDTO;
import cucumber.api.tests.test.admconsole.validations.AdmConSearchTransactionsValidations;
import cucumber.api.tests.test.merchantdemo.actions.get.merchantdemo.MerchantDemoGetHttpActions;
import cucumber.api.tests.test.merchantdemo.actions.get.merchantinfo.MerchantInfoGetHttpActions;
import cucumber.api.tests.test.merchantdemo.data.dto.MerchantInfoDTO;
import cucumber.api.tests.test.paymentpanel.actions.PaymentPanelActions;
import cucumber.api.tests.validations.object.GenericObjectValidations;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;

import java.io.IOException;
import java.util.List;

import static cucumber.api.tests.configurations.resttemplate.common.enums.StatefulRestTemplateInterceptorKeyEnums.MERCHANT_DEMO_INTERCEPTOR_MAP_KEY;
import static cucumber.api.tests.configurations.resttemplate.common.enums.StatefulRestTemplateInterceptorKeyEnums.PAYMENT_PANEL_INTERCEPTOR_MAP_KEY;
import static cucumber.api.tests.test.admconsole.common.constants.AdmConSearchTransactionsConstants.ADM_CON_SEARCH_TRANSACTIONS_NO_RESULTS_FOUND;

@Slf4j
public class PaymentPanelSelectBank_FT extends CucumberTest {

    //SelectBankController
    @When("The user access Payment Panel and Select Bank {string} - should get Bank Redirect Url and Expect Http Status {string}")
    public void theUserAccessPaymentPanelAndSelectBankShouldGetBankRedirectUrlAndExpectHttpStatus(String bankName,
                                                                                                  String expectMerchantInfoHttpStatus) throws IOException {

        PaymentProviderEnum paymentProviderEnum = PaymentProviderEnum.valueOf(bankName);

        String redirectUrl = PaymentPanelActions.getSelectBankRedirectUrl(paymentProviderEnum, Integer.parseInt(expectMerchantInfoHttpStatus), PAYMENT_PANEL_INTERCEPTOR_MAP_KEY);

        MyTestContext.getMyTestContext().paymentPanelManager.setBankRedirectUrl(redirectUrl);

    }


    @Then("The user should have a Valid Bank Redirect Url")
    public void theUserShouldHaveAValidBankRedirectUrl() {

        String redirectUrl = MyTestContext.getMyTestContext().paymentPanelManager.getBankRedirectUrl();

        Assertions.assertFalse(GenericPredicates.checkIfNullOrEmpty.test(redirectUrl));

    }

}