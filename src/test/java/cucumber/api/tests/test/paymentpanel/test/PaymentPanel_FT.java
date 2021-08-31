package cucumber.api.tests.test.paymentpanel.test;

import cucumber.api.tests.CucumberTest;
import cucumber.api.tests.common.enums.DeviceInfoEnum;
import cucumber.api.tests.common.enums.MerchantTypeEnum;
import cucumber.api.tests.common.enums.PaymentProviderEnum;
import cucumber.api.tests.common.enums.WidgetIdEnum;
import cucumber.api.tests.support.cucumber.context.MyTestContext;
import cucumber.api.tests.test.merchantdemo.actions.get.merchantdemo.MerchantDemoGetHttpActions;
import cucumber.api.tests.test.merchantdemo.actions.get.merchantinfo.MerchantInfoGetHttpActions;
import cucumber.api.tests.test.merchantdemo.data.dto.MerchantInfoDTO;
import cucumber.api.tests.test.paymentpanel.actions.PaymentPanelActions;
import cucumber.api.tests.validations.object.GenericObjectValidations;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.util.List;

import static cucumber.api.tests.configurations.resttemplate.common.enums.StatefulRestTemplateInterceptorKeyEnums.MERCHANT_DEMO_INTERCEPTOR_MAP_KEY;
import static cucumber.api.tests.configurations.resttemplate.common.enums.StatefulRestTemplateInterceptorKeyEnums.PAYMENT_PANEL_INTERCEPTOR_MAP_KEY;

@Slf4j
public class PaymentPanel_FT extends CucumberTest {

    //payment-panel
    //HomeController
    //SelectBankController
    @Given("Payment Panel up and running and We are using Widget {string} Expect Http Status {string}")
    public void paymentPanelUpAndRunningAndWeAreUsingWidgetExpectHttpStatus(String widgetId, String expectPaymentPanelHttpStatus) {

        PaymentProviderEnum paymentProviderEnum = PaymentProviderEnum.valueOf("DEMO_BANK");
        DeviceInfoEnum deviceInfoEnum = DeviceInfoEnum.valueOf("DESKTOP_WEB");

        PaymentPanelActions.getPaymentPanel(
                paymentProviderEnum,
                deviceInfoEnum,
                MyTestContext.getMyTestContext().merchantDemoManager.getMerchantInfoDTOList(),
                WidgetIdEnum.valueOf(widgetId),
                Integer.parseInt(expectPaymentPanelHttpStatus),
                PAYMENT_PANEL_INTERCEPTOR_MAP_KEY);

    }
}