package cucumber.api.tests.conectors.admconsole.endpoints;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static cucumber.api.tests.conectors.admconsole.endpoints.AdmConEndpoint.ADM_CON_ADM_CON_ENDPOINT;

//admin-console
//WhitelistController
@AllArgsConstructor
@Getter
public enum AdmConWhiteListEndpoint {

    //index
    //get
    ADM_CON_WHITE_LIST_ENDPOINT(ADM_CON_ADM_CON_ENDPOINT.getEndpoint() + "/white-list"),

    //update
    //post
    ADM_CON_WHITE_LIST_UPDATE_ENDPOINT(ADM_CON_WHITE_LIST_ENDPOINT.getEndpoint() + "/update");


    private final String endpoint;

}
