package cucumber.api.tests.conectors.admconsole.endpoints;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static cucumber.api.tests.conectors.admconsole.endpoints.AdmConEndpoint.ADM_CON_ADM_CON_ENDPOINT;

//admin-console
//AchproEntityDestinationController
@AllArgsConstructor
@Getter
public enum AdmConAchProEntityDestinationEndpoint {

    //index
    //get
    ADM_CON_ACH_PRO_ENTITY_DESTINATION_ENDPOINT(ADM_CON_ADM_CON_ENDPOINT + "/ach-pro-entity-destination"),

    //delete
    //get
    ADM_CON_ACH_PRO_ENTITY_DESTINATION_DELETE_ENDPOINT(ADM_CON_ACH_PRO_ENTITY_DESTINATION_ENDPOINT + "/delete"),

    //deleteAccount
    //post
    ADM_CON_ACH_PRO_ENTITY_DESTINATION_UPDATE_ENDPOINT(ADM_CON_ACH_PRO_ENTITY_DESTINATION_ENDPOINT + "/update"),

    //update
    //post
    ADM_CON_ACH_PRO_ENTITY_DESTINATION_EDIT_ENDPOINT(ADM_CON_ACH_PRO_ENTITY_DESTINATION_ENDPOINT + "/edit");


    private final String endpoint;

}
