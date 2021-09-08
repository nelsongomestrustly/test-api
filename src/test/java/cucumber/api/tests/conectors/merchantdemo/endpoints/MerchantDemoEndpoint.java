package cucumber.api.tests.conectors.merchantdemo.endpoints;

import cucumber.api.tests.configurations.endpoints.MainEndpoints;
import lombok.AllArgsConstructor;
import lombok.Getter;

//Merchant-Demo
@AllArgsConstructor
@Getter
public enum MerchantDemoEndpoint {

    MERCHANT_DEMO_ENDPOINT(MainEndpoints.MERCHANT_DEMO_URL + "/merchant-demo");

    private final String endpoint;

}
