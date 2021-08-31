package cucumber.api.tests.configurations.endpoints;

import cucumber.api.tests.common.constants.Hosts;
import cucumber.api.tests.common.constants.Ports;

public class MainEndpoints {

    public static final String ADM_CON_ENDPOINT = Hosts.ADMIN_CONSOLE_HOST + Ports.ADMIN_CONSOLE_PORT;
    public static final String MERCHANT_GATEWAY_URL = Hosts.MERCHANT_GATEWAY_SERVER_HOST + Ports.MERCHANT_GATEWAY_SERVER_PORT;
    public static final String MERCHANT_DEMO_URL = Hosts.MERCHANT_DEMO_HOST + Ports.MERCHANT_DEMO_PORT;
    public static final String PAYMENT_PANE_URL = Hosts.PAYMENT_PANEL_HOST + Ports.PAYMENT_PANEL_PORT;

}
