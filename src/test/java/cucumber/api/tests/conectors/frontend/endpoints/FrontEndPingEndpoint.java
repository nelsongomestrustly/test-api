package cucumber.api.tests.conectors.frontend.endpoints;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static cucumber.api.tests.conectors.frontend.endpoints.FrontEndEndpoint.FRONT_END_ENDPOINT;

//frontend-panel
//PingController
@AllArgsConstructor
@Getter
public enum FrontEndPingEndpoint {

    //index
    //post
    FRONT_END_ENDPOINT_PING(FRONT_END_ENDPOINT.getEndpoint() + "/ping");

    private final String endpoint;

}
