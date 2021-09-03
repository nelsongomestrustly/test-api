package cucumber.api.tests.common.constants.env;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class Hosts {

    public static String MAIN_HOST;
    public static String ADMIN_CONSOLE_HOST;
    public static String MERCHANT_GATEWAY_SERVER_HOST;
    public static String MERCHANT_DEMO_HOST;
    public static String PAYMENT_PANEL_HOST;
    public static String FRONT_END_HOST;

    @Value("${main.host}")
    public void setMainHost(String mainHost) {
        MAIN_HOST = mainHost;
    }


    @Value("${admin.console.host}")
    public void setAdminConsoleHost(String adminConsoleHost) {
        ADMIN_CONSOLE_HOST = adminConsoleHost;
    }

    @Value("${merchant.gateway.server.host}")
    public void setMerchantGatewayServerHost(String merchantGatewayServerHost) {
        MERCHANT_GATEWAY_SERVER_HOST = merchantGatewayServerHost;
    }

    @Value("${merchant.demo.host}")
    public void setMerchantDemoHost(String merchantDemoHost) {
        MERCHANT_DEMO_HOST = merchantDemoHost;
    }

    @Value("${payment.panel.host}")
    public void setPaymentPanelHost(String paymentPanelHost) {
        PAYMENT_PANEL_HOST = paymentPanelHost;
    }

    @Value("${front.end.host}")
    public void setFrontEndHost(String frontEndHost) {
        FRONT_END_HOST = frontEndHost;
    }


}
