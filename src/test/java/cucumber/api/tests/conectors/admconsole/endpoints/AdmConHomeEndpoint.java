package cucumber.api.tests.conectors.admconsole.endpoints;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static cucumber.api.tests.conectors.admconsole.endpoints.AdmConEndpoint.ADM_CON_ADM_CON_ENDPOINT;

//admin-console
//HomeController
@AllArgsConstructor
@Getter
public enum AdmConHomeEndpoint {

    //index
    //get
    ADM_CON_HOME_ENDPOINT(ADM_CON_ADM_CON_ENDPOINT.getEndpoint() + "/home"),

    //mfaSetup
    //post
    ADM_CON_HOME_MFA_SETUP_ENDPOINT(ADM_CON_HOME_ENDPOINT + "/mfaSetup"),

    //changePass
    //post and get
    ADM_CON_HOME_CHANGE_PASS_ENDPOINT(ADM_CON_HOME_ENDPOINT + "/changePass"),

    //mfaConfig
    //get
    ADM_CON_HOME_MFA_CONFIG_ENDPOINT(ADM_CON_HOME_ENDPOINT + "/mfaConfig"),

    //login
    //post
    ADM_CON_LOGIN_ENDPOINT(ADM_CON_HOME_ENDPOINT.getEndpoint() + "/login"),

    //logout
    //post
    ADM_CON_LOGOUT_ENDPOINT(ADM_CON_ADM_CON_ENDPOINT.getEndpoint() + "/home/logout");


    private final String endpoint;

}
