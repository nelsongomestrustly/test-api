package cucumber.api.tests.conectors.paymentpanel.endpoints;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static cucumber.api.tests.conectors.paymentpanel.endpoints.PaymentPanelEndpoint.PAYMENT_PANEL_ENDPOINT;


//payment-panel
//HomeController
@AllArgsConstructor
@Getter
public enum PaymentPanelHomeEndpoint {

    //index
    //get
    PAYMENT_PANEL_HOME_ENDPOINT(PAYMENT_PANEL_ENDPOINT.getEndpoint() + "/home");


    private final String endpoint;

}
