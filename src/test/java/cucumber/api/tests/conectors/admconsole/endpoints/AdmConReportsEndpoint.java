package cucumber.api.tests.conectors.admconsole.endpoints;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static cucumber.api.tests.conectors.admconsole.endpoints.AdmConEndpoint.ADM_CON_ADM_CON_ENDPOINT;

//admin-console
//ReportsController
@AllArgsConstructor
@Getter
public enum AdmConReportsEndpoint {

    //index
    //get
    ADM_CON_REPORTS_ENDPOINT(ADM_CON_ADM_CON_ENDPOINT.getEndpoint() + "/reports"),

    //run
    //post
    ADM_CON_REPORTS_RUN_ENDPOINT(ADM_CON_REPORTS_ENDPOINT.getEndpoint() + "/run");

    private final String endpoint;

}
