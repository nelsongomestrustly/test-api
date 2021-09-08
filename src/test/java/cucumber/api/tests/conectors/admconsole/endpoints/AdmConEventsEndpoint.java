package cucumber.api.tests.conectors.admconsole.endpoints;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static cucumber.api.tests.conectors.admconsole.endpoints.AdmConEndpoint.ADM_CON_ADM_CON_ENDPOINT;

//admin-console
//EventsController
@AllArgsConstructor
@Getter
public enum AdmConEventsEndpoint {

    //index
    //get
    ADM_CON_EVENTS_ENDPOINT(ADM_CON_ADM_CON_ENDPOINT + "/events");


    private final String endpoint;

}
