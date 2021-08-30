package cucumber.api.tests.test.admconsole.connectors;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static cucumber.api.tests.configurations.urls.Urls.ADMIN_CONSOLE_URL;


@AllArgsConstructor
@Getter
public enum AdmConsoleEndpoint {

    ADMIN_CONSOLE_HP(ADMIN_CONSOLE_URL + "/admin-console"),

    ADMIN_CONSOLE_LOGIN_HP(ADMIN_CONSOLE_HP.getEndpoint() + "/home/login"),

    ADMIN_CONSOLE_TRANSACTIONS_HP(ADMIN_CONSOLE_HP.getEndpoint() + "/transactions"),

    ADMIN_CONSOLE_TRANSACTIONS_SEARCH_HP(ADMIN_CONSOLE_TRANSACTIONS_HP.getEndpoint() + "?{0}");

    private final String endpoint;

}
