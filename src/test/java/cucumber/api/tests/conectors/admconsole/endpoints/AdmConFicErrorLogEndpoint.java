package cucumber.api.tests.conectors.admconsole.endpoints;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static cucumber.api.tests.conectors.admconsole.endpoints.AdmConEndpoint.ADM_CON_ADM_CON_ENDPOINT;

//admin-console
//FicErrorlogController
@AllArgsConstructor
@Getter
public enum AdmConFicErrorLogEndpoint {

    //index
    //get
    ADM_CON_FIC_ERROR_LOG_ENDPOINT(ADM_CON_ADM_CON_ENDPOINT + "/ficerrorlog"),

    //updateJiraIssue
    //post
    ADM_CON_FIC_ERROR_LOG_UPDATE_JIRA_ISSUE_ENDPOINT(ADM_CON_FIC_ERROR_LOG_ENDPOINT + "/updateJiraIssue");


    private final String endpoint;

}
