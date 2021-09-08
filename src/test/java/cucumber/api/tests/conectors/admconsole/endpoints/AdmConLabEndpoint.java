package cucumber.api.tests.conectors.admconsole.endpoints;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static cucumber.api.tests.conectors.admconsole.endpoints.AdmConEndpoint.ADM_CON_ADM_CON_ENDPOINT;

//admin-console
//LabController
@AllArgsConstructor
@Getter
public enum AdmConLabEndpoint {

    //index
    //get
    ADM_CON_LAB_ENDPOINT(ADM_CON_ADM_CON_ENDPOINT + "/lab"),

    //addNewQuestion
    //post
    ADM_CON_LAB_ADD_NEW_QUESTION_ENDPOINT(ADM_CON_LAB_ENDPOINT + "/addNewQuestion"),

    //loadQuestions
    //post
    ADM_CON_LAB_LOAD_QUESTIONS_ENDPOINT(ADM_CON_LAB_ENDPOINT + "/loadQuestions"),

    //questionEditScreen
    //post
    ADM_CON_LAB_QUESTION_EDIT_SCREEN_ENDPOINT(ADM_CON_LAB_ENDPOINT + "/questionEditScreen"),

    //editQuestion
    //post
    ADM_CON_LAB_EDIT_QUESTION_ENDPOINT(ADM_CON_LAB_ENDPOINT + "/editQuestion"),

    //listResponses
    //post
    ADM_CON_LAB_LIST_RESPONSES_ENDPOINT(ADM_CON_LAB_ENDPOINT + "/listResponses"),

    //listResponsesFiltered
    //post
    ADM_CON_LAB_LIST_RESPONSES_FILTERED_ENDPOINT(ADM_CON_LAB_ENDPOINT + "/listResponsesFiltered"),

    //listStats
    //post
    ADM_CON_LAB_LIST_STATS_ENDPOINT(ADM_CON_LAB_ENDPOINT + "/listStats"),

    //listStatsFiltered
    //post
    ADM_CON_LAB_LIST_STATS_FILTERED_ENDPOINT(ADM_CON_LAB_ENDPOINT + "/listStatsFiltered");


    private final String endpoint;

}
