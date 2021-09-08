package cucumber.api.tests.conectors.admconsole.endpoints;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static cucumber.api.tests.conectors.admconsole.endpoints.AdmConEndpoint.ADM_CON_ADM_CON_ENDPOINT;

//admin-console
//FicMetricsController
@AllArgsConstructor
@Getter
public enum AdmConFicMetricsLogEndpoint {

    //index
    //get
    ADM_CON_FIC_METRICS_ENDPOINT(ADM_CON_ADM_CON_ENDPOINT + "/ficmetrics");


    private final String endpoint;

}
