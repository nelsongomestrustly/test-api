package cucumber.api.tests.conectors.admconsole.endpoints;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static cucumber.api.tests.conectors.admconsole.endpoints.AdmConEndpoint.ADM_CON_ADM_CON_ENDPOINT;

//admin-console
//BillingTermsController
@AllArgsConstructor
@Getter
public enum AdmConBillingTermsEndpoint {

    //index
    //get
    ADM_CON_BILLING_TERMS_ENDPOINT(ADM_CON_ADM_CON_ENDPOINT + "/badaccounts"),

    //save
    //post
    ADM_CON_BILLING_TERMS_SAVE_ENDPOINT(ADM_CON_BILLING_TERMS_ENDPOINT + "/save");


    private final String endpoint;

}
