package cucumber.api.tests.conectors.frontend.endpoints;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static cucumber.api.tests.conectors.frontend.endpoints.FrontEndEndpoint.FRONT_END_ENDPOINT;

//frontend-panel
//SetupController
@AllArgsConstructor
@Getter
public enum FrontEndSetupEndpoint {

    //index
    //post
    FRONT_END_ENDPOINT_SETUP(FRONT_END_ENDPOINT.getEndpoint() + "/setup"),

    //index
    //post
    FRONT_END_ENDPOINT_SETUP_TOKEN(FRONT_END_ENDPOINT_SETUP.getEndpoint() + "?token={0}"),

    //index
    //post
    FRONT_END_ENDPOINT_SETUP_FULL(FRONT_END_ENDPOINT_SETUP.getEndpoint() + "?token={0}&cancelUrl={1}&It={2}"),

    //fingerprint
    //post
    FRONT_END_ENDPOINT_SETUP_FINGER_PRINT_(FRONT_END_ENDPOINT_SETUP.getEndpoint() + "/fingerprint"),

    //changeBank
    //post
    FRONT_END_ENDPOINT_SETUP_CHANGE_BANK(FRONT_END_ENDPOINT_SETUP.getEndpoint() + "/changeBank"),

    //bankList
    //post
    FRONT_END_ENDPOINT_SETUP_BANK_LIST(FRONT_END_ENDPOINT_SETUP.getEndpoint() + "/bankList");


    private final String endpoint;

}
