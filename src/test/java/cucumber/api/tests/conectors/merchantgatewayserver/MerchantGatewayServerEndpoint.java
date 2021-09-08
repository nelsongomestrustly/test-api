package cucumber.api.tests.conectors.merchantgatewayserver;

import cucumber.api.tests.configurations.endpoints.MainEndpoints;
import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor
@Getter
public enum MerchantGatewayServerEndpoint {

    MERCHANT_GATEWAY_SERVER_V1_ADMIN_ENDPOINT(MainEndpoints.MERCHANT_GATEWAY_SERVER_URL + "/v1/admin"),

    MERCHANT_GATEWAY_SERVER_V1_ADMIN_TRANSACTIONS_ENDPOINT(MERCHANT_GATEWAY_SERVER_V1_ADMIN_ENDPOINT.getEndpoint() + "/transactions"),

    //boolean createTransaction, Integer grp
    MERCHANT_GATEWAY_SERVER_V1_ADMIN_ESTABILISH_TRANSACTIONS_ENDPOINT
            (MERCHANT_GATEWAY_SERVER_V1_ADMIN_TRANSACTIONS_ENDPOINT.getEndpoint() + "/establish?createTransaction={0}&grp={1}");

    private final String endpoint;

}
