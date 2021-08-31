package cucumber.api.tests.test.merchantdemo.connectors;

import cucumber.api.tests.configurations.endpoints.MainEndpoints;
import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor
@Getter
public enum MerchantDemoEndpoint {

    MERCHANT_DEMO_ENDPOINT(MainEndpoints.MERCHANT_DEMO_URL + "/merchant-demo"),
    MERCHANT_DEMO_GLOBEX_ENDPOINT(MERCHANT_DEMO_ENDPOINT.getEndpoint() + "/globex"),
    MERCHANT_DEMO_GET_PAYMENT_FLOWS_ENDPOINT(MERCHANT_DEMO_GLOBEX_ENDPOINT.getEndpoint() + "/getPaymentFlows"),
    MERCHANT_DEMO_GET_MERCHANT_LIST_ENDPOINT(MERCHANT_DEMO_GLOBEX_ENDPOINT.getEndpoint() + "/getMerchantList"),
    MERCHANT_DEMO_GET_SIGNATURE_ENDPOINT(MERCHANT_DEMO_GLOBEX_ENDPOINT.getEndpoint() + "/createSignature");

    private final String endpoint;


}
