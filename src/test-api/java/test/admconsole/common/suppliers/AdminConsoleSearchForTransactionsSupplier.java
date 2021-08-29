package test.admconsole.common.suppliers;

import cucumber.api.tests.common.functions.GenericFunctions;
import cucumber.api.tests.common.predicates.GenericPredicates;
import test.admconsole.common.enums.AdminConsoleSearchTransactionsDTOFieldsEnum;
import test.admconsole.data.dto.AdminConsoleSearchTransactionsDTO;

public class AdminConsoleSearchForTransactionsSupplier {

    private static final String URL_SPLIT_SYMBOL = "&";
    private static final String EQUAL_SYMBOL = "=";
    private static boolean removeLastChar;

    /**
     * &mctCustomerName=cunelson&customerExternalId=&
     * &mctCustomerName=&customerExternalId=&
     * &customerName=finelson&taxId=&
     * end = &X-CSRFKey=meg4t6uc4a0831lvcqdvu88q6j
     */
    public static String getSearchForTransactionsUrl(AdminConsoleSearchTransactionsDTO adminConsoleSearchTransactionsDTO) {

        removeLastChar = false;
        StringBuilder sb = new StringBuilder();

        //Transaction Id
        sb.append(getSearchFormatByField(adminConsoleSearchTransactionsDTO.getTransactionId(), AdminConsoleSearchTransactionsDTOFieldsEnum.TRANSACTION_ID));
        //ppTransactionId
        sb.append(getSearchFormatByField(adminConsoleSearchTransactionsDTO.getPpTransactionId(), AdminConsoleSearchTransactionsDTOFieldsEnum.PP_TRANSACTION_ID));
        //Merchant Reference
        sb.append(getSearchFormatByField(adminConsoleSearchTransactionsDTO.getMerchantReference(), AdminConsoleSearchTransactionsDTOFieldsEnum.MERCHANT_REFERENCE));
        //originalTransactionId
        sb.append(getSearchFormatByField(adminConsoleSearchTransactionsDTO.getOriginalTransactionId(), AdminConsoleSearchTransactionsDTOFieldsEnum.ORIGINAL_TRANSACTION_ID));
        //merchantId
        sb.append(getSearchFormatByField(adminConsoleSearchTransactionsDTO.getMerchantId(), AdminConsoleSearchTransactionsDTOFieldsEnum.MERCHANT_ID));
        //paymentProviderId
        sb.append(getSearchFormatByField(adminConsoleSearchTransactionsDTO.getPaymentProviderId(), AdminConsoleSearchTransactionsDTOFieldsEnum.PAYMENT_PROVIDER_ID));
        //paymentId
        sb.append(getSearchFormatByField(adminConsoleSearchTransactionsDTO.getPaymentId(), AdminConsoleSearchTransactionsDTOFieldsEnum.PAYMENT_ID));
        //ppTrxStatusCode
        sb.append(getSearchFormatByField(adminConsoleSearchTransactionsDTO.getPpTrxStatusCode(), AdminConsoleSearchTransactionsDTOFieldsEnum.PP_TRX_STATUS_CODE));
        //authorizationStatus
        sb.append(getSearchFormatByField(adminConsoleSearchTransactionsDTO.getAuthorizationStatus(), AdminConsoleSearchTransactionsDTOFieldsEnum.AUTHORIZATION_STATUS));
        //fingerprint
        sb.append(getSearchFormatByField(adminConsoleSearchTransactionsDTO.getFingerprint(), AdminConsoleSearchTransactionsDTOFieldsEnum.FINGER_PRINT));
        //Customer Name
        sb.append(getSearchFormatByField(adminConsoleSearchTransactionsDTO.getCustomerName(), AdminConsoleSearchTransactionsDTOFieldsEnum.CUSTOMER_NAME));
        //taxId
        sb.append(getSearchFormatByField(adminConsoleSearchTransactionsDTO.getTaxId(), AdminConsoleSearchTransactionsDTOFieldsEnum.TAX_ID));
        //MCT Customer Name
        sb.append(getSearchFormatByField(adminConsoleSearchTransactionsDTO.getMctCustomerName(), AdminConsoleSearchTransactionsDTOFieldsEnum.MCT_CUSTOMER));
        //customerExternalId
        sb.append(getSearchFormatByField(adminConsoleSearchTransactionsDTO.getCustomerExternalId(), AdminConsoleSearchTransactionsDTOFieldsEnum.CUSTOMER_EXTERNAL_ID));
        //routingNumber
        sb.append(getSearchFormatByField(adminConsoleSearchTransactionsDTO.getRoutingNumber(), AdminConsoleSearchTransactionsDTOFieldsEnum.ROUTING_NUMBER));
        //accountNumber
        sb.append(getSearchFormatByField(adminConsoleSearchTransactionsDTO.getAccountNumber(), AdminConsoleSearchTransactionsDTOFieldsEnum.ACCOUNT_NUMBER));
        //iban
        sb.append(getSearchFormatByField(adminConsoleSearchTransactionsDTO.getIban(), AdminConsoleSearchTransactionsDTOFieldsEnum.IBAN));
        //minRiskIndex
        sb.append(getSearchFormatByField(adminConsoleSearchTransactionsDTO.getMinRiskIndex(), AdminConsoleSearchTransactionsDTOFieldsEnum.MIN_RISK_INDEX));
        //maxRiskIndex
        sb.append(getSearchFormatByField(adminConsoleSearchTransactionsDTO.getMaxRiskIndex(), AdminConsoleSearchTransactionsDTOFieldsEnum.MAX_RISK_INDEX));
        //deviceFingerprint
        sb.append(getSearchFormatByField(adminConsoleSearchTransactionsDTO.getDeviceFingerprint(), AdminConsoleSearchTransactionsDTOFieldsEnum.DEVICE_FINGER_PRINT));
        //ipAddr
        sb.append(getSearchFormatByField(adminConsoleSearchTransactionsDTO.getIpAddr(), AdminConsoleSearchTransactionsDTOFieldsEnum.IP_ADDR));
        //description
        sb.append(getSearchFormatByField(adminConsoleSearchTransactionsDTO.getDescription(), AdminConsoleSearchTransactionsDTOFieldsEnum.DESCRIPTION));
        //excludedFromReports
        sb.append(getSearchFormatByField(adminConsoleSearchTransactionsDTO.getExcludedFromReports(), AdminConsoleSearchTransactionsDTOFieldsEnum.EXCLUDED_FROM_REPORTS));
        //verificationFICode
        sb.append(getSearchFormatByField(adminConsoleSearchTransactionsDTO.getVerificationFICode(), AdminConsoleSearchTransactionsDTOFieldsEnum.VERIFICATION_FI_CODE));
        //verificationRoutingNumber
        sb.append(getSearchFormatByField(adminConsoleSearchTransactionsDTO.getVerificationRoutingNumber(), AdminConsoleSearchTransactionsDTOFieldsEnum.VERIFICATION_ROUTING_NUMBER));
        //verificationAccountNumber
        sb.append(getSearchFormatByField(adminConsoleSearchTransactionsDTO.getVerificationAccountNumber(), AdminConsoleSearchTransactionsDTOFieldsEnum.VERIFICATION_ACCOUNT_NUMBER));
        //verified
        sb.append(getSearchFormatByField(adminConsoleSearchTransactionsDTO.getVerified(), AdminConsoleSearchTransactionsDTOFieldsEnum.VERIFIED));
        //verificationStatus
        sb.append(getSearchFormatByField(adminConsoleSearchTransactionsDTO.getVerificationStatus(), AdminConsoleSearchTransactionsDTOFieldsEnum.VERIFICATION_STATUS));
        //minAmount
        sb.append(getSearchFormatByField(adminConsoleSearchTransactionsDTO.getMinAmount(), AdminConsoleSearchTransactionsDTOFieldsEnum.MIN_AMOUNT));
        //maxAmount
        sb.append(getSearchFormatByField(adminConsoleSearchTransactionsDTO.getMaxAmount(), AdminConsoleSearchTransactionsDTOFieldsEnum.MAX_AMOUNT));
        //minPaid
        sb.append(getSearchFormatByField(adminConsoleSearchTransactionsDTO.getMinPaid(), AdminConsoleSearchTransactionsDTOFieldsEnum.MIN_PAID));
        //maxPaid
        sb.append(getSearchFormatByField(adminConsoleSearchTransactionsDTO.getMaxPaid(), AdminConsoleSearchTransactionsDTOFieldsEnum.MAX_PAID));
        //minRefunded
        sb.append(getSearchFormatByField(adminConsoleSearchTransactionsDTO.getMinRefunded(), AdminConsoleSearchTransactionsDTOFieldsEnum.MIN_REFUNDED));
        //maxRefunded
        sb.append(getSearchFormatByField(adminConsoleSearchTransactionsDTO.getMaxRefunded(), AdminConsoleSearchTransactionsDTOFieldsEnum.MAX_REFUNDED));
        //startCreateDate
        sb.append(getSearchFormatByField(adminConsoleSearchTransactionsDTO.getStartCreateDate(), AdminConsoleSearchTransactionsDTOFieldsEnum.START_CREATE_DATE));
        //endCreateDate
        sb.append(getSearchFormatByField(adminConsoleSearchTransactionsDTO.getEndCreateDate(), AdminConsoleSearchTransactionsDTOFieldsEnum.END_CREATE_DATE));
        //startUpdateDate
        sb.append(getSearchFormatByField(adminConsoleSearchTransactionsDTO.getStartUpdateDate(), AdminConsoleSearchTransactionsDTOFieldsEnum.START_UPDATE_DATE));
        //endUpdateDate
        sb.append(getSearchFormatByField(adminConsoleSearchTransactionsDTO.getStartUpdateDate(), AdminConsoleSearchTransactionsDTOFieldsEnum.END_UPDATE_DATE));
        //startProcessedDate
        sb.append(getSearchFormatByField(adminConsoleSearchTransactionsDTO.getStartProcessedDate(), AdminConsoleSearchTransactionsDTOFieldsEnum.START_PROCESSED_DATE));
        //endProcessedDate
        sb.append(getSearchFormatByField(adminConsoleSearchTransactionsDTO.getEndProcessedDate(), AdminConsoleSearchTransactionsDTOFieldsEnum.END_PROCESSED_DATE));
        //startCompletedDate
        sb.append(getSearchFormatByField(adminConsoleSearchTransactionsDTO.getStartCompletedDate(), AdminConsoleSearchTransactionsDTOFieldsEnum.START_COMPLETE_DATE));
        //endCompletedDate
        sb.append(getSearchFormatByField(adminConsoleSearchTransactionsDTO.getEndCompletedDate(), AdminConsoleSearchTransactionsDTOFieldsEnum.END_COMPLETE_DATE));
        //customerCollectionRef
        sb.append(getSearchFormatByField(adminConsoleSearchTransactionsDTO.getCustomerCollectionRef(), AdminConsoleSearchTransactionsDTOFieldsEnum.CUSTOMER_COLLECTION_REF));
        //framework
        sb.append(getSearchFormatByField(adminConsoleSearchTransactionsDTO.getFramework(), AdminConsoleSearchTransactionsDTOFieldsEnum.FRAMEWORK));
        //excludedFromCollections
        sb.append(getSearchFormatByField(adminConsoleSearchTransactionsDTO.getExcludedFromCollections(), AdminConsoleSearchTransactionsDTOFieldsEnum.EXCLUDED_FROM_COLLECTIONS));
        //personId
        sb.append(getSearchFormatByField(adminConsoleSearchTransactionsDTO.getPersonId(), AdminConsoleSearchTransactionsDTOFieldsEnum.PERSON_ID));
        //fiCustomerId
        sb.append(getSearchFormatByField(adminConsoleSearchTransactionsDTO.getFiCustomerId(), AdminConsoleSearchTransactionsDTOFieldsEnum.FI_CUSTOMER_ID));
        //orderBy
        sb.append(getSearchFormatByField(adminConsoleSearchTransactionsDTO.getOrderBy(), AdminConsoleSearchTransactionsDTOFieldsEnum.ORDER_BY));
        //sortOrder
        //sb.append(getSearchFormatByField(adminConsoleSearchTransactionsDTO.getOrderBy(), AdminConsoleSearchTransactionsDTOFieldsEnum.SORT_ORDER));
        //startIndex
        sb.append(getSearchFormatByField(adminConsoleSearchTransactionsDTO.getStartIndex(), AdminConsoleSearchTransactionsDTOFieldsEnum.START_INDEX));


        if (removeLastChar) {
            return GenericFunctions.removeLastChar.apply(sb.toString());
        } else {
            return sb.toString();
        }

    }



