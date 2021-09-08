package cucumber.api.tests.conectors.admconsole.endpoints;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static cucumber.api.tests.conectors.admconsole.endpoints.AdmConEndpoint.ADM_CON_ADM_CON_ENDPOINT;

//admin-console
//AchproController
@AllArgsConstructor
@Getter
public enum AdmConAchProEndpoint {

    //index
    //get
    ADM_CON_ACH_PRO_ENDPOINT(ADM_CON_ADM_CON_ENDPOINT + "/ach-pro");

    private final String endpoint;

}
