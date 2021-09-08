package cucumber.api.tests.conectors.admconsole.endpoints;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static cucumber.api.tests.conectors.admconsole.endpoints.AdmConEndpoint.ADM_CON_ADM_CON_ENDPOINT;

//admin-console
//MerchantsController
@AllArgsConstructor
@Getter
public enum AdmConMerchantsEndpoint {

    //merchants
    //get
    ADM_CON_MERCHANTS_ENDPOINT(ADM_CON_ADM_CON_ENDPOINT + "/merchants"),

    //newMerchant
    //get
    ADM_CON_MERCHANTS_NEW_MERCHANT_ENDPOINT(ADM_CON_MERCHANTS_ENDPOINT + "/newMerchant"),

    //financialInstitutions
    //get
    ADM_CON_MERCHANTS_FINANCIAL_INSTITUTIONS_ENDPOINT(ADM_CON_MERCHANTS_ENDPOINT + "/financialInstitutions"),

    //financialInstitutionsSave
    //get
    ADM_CON_MERCHANTS_FINANCIAL_INSTITUTIONS_SAVE_ENDPOINT(ADM_CON_MERCHANTS_ENDPOINT + "/financialInstitutions-save"),

    //experiments
    //get
    ADM_CON_MERCHANTS_EXPERIMENTS_ENDPOINT(ADM_CON_MERCHANTS_ENDPOINT + "/experiments"),

    //experimentsSave
    //get
    ADM_CON_MERCHANTS_EXPERIMENTS_SAVE_ENDPOINT(ADM_CON_MERCHANTS_ENDPOINT + "/experiments-save"),

    //save
    //post
    ADM_CON_MERCHANTS_SAVE_ENDPOINT(ADM_CON_MERCHANTS_ENDPOINT + "/save"),

    //activate
    //post
    ADM_CON_MERCHANTS_ACTIVATE_ENDPOINT(ADM_CON_MERCHANTS_ENDPOINT + "/activate"),

    //deactivate
    //post
    ADM_CON_MERCHANTS_DESACTIVATE_ENDPOINT(ADM_CON_MERCHANTS_ENDPOINT + "/deactivate"),

    //schema
    //post
    ADM_CON_MERCHANTS_SCHEMA_ENDPOINT(ADM_CON_MERCHANTS_ENDPOINT + "/schema"),

    //uxpreview
    //get
    ADM_CON_MERCHANTS_UX_PREVIEW_ENDPOINT(ADM_CON_MERCHANTS_ENDPOINT + "/uxpreview"),

    //widgetPreview
    //get
    ADM_CON_MERCHANTS_WIDGET_PREVIEW_ENDPOINT(ADM_CON_MERCHANTS_ENDPOINT + "/widgetPreview"),

    //abstats
    //get
    ADM_CON_MERCHANTS_ABSTATS_ENDPOINT(ADM_CON_MERCHANTS_ENDPOINT + "/abstats"),

    //templates
    //get
    ADM_CON_MERCHANTS_TEMPLATES_ENDPOINT(ADM_CON_MERCHANTS_ENDPOINT + "/templates"),

    //listTemplates
    //get
    ADM_CON_MERCHANTS_TEMPLATES_LIST_ENDPOINT(ADM_CON_MERCHANTS_ENDPOINT + "/listTemplates"),

    //newTemplate
    //post
    ADM_CON_MERCHANTS_NEW_TEMPLATES_ENDPOINT(ADM_CON_MERCHANTS_ENDPOINT + "/newTemplate"),

    //deleteTemplate
    //post
    ADM_CON_MERCHANTS_DELETE_TEMPLATES_ENDPOINT(ADM_CON_MERCHANTS_ENDPOINT + "/deleteTemplate"),

    //logAccessKeyReveal
    //post
    ADM_CON_MERCHANTS_LOG_ACCESS_KEY_REVEAL_ENDPOINT(ADM_CON_MERCHANTS_ENDPOINT + "/logAccessKeyReveal"),

    //logTrustlyABConfigReveal
    //post
    ADM_CON_MERCHANTS_LOG_TRUSTLY_AB_CONFIG_REVEAL_ENDPOINT(ADM_CON_MERCHANTS_ENDPOINT + "/logTrustlyABConfigReveal"),

    //selfRegisterMid
    //post
    ADM_CON_MERCHANTS_SELF_REGISTER_MID_ENDPOINT(ADM_CON_MERCHANTS_ENDPOINT + "/selfRegisterMid");

    private final String endpoint;

}
