package cucumber.api.tests.conectors.admconsole.endpoints;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static cucumber.api.tests.conectors.admconsole.endpoints.AdmConEndpoint.ADM_CON_ADM_CON_ENDPOINT;

//admin-console
//IpFiltersController
@AllArgsConstructor
@Getter
public enum AdmConIpFiltersEndpoint {

    //index
    //get
    ADM_CON_IP_FILTERS_ENDPOINT(ADM_CON_ADM_CON_ENDPOINT + "/ip-filters"),


    //find
    //get
    ADM_CON_IP_FILTERS_FIND_ENDPOINT(ADM_CON_IP_FILTERS_ENDPOINT + "/find"),

    //delete
    //get
    ADM_CON_IP_FILTERS_DELETE_ENDPOINT(ADM_CON_IP_FILTERS_ENDPOINT + "/delete"),

    //save
    //get
    ADM_CON_IP_FILTERS_SAVE_ENDPOINT(ADM_CON_IP_FILTERS_ENDPOINT + "/save");


    private final String endpoint;

}
