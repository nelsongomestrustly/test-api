package cucumber.api.tests.conectors.admconsole.endpoints;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static cucumber.api.tests.conectors.admconsole.endpoints.AdmConEndpoint.ADM_CON_ADM_CON_ENDPOINT;
import static cucumber.api.tests.conectors.bankpanel.endpoints.BankPanelEndpoint.BANK_PANEL_ENDPOINT_STEP;

//admin-console
//PingController
@AllArgsConstructor
@Getter
public enum AdmConPingEndpoint {

    //index
    //get
    ADM_CON_PING_ENDPOINT(ADM_CON_ADM_CON_ENDPOINT.getEndpoint() + "/ping");

    private final String endpoint;

}
