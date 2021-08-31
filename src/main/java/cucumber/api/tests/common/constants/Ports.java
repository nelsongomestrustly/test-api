package cucumber.api.tests.common.constants;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class Ports {

    public static String ADMIN_CONSOLE_PORT;
    public static String MERCHANT_GATEWAY_SERVER_PORT;
    public static String MERCHANT_DEMO_PORT;

    @Value("${admin.console.port}")
    public void setAdminConsolePort(String adminConsolePort) {
        ADMIN_CONSOLE_PORT = adminConsolePort;
    }

    @Value("${merchant.gateway.server.port}")
    public void setMerchantGatewayServerPort(String merchantGatewayServerPort) {
        MERCHANT_GATEWAY_SERVER_PORT = merchantGatewayServerPort;
    }

    @Value("${merchant.demo.port}")
    public void setMerchantDemoPort(String merchantDemoPort) {
        MERCHANT_DEMO_PORT = merchantDemoPort;
    }

}
