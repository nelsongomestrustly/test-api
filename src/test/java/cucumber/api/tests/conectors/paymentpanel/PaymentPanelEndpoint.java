package cucumber.api.tests.conectors.paymentpanel;

import cucumber.api.tests.configurations.endpoints.MainEndpoints;
import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor
@Getter
public enum PaymentPanelEndpoint {

    PAYMENT_PANEL_ENDPOINT(MainEndpoints.PAYMENT_PANE_URL + "/start"),
    PAYMENT_PANEL_SELECT_BANK_ENDPOINT(PAYMENT_PANEL_ENDPOINT.getEndpoint() + "/selectBank"),
    PAYMENT_PANEL_SELECT_BANK_SELECT_BANK_ENDPOINT(PAYMENT_PANEL_ENDPOINT.getEndpoint() + "/selectBank/selectBank"),
    PAYMENT_PANEL_SELECT_BANK_WIDGET_ENDPOINT(PAYMENT_PANEL_ENDPOINT.getEndpoint() + "/selectBank/widget");

    private final String endpoint;

}
