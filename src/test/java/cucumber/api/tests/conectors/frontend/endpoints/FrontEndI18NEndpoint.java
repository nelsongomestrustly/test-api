package cucumber.api.tests.conectors.frontend.endpoints;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static cucumber.api.tests.conectors.frontend.endpoints.FrontEndEndpoint.FRONT_END_ENDPOINT;

//frontend-panel
//I18nController
@AllArgsConstructor
@Getter
public enum FrontEndI18NEndpoint {

    //index
    //post & get
    FRONT_END_ENDPOINT_I_18_N(FRONT_END_ENDPOINT.getEndpoint() + "/i18n");

    private final String endpoint;

}
