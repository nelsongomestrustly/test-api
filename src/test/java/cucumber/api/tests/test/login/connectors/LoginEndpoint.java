package cucumber.api.tests.test.login.connectors;

import cucumber.api.tests.test.admconsole.connectors.AdminConsoleEndpoint;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum LoginEndpoint {

    ADMIN_CONSOLE_LOGIN_ENDPOINT(AdminConsoleEndpoint.ADMIN_CONSOLE_LOGIN_ENDPOINT.getEndpoint()),
    ADMIN_CONSOLE_LOGOUT_ENDPOINT(AdminConsoleEndpoint.ADMIN_CONSOLE_LOGOUT_ENDPOINT.getEndpoint());

    private final String endpoint;

}
