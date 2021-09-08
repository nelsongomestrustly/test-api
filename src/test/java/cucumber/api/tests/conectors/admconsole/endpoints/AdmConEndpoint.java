package cucumber.api.tests.conectors.admconsole.endpoints;

import cucumber.api.tests.configurations.endpoints.MainEndpoints;
import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor
@Getter
public enum AdmConEndpoint {

    ADM_CON_ADM_CON_ENDPOINT(MainEndpoints.ADM_CON_ENDPOINT + "/admin-console");

    private final String endpoint;

}
