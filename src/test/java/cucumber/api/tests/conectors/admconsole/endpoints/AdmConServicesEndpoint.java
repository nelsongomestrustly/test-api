package cucumber.api.tests.conectors.admconsole.endpoints;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static cucumber.api.tests.conectors.admconsole.endpoints.AdmConEndpoint.ADM_CON_ADM_CON_ENDPOINT;

//admin-console
//ServicesController
@AllArgsConstructor
@Getter
public enum AdmConServicesEndpoint {

    //index
    //get
    ADM_CON_SERVICES_ENDPOINT(ADM_CON_ADM_CON_ENDPOINT.getEndpoint() + "/services"),

    //ficprocessor
    //get
    ADM_CON_SERVICES_FIC_PROCESSOR_ENDPOINT(ADM_CON_SERVICES_ENDPOINT.getEndpoint() + "/ficprocessor"),

    //billing
    //get
    ADM_CON_SERVICES_BILLING_ENDPOINT(ADM_CON_SERVICES_ENDPOINT.getEndpoint() + "/billing"),

    //runFIGatewayProcessor
    //post
    ADM_CON_SERVICES_RUN_FI_GATEWAY_PROCESSOR_ENDPOINT(ADM_CON_SERVICES_ENDPOINT.getEndpoint() + "/runFIGatewayProcessor"),

    //runMerchantGatewayProcessor
    //post
    ADM_CON_SERVICES_RUN_MERCHANT_GATEWAY_PROCESSOR_ENDPOINT(ADM_CON_SERVICES_ENDPOINT.getEndpoint() + "/runMerchantGatewayProcessor"),

    //runFICProcessor
    //post
    ADM_CON_SERVICES_RUN_FIC_PROCESSOR_ENDPOINT(ADM_CON_SERVICES_ENDPOINT.getEndpoint() + "/runFICProcessor"),

    //runBilling
    //post
    ADM_CON_SERVICES_RUN_BILLING_ENDPOINT(ADM_CON_SERVICES_ENDPOINT.getEndpoint() + "/runBilling");

    private final String endpoint;

}
