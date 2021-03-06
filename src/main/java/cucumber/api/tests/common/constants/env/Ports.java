package cucumber.api.tests.common.constants.env;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class Ports {

    public static String ADMIN_CONSOLE_PORT;
    public static String BANK_PANEL_PORT;
    public static String MERCHANT_GATEWAY_SERVER_PORT;
    public static String MERCHANT_DEMO_PORT;
    public static String PAYMENT_PANEL_PORT;
    public static String FRONT_END_PORT;

    @Value("${admin.console.port}")
    public void setAdminConsolePort(String adminConsolePort) {
        ADMIN_CONSOLE_PORT = adminConsolePort;
    }

    @Value("${bank.panel.port}")
    public void setBankPanelPort(String bankPanelPort) {
        BANK_PANEL_PORT = bankPanelPort;
    }

    @Value("${front.end.port}")
    public void setFrontEndPort(String frontEndPort) {
        FRONT_END_PORT = frontEndPort;
    }

    @Value("${merchant.demo.port}")
    public void setMerchantDemoPort(String merchantDemoPort) {
        MERCHANT_DEMO_PORT = merchantDemoPort;
    }

    @Value("${merchant.gateway.server.port}")
    public void setMerchantGatewayServerPort(String merchantGatewayServerPort) {
        MERCHANT_GATEWAY_SERVER_PORT = merchantGatewayServerPort;
    }

    @Value("${payment.panel.port}")
    public void setPaymentPanelPort(String paymentPanelPort) {
        PAYMENT_PANEL_PORT = paymentPanelPort;
    }


}
