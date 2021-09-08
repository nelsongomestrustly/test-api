package cucumber.api.tests.conectors.frontend.endpoints;

import cucumber.api.tests.configurations.endpoints.MainEndpoints;
import lombok.AllArgsConstructor;
import lombok.Getter;

//frontend-panel
//SetupController
@AllArgsConstructor
@Getter
public enum FrontEndEndpoint {

    FRONT_END_ENDPOINT(MainEndpoints.FRONT_END_URL + "/frontend");

    private final String endpoint;

}
