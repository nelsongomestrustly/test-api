package cucumber.api.tests.conectors.login;

import cucumber.api.tests.conectors.admconsole.AdmConEndpoint;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum LoginAdmConsoleEndpoint {

    ADMIN_CONSOLE_LOGIN_ENDPOINT(AdmConEndpoint.ADM_CON_LOGIN_ENDPOINT.getEndpoint()),
    ADMIN_CONSOLE_LOGOUT_ENDPOINT(AdmConEndpoint.ADM_CON_LOGOUT_ENDPOINT.getEndpoint());

    private final String endpoint;

}
