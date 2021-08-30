package cucumber.api.tests.test.admconsole.connectors;

import cucumber.api.tests.configurations.endpoints.MainEndpoints;
import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor
@Getter
public enum AdminConsoleEndpoint {

    ADMIN_CONSOLE_ENDPOINT(MainEndpoints.ADMIN_CONSOLE_ENDPOINT + "/admin-console"),

    ADMIN_CONSOLE_LOGIN_ENDPOINT(ADMIN_CONSOLE_ENDPOINT.getEndpoint() + "/home/login"),

    ADMIN_CONSOLE_LOGOUT_ENDPOINT(ADMIN_CONSOLE_ENDPOINT.getEndpoint() + "/home/logout"),

    ADMIN_CONSOLE_TRANSACTIONS_ENDPOINT(ADMIN_CONSOLE_ENDPOINT.getEndpoint() + "/transactions"),

    ADMIN_CONSOLE_TRANSACTIONS_SEARCH_ENDPOINT(ADMIN_CONSOLE_TRANSACTIONS_ENDPOINT.getEndpoint() + "?{0}");

    private final String endpoint;

}
