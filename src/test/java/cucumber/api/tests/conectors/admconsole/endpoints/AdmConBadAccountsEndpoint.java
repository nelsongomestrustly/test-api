package cucumber.api.tests.conectors.admconsole.endpoints;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static cucumber.api.tests.conectors.admconsole.endpoints.AdmConEndpoint.ADM_CON_ADM_CON_ENDPOINT;

//admin-console
//BadAccountsController
@AllArgsConstructor
@Getter
public enum AdmConBadAccountsEndpoint {

    //index
    //get
    ADM_CON_BAD_ACCOUNTS_ENDPOINT(ADM_CON_ADM_CON_ENDPOINT + "/badaccounts"),

    //save
    //post
    ADM_CON_BAD_ACCOUNTS_SAVE_ENDPOINT(ADM_CON_ADM_CON_ENDPOINT + "/save");


    private final String endpoint;

}
