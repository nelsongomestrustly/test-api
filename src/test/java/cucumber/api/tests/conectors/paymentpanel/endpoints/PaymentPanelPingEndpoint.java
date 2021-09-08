package cucumber.api.tests.conectors.paymentpanel.endpoints;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static cucumber.api.tests.conectors.paymentpanel.endpoints.PaymentPanelEndpoint.PAYMENT_PANEL_ENDPOINT;


//payment-panel
//PingController
@AllArgsConstructor
@Getter
public enum PaymentPanelPingEndpoint {

    //index
    //get
    PAYMENT_PANEL_PING_ENDPOINT(PAYMENT_PANEL_ENDPOINT.getEndpoint() + "/ping");


    private final String endpoint;

}
