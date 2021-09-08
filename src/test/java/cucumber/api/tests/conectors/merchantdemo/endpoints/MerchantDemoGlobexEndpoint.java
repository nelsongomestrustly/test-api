package cucumber.api.tests.conectors.merchantdemo.endpoints;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static cucumber.api.tests.conectors.merchantdemo.endpoints.MerchantDemoEndpoint.MERCHANT_DEMO_ENDPOINT;

//Merchant-Demo
//GlobexDemoController
@AllArgsConstructor
@Getter
public enum MerchantDemoGlobexEndpoint {

    //index
    //GET
    MERCHANT_DEMO_GLOBEX_ENDPOINT(MERCHANT_DEMO_ENDPOINT.getEndpoint() + "/globex"),

    //createAuthToken
    //POST
    MERCHANT_DEMO_CREATE_AUTH_TOKEN_ENDPOINT(MERCHANT_DEMO_GLOBEX_ENDPOINT.getEndpoint() + "/createAuthToken"),

    //getMerchant
    //POST
    MERCHANT_DEMO_GET_MERCHANT_ENDPOINT(MERCHANT_DEMO_GLOBEX_ENDPOINT.getEndpoint() + "/getMerchant"),

    //getPaymentFlows
    //POST
    MERCHANT_DEMO_GET_PAYMENT_FLOWS_ENDPOINT(MERCHANT_DEMO_GLOBEX_ENDPOINT.getEndpoint() + "/getPaymentFlows"),

    //getMerchantList
    //POST
    MERCHANT_DEMO_GET_MERCHANT_LIST_ENDPOINT(MERCHANT_DEMO_GLOBEX_ENDPOINT.getEndpoint() + "/getMerchantList"),

    //createSignature
    //POST
    MERCHANT_DEMO_GET_SIGNATURE_ENDPOINT(MERCHANT_DEMO_GLOBEX_ENDPOINT.getEndpoint() + "/createSignature");

    private final String endpoint;


}
