package cucumber.api.tests.conectors.admconsole.endpoints;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static cucumber.api.tests.conectors.admconsole.endpoints.AdmConEndpoint.ADM_CON_ADM_CON_ENDPOINT;

//admin-console
//ProxyController
@AllArgsConstructor
@Getter
public enum AdmConProxyEndpoint {

    //index
    //get
    ADM_CON_PROXY_ENDPOINT(ADM_CON_ADM_CON_ENDPOINT.getEndpoint() + "/proxy"),

    //save
    //post
    ADM_CON_PROXY_SAVE_ENDPOINT(ADM_CON_PROXY_ENDPOINT.getEndpoint() + "/save"),

    //deleteInstitution
    //post
    ADM_CON_PROXY_DELETE_INSTITUTION_ENDPOINT(ADM_CON_PROXY_ENDPOINT.getEndpoint() + "/deleteInstitution");

    private final String endpoint;

}
