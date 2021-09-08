package cucumber.api.tests.conectors.admconsole.endpoints;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static cucumber.api.tests.conectors.admconsole.endpoints.AdmConEndpoint.ADM_CON_ADM_CON_ENDPOINT;

//admin-console
//AchproExchangeWindowsController
@AllArgsConstructor
@Getter
public enum AdmConAchProExchangeWindowsEndpoint {

    //index
    //get
    ADM_CON_ACH_PRO_EXCHANGE_WINDOWS_ENDPOINT(ADM_CON_ADM_CON_ENDPOINT + "/ach-pro-exchange-windows"),

    //delete
    //get
    ADM_CON_ACH_PRO_EXCHANGE_WINDOWS_DELETE_ENDPOINT(ADM_CON_ACH_PRO_EXCHANGE_WINDOWS_ENDPOINT + "/delete"),

    //update
    //post
    ADM_CON_ACH_PRO_EXCHANGE_WINDOWS_UPDATE_ENDPOINT(ADM_CON_ACH_PRO_EXCHANGE_WINDOWS_ENDPOINT + "/update"),

    //edit
    //get
    ADM_CON_ACH_PRO_EXCHANGE_WINDOWS_EDIT_ENDPOINT(ADM_CON_ACH_PRO_EXCHANGE_WINDOWS_ENDPOINT + "/edit");


    private final String endpoint;

}
