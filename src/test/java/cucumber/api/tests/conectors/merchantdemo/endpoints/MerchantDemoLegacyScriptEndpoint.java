package cucumber.api.tests.conectors.merchantdemo.endpoints;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static cucumber.api.tests.conectors.merchantdemo.endpoints.MerchantDemoEndpoint.MERCHANT_DEMO_ENDPOINT;

//Merchant-Demo
//LegacyScriptController
@AllArgsConstructor
@Getter
public enum MerchantDemoLegacyScriptEndpoint {

    //index
    //GET
    //TODO TO CONFIRM ENDPOINT
    MERCHANT_DEMO_GLOBEX_ENDPOINT(MERCHANT_DEMO_ENDPOINT.getEndpoint() + "/legacy");


    private final String endpoint;


}
