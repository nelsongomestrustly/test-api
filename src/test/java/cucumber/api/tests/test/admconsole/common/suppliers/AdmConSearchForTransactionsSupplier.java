package cucumber.api.tests.test.admconsole.common.suppliers;

import cucumber.api.tests.common.enums.queries.QueryParametersEnum;
import cucumber.api.tests.common.functions.GenericFunctions;
import cucumber.api.tests.common.predicates.GenericPredicates;
import cucumber.api.tests.test.admconsole.data.dto.AdmConSearchTransactionsDTO;

import static cucumber.api.tests.common.suppliers.QueryParamSuppliers.getSearchFormatByField;
import static cucumber.api.tests.common.suppliers.QueryParamSuppliers.removeLastCharIfNecessary;

public class AdmConSearchForTransactionsSupplier {

    private static boolean removeLastChar;

    /**
     * &mctCustomerName=cunelson&customerExternalId=&
     * &mctCustomerName=&customerExternalId=&
     * &customerName=finelson&taxId=&
     * end = &X-CSRFKey=meg4t6uc4a0831lvcqdvu88q6j
     */
    public static String getSearchForTransactionsUrl(AdmConSearchTransactionsDTO admConSearchTransactionsDTO) {

        StringBuilder sb = new StringBuilder();

        //Transaction Id
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getTransactionId(), QueryParametersEnum.TRANSACTION_ID));
        //ppTransactionId
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getPpTransactionId(), QueryParametersEnum.PP_TRANSACTION_ID));
        //Merchant Reference
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getMerchantReference(), QueryParametersEnum.MERCHANT_REFERENCE));
        //originalTransactionId
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getOriginalTransactionId(), QueryParametersEnum.ORIGINAL_TRANSACTION_ID));
        //merchantId
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getMerchantId(), QueryParametersEnum.MERCHANT_ID));
        //paymentProviderId
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getPaymentProviderId(), QueryParametersEnum.PAYMENT_PROVIDER_ID));
        //paymentId
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getPaymentId(), QueryParametersEnum.PAYMENT_ID));
        //ppTrxStatusCode
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getPpTrxStatusCode(), QueryParametersEnum.PP_TRX_STATUS_CODE));
        //authorizationStatus
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getAuthorizationStatus(), QueryParametersEnum.AUTHORIZATION_STATUS));
        //fingerprint
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getFingerprint(), QueryParametersEnum.FINGER_PRINT));
        //Customer Name
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getCustomerName(), QueryParametersEnum.CUSTOMER_NAME));
        //taxId
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getTaxId(), QueryParametersEnum.TAX_ID));
        //MCT Customer Name
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getMctCustomerName(), QueryParametersEnum.MCT_CUSTOMER));
        //customerExternalId
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getCustomerExternalId(), QueryParametersEnum.CUSTOMER_EXTERNAL_ID));
        //routingNumber
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getRoutingNumber(), QueryParametersEnum.ROUTING_NUMBER));
        //accountNumber
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getAccountNumber(), QueryParametersEnum.ACCOUNT_NUMBER));
        //iban
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getIban(), QueryParametersEnum.IBAN));
        //minRiskIndex
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getMinRiskIndex(), QueryParametersEnum.MIN_RISK_INDEX));
        //maxRiskIndex
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getMaxRiskIndex(), QueryParametersEnum.MAX_RISK_INDEX));
        //deviceFingerprint
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getDeviceFingerprint(), QueryParametersEnum.DEVICE_FINGER_PRINT));
        //ipAddr
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getIpAddr(), QueryParametersEnum.IP_ADDR));
        //description
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getDescription(), QueryParametersEnum.DESCRIPTION));
        //excludedFromReports
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getExcludedFromReports(), QueryParametersEnum.EXCLUDED_FROM_REPORTS));
        //verificationFICode
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getVerificationFICode(), QueryParametersEnum.VERIFICATION_FI_CODE));
        //verificationRoutingNumber
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getVerificationRoutingNumber(), QueryParametersEnum.VERIFICATION_ROUTING_NUMBER));
        //verificationAccountNumber
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getVerificationAccountNumber(), QueryParametersEnum.VERIFICATION_ACCOUNT_NUMBER));
        //verified
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getVerified(), QueryParametersEnum.VERIFIED));
        //verificationStatus
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getVerificationStatus(), QueryParametersEnum.VERIFICATION_STATUS));
        //minAmount
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getMinAmount(), QueryParametersEnum.MIN_AMOUNT));
        //maxAmount
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getMaxAmount(), QueryParametersEnum.MAX_AMOUNT));
        //minPaid
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getMinPaid(), QueryParametersEnum.MIN_PAID));
        //maxPaid
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getMaxPaid(), QueryParametersEnum.MAX_PAID));
        //minRefunded
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getMinRefunded(), QueryParametersEnum.MIN_REFUNDED));
        //maxRefunded
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getMaxRefunded(), QueryParametersEnum.MAX_REFUNDED));
        //startCreateDate
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getStartCreateDate(), QueryParametersEnum.START_CREATE_DATE));
        //endCreateDate
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getEndCreateDate(), QueryParametersEnum.END_CREATE_DATE));
        //startUpdateDate
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getStartUpdateDate(), QueryParametersEnum.START_UPDATE_DATE));
        //endUpdateDate
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getStartUpdateDate(), QueryParametersEnum.END_UPDATE_DATE));
        //startProcessedDate
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getStartProcessedDate(), QueryParametersEnum.START_PROCESSED_DATE));
        //endProcessedDate
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getEndProcessedDate(), QueryParametersEnum.END_PROCESSED_DATE));
        //startCompletedDate
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getStartCompletedDate(), QueryParametersEnum.START_COMPLETE_DATE));
        //endCompletedDate
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getEndCompletedDate(), QueryParametersEnum.END_COMPLETE_DATE));
        //customerCollectionRef
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getCustomerCollectionRef(), QueryParametersEnum.CUSTOMER_COLLECTION_REF));
        //framework
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getFramework(), QueryParametersEnum.FRAMEWORK));
        //excludedFromCollections
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getExcludedFromCollections(), QueryParametersEnum.EXCLUDED_FROM_COLLECTIONS));
        //personId
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getPersonId(), QueryParametersEnum.PERSON_ID));
        //fiCustomerId
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getFiCustomerId(), QueryParametersEnum.FI_CUSTOMER_ID));
        //orderBy
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getOrderBy(), QueryParametersEnum.ORDER_BY));
        //sortOrder
        //sb.append(getSearchFormatByField(adminConsoleSearchTransactionsDTO.getOrderBy(), AdminConsoleSearchTransactionsDTOFieldsEnum.SORT_ORDER));
        //startIndex
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getStartIndex(), QueryParametersEnum.START_INDEX));

        return removeLastCharIfNecessary(sb.toString());


    }



}
