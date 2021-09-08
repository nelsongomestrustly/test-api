package cucumber.api.tests.conectors.admconsole.endpoints;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static cucumber.api.tests.conectors.admconsole.endpoints.AdmConEndpoint.ADM_CON_ADM_CON_ENDPOINT;

//admin-console
//HelpTooltipsController
@AllArgsConstructor
@Getter
public enum AdmConHelpToolTipsEndpoint {

    //index
    //get
    ADM_CON_HELP_TOOL_TIPS_ENDPOINT(ADM_CON_ADM_CON_ENDPOINT + "/help-tool-tips");


    private final String endpoint;

}
