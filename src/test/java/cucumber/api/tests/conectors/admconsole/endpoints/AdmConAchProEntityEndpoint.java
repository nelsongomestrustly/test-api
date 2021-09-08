package cucumber.api.tests.conectors.admconsole.endpoints;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static cucumber.api.tests.conectors.admconsole.endpoints.AdmConEndpoint.ADM_CON_ADM_CON_ENDPOINT;

//admin-console
//AchproEntityController
@AllArgsConstructor
@Getter
public enum AdmConAchProEntityEndpoint {

    //index
    //get
    ADM_CON_ACH_PRO_ENTITY_ENDPOINT(ADM_CON_ADM_CON_ENDPOINT + "/ach-pro-entity"),

    //newRecord
    //post
    ADM_CON_ACH_PRO_ENTITY_NEW_RECORD_ENDPOINT(ADM_CON_ACH_PRO_ENTITY_ENDPOINT + "/newRecord"),

    //newAccount
    //post
    ADM_CON_ACH_PRO_ENTITY_NEW_ACCOUNT_ENDPOINT(ADM_CON_ACH_PRO_ENTITY_ENDPOINT + "/newAccount"),

    //delete
    //post
    ADM_CON_ACH_PRO_ENTITY_DELETE_ENDPOINT(ADM_CON_ACH_PRO_ENTITY_ENDPOINT + "/delete"),

    //deleteAccount
    //post
    ADM_CON_ACH_PRO_ENTITY_DELETE_ACCOUNT_ENDPOINT(ADM_CON_ACH_PRO_ENTITY_ENDPOINT + "/deleteAccount"),

    //update
    //post
    ADM_CON_ACH_PRO_ENTITY_UPDATE_ENDPOINT(ADM_CON_ACH_PRO_ENTITY_ENDPOINT + "/update"),

    //updateAccount
    //post
    ADM_CON_ACH_PRO_ENTITY_UPDATE_ACCOUNT_ENDPOINT(ADM_CON_ACH_PRO_ENTITY_ENDPOINT + "/updateAccount"),

    //updateAccount
    //get
    ADM_CON_ACH_PRO_ENTITY_EDIT_ENDPOINT(ADM_CON_ACH_PRO_ENTITY_ENDPOINT + "/edit");

    private final String endpoint;

}
