package cucumber.api.tests.conectors.admconsole.endpoints;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static cucumber.api.tests.conectors.admconsole.endpoints.AdmConEndpoint.ADM_CON_ADM_CON_ENDPOINT;

//admin-console
//QlikController
@AllArgsConstructor
@Getter
public enum AdmConQlikEndpoint {

    //index
    //get
    ADM_CON_QLIK_ENDPOINT(ADM_CON_ADM_CON_ENDPOINT.getEndpoint() + "/qlik");

    private final String endpoint;

}
