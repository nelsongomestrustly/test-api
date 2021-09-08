package cucumber.api.tests.conectors.admconsole.endpoints;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static cucumber.api.tests.conectors.admconsole.endpoints.AdmConEndpoint.ADM_CON_ADM_CON_ENDPOINT;

//admin-console
//CollectionFilesController
@AllArgsConstructor
@Getter
public enum AdmConCollectionFilesEndpoint {

    //index
    //get
    ADM_CON_COLLECTION_FILES_ENDPOINT(ADM_CON_ADM_CON_ENDPOINT + "/collectionfiles"),

    //download
    //get
    ADM_CON_COLLECTION_FILES_DOWNLOAD_ENDPOINT(ADM_CON_COLLECTION_FILES_ENDPOINT + "/download"),

    //downloadAll
    //get
    ADM_CON_COLLECTION_FILES_DOWNLOAD_ALL_ENDPOINT(ADM_CON_COLLECTION_FILES_ENDPOINT + "/downloadAll");


    private final String endpoint;

}
