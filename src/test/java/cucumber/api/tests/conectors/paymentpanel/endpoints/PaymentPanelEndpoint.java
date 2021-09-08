package cucumber.api.tests.conectors.paymentpanel.endpoints;

import cucumber.api.tests.configurations.endpoints.MainEndpoints;
import lombok.AllArgsConstructor;
import lombok.Getter;


//payment-panel
@AllArgsConstructor
@Getter
public enum PaymentPanelEndpoint {

    PAYMENT_PANEL_ENDPOINT(MainEndpoints.PAYMENT_PANE_URL + "/start");

    private final String endpoint;

}
