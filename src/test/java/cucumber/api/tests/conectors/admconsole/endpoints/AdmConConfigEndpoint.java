package cucumber.api.tests.conectors.admconsole.endpoints;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static cucumber.api.tests.conectors.admconsole.endpoints.AdmConEndpoint.ADM_CON_ADM_CON_ENDPOINT;

//admin-console
//ConfigController
@AllArgsConstructor
@Getter
public enum AdmConConfigEndpoint {

    //index
    //get
    ADM_CON_CONFIG_ENDPOINT(ADM_CON_ADM_CON_ENDPOINT + "/config"),

    //download
    //get and post
    ADM_CON_CONFIG_ENCRYPT_ENDPOINT(ADM_CON_CONFIG_ENDPOINT + "/encrypt");


    private final String endpoint;

}
