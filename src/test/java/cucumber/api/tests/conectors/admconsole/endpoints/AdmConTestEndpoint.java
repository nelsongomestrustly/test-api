package cucumber.api.tests.conectors.admconsole.endpoints;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static cucumber.api.tests.conectors.admconsole.endpoints.AdmConEndpoint.ADM_CON_ADM_CON_ENDPOINT;

//admin-console
//TestController
@AllArgsConstructor
@Getter
public enum AdmConTestEndpoint {

    //index
    //get
    ADM_CON_TEST_ENDPOINT(ADM_CON_ADM_CON_ENDPOINT.getEndpoint() + "/test"),

    //save
    //post
    ADM_CON_TEST_SAVE_ENDPOINT(ADM_CON_TEST_ENDPOINT.getEndpoint() + "/save"),

    //details
    //get
    ADM_CON_TEST_DETAILS_ENDPOINT(ADM_CON_TEST_ENDPOINT.getEndpoint() + "/details");

    private final String endpoint;

}
