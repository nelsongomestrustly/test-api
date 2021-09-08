package cucumber.api.tests.conectors.paymentpanel.endpoints;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static cucumber.api.tests.conectors.paymentpanel.endpoints.PaymentPanelEndpoint.PAYMENT_PANEL_ENDPOINT;


//payment-panel
//ChallengeDepositController
@AllArgsConstructor
@Getter
public enum PaymentPanelChallengeDepositEndpoint {

    //index
    //post
    PAYMENT_PANEL_CHALLENGE_DEPOSIT_ENDPOINT(PAYMENT_PANEL_ENDPOINT.getEndpoint() + "/challengedeposit"),

    //authorize
    //post
    PAYMENT_PANEL_CHALLENGE_DEPOSIT_AUTHORIZE_ENDPOINT(PAYMENT_PANEL_CHALLENGE_DEPOSIT_ENDPOINT.getEndpoint() + "/authorize"),

    //validate
    //post
    PAYMENT_PANEL_CHALLENGE_DEPOSIT_VALIDATE_ENDPOINT(PAYMENT_PANEL_CHALLENGE_DEPOSIT_ENDPOINT.getEndpoint() + "/validate"),

    //cancel
    //post
    PAYMENT_PANEL_CHALLENGE_DEPOSIT_CANCEL_ENDPOINT(PAYMENT_PANEL_CHALLENGE_DEPOSIT_ENDPOINT.getEndpoint() + "/cancel");

    private final String endpoint;

}
