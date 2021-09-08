package cucumber.api.tests.conectors.paymentpanel.endpoints;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static cucumber.api.tests.conectors.paymentpanel.endpoints.PaymentPanelEndpoint.PAYMENT_PANEL_ENDPOINT;


//payment-panel
//AssetController
@AllArgsConstructor
@Getter
public enum PaymentPanelAssetEndpoint {

    //index
    //get
    PAYMENT_PANEL_ASSET_ENDPOINT(PAYMENT_PANEL_ENDPOINT.getEndpoint() + "/asset"),

    //selectBank
    //post
    PAYMENT_PANEL_ASSET_LOAD_FROM_GENERATED_ENDPOINT(PAYMENT_PANEL_ASSET_ENDPOINT.getEndpoint() + "/loadFromGenerated");

    private final String endpoint;

}
