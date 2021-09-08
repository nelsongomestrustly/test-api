package cucumber.api.tests.conectors.admconsole.endpoints;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static cucumber.api.tests.conectors.admconsole.endpoints.AdmConEndpoint.ADM_CON_ADM_CON_ENDPOINT;

//admin-console
//AchproSftpController
@AllArgsConstructor
@Getter
public enum AdmConAchProSftpEndpoint {

    //index
    //get
    ADM_CON_ACH_PRO_SFTP_ENDPOINT(ADM_CON_ADM_CON_ENDPOINT + "/ach-pro-sftp"),

    //delete
    //post
    ADM_CON_ACH_PRO_SFTP_DELETE_ENDPOINT(ADM_CON_ACH_PRO_SFTP_ENDPOINT + "/delete"),

    //update
    //post
    ADM_CON_ACH_PRO_SFTP_UPDATE_ENDPOINT(ADM_CON_ACH_PRO_SFTP_ENDPOINT + "/update"),

    //edit
    //get
    ADM_CON_ACH_PRO_SFTP_EDIT_ENDPOINT(ADM_CON_ACH_PRO_SFTP_ENDPOINT + "/edit");


    private final String endpoint;

}
