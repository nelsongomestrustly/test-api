package cucumber.api.tests.test.admconsole.common.suppliers;

import cucumber.api.tests.common.functions.GenericFunctions;
import cucumber.api.tests.common.predicates.GenericPredicates;
import cucumber.api.tests.test.admconsole.common.enums.AdmConSearchTransactionsDTOFieldsEnum;
import cucumber.api.tests.test.admconsole.data.dto.AdmConSearchTransactionsDTO;

public class AdmConSearchForTransactionsSupplier {

    private static final String URL_SPLIT_SYMBOL = "&";
    private static final String EQUAL_SYMBOL = "=";
    private static boolean removeLastChar;

    /**
     * &mctCustomerName=cunelson&customerExternalId=&
     * &mctCustomerName=&customerExternalId=&
     * &customerName=finelson&taxId=&
     * end = &X-CSRFKey=meg4t6uc4a0831lvcqdvu88q6j
     */
    public static String getSearchForTransactionsUrl(AdmConSearchTransactionsDTO admConSearchTransactionsDTO) {

        removeLastChar = false;
        StringBuilder sb = new StringBuilder();

        //Transaction Id
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getTransactionId(), AdmConSearchTransactionsDTOFieldsEnum.TRANSACTION_ID));
        //ppTransactionId
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getPpTransactionId(), AdmConSearchTransactionsDTOFieldsEnum.PP_TRANSACTION_ID));
        //Merchant Reference
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getMerchantReference(), AdmConSearchTransactionsDTOFieldsEnum.MERCHANT_REFERENCE));
        //originalTransactionId
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getOriginalTransactionId(), AdmConSearchTransactionsDTOFieldsEnum.ORIGINAL_TRANSACTION_ID));
        //merchantId
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getMerchantId(), AdmConSearchTransactionsDTOFieldsEnum.MERCHANT_ID));
        //paymentProviderId
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getPaymentProviderId(), AdmConSearchTransactionsDTOFieldsEnum.PAYMENT_PROVIDER_ID));
        //paymentId
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getPaymentId(), AdmConSearchTransactionsDTOFieldsEnum.PAYMENT_ID));
        //ppTrxStatusCode
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getPpTrxStatusCode(), AdmConSearchTransactionsDTOFieldsEnum.PP_TRX_STATUS_CODE));
        //authorizationStatus
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getAuthorizationStatus(), AdmConSearchTransactionsDTOFieldsEnum.AUTHORIZATION_STATUS));
        //fingerprint
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getFingerprint(), AdmConSearchTransactionsDTOFieldsEnum.FINGER_PRINT));
        //Customer Name
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getCustomerName(), AdmConSearchTransactionsDTOFieldsEnum.CUSTOMER_NAME));
        //taxId
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getTaxId(), AdmConSearchTransactionsDTOFieldsEnum.TAX_ID));
        //MCT Customer Name
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getMctCustomerName(), AdmConSearchTransactionsDTOFieldsEnum.MCT_CUSTOMER));
        //customerExternalId
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getCustomerExternalId(), AdmConSearchTransactionsDTOFieldsEnum.CUSTOMER_EXTERNAL_ID));
        //routingNumber
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getRoutingNumber(), AdmConSearchTransactionsDTOFieldsEnum.ROUTING_NUMBER));
        //accountNumber
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getAccountNumber(), AdmConSearchTransactionsDTOFieldsEnum.ACCOUNT_NUMBER));
        //iban
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getIban(), AdmConSearchTransactionsDTOFieldsEnum.IBAN));
        //minRiskIndex
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getMinRiskIndex(), AdmConSearchTransactionsDTOFieldsEnum.MIN_RISK_INDEX));
        //maxRiskIndex
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getMaxRiskIndex(), AdmConSearchTransactionsDTOFieldsEnum.MAX_RISK_INDEX));
        //deviceFingerprint
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getDeviceFingerprint(), AdmConSearchTransactionsDTOFieldsEnum.DEVICE_FINGER_PRINT));
        //ipAddr
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getIpAddr(), AdmConSearchTransactionsDTOFieldsEnum.IP_ADDR));
        //description
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getDescription(), AdmConSearchTransactionsDTOFieldsEnum.DESCRIPTION));
        //excludedFromReports
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getExcludedFromReports(), AdmConSearchTransactionsDTOFieldsEnum.EXCLUDED_FROM_REPORTS));
        //verificationFICode
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getVerificationFICode(), AdmConSearchTransactionsDTOFieldsEnum.VERIFICATION_FI_CODE));
        //verificationRoutingNumber
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getVerificationRoutingNumber(), AdmConSearchTransactionsDTOFieldsEnum.VERIFICATION_ROUTING_NUMBER));
        //verificationAccountNumber
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getVerificationAccountNumber(), AdmConSearchTransactionsDTOFieldsEnum.VERIFICATION_ACCOUNT_NUMBER));
        //verified
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getVerified(), AdmConSearchTransactionsDTOFieldsEnum.VERIFIED));
        //verificationStatus
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getVerificationStatus(), AdmConSearchTransactionsDTOFieldsEnum.VERIFICATION_STATUS));
        //minAmount
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getMinAmount(), AdmConSearchTransactionsDTOFieldsEnum.MIN_AMOUNT));
        //maxAmount
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getMaxAmount(), AdmConSearchTransactionsDTOFieldsEnum.MAX_AMOUNT));
        //minPaid
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getMinPaid(), AdmConSearchTransactionsDTOFieldsEnum.MIN_PAID));
        //maxPaid
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getMaxPaid(), AdmConSearchTransactionsDTOFieldsEnum.MAX_PAID));
        //minRefunded
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getMinRefunded(), AdmConSearchTransactionsDTOFieldsEnum.MIN_REFUNDED));
        //maxRefunded
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getMaxRefunded(), AdmConSearchTransactionsDTOFieldsEnum.MAX_REFUNDED));
        //startCreateDate
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getStartCreateDate(), AdmConSearchTransactionsDTOFieldsEnum.START_CREATE_DATE));
        //endCreateDate
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getEndCreateDate(), AdmConSearchTransactionsDTOFieldsEnum.END_CREATE_DATE));
        //startUpdateDate
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getStartUpdateDate(), AdmConSearchTransactionsDTOFieldsEnum.START_UPDATE_DATE));
        //endUpdateDate
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getStartUpdateDate(), AdmConSearchTransactionsDTOFieldsEnum.END_UPDATE_DATE));
        //startProcessedDate
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getStartProcessedDate(), AdmConSearchTransactionsDTOFieldsEnum.START_PROCESSED_DATE));
        //endProcessedDate
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getEndProcessedDate(), AdmConSearchTransactionsDTOFieldsEnum.END_PROCESSED_DATE));
        //startCompletedDate
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getStartCompletedDate(), AdmConSearchTransactionsDTOFieldsEnum.START_COMPLETE_DATE));
        //endCompletedDate
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getEndCompletedDate(), AdmConSearchTransactionsDTOFieldsEnum.END_COMPLETE_DATE));
        //customerCollectionRef
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getCustomerCollectionRef(), AdmConSearchTransactionsDTOFieldsEnum.CUSTOMER_COLLECTION_REF));
        //framework
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getFramework(), AdmConSearchTransactionsDTOFieldsEnum.FRAMEWORK));
        //excludedFromCollections
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getExcludedFromCollections(), AdmConSearchTransactionsDTOFieldsEnum.EXCLUDED_FROM_COLLECTIONS));
        //personId
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getPersonId(), AdmConSearchTransactionsDTOFieldsEnum.PERSON_ID));
        //fiCustomerId
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getFiCustomerId(), AdmConSearchTransactionsDTOFieldsEnum.FI_CUSTOMER_ID));
        //orderBy
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getOrderBy(), AdmConSearchTransactionsDTOFieldsEnum.ORDER_BY));
        //sortOrder
        //sb.append(getSearchFormatByField(adminConsoleSearchTransactionsDTO.getOrderBy(), AdminConsoleSearchTransactionsDTOFieldsEnum.SORT_ORDER));
        //startIndex
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getStartIndex(), AdmConSearchTransactionsDTOFieldsEnum.START_INDEX));


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

    public static String getSearchFormatByField(Object object, AdmConSearchTransactionsDTOFieldsEnum adminConsoleSearchTransactionsFieldsEnum) {

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


    private static String getSearchFormatWithValue(AdmConSearchTransactionsDTOFieldsEnum adminConsoleSearchTransactionsFieldsEnum, String fieldValue) {

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

    private static String getSearchFormatWithoutValue(AdmConSearchTransactionsDTOFieldsEnum adminConsoleSearchTransactionsFieldsEnum) {

        StringBuilder sbSearchFormat = new StringBuilder();

        sbSearchFormat.append(adminConsoleSearchTransactionsFieldsEnum.getFieldName());
        sbSearchFormat.append(EQUAL_SYMBOL);
        sbSearchFormat.append(URL_SPLIT_SYMBOL);

        return sbSearchFormat.toString();

    }


}
