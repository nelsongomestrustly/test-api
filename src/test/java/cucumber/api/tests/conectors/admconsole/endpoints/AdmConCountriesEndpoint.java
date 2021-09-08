package cucumber.api.tests.conectors.admconsole.endpoints;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static cucumber.api.tests.conectors.admconsole.endpoints.AdmConEndpoint.ADM_CON_ADM_CON_ENDPOINT;

//admin-console
//CountriesController
@AllArgsConstructor
@Getter
public enum AdmConCountriesEndpoint {

    //index
    //get
    ADM_CON_COUNTRIES_ENDPOINT(ADM_CON_ADM_CON_ENDPOINT + "/countries"),

    //save
    //post
    ADM_CON_COUNTRIES_SAVE_ENDPOINT(ADM_CON_COUNTRIES_ENDPOINT + "/save"),

    //update
    //post
    ADM_CON_COUNTRIES_UPDATE_ENDPOINT(ADM_CON_COUNTRIES_ENDPOINT + "/update");


    private final String endpoint;

}
