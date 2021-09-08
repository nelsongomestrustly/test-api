package cucumber.api.tests.conectors.bankpanel.endpoints;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static cucumber.api.tests.conectors.bankpanel.endpoints.BankPanelEndpoint.BANK_PANEL_ENDPOINT_STEP;
import static cucumber.api.tests.conectors.frontend.endpoints.FrontEndEndpoint.FRONT_END_ENDPOINT;

//fi-gateway
//bank-panel
//PingController
@AllArgsConstructor
@Getter
public enum BankPanelPingEndpoint {

    //index
    //post
    BANK_PANEL_ENDPOINT_PING(BANK_PANEL_ENDPOINT_STEP.getEndpoint() + "/ping");

    private final String endpoint;

}
