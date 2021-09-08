package cucumber.api.tests.conectors.admconsole.endpoints;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static cucumber.api.tests.conectors.admconsole.endpoints.AdmConEndpoint.ADM_CON_ADM_CON_ENDPOINT;

//admin-console
//AchproController
@AllArgsConstructor
@Getter
public enum AdmConAchProDestinationEndpoint {

    //index
    //get
    ADM_CON_ACH_PRO_DESTINATION_ENDPOINT(ADM_CON_ADM_CON_ENDPOINT + "/ach-pro-destination"),

    //delete
    //get
    ADM_CON_ACH_PRO_DESTINATION_DELETE_ENDPOINT(ADM_CON_ACH_PRO_DESTINATION_ENDPOINT + "/delete"),

    //update
    //get
    ADM_CON_ACH_PRO_DESTINATION_UPDATE_ENDPOINT(ADM_CON_ACH_PRO_DESTINATION_ENDPOINT + "/update"),

    //edit
    //get
    ADM_CON_ACH_PRO_DESTINATION_EDIT_ENDPOINT(ADM_CON_ACH_PRO_DESTINATION_ENDPOINT + "/edit");

    private final String endpoint;

}
