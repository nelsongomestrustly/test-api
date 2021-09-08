package cucumber.api.tests.conectors.admconsole.endpoints;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static cucumber.api.tests.conectors.admconsole.endpoints.AdmConEndpoint.ADM_CON_ADM_CON_ENDPOINT;

//admin-console
//RiskRulesController
@AllArgsConstructor
@Getter
public enum AdmConRiskLimitsEndpoint {

    //index
    //get
    ADM_CON_RISK_LIMITS_ENDPOINT(ADM_CON_ADM_CON_ENDPOINT.getEndpoint() + "/risk-limits"),

    //save
    //post
    ADM_CON_RISK_LIMITS_SAVE_ENDPOINT(ADM_CON_RISK_LIMITS_ENDPOINT.getEndpoint() + "/save");

    private final String endpoint;

}
