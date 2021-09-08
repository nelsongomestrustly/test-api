package cucumber.api.tests.conectors.admconsole.endpoints;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static cucumber.api.tests.conectors.admconsole.endpoints.AdmConEndpoint.ADM_CON_ADM_CON_ENDPOINT;

//admin-console
//TestController
@AllArgsConstructor
@Getter
public enum AdmConUserMgmtEndpoint {

    //index
    //get
    ADM_CON_USER_MGMT_ENDPOINT(ADM_CON_ADM_CON_ENDPOINT.getEndpoint() + "/user-mgmt"),

    //force2FASetup
    //post
    ADM_CON_FORCE_2_FA_SETUP_ENDPOINT(ADM_CON_USER_MGMT_ENDPOINT.getEndpoint() + "/force2FASetup"),

    //setUser
    //post
    ADM_CON_SET_USER_ENDPOINT(ADM_CON_USER_MGMT_ENDPOINT.getEndpoint() + "/setUser"),

    //changeStatus
    //post
    ADM_CON_CHANGE_STATUS_ENDPOINT(ADM_CON_USER_MGMT_ENDPOINT.getEndpoint() + "/changeStatus"),

    //saveRole
    //post
    ADM_CON_SAVE_ROLE_ENDPOINT(ADM_CON_USER_MGMT_ENDPOINT.getEndpoint() + "/saveRole"),

    //deleteRole
    //post
    ADM_CON_DELETE_ROLE_ENDPOINT(ADM_CON_USER_MGMT_ENDPOINT.getEndpoint() + "/deleteRole"),

    //resetPassword
    //post
    ADM_CON_RESET_PASSWORD_ENDPOINT(ADM_CON_USER_MGMT_ENDPOINT.getEndpoint() + "/resetPassword"),

    //expirePassword
    //post
    ADM_CON_EXPIRE_PASSWORD_ENDPOINT(ADM_CON_USER_MGMT_ENDPOINT.getEndpoint() + "/expirePassword"),

    //updatePassword
    //post
    ADM_CON_UPDATE_PASSWORD_ENDPOINT(ADM_CON_USER_MGMT_ENDPOINT.getEndpoint() + "/updatePassword");

    private final String endpoint;

}
