package cucumber.api.tests.conectors.admconsole.endpoints;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static cucumber.api.tests.conectors.admconsole.endpoints.AdmConEndpoint.ADM_CON_ADM_CON_ENDPOINT;

//admin-console
//MetadatasController
@AllArgsConstructor
@Getter
public enum AdmConMetadatasEndpoint {

    //index
    //get
    ADM_CON_METADATAS_ENDPOINT(ADM_CON_ADM_CON_ENDPOINT + "/metadatas"),

    //delete
    //post
    ADM_CON_METADATAS_DELETE_ENDPOINT(ADM_CON_METADATAS_ENDPOINT + "/delete"),

    //save
    //post
    ADM_CON_METADATAS_SAVE_ENDPOINT(ADM_CON_METADATAS_ENDPOINT + "/save");




    private final String endpoint;

}
