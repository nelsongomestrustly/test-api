package cucumber.api.tests.conectors.paymentpanel.endpoints;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static cucumber.api.tests.conectors.paymentpanel.endpoints.PaymentPanelEndpoint.PAYMENT_PANEL_ENDPOINT;


//payment-panel
//CallbackController
@AllArgsConstructor
@Getter
public enum PaymentPanelCallBackEndpoint {

    //index
    //post
    PAYMENT_PANEL_CALL_BACK_ENDPOINT(PAYMENT_PANEL_ENDPOINT.getEndpoint() + "/callback"),

    //rtn
    //get and post
    PAYMENT_PANEL_CALL_BACK_RTN_ENDPOINT(PAYMENT_PANEL_CALL_BACK_ENDPOINT.getEndpoint() + "/rtn"),

    //can
    //get and post
    PAYMENT_PANEL_CALL_BACK_CAN_ENDPOINT(PAYMENT_PANEL_CALL_BACK_ENDPOINT.getEndpoint() + "/can");

    private final String endpoint;

}
