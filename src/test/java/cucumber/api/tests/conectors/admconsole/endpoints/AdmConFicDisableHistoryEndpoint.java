package cucumber.api.tests.conectors.admconsole.endpoints;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static cucumber.api.tests.conectors.admconsole.endpoints.AdmConEndpoint.ADM_CON_ADM_CON_ENDPOINT;

//admin-console
//FicDisabledHistoryController
@AllArgsConstructor
@Getter
public enum AdmConFicDisableHistoryEndpoint {

    //index
    //get
    ADM_CON_FIC_DISABLE_HISTORY_ENDPOINT(ADM_CON_ADM_CON_ENDPOINT + "/ficdisablehistory"),

    //getFilteredListMerchant
    //get
    ADM_CON_FIC_DISABLE_HISTORY_GET_FILTERED_LIST_MERCHANT_ENDPOINT(ADM_CON_FIC_DISABLE_HISTORY_ENDPOINT + "/getFilteredListMerchant");


    private final String endpoint;

}
