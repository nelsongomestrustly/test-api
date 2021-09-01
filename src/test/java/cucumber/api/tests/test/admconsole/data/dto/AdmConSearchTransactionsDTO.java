package cucumber.api.tests.test.admconsole.data.dto;

import cucumber.api.tests.common.enums.queries.QueryParametersEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
/**
 * http://localhost:9002/admin-console/transactions?transactionId=&ppTransactionId=&merchantReference=&originalTransactionId=&merchantId=&paymentProviderId=&paymentId=&ppTrxStatusCode=
 * &authorizationStatus=&fingerprint=&customerName=&taxId=&mctCustomerName=&customerExternalId=&routingNumber=&accountNumber=&iban=&minRiskIndex=&maxRiskIndex=&deviceFingerprint=&ipAddr=
 * &description=&excludedFromReports=&verificationFICode=&verificationRoutingNumber=&verificationAccountNumber=&verified=&verificationStatus=&minAmount=&maxAmount=&minPaid=&maxPaid=&minRefunded=
 * &maxRefunded=&startCreateDate=&endCreateDate=&startUpdateDate=&endUpdateDate=&startProcessedDate=&endProcessedDate=&startCompletedDate=&endCompletedDate=&customerCollectionRef=
 * &framework=&excludedFromCollections=&personId=&fiCustomerId=&orderBy=createdAt&sortOrder=desc&startIndex=0&originalStartIndex=0&X-CSRFKey=meg4t6uc4a0831lvcqdvu88q6j
 *
 * &mctCustomerName=cunelson&customerExternalId=&
 * &mctCustomerName=&customerExternalId=&
 */
public class AdmConSearchTransactionsDTO {

    //Don´t change the order of this fields

    private Integer transactionId;
    private QueryParametersEnum transactionIdKey = QueryParametersEnum.TRANSACTION_ID;

    private Integer ppTransactionId;
    private QueryParametersEnum ppTransactionIdKey = QueryParametersEnum.PP_TRANSACTION_ID;

    private String merchantReference;
    private QueryParametersEnum merchantReferenceKey = QueryParametersEnum.MERCHANT_REFERENCE;

    private Integer originalTransactionId;
    private QueryParametersEnum originalTransactionIdKey = QueryParametersEnum.ORIGINAL_TRANSACTION_ID;

    private Integer merchantId;
    private QueryParametersEnum merchantIdKey = QueryParametersEnum.MERCHANT_ID;

    private Integer paymentProviderId;
    private QueryParametersEnum paymentProviderIdKey = QueryParametersEnum.PAYMENT_PROVIDER_ID;

    private Integer paymentId;
    private QueryParametersEnum paymentIdKey = QueryParametersEnum.PAYMENT_ID;

    private Integer ppTrxStatusCode;
    private QueryParametersEnum ppTrxStatusCodeKey = QueryParametersEnum.PP_TRX_STATUS_CODE;

    private Integer authorizationStatus;
    private QueryParametersEnum authorizationStatusKey = QueryParametersEnum.AUTHORIZATION_STATUS;

    private Integer fingerprint;
    private QueryParametersEnum fingerprintKey = QueryParametersEnum.FINGER_PRINT;

    //FI Customer Name (Front End)
    private String customerName;
    private QueryParametersEnum customerNameKey = QueryParametersEnum.CUSTOMER_NAME;

    private String taxId;
    private QueryParametersEnum taxIdKey = QueryParametersEnum.TAX_ID;

    //Customer Name (Front End)
    private String mctCustomerName;
    private QueryParametersEnum mctCustomerNameKey = QueryParametersEnum.MCT_CUSTOMER_NAME;

    private Integer customerExternalId;
    private QueryParametersEnum customerExternalIdKey = QueryParametersEnum.CUSTOMER_EXTERNAL_ID;

    private Integer routingNumber;
    private QueryParametersEnum routingNumberKey = QueryParametersEnum.ROUTING_NUMBER;

    private Integer accountNumber;
    private QueryParametersEnum accountNumberKey = QueryParametersEnum.ACCOUNT_NUMBER;

    private Integer iban;
    private QueryParametersEnum ibanKey = QueryParametersEnum.IBAN;

    private Integer minRiskIndex;
    private QueryParametersEnum minRiskIndexKey = QueryParametersEnum.MIN_RISK_INDEX;

    private Integer maxRiskIndex;
    private QueryParametersEnum maxRiskIndexKey = QueryParametersEnum.MAX_RISK_INDEX;

