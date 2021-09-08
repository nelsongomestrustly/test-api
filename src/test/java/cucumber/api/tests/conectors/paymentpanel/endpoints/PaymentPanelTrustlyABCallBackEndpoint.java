package cucumber.api.tests.conectors.paymentpanel.endpoints;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static cucumber.api.tests.conectors.paymentpanel.endpoints.PaymentPanelEndpoint.PAYMENT_PANEL_ENDPOINT;


//payment-panel
//TrustlyABCallbackController
@AllArgsConstructor
@Getter
public enum PaymentPanelTrustlyABCallBackEndpoint {

    //index
    //get
    PAYMENT_PANEL_TRUSTLY_AB_CALL_BACK_ENDPOINT(PAYMENT_PANEL_ENDPOINT.getEndpoint() + "/trustlyabcallback");


    private final String endpoint;

}
