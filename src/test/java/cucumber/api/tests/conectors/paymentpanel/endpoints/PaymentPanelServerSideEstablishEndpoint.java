package cucumber.api.tests.conectors.paymentpanel.endpoints;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static cucumber.api.tests.conectors.paymentpanel.endpoints.PaymentPanelEndpoint.PAYMENT_PANEL_ENDPOINT;


//payment-panel
//ServerSideEstablishController
@AllArgsConstructor
@Getter
public enum PaymentPanelServerSideEstablishEndpoint {

    //index
    //post
    PAYMENT_PANEL_SERVER_SIDE_ESTABLISH_ENDPOINT(PAYMENT_PANEL_ENDPOINT.getEndpoint() + "/serversideestablish"),

    //establish
    //get
    PAYMENT_PANEL_SERVER_SIDE_ESTABLISH_ESTABLISH_ENDPOINT(PAYMENT_PANEL_SERVER_SIDE_ESTABLISH_ENDPOINT.getEndpoint() + "/establish"),

    //rtn
    //get
    PAYMENT_PANEL_SERVER_SIDE_RTN_ENDPOINT(PAYMENT_PANEL_SERVER_SIDE_ESTABLISH_ENDPOINT.getEndpoint() + "/rtn"),

    //can
    //get
    PAYMENT_PANEL_SERVER_SIDE_CAN_ENDPOINT(PAYMENT_PANEL_SERVER_SIDE_ESTABLISH_ENDPOINT.getEndpoint() + "/can");

    private final String endpoint;

}
