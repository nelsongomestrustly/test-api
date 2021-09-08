package cucumber.api.tests.conectors.paymentpanel.endpoints;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static cucumber.api.tests.conectors.paymentpanel.endpoints.PaymentPanelEndpoint.PAYMENT_PANEL_ENDPOINT;


//payment-panel
//ExternalCallbackController
@AllArgsConstructor
@Getter
public enum PaymentPanelExternalCallBackEndpoint {

    //index
    //post
    PAYMENT_PANEL_EXTERNAL_CALL_BACK_ENDPOINT(PAYMENT_PANEL_ENDPOINT.getEndpoint() + "/externalcallback"),

    //establishTimeout
    //get
    PAYMENT_PANEL_EXTERNAL_CALL_BACK_ESTABLISH_TIME_OUT_ENDPOINT(PAYMENT_PANEL_EXTERNAL_CALL_BACK_ENDPOINT.getEndpoint() + "/establishTimeout");


    private final String endpoint;

}
