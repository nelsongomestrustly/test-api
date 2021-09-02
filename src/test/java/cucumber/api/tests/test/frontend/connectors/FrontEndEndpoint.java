package cucumber.api.tests.test.frontend.connectors;

import cucumber.api.tests.configurations.endpoints.MainEndpoints;
import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor
@Getter
public enum FrontEndEndpoint {

    FRONT_END_ENDPOINT(MainEndpoints.FRONT_END_URL + "/frontend"),
    FRONT_END_ENDPOINT_SETUP(FRONT_END_ENDPOINT.getEndpoint() + "/setup?Token={0}"),
    FRONT_END_ENDPOINT_SETUP_FULL(FRONT_END_ENDPOINT.getEndpoint() + "/setup?Token={0}&cancelUrl={1}&It={2}"),
    FRONT_END_ENDPOINT_BUILD_BANK_PANEL(FRONT_END_ENDPOINT.getEndpoint() + "/build/index.html?token={0}");

    private final String endpoint;

}
