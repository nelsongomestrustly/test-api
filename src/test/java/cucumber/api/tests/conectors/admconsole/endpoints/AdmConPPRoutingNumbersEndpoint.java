package cucumber.api.tests.conectors.admconsole.endpoints;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static cucumber.api.tests.conectors.admconsole.endpoints.AdmConEndpoint.ADM_CON_ADM_CON_ENDPOINT;

//admin-console
//PpRoutingNumbersController
@AllArgsConstructor
@Getter
public enum AdmConPPRoutingNumbersEndpoint {

    //index
    //get
    ADM_CON_PP_ROUTING_NUMBERS_ENDPOINT(ADM_CON_ADM_CON_ENDPOINT.getEndpoint() + "/pp-routing-numbers"),

    //update
    //post
    ADM_CON_PP_ROUTING_NUMBERS_UPDATE_ENDPOINT(ADM_CON_PP_ROUTING_NUMBERS_ENDPOINT.getEndpoint() + "/update"),

    //save
    //post
    ADM_CON_PP_ROUTING_NUMBERS_SAVE_ENDPOINT(ADM_CON_PP_ROUTING_NUMBERS_ENDPOINT.getEndpoint() + "/save"),

    //saveList
    //post
    ADM_CON_PP_ROUTING_NUMBERS_SAVE_LIST_ENDPOINT(ADM_CON_PP_ROUTING_NUMBERS_ENDPOINT.getEndpoint() + "/saveList");

    private final String endpoint;

}
