package cucumber.api.tests.conectors.admconsole.endpoints;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static cucumber.api.tests.conectors.admconsole.endpoints.AdmConEndpoint.ADM_CON_ADM_CON_ENDPOINT;

//admin-console
//MonitisController
@AllArgsConstructor
@Getter
public enum AdmConMonitisEndpoint {

    //index
    //get
    ADM_CON_MONITIS_ENDPOINT(ADM_CON_ADM_CON_ENDPOINT + "/monitis");


    private final String endpoint;

}
