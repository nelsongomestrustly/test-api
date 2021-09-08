package cucumber.api.tests.conectors.admconsole.endpoints;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static cucumber.api.tests.conectors.admconsole.endpoints.AdmConEndpoint.ADM_CON_ADM_CON_ENDPOINT;

//admin-console
//BlacklistImportController
@AllArgsConstructor
@Getter
public enum AdmConBlackListImportEndpoint {

    //index
    //get
    ADM_CON_BLACK_LIST_IMPORT_ENDPOINT(ADM_CON_ADM_CON_ENDPOINT + "/blacklistimport"),

    //update
    //post
    ADM_CON_BLACK_LIST_IMPORT_IMPORT_FILE_ENDPOINT(ADM_CON_BLACK_LIST_IMPORT_ENDPOINT + "/importFile"),

    //downloadFile
    //post
    ADM_CON_BLACK_LIST_IMPORT_DOWNLOAD_FILE_ENDPOINT(ADM_CON_BLACK_LIST_IMPORT_ENDPOINT + "/downloadFile"),

    //saveList
    //post
    ADM_CON_BLACK_LIST_IMPORT_DOWNLOAD_TEMPLATE_FILE_ENDPOINT(ADM_CON_BLACK_LIST_IMPORT_ENDPOINT + "/downloadTemplateFile");


    private final String endpoint;

}
