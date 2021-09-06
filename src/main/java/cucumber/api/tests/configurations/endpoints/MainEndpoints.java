package cucumber.api.tests.configurations.endpoints;

import cucumber.api.tests.common.constants.env.Hosts;
import cucumber.api.tests.common.constants.env.Ports;

public class MainEndpoints {

    public static final String ADM_CON_ENDPOINT = Hosts.ADMIN_CONSOLE_HOST + Ports.ADMIN_CONSOLE_PORT;
    public static final String BANK_PANEL_ENDPOINT = Hosts.BANK_PANEL_HOST + Ports.BANK_PANEL_PORT;
    public static final String MERCHANT_GATEWAY_SERVER_URL = Hosts.MERCHANT_GATEWAY_SERVER_HOST + Ports.MERCHANT_GATEWAY_SERVER_PORT;
    public static final String MERCHANT_DEMO_URL = Hosts.MERCHANT_DEMO_HOST + Ports.MERCHANT_DEMO_PORT;
    public static final String PAYMENT_PANE_URL = Hosts.PAYMENT_PANEL_HOST + Ports.PAYMENT_PANEL_PORT;
    public static final String FRONT_END_URL = Hosts.FRONT_END_HOST + Ports.FRONT_END_PORT;

}
