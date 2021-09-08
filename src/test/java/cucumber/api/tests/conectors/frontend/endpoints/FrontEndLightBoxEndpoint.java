package cucumber.api.tests.conectors.frontend.endpoints;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static cucumber.api.tests.conectors.frontend.endpoints.FrontEndEndpoint.FRONT_END_ENDPOINT;

//frontend-panel
//LightboxStateController
@AllArgsConstructor
@Getter
public enum FrontEndLightBoxEndpoint {

    //index
    //post
    FRONT_END_ENDPOINT_LIGHT_BOX(FRONT_END_ENDPOINT.getEndpoint() + "/lightbox"),

    //save
    //post
    FRONT_END_ENDPOINT_LIGHT_BOX_SAVE(FRONT_END_ENDPOINT_LIGHT_BOX.getEndpoint() + "/save"),

    //save
    //get
    FRONT_END_ENDPOINT_LIGHT_BOX_GET(FRONT_END_ENDPOINT_LIGHT_BOX.getEndpoint() + "/get");


    private final String endpoint;

}
