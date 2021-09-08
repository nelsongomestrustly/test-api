package cucumber.api.tests.conectors.admconsole.endpoints;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static cucumber.api.tests.conectors.admconsole.endpoints.AdmConEndpoint.ADM_CON_ADM_CON_ENDPOINT;

//admin-console
//EnvironmentVariablesController
@AllArgsConstructor
@Getter
public enum AdmConEnvironmentVariablesEndpoint {

    //index
    //get
    ADM_CON_ENVIRONMENT_VARIABLES_ENDPOINT(ADM_CON_ADM_CON_ENDPOINT + "/environmentvariables");


    private final String endpoint;

}
