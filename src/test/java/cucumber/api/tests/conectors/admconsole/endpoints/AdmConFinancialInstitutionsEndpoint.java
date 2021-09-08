package cucumber.api.tests.conectors.admconsole.endpoints;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static cucumber.api.tests.conectors.admconsole.endpoints.AdmConEndpoint.ADM_CON_ADM_CON_ENDPOINT;

//admin-console
//FinancialInstitutionsController
@AllArgsConstructor
@Getter
public enum AdmConFinancialInstitutionsEndpoint {

    //index
    //get
    ADM_CON_FINANCIAL_INSTITUTIONS_ENDPOINT(ADM_CON_ADM_CON_ENDPOINT + "/financial-institutions"),

    //save
    //post
    ADM_CON_FINANCIAL_INSTITUTIONS_SAVE_ENDPOINT(ADM_CON_ADM_CON_ENDPOINT + "/save"),

    //save
    //post
    ADM_CON_FINANCIAL_INSTITUTIONS_SAVE_CAPABILITIES_ENDPOINT(ADM_CON_ADM_CON_ENDPOINT + "/saveCapabilities");


    private final String endpoint;

}
