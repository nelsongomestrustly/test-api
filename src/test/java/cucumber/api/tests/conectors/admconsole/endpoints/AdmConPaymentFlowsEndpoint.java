package cucumber.api.tests.conectors.admconsole.endpoints;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static cucumber.api.tests.conectors.admconsole.endpoints.AdmConEndpoint.ADM_CON_ADM_CON_ENDPOINT;

//admin-console
//PaymentFlowsController
@AllArgsConstructor
@Getter
public enum AdmConPaymentFlowsEndpoint {

    //index
    //get
    ADM_CON_PAYMENT_FLOWS_ENDPOINT(ADM_CON_ADM_CON_ENDPOINT + "/payment-flows"),

    //details
    //get
    ADM_CON_PAYMENT_FLOWS_DETAILS_ENDPOINT(ADM_CON_ADM_CON_ENDPOINT + "/details"),

    //setup
    //get
    ADM_CON_PAYMENT_FLOWS_SETUP_ENDPOINT(ADM_CON_ADM_CON_ENDPOINT + "/setup"),

    //properties
    //get
    ADM_CON_PAYMENT_FLOWS_PROPERTIES_ENDPOINT(ADM_CON_ADM_CON_ENDPOINT + "/properties"),

    //save
    //post
    ADM_CON_PAYMENT_FLOWS_SAVE_ENDPOINT(ADM_CON_ADM_CON_ENDPOINT + "/save"),

    //savePaymentFlowMerchant
    //post
    ADM_CON_PAYMENT_FLOWS_SAVE_PAYMENT_FLOW_MERCHANT_ENDPOINT(ADM_CON_ADM_CON_ENDPOINT + "/savePaymentFlowMerchant");


    private final String endpoint;

}
