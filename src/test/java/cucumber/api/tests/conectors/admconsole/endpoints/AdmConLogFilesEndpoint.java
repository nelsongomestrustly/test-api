package cucumber.api.tests.conectors.admconsole.endpoints;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static cucumber.api.tests.conectors.admconsole.endpoints.AdmConEndpoint.ADM_CON_ADM_CON_ENDPOINT;

//admin-console
//LogFilesController
@AllArgsConstructor
@Getter
public enum AdmConLogFilesEndpoint {

    //index
    //get
    ADM_CON_LOG_FILES_ENDPOINT(ADM_CON_ADM_CON_ENDPOINT + "/log-files");

    private final String endpoint;

}
