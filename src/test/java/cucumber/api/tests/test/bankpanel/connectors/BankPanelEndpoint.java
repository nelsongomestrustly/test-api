package cucumber.api.tests.test.bankpanel.connectors;

import cucumber.api.tests.configurations.endpoints.MainEndpoints;
import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor
@Getter
public enum BankPanelEndpoint {

    BANK_PANEL_ENDPOINT(MainEndpoints.BANK_PANEL_ENDPOINT + "/step"),

    /**
     * http://192.168.1.54:9000/step/200005501/authentication/index/?ppTransactionId=ptx-qmiPbEdJtXp-LE7nrRMd3Rmb-NAG&requestSignature=6YkJRTK7xPLZnQ2%2BAJL%2BR1hb82w%3D&lang=en
     * http://192.168.1.54:9000/step/bankId/authentication/index/?ppTransactionId=ptx-qmiPbEd&requestSignature=6Y&lang=en
     * {0} = BankId
     * {1} = ppTransactionId
     * {2} = transactionId
     * {3} = lang
     */
    BANK_PANEL_ENDPOINT_AUTHENTICATION(BANK_PANEL_ENDPOINT.getEndpoint() + "/{0}/authentication/index/?ppTransactionId={1}&requestSignature={2}&lang={3}");

    private final String endpoint;

}
