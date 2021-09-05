package cucumber.api.tests.test.admconsole.common.suppliers.html;

import cucumber.api.tests.data.dto.admconsole.AdmConSearchTransactionsDTO;

import static cucumber.api.tests.common.suppliers.QueryParamSuppliers.getSearchFormatByField;
import static cucumber.api.tests.common.suppliers.StringSuppliers.removeLastCharIfNecessary;

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
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getTransactionId(), admConSearchTransactionsDTO.getTransactionIdKey()));
        //ppTransactionId
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getPpTransactionId(), admConSearchTransactionsDTO.getPpTransactionIdKey()));
        //Merchant Reference
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getMerchantReference(), admConSearchTransactionsDTO.getMerchantReferenceKey()));
        //originalTransactionId
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getOriginalTransactionId(), admConSearchTransactionsDTO.getOriginalTransactionIdKey()));
        //merchantId
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getMerchantId(), admConSearchTransactionsDTO.getMerchantIdKey()));
        //paymentProviderId
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getPaymentProviderId(), admConSearchTransactionsDTO.getPaymentProviderIdKey()));
        //paymentId
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getPaymentId(), admConSearchTransactionsDTO.getPaymentIdKey()));
        //ppTrxStatusCode
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getPpTrxStatusCode(), admConSearchTransactionsDTO.getPpTrxStatusCodeKey()));
        //authorizationStatus
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getAuthorizationStatus(), admConSearchTransactionsDTO.getAuthorizationStatusKey()));
        //fingerprint
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getFingerprint(), admConSearchTransactionsDTO.getFingerprintKey()));
        //Customer Name
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getCustomerName(), admConSearchTransactionsDTO.getCustomerNameKey()));
        //taxId
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getTaxId(), admConSearchTransactionsDTO.getTaxIdKey()));
        //MCT Customer Name
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getMctCustomerName(), admConSearchTransactionsDTO.getMctCustomerNameKey()));
        //customerExternalId
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getCustomerExternalId(), admConSearchTransactionsDTO.getCustomerExternalIdKey()));
        //routingNumber
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getRoutingNumber(), admConSearchTransactionsDTO.getRoutingNumberKey()));
        //accountNumber
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getAccountNumber(), admConSearchTransactionsDTO.getAccountNumberKey()));
        //iban
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getIban(), admConSearchTransactionsDTO.getIbanKey()));
        //minRiskIndex
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getMinRiskIndex(), admConSearchTransactionsDTO.getMinRiskIndexKey()));
        //maxRiskIndex
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getMaxRiskIndex(), admConSearchTransactionsDTO.getMaxRiskIndexKey()));
        //deviceFingerprint
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getDeviceFingerprint(), admConSearchTransactionsDTO.getDeviceFingerprintKey()));
        //ipAddr
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getIpAddr(), admConSearchTransactionsDTO.getIpAddrKey()));
        //description
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getDescription(), admConSearchTransactionsDTO.getDescriptionKey()));
        //excludedFromReports
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getExcludedFromReports(), admConSearchTransactionsDTO.getExcludedFromReportsKey()));
        //verificationFICode
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getVerificationFICode(), admConSearchTransactionsDTO.getVerificationFICodeKey()));
        //verificationRoutingNumber
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getVerificationRoutingNumber(), admConSearchTransactionsDTO.getVerificationRoutingNumberKey()));
        //verificationAccountNumber
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getVerificationAccountNumber(), admConSearchTransactionsDTO.getVerificationAccountNumberKey()));
        //verified
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getVerified(), admConSearchTransactionsDTO.getVerifiedKey()));
        //verificationStatus
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getVerificationStatus(), admConSearchTransactionsDTO.getVerificationStatusKey()));
        //minAmount
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getMinAmount(), admConSearchTransactionsDTO.getMinAmountKey()));
        //maxAmount
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getMaxAmount(), admConSearchTransactionsDTO.getMaxAmountKey()));
        //minPaid
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getMinPaid(), admConSearchTransactionsDTO.getMinPaidKey()));
        //maxPaid
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getMaxPaid(), admConSearchTransactionsDTO.getMaxPaidKey()));
        //minRefunded
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getMinRefunded(), admConSearchTransactionsDTO.getMinRefundedKey()));
        //maxRefunded
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getMaxRefunded(), admConSearchTransactionsDTO.getMaxRefundedKey()));
        //startCreateDate
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getStartCreateDate(), admConSearchTransactionsDTO.getStartCreateDateKey()));
        //endCreateDate
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getEndCreateDate(), admConSearchTransactionsDTO.getEndCreateDateKey()));
        //startUpdateDate
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getStartUpdateDate(), admConSearchTransactionsDTO.getStartUpdateDateKey()));
        //endUpdateDate
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getEndUpdateDate(), admConSearchTransactionsDTO.getEndUpdateDateKey()));
        //startProcessedDate
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getStartProcessedDate(), admConSearchTransactionsDTO.getStartProcessedDateKey()));
        //endProcessedDate
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getEndProcessedDate(), admConSearchTransactionsDTO.getEndProcessedDateKey()));
        //startCompletedDate
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getStartCompletedDate(), admConSearchTransactionsDTO.getStartCompletedDateKey()));
        //endCompletedDate
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getEndCompletedDate(), admConSearchTransactionsDTO.getEndCompletedDateKey()));
        //customerCollectionRef
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getCustomerCollectionRef(), admConSearchTransactionsDTO.getCustomerCollectionRefKey()));
        //framework
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getFramework(), admConSearchTransactionsDTO.getFrameworkKey()));
        //excludedFromCollections
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getExcludedFromCollections(), admConSearchTransactionsDTO.getExcludedFromCollectionsKey()));
        //personId
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getPersonId(), admConSearchTransactionsDTO.getPersonIdKey()));
        //fiCustomerId
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getFiCustomerId(), admConSearchTransactionsDTO.getFiCustomerIdKey()));
        //orderBy
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getOrderBy(), admConSearchTransactionsDTO.getOrderByKey()));
        //sortOrder
        //sb.append(getSearchFormatByField(adminConsoleSearchTransactionsDTO.getOrderBy(), admConSearchTransactionsDTO.));
        //startIndex
        sb.append(getSearchFormatByField(admConSearchTransactionsDTO.getStartIndex(), admConSearchTransactionsDTO.getStartIndexKey()));

        return removeLastCharIfNecessary(sb.toString());


    }



}