    private Integer deviceFingerprint;
    private QueryParametersEnum deviceFingerprintKey = QueryParametersEnum.DEVICE_FINGER_PRINT;

    private Integer ipAddr;
    private QueryParametersEnum ipAddrKey = QueryParametersEnum.IP_ADDR;

    private String description;
    private QueryParametersEnum descriptionKey = QueryParametersEnum.DESCRIPTION;

    private String excludedFromReports;
    private QueryParametersEnum excludedFromReportsKey = QueryParametersEnum.EXCLUDED_FROM_REPORTS;

    private Integer verificationFICode;
    private QueryParametersEnum verificationFICodeKey = QueryParametersEnum.VERIFICATION_FI_CODE;

    private Integer verificationRoutingNumber;
    private QueryParametersEnum verificationRoutingNumberKey = QueryParametersEnum.VERIFICATION_ROUTING_NUMBER;

    private Integer verificationAccountNumber;
    private QueryParametersEnum verificationAccountNumberKey = QueryParametersEnum.VERIFICATION_ACCOUNT_NUMBER;

    private Integer verified;
    private QueryParametersEnum verifiedKey = QueryParametersEnum.VERIFIED;

    private Integer verificationStatus;
    private QueryParametersEnum verificationStatusKey = QueryParametersEnum.VERIFICATION_STATUS;

    private Integer minAmount;
    private QueryParametersEnum minAmountKey = QueryParametersEnum.MIN_AMOUNT;

    private Integer maxAmount;
    private QueryParametersEnum maxAmountKey = QueryParametersEnum.MAX_AMOUNT;

    private Integer minPaid;
    private QueryParametersEnum minPaidKey = QueryParametersEnum.MIN_PAID;

    private Integer maxPaid;
    private QueryParametersEnum maxPaidKey = QueryParametersEnum.MAX_PAID;

    private Integer minRefunded;
    private QueryParametersEnum minRefundedKey = QueryParametersEnum.MIN_REFUNDED;

    private Integer maxRefunded;
    private QueryParametersEnum maxRefundedKey = QueryParametersEnum.MAX_REFUNDED;

    private Integer startCreateDate;
    private QueryParametersEnum startCreateDateKey = QueryParametersEnum.START_CREATE_DATE;

    private Integer endCreateDate;
    private QueryParametersEnum endCreateDateKey = QueryParametersEnum.END_CREATE_DATE;

    private Integer startUpdateDate;
    private QueryParametersEnum startUpdateDateKey = QueryParametersEnum.START_UPDATE_DATE;

    private Integer endUpdateDate;
    private QueryParametersEnum endUpdateDateKey = QueryParametersEnum.END_UPDATE_DATE;

    private Integer startProcessedDate;
    private QueryParametersEnum startProcessedDateKey = QueryParametersEnum.START_PROCESSED_DATE;

    private Integer endProcessedDate;
    private QueryParametersEnum endProcessedDateKey = QueryParametersEnum.END_PROCESSED_DATE;

    private Integer startCompletedDate;
    private QueryParametersEnum startCompletedDateKey = QueryParametersEnum.START_COMPLETE_DATE;

    private Integer endCompletedDate;
    private QueryParametersEnum endCompletedDateKey = QueryParametersEnum.END_COMPLETE_DATE;

    private Integer customerCollectionRef;
    private QueryParametersEnum customerCollectionRefKey = QueryParametersEnum.CUSTOMER_COLLECTION_REF;

    private Integer framework;
    private QueryParametersEnum frameworkKey = QueryParametersEnum.FRAMEWORK;

    private Integer excludedFromCollections;
    private QueryParametersEnum excludedFromCollectionsKey = QueryParametersEnum.EXCLUDED_FROM_COLLECTIONS;

    private Integer personId;
    private QueryParametersEnum personIdKey = QueryParametersEnum.PERSON_ID;

    private Integer fiCustomerId;
    private QueryParametersEnum fiCustomerIdKey = QueryParametersEnum.FI_CUSTOMER_ID;

    //Default Values

    private String orderBy;
    private QueryParametersEnum orderByKey = QueryParametersEnum.ORDER_BY;

    private String sortOrder;
    private QueryParametersEnum sortOrderKey = QueryParametersEnum.SORT_ORDER;

    private Integer startIndex;
    private QueryParametersEnum startIndexKey = QueryParametersEnum.START_INDEX;

}
