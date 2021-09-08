package cucumber.api.tests.conectors.admconsole.endpoints;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static cucumber.api.tests.conectors.admconsole.endpoints.AdmConEndpoint.ADM_CON_ADM_CON_ENDPOINT;

//admin-console
//EnvironmentVariablesController
@AllArgsConstructor
@Getter
public enum AdmConExperimentsEndpoint {

    //index
    //get
    ADM_CON_EXPERIMENTS_ENDPOINT(ADM_CON_ADM_CON_ENDPOINT + "/experiments"),

    //create
    //get
    ADM_CON_EXPERIMENTS_CREATE_ENDPOINT(ADM_CON_EXPERIMENTS_ENDPOINT + "/create"),

    //details
    //get
    ADM_CON_EXPERIMENTS_DETAILS_ENDPOINT(ADM_CON_EXPERIMENTS_ENDPOINT + "/details"),

    //save
    //post
    ADM_CON_EXPERIMENTS_SAVE_ENDPOINT(ADM_CON_EXPERIMENTS_ENDPOINT + "/save");


    private final String endpoint;

}
