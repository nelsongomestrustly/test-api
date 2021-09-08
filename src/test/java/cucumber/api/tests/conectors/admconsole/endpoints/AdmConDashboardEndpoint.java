package cucumber.api.tests.conectors.admconsole.endpoints;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static cucumber.api.tests.conectors.admconsole.endpoints.AdmConEndpoint.ADM_CON_ADM_CON_ENDPOINT;

//admin-console
//AdminDashboardController
@AllArgsConstructor
@Getter
public enum AdmConDashboardEndpoint {

    //index
    //get
    ADM_CON_DASHBOARD_ENDPOINT(ADM_CON_ADM_CON_ENDPOINT + "/dashboard");

    private final String endpoint;

}
