package cucumber.api.tests.conectors.bankpanel.endpoints;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static cucumber.api.tests.conectors.bankpanel.endpoints.BankPanelEndpoint.BANK_PANEL_ENDPOINT_STEP;

//fi-gateway
//bank-panel
//PrintController
@AllArgsConstructor
@Getter
public enum BankPanelPrintEndpoint {

    //index
    //post
    BANK_PANEL_ENDPOINT_PRINT(BANK_PANEL_ENDPOINT_STEP.getEndpoint() + "/print");

    private final String endpoint;

}
