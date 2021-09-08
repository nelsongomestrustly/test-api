package cucumber.api.tests.conectors.frontend.endpoints;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static cucumber.api.tests.conectors.frontend.endpoints.FrontEndEndpoint.FRONT_END_ENDPOINT;

//frontend-panel
//StepController
@AllArgsConstructor
@Getter
public enum FrontEndStepEndpoint {

    //index
    //post
    FRONT_END_ENDPOINT_STEP(FRONT_END_ENDPOINT.getEndpoint() + "/step"),

    //progress
    //post
    FRONT_END_ENDPOINT_STEP_PROGRESS(FRONT_END_ENDPOINT_STEP.getEndpoint() + "/progress");


    private final String endpoint;

}
