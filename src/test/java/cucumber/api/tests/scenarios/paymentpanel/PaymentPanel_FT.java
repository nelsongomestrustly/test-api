package cucumber.api.tests.scenarios.paymentpanel;

import cucumber.api.tests.CucumberTest;
import cucumber.api.tests.common.enums.DeviceInfoEnum;
import cucumber.api.tests.common.enums.PaymentProviderEnum;
import cucumber.api.tests.common.enums.WidgetIdEnum;
import cucumber.api.tests.support.cucumber.context.MyTestContext;
import cucumber.api.tests.test.paymentpanel.actions.PaymentPanelActions;
import io.cucumber.java.en.Given;
import lombok.extern.slf4j.Slf4j;

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
                MyTestContext.getMyTestContext().merchantDemoManager.getMerchantSignatureDTOList().get(0).getSignature(),
                paymentProviderEnum,
                deviceInfoEnum,
                MyTestContext.getMyTestContext().merchantDemoManager.getMerchantInfoDTOList(),
                WidgetIdEnum.valueOf(widgetId),
                Integer.parseInt(expectPaymentPanelHttpStatus),
                PAYMENT_PANEL_INTERCEPTOR_MAP_KEY);

    }

}