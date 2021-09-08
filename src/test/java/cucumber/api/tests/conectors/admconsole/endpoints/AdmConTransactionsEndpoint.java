package cucumber.api.tests.conectors.admconsole.endpoints;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static cucumber.api.tests.conectors.admconsole.endpoints.AdmConEndpoint.ADM_CON_ADM_CON_ENDPOINT;

//admin-console
//TestController
@AllArgsConstructor
@Getter
public enum AdmConTransactionsEndpoint {

    //index
    //get
    ADM_CON_TRANSACTIONS_ENDPOINT(ADM_CON_ADM_CON_ENDPOINT.getEndpoint() + "/transactions"),

    //index
    //get with params
    ADM_CON_TRANSACTIONS_SEARCH_ENDPOINT(ADM_CON_TRANSACTIONS_ENDPOINT.getEndpoint() + "?{0}"),

    //details
    //get
    ADM_CON_TRANSACTIONS_DETAILS_ENDPOINT(ADM_CON_TRANSACTIONS_ENDPOINT + "/details"),

    //eventsList
    //get
    ADM_CON_TRANSACTIONS_EVENTS_LIST_ENDPOINT(ADM_CON_TRANSACTIONS_ENDPOINT + "/eventsList"),

    //loadingEvents
    //get
    ADM_CON_TRANSACTIONS_LOADING_EVENTS_ENDPOINT(ADM_CON_TRANSACTIONS_ENDPOINT + "/loadingEvents"),

    //sessionSteps
    //get
    ADM_CON_TRANSACTIONS_SESSIONS_STEPS_ENDPOINT(ADM_CON_TRANSACTIONS_ENDPOINT + "/sessionSteps"),

    //refund
    //post
    ADM_CON_TRANSACTIONS_REFUND_ENDPOINT(ADM_CON_TRANSACTIONS_ENDPOINT + "/refund"),

    //dispute
    //post
    ADM_CON_TRANSACTIONS_DISPUTE_ENDPOINT(ADM_CON_TRANSACTIONS_ENDPOINT + "/dispute"),

    //reverse
    //post
    ADM_CON_TRANSACTIONS_REVERSE_ENDPOINT(ADM_CON_TRANSACTIONS_ENDPOINT + "/reverse"),

    //settle
    //post
    ADM_CON_TRANSACTIONS_SETTLE_ENDPOINT(ADM_CON_TRANSACTIONS_ENDPOINT + "/settle"),

    //capture
    //post
    ADM_CON_TRANSACTIONS_CAPTURE_ENDPOINT(ADM_CON_TRANSACTIONS_ENDPOINT + "/capture"),

    //preauth
    //post
    ADM_CON_TRANSACTIONS_PRE_AUTH_ENDPOINT(ADM_CON_TRANSACTIONS_ENDPOINT + "/preauth"),

    //represent
    //post
    ADM_CON_TRANSACTIONS_REPRESENT_ENDPOINT(ADM_CON_TRANSACTIONS_ENDPOINT + "/represent"),

    //updateRecurrence
    //post
    ADM_CON_TRANSACTIONS_UPDATE_RECURRENCE_ENDPOINT(ADM_CON_TRANSACTIONS_ENDPOINT + "/updateRecurrence"),

    //cancel
    //post
    ADM_CON_TRANSACTIONS_CANCEL_ENDPOINT(ADM_CON_TRANSACTIONS_ENDPOINT + "/cancel"),

    //fail
    //post
    ADM_CON_TRANSACTIONS_FAIL_ENDPOINT(ADM_CON_TRANSACTIONS_ENDPOINT + "/fail"),

    //process
    //post
    ADM_CON_TRANSACTIONS_PROCESS_ENDPOINT(ADM_CON_TRANSACTIONS_ENDPOINT + "/process"),

    //displayIdentityValidationResultDialog
    //get
    ADM_CON_TRANSACTIONS_DISPLAY_IDENTITY_VALIDATION_RESULT_DIALOG_ENDPOINT(ADM_CON_TRANSACTIONS_ENDPOINT + "/displayIdentityValidationResultDialog"),

