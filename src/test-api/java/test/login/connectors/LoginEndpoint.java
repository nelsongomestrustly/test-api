package test.login.connectors;

import lombok.AllArgsConstructor;
import lombok.Getter;
import test.admconsole.connectors.AdmConsoleEndpoint;

import static test.admconsole.connectors.AdmConsoleEndpoint.ADMIN_CONSOLE_LOGIN_HP;
import static test.admconsole.connectors.AdmConsoleEndpoint.ADMIN_CONSOLE_TRANSACTIONS_HP;

@AllArgsConstructor
@Getter
public enum LoginEndpoint {

    ADMIN_CONSOLE_ENDPOINT(AdmConsoleEndpoint.ADMIN_CONSOLE_HP.getEndpoint()),
    ADMIN_CONSOLE_LOGIN_ENDPOINT(ADMIN_CONSOLE_LOGIN_HP.getEndpoint()),
    ADMIN_CONSOLE_TRANSACTIONS_ENDPOINT(ADMIN_CONSOLE_TRANSACTIONS_HP.getEndpoint());

    private final String endpoint;

}
