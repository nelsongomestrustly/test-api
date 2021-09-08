package cucumber.api.tests.conectors.paymentpanel.endpoints;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static cucumber.api.tests.conectors.paymentpanel.endpoints.PaymentPanelEndpoint.PAYMENT_PANEL_ENDPOINT;


//payment-panel
//EventsTrackerController
@AllArgsConstructor
@Getter
public enum PaymentPanelEventsTrackerEndpoint {

    //index
    //post
    PAYMENT_PANEL_EVENTS_TRACKER_ENDPOINT(PAYMENT_PANEL_ENDPOINT.getEndpoint() + "/eventstracker"),

    //establishTimeout
    //post
    PAYMENT_PANEL_EVENTS_TRACKER_ESTABLISH_TIME_OUT_ENDPOINT(PAYMENT_PANEL_EVENTS_TRACKER_ENDPOINT.getEndpoint() + "/establishTimeout");


    private final String endpoint;


}
