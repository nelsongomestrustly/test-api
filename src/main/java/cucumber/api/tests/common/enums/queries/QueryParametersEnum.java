package cucumber.api.tests.common.enums.queries;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum QueryParametersEnum {


    ACCESS_ID("accessId"),
    ACCOUNT_NUMBER("accountNumber"),
    ACTIVE("active"),
    AMOUNT("amount"),
    AUTHORIZATION_STATUS("authorizationStatus"),
    AUTH_TOKEN("authToken"),
    CANCEL_URL("cancelUrl"),
    CID("cid"),
    CREATE_AT("createdAt"),
    CURRENCY("currency"),
    CUSTOMER_ADDRESS_1_PARAM("customer.address.address1"),
    CUSTOMER_ADDRESS_2_PARAM("customer.address.address2"),
    CUSTOMER_ADDRESS_CITY_PARAM("customer.address.city"),
    CUSTOMER_ADDRESS_COUNTRY_DOT("customer.address.country"),
    CUSTOMER_ADDRESS_COUNTRY_PARAM("customer.address.country"),
    CUSTOMER_ADDRESS_STATE_PARAM("customer.address.state"),
    CUSTOMER_ADDRESS_STATE_DOT("customer.address.state"),
    CUSTOMER_ADDRESS_ZIP_PARAM("customer.address.zip"),
    CUSTOMER_DRIVER_LICENSE_NUMBER_PARAM("customer.driverLicense.number"),
    CUSTOMER_DRIVER_LICENSE_STATE_PARAM("customer.driverLicense.state"),
    CUSTOMER_EMAIL_PARAM("customer.email"),
    CUSTOMER_NAME("customerName"),
    CUSTOMER_NAME_PARAM("customer.name"),
    CUSTOMER_COLLECTION_REF("customerCollectionRef"),
    CUSTOMER_EXTERNAL_ID("customerExternalId"),
    CUSTOMER_EXTERNAL_DOT_ID("customer.externalId"),
    CUSTOMER_PHONE("customer.phone"),
    CUSTOMER_TAX_ID("customer.taxId"),
    DEPRECATED("deprecated"),
    DESCRIPTION("description"),
    DEVICE_CATEGORY("deviceCategory"),
    DEVICE_OS("deviceOs"),
    DEVICE_TYPE("deviceType"),
    DEVICE_FINGER_PRINT("deviceFingerprint"),
    DYNAMIC_WIDGET("dynamicWidget"),
    END_COMPLETE_DATE("endCompletedDate"),
    END_CREATE_DATE("endCreateDate"),
    END_PROCESSED_DATE("endProcessedDate"),
    END_UPDATE_DATE("endUpdateDate"),
    EXCLUDED_FROM_COLLECTIONS("excludedFromCollections"),
    EXCLUDED_FROM_REPORTS("excludedFromReports"),
    FI_CUSTOMER_ID("fiCustomerId"),
    FINGER_PRINT("fingerprint"),
    FPD("fpd"),
    FRAMEWORK("framework"),
    GLOBEX_LANG_PARAM("globex.lang"),
    GLOBEX_DESCRIPTION("globexDescription"),
    GRP("grp"),
    IBAN("iban"),
    ID("id"),
    IP_ADDR("ipAddr"),
    IS_DELETED("isDeleted"),
    LANG("lang"),
    LAST_USED("lastUsed"),
    LIGHT_BOX_COMPLETES("lightboxCompletes"),
    LIGHT_BOX_INITIATES("lightboxInitiates"),
    LOGO_URL("logoUrl"),
    MAX_AMOUNT("maxAmount"),
    MAX_PAID("maxPaid"),
    MAX_REFUNDED("maxRefunded"),
    MAX_RISK_INDEX("maxRiskIndex"),
    MCT_CUSTOMER_NAME("mctCustomerName"),
    MERCHANT_ID("merchantId"),
    MERCHANT_REFERENCE("merchantReference"),
    METADATA_LANG_PARAM("metadata.lang"),
    METADATA_SKIN_CODE_PARAM("metadata.skinCode"),
    MIN_AMOUNT("minAmount"),
    MIN_REFUNDED("minRefunded"),
    MIN_PAID("minPaid"),
    MIN_RISK_INDEX("minRiskIndex"),
    NAME("name"),
    NUMBER("number"),
    ORDER_BY("orderBy"),
    ORIGINAL_TRANSACTION_ID("originalTransactionId"),
    PAYMENT_ID("paymentId"),
    PAYMENT_FLOW("paymentFlow"),
    PAYMENT_FLOW_MERCHANT_ID("paymentFlowMerchantIdKey"),
    PAYMENT_PROVIDER_ID("paymentProviderId"),
    PAYMENT_TYPE("paymentType"),
    PERCENTAGE("percentage"),
    PERSON_ID("personId"),
    PP_TRANSACTION_ID("ppTransactionId"),
    PP_TRX_STATUS_CODE("ppTrxStatusCode"),
    RECURRENCE("recurrence"),
    RECURRENCE_AUTOMATIC_CAPTURE_PARAM("recurrence.automaticCapture"),
    RECURRENCE_END_DATE_PARAM("recurrence.endDate"),
    RECURRENCE_FREQUENCY_PARAM("recurrence.frequency"),
    RECURRENCE_FREQUENCY_UNIT_PARAM("recurrence.frequencyUnit"),
    RECURRENCE_FREQUENCY_UNIT_TYPE_PARAM("recurrence.frequencyUnitType"),
    RECURRENCE_RECURRING_AMOUNT_PARAM("recurrence.recurringAmount"),
    RECURRENCE_START_DATE_PARAM("recurrence.startDate"),
    REFERER("referer"),
    REQUEST_SIGNATURE("requestSignature"),
    RETURN_URL("returnUrl"),
    ROUTING_NUMBER("routingNumber"),
    SORT_ORDER("sortOrder"),
    START_COMPLETE_DATE("startCompletedDate"),
    START_CREATE_DATE("startCreateDate"),
    START_INDEX("startIndex"),
    START_PROCESSED_DATE("startProcessedDate"),
    START_UPDATE_DATE("startUpdateDate"),
    STORAGE("storage"),
    TAX_ID("taxId"),
    TOKEN("token"),
    TRANSACTION_ID("transactionId"),
    TYPE("type"),
    UI_PARAMS("uiParams"),
    UI_THEME("uiTheme"),
    V("v"),
    VERIFICATION_ACCOUNT_NUMBER("verificationAccountNumber"),
    VERIFICATION_FI_CODE("verificationFICode"),
    VERIFICATION_ROUTING_NUMBER("verificationRoutingNumber"),
    VERIFICATION_STATUS("verificationStatus"),
    VERIFIED("verified"),
    WIDGET_ID("widgetId"),
    WIDGET_IMPRESSIONS("widgetImpressions");

    private final String keyName;

}
