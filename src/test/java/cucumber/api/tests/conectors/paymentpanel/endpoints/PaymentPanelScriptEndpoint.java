package cucumber.api.tests.conectors.paymentpanel.endpoints;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static cucumber.api.tests.conectors.paymentpanel.endpoints.PaymentPanelEndpoint.PAYMENT_PANEL_ENDPOINT;


//payment-panel
//ScriptsController
@AllArgsConstructor
@Getter
public enum PaymentPanelScriptEndpoint {

    //index
    //get
    PAYMENT_PANEL_SCRIPT_ENDPOINT(PAYMENT_PANEL_ENDPOINT.getEndpoint() + "/script"),

    //index
    //post
    PAYMENT_PANEL_UPDATE_PWMB_WIDGET_MAP_ENDPOINT(PAYMENT_PANEL_ENDPOINT.getEndpoint() + "/updatePWMBWidgetMap");


    private final String endpoint;

}
