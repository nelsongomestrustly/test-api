package cucumber.api.tests.conectors.admconsole.endpoints;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static cucumber.api.tests.conectors.admconsole.endpoints.AdmConEndpoint.ADM_CON_ADM_CON_ENDPOINT;

//admin-console
//HolidaysController
@AllArgsConstructor
@Getter
public enum AdmConHolidayEndpoint {

    //index
    //get
    ADM_CON_HOLIDAY_ENDPOINT(ADM_CON_ADM_CON_ENDPOINT + "/holiday"),


    //print
    //get
    ADM_CON_HOLIDAY_PRINT_ENDPOINT(ADM_CON_HOLIDAY_ENDPOINT + "/print");


    private final String endpoint;

}
