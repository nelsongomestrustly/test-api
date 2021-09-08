package cucumber.api.tests.conectors.paymentpanel.endpoints;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static cucumber.api.tests.conectors.paymentpanel.endpoints.PaymentPanelEndpoint.PAYMENT_PANEL_ENDPOINT;


//payment-panel
//MessageController
@AllArgsConstructor
@Getter
public enum PaymentPanelMessageEndpoint {

    //index
    //get
    PAYMENT_PANEL_EXTERNAL_MESSAGE_ENDPOINT(PAYMENT_PANEL_ENDPOINT.getEndpoint() + "/message"),

    //index
    //get
    PAYMENT_PANEL_EXTERNAL_MESSAGE_INVALID_BROWSER_ENDPOINT(PAYMENT_PANEL_EXTERNAL_MESSAGE_ENDPOINT.getEndpoint() + "/invalidBrowser");


    private final String endpoint;

}
