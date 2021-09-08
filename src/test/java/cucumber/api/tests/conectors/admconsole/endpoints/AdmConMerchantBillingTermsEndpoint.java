package cucumber.api.tests.conectors.admconsole.endpoints;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static cucumber.api.tests.conectors.admconsole.endpoints.AdmConEndpoint.ADM_CON_ADM_CON_ENDPOINT;

//admin-console
//MerchantBillingTermsController
@AllArgsConstructor
@Getter
public enum AdmConMerchantBillingTermsEndpoint {

    //index
    //get
    ADM_CON_MERCHANT_BILLING_TERMS_ENDPOINT(ADM_CON_ADM_CON_ENDPOINT + "/merchant-billing-terms"),

    //save
    //post
    ADM_CON_MERCHANT_BILLING_TERMS_SAVE_ENDPOINT(ADM_CON_MERCHANT_BILLING_TERMS_ENDPOINT + "/save"),

    //delete
    //post
    ADM_CON_MERCHANT_BILLING_TERMS_DELETE_ENDPOINT(ADM_CON_MERCHANT_BILLING_TERMS_ENDPOINT + "/delete");

    private final String endpoint;

}
