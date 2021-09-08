package cucumber.api.tests.conectors.frontend.endpoints;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static cucumber.api.tests.conectors.frontend.endpoints.FrontEndEndpoint.FRONT_END_ENDPOINT;

//frontend-panel
//SetupController
@AllArgsConstructor
@Getter
public enum FrontEndBuildEndpoint {

    FRONT_END_ENDPOINT_BUILD(FRONT_END_ENDPOINT.getEndpoint() + "/build/index.html?token={0}");

    private final String endpoint;

}