    /**
     *
     *
     *
     *
     *
     */

    public static String getSearchFormatByField(Object object, AdminConsoleSearchTransactionsDTOFieldsEnum adminConsoleSearchTransactionsFieldsEnum) {

        StringBuilder sb = new StringBuilder();

        if (GenericPredicates.checkIfNullOrEmpty.negate().test(object)) {
            sb.append(getSearchFormatWithValue(adminConsoleSearchTransactionsFieldsEnum, String.valueOf(object)));
            removeLastChar = true;
        } else {
            sb.append(getSearchFormatWithoutValue(adminConsoleSearchTransactionsFieldsEnum));
        }

        return sb.toString();

    }



    /**
     *
     *
     *
     *
     *
     */


    private static String getSearchFormatWithValue(AdminConsoleSearchTransactionsDTOFieldsEnum adminConsoleSearchTransactionsFieldsEnum, String fieldValue) {

        StringBuilder sbSearchFormat = new StringBuilder();

        /**
         * Need to Replace Empty Spaces, with "+" signal
         * customerName=Mary+Smith
         * mctCustomerName=John+Smith
         */
        sbSearchFormat.append(adminConsoleSearchTransactionsFieldsEnum.getFieldName());
        sbSearchFormat.append(EQUAL_SYMBOL);
        sbSearchFormat.append(fieldValue.replace(" ", "+"));
        sbSearchFormat.append(URL_SPLIT_SYMBOL);

        return sbSearchFormat.toString();

    }

    private static String getSearchFormatWithoutValue(AdminConsoleSearchTransactionsDTOFieldsEnum adminConsoleSearchTransactionsFieldsEnum) {

        StringBuilder sbSearchFormat = new StringBuilder();

        sbSearchFormat.append(adminConsoleSearchTransactionsFieldsEnum.getFieldName());
        sbSearchFormat.append(EQUAL_SYMBOL);
        sbSearchFormat.append(URL_SPLIT_SYMBOL);

        return sbSearchFormat.toString();

    }


}