    //displayVerificationDialog
    //get
    ADM_CON_TRANSACTIONS_DISPLAY_VERIFICATION_DIALOG_ENDPOINT(ADM_CON_TRANSACTIONS_ENDPOINT + "/displayVerificationDialog"),

    //approve
    //get
    ADM_CON_TRANSACTIONS_APPROVE_ENDPOINT(ADM_CON_TRANSACTIONS_ENDPOINT + "/approve"),

    //deny
    //get
    ADM_CON_TRANSACTIONS_DENY_ENDPOINT(ADM_CON_TRANSACTIONS_ENDPOINT + "/deny"),

    //approveAccValidation
    //get
    ADM_CON_TRANSACTIONS_APPROVE_ACC_VALIDATION_ENDPOINT(ADM_CON_TRANSACTIONS_ENDPOINT + "/approveAccValidation"),

    //denyAccValidation
    //get
    ADM_CON_TRANSACTIONS_DENY_ACC_VALIDATION_ENDPOINT(ADM_CON_TRANSACTIONS_ENDPOINT + "/denyAccValidation"),

    //resetToResubmitTransaction
    //post
    ADM_CON_TRANSACTIONS_RESET_TO_RESUBMIT_TRANSACTION_ENDPOINT(ADM_CON_TRANSACTIONS_ENDPOINT + "/resetToResubmitTransaction"),

    //deposit
    //post
    ADM_CON_TRANSACTIONS_DEPOSIT_ENDPOINT(ADM_CON_TRANSACTIONS_ENDPOINT + "/deposit"),

    //reclaim
    //post
    ADM_CON_TRANSACTIONS_RECLAIM_ENDPOINT(ADM_CON_TRANSACTIONS_ENDPOINT + "/reclaim"),

    //setExcludeFromReports
    //post
    ADM_CON_TRANSACTIONS_SET_EXCLUDED_FROM_REPORTS_ENDPOINT(ADM_CON_TRANSACTIONS_ENDPOINT + "/setExcludeFromReports"),

    //setAutomaticRepresentment
    //post
    ADM_CON_TRANSACTIONS_SET_AUTOMATIC_REPRESENTMENT_ENDPOINT(ADM_CON_TRANSACTIONS_ENDPOINT + "/setAutomaticRepresentment"),

    //batchSetExcludeFromReports
    //post
    ADM_CON_TRANSACTIONS_BATCH_SET_EXCLUDE_FROM_REPORTS_ENDPOINT(ADM_CON_TRANSACTIONS_ENDPOINT + "/batchSetExcludeFromReports"),

    //createFraudAnalysisIssue
    //post
    ADM_CON_TRANSACTIONS_CREATE_FRAUD_ANALYSIS_ISSUE_ENDPOINT(ADM_CON_TRANSACTIONS_ENDPOINT + "/createFraudAnalysisIssue"),

    //createFraudAnalysisIssue
    //post
    ADM_CON_TRANSACTIONS_RETRIEVE_LOG_ENDPOINT(ADM_CON_TRANSACTIONS_ENDPOINT + "/retrieveLog"),

    //collect
    //post
    ADM_CON_TRANSACTIONS_COLLECT_ENDPOINT(ADM_CON_TRANSACTIONS_ENDPOINT + "/collect"),

    //setExcludeFromCollections
    //post
    ADM_CON_TRANSACTIONS_SET_EXCLUDE_FROM_COLLECTIONS_ENDPOINT(ADM_CON_TRANSACTIONS_ENDPOINT + "/setExcludeFromCollections"),

    //completeMCD
    //post
    ADM_CON_TRANSACTIONS_COMPLETE_MCD_ENDPOINT(ADM_CON_TRANSACTIONS_ENDPOINT + "/completeMCD"),

    //denyMCD
    //post
    ADM_CON_TRANSACTIONS_DENY_MCD_ENDPOINT(ADM_CON_TRANSACTIONS_ENDPOINT + "/denyMCD");

    private final String endpoint;

}
