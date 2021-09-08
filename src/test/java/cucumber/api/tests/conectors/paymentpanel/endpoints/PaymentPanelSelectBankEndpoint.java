package cucumber.api.tests.conectors.paymentpanel.endpoints;

import cucumber.api.tests.configurations.endpoints.MainEndpoints;
import lombok.AllArgsConstructor;
import lombok.Getter;

import static cucumber.api.tests.conectors.paymentpanel.endpoints.PaymentPanelEndpoint.PAYMENT_PANEL_ENDPOINT;


//payment-panel
//SelectBankController
@AllArgsConstructor
@Getter
public enum PaymentPanelSelectBankEndpoint {

    //index
    //get
    PAYMENT_PANEL_SELECT_BANK_ENDPOINT(PAYMENT_PANEL_ENDPOINT.getEndpoint() + "/selectBank"),

    //selectBank
    //post
    PAYMENT_PANEL_SELECT_BANK_SELECT_BANK_ENDPOINT(PAYMENT_PANEL_SELECT_BANK_ENDPOINT.getEndpoint() + "/selectBank"),

    //widget
    //post and get
    PAYMENT_PANEL_SELECT_BANK_WIDGET_ENDPOINT(PAYMENT_PANEL_SELECT_BANK_ENDPOINT.getEndpoint() + "/widget"),

    //widgetPreview
    //get
    PAYMENT_PANEL_SELECT_BANK_WIDGET_PREVIEW_ENDPOINT(PAYMENT_PANEL_SELECT_BANK_ENDPOINT.getEndpoint() + "/widgetPreview"),

    //search
    //post
    PAYMENT_PANEL_SELECT_BANK_SEARCH_ENDPOINT(PAYMENT_PANEL_SELECT_BANK_ENDPOINT.getEndpoint() + "/search");

    private final String endpoint;

}
