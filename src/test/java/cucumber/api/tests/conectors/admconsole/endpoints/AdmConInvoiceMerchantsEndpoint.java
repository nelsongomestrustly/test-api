package cucumber.api.tests.conectors.admconsole.endpoints;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static cucumber.api.tests.conectors.admconsole.endpoints.AdmConEndpoint.ADM_CON_ADM_CON_ENDPOINT;

//admin-console
//InvoicedMerchantsController
@AllArgsConstructor
@Getter
public enum AdmConInvoiceMerchantsEndpoint {

    //index
    //get
    ADM_CON_INVOICE_MERCHANTS_ENDPOINT(ADM_CON_ADM_CON_ENDPOINT + "/invoice-merchants"),


    //getFilteredInvoicedMerchantList
    //get
    ADM_CON_GET_INVOICE_MERCHANTS_LIST_ENDPOINT(ADM_CON_INVOICE_MERCHANTS_ENDPOINT + "/getFilteredInvoicedMerchantList");


    private final String endpoint;

}
