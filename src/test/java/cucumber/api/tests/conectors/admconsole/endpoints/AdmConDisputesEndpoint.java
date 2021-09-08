package cucumber.api.tests.conectors.admconsole.endpoints;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static cucumber.api.tests.conectors.admconsole.endpoints.AdmConEndpoint.ADM_CON_ADM_CON_ENDPOINT;

//admin-console
//DisputesController
@AllArgsConstructor
@Getter
public enum AdmConDisputesEndpoint {

    //index
    //get
    ADM_CON_DISPUTES_ENDPOINT(ADM_CON_ADM_CON_ENDPOINT + "/disputes"),

    //generate
    //post
    ADM_CON_DISPUTES_GENERATE_ENDPOINT(ADM_CON_DISPUTES_ENDPOINT + "/generate");


    private final String endpoint;

}
