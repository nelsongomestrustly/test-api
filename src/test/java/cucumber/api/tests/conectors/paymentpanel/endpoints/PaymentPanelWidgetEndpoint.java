package cucumber.api.tests.conectors.paymentpanel.endpoints;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static cucumber.api.tests.conectors.paymentpanel.endpoints.PaymentPanelEndpoint.PAYMENT_PANEL_ENDPOINT;


//payment-panel
//WarmupController
@AllArgsConstructor
@Getter
public enum PaymentPanelWidgetEndpoint {

    //index
    //get
    PAYMENT_PANEL_WIDGET_ENDPOINT(PAYMENT_PANEL_ENDPOINT.getEndpoint() + "/widget");


    private final String endpoint;

}
