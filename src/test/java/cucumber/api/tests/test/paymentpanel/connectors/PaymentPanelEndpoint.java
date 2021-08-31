package cucumber.api.tests.test.paymentpanel.connectors;

import cucumber.api.tests.configurations.endpoints.MainEndpoints;
import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor
@Getter
public enum PaymentPanelEndpoint {

    PAYMENT_PANEL_ENDPOINT(MainEndpoints.PAYMENT_PANE_URL + "/start"),
    PAYMENT_PANEL_SELECT_BANK_ENDPOINT(PAYMENT_PANEL_ENDPOINT.getEndpoint() + "/selectBank/selectBank");

    private final String endpoint;

}
