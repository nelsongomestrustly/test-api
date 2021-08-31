package cucumber.api.tests.common.constants;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class Hosts {

    public static String ADMIN_CONSOLE_HOST;
    public static String MERCHANT_GATEWAY_SERVER_HOST;
    public static String MERCHANT_DEMO_HOST;

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




}
