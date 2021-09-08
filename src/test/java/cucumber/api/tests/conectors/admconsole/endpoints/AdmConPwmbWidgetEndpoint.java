package cucumber.api.tests.conectors.admconsole.endpoints;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static cucumber.api.tests.conectors.admconsole.endpoints.AdmConEndpoint.ADM_CON_ADM_CON_ENDPOINT;

//admin-console
//PwmbWidgetController
@AllArgsConstructor
@Getter
public enum AdmConPwmbWidgetEndpoint {

    //index
    //get
    ADM_CON_PWMB_WIDGET_ENDPOINT(ADM_CON_ADM_CON_ENDPOINT.getEndpoint() + "/pwmb-widget"),

    //reload
    //post
    ADM_CON_PWMB_WIDGET_RELOAD_ENDPOINT(ADM_CON_PWMB_WIDGET_ENDPOINT.getEndpoint() + "/reload"),

    //create
    //post
    ADM_CON_PWMB_WIDGET_CREATE_ENDPOINT(ADM_CON_PWMB_WIDGET_ENDPOINT.getEndpoint() + "/create"),

    //updateWidgets
    //post
    ADM_CON_PWMB_WIDGET_UPDATE_WIDGETS_ENDPOINT(ADM_CON_PWMB_WIDGET_ENDPOINT.getEndpoint() + "/updateWidgets"),

    //newAssociation
    //get
    ADM_CON_PWMB_WIDGET_NEW_ASSOCIATION_ENDPOINT(ADM_CON_PWMB_WIDGET_ENDPOINT.getEndpoint() + "/newAssociation"),

    //updateWidgets
    //post
    ADM_CON_PWMB_WIDGET_ASSOCIATE_WIDGET_ENDPOINT(ADM_CON_PWMB_WIDGET_ENDPOINT.getEndpoint() + "/associateWidget"),

    //merchantsUsing
    //get
    ADM_CON_PWMB_WIDGET_MERCHANTS_USING_ENDPOINT(ADM_CON_PWMB_WIDGET_ENDPOINT.getEndpoint() + "/merchantsUsing");


    private final String endpoint;

}
