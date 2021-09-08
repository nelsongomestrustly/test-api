package cucumber.api.tests.conectors.paymentpanel.endpoints;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static cucumber.api.tests.conectors.paymentpanel.endpoints.PaymentPanelEndpoint.PAYMENT_PANEL_ENDPOINT;


//payment-panel
//WarmupController
@AllArgsConstructor
@Getter
public enum PaymentPanelWarmUpEndpoint {

    //index
    //get
    PAYMENT_PANEL_WARM_UP_ENDPOINT(PAYMENT_PANEL_ENDPOINT.getEndpoint() + "/warmup");


    private final String endpoint;

}
