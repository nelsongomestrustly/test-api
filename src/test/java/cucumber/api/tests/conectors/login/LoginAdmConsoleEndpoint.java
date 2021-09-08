package cucumber.api.tests.conectors.login;

import cucumber.api.tests.conectors.admconsole.endpoints.AdmConEndpoint;
import lombok.AllArgsConstructor;
import lombok.Getter;

import static cucumber.api.tests.conectors.admconsole.endpoints.AdmConHomeEndpoint.ADM_CON_LOGIN_ENDPOINT;
import static cucumber.api.tests.conectors.admconsole.endpoints.AdmConHomeEndpoint.ADM_CON_LOGOUT_ENDPOINT;

@AllArgsConstructor
@Getter
public enum LoginAdmConsoleEndpoint {

    ADMIN_CONSOLE_LOGIN_ENDPOINT(ADM_CON_LOGIN_ENDPOINT.getEndpoint()),
    ADMIN_CONSOLE_LOGOUT_ENDPOINT(ADM_CON_LOGOUT_ENDPOINT.getEndpoint());

    private final String endpoint;

}
