package cucumber.api.tests.conectors.admconsole.endpoints;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static cucumber.api.tests.conectors.admconsole.endpoints.AdmConEndpoint.ADM_CON_ADM_CON_ENDPOINT;

//admin-console
//CurrenciesController
@AllArgsConstructor
@Getter
public enum AdmConCurrenciesEndpoint {

    //index
    //get
    ADM_CON_CURRENCIES_ENDPOINT(ADM_CON_ADM_CON_ENDPOINT + "/currencies"),

    //save
    //post
    ADM_CON_CURRENCIES_SAVE_ENDPOINT(ADM_CON_CURRENCIES_ENDPOINT + "/save"),

    //delete
    //post
    ADM_CON_CURRENCIES_DELETE_ENDPOINT(ADM_CON_CURRENCIES_ENDPOINT + "/delete"),

    //delete
    //post
    ADM_CON_CURRENCIES_DELETE_COUNTRY_MAPPING_ENDPOINT(ADM_CON_CURRENCIES_ENDPOINT + "/deleteCountryMapping");


    private final String endpoint;

}
