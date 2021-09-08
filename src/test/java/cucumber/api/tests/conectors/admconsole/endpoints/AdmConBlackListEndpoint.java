package cucumber.api.tests.conectors.admconsole.endpoints;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static cucumber.api.tests.conectors.admconsole.endpoints.AdmConEndpoint.ADM_CON_ADM_CON_ENDPOINT;

//admin-console
//BlacklistController
@AllArgsConstructor
@Getter
public enum AdmConBlackListEndpoint {

    //index
    //get
    ADM_CON_BLACK_LIST_ENDPOINT(ADM_CON_ADM_CON_ENDPOINT + "/blacklist"),

    //update
    //post
    ADM_CON_BLACK_LIST_UPDATE_ENDPOINT(ADM_CON_BLACK_LIST_ENDPOINT + "/update"),

    //updateList
    //post
    ADM_CON_BLACK_LIST_UPDATE_LIST_ENDPOINT(ADM_CON_BLACK_LIST_ENDPOINT + "/updateList"),

    //saveList
    //post
    ADM_CON_BLACK_LIST_SAVE_LIST_ENDPOINT(ADM_CON_BLACK_LIST_ENDPOINT + "/saveList"),

    //saveItem
    //post
    ADM_CON_BLACK_LIST_SAVE_ITEM_ENDPOINT(ADM_CON_BLACK_LIST_ENDPOINT + "/saveItem");


    private final String endpoint;

}
