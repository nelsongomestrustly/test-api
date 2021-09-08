package cucumber.api.tests.conectors.admconsole;

import cucumber.api.tests.configurations.endpoints.MainEndpoints;
import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor
@Getter
public enum AdmConEndpoint {

    ADM_CON_ENDPOINT(MainEndpoints.ADM_CON_ENDPOINT + "/admin-console"),

    ADM_CON_LOGIN_ENDPOINT(ADM_CON_ENDPOINT.getEndpoint() + "/home/login"),

    ADM_CON_LOGOUT_ENDPOINT(ADM_CON_ENDPOINT.getEndpoint() + "/home/logout"),

    ADM_CON_TRANSACTIONS_ENDPOINT(ADM_CON_ENDPOINT.getEndpoint() + "/transactions"),

    ADM_CON_TRANSACTIONS_SEARCH_ENDPOINT(ADM_CON_TRANSACTIONS_ENDPOINT.getEndpoint() + "?{0}");

    private final String endpoint;

}
