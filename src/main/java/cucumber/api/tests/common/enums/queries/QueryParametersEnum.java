package cucumber.api.tests.common.enums.queries;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum QueryParametersEnum {


    ACCESS_ID("accessId"),
    ACCOUNT_NUMBER("accountNumber"),
    AUTHORIZATION_STATUS("authorizationStatus"),
    CUSTOMER_COUNTRY_NAME_PARAM("customer[address][country]"),
    CUSTOMER_NAME("customerName"),
    CUSTOMER_NAME_PARAM("customer[name]"),
    CUSTOMER_COLLECTION_REF("customerCollectionRef"),
    CUSTOMER_EXTERNAL_ID("customerExternalId"),
    DESCRIPTION("description"),
    DEVICE_CATEGORY("deviceCategory"),
    DEVICE_OS("deviceOs"),
    DEVICE_TYPE("deviceType"),
    DEVICE_FINGER_PRINT("deviceFingerprint"),
    END_COMPLETE_DATE("endCompletedDate"),
    END_CREATE_DATE("endCreateDate"),
    END_PROCESSED_DATE("endProcessedDate"),
    END_UPDATE_DATE("endUpdateDate"),
    EXCLUDED_FROM_COLLECTIONS("excludedFromCollections"),
    EXCLUDED_FROM_REPORTS("excludedFromReports"),
    FI_CUSTOMER_ID("fiCustomerId"),
    FINGER_PRINT("fingerprint"),
    FRAMEWORK("framework"),
    IBAN("iban"),
    IP_ADDR("ipAddr"),
    MAX_AMOUNT("maxAmount"),
    MAX_PAID("maxPaid"),
    MAX_REFUNDED("maxRefunded"),
    MAX_RISK_INDEX("maxRiskIndex"),
    MCT_CUSTOMER("mctCustomerName"),
    MERCHANT_ID("merchantId"),
    MERCHANT_REFERENCE("merchantReference"),
    MIN_AMOUNT("minAmount"),
    MIN_REFUNDED("minRefunded"),
    MIN_PAID("minPaid"),
    MIN_RISK_INDEX("minRiskIndex"),
    ORDER_BY("orderBy"),
    ORIGINAL_TRANSACTION_ID("originalTransactionId"),
    PAYMENT_ID("paymentId"),
    PAYMENT_PROVIDER_ID("paymentProviderId"),
    PAYMENT_TYPE_PARAM("paymentType"),
    PERSON_ID("personId"),
    PP_TRANSACTION_ID("ppTransactionId"),
    PP_TRX_STATUS_CODE("ppTrxStatusCode"),
    ROUTING_NUMBER("routingNumber"),
    SORT_ORDER("sortOrder"),
    START_COMPLETE_DATE("startCompletedDate"),
    START_CREATE_DATE("startCreateDate"),
    START_INDEX("startIndex"),
    START_PROCESSED_DATE("startProcessedDate"),
    START_UPDATE_DATE("startUpdateDate"),
    TAX_ID("taxId"),
    TRANSACTION_ID("transactionId"),
    TYPE("type"),
    VERIFICATION_ACCOUNT_NUMBER("verificationAccountNumber"),
    VERIFICATION_FI_CODE("verificationFICode"),
    VERIFICATION_ROUTING_NUMBER("verificationRoutingNumber"),
    VERIFICATION_STATUS("verificationStatus"),
    VERIFIED("verified"),
    WIDGET_ID("widgetId");

    private final String keyName;

}
