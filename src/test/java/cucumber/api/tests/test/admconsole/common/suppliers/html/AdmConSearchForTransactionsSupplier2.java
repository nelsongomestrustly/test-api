package cucumber.api.tests.test.admconsole.common.suppliers.html;

import cucumber.api.tests.common.enums.queries.QueryParametersEnum;
import cucumber.api.tests.common.predicates.GenericPredicates;
import cucumber.api.tests.test.admconsole.data.dto.AdmConSearchTransactionsDTO;

import java.util.HashMap;

//TODO PROBLEM
public class AdmConSearchForTransactionsSupplier2 {

    private static boolean removeLastChar;

    /**
     * &mctCustomerName=cunelson&customerExternalId=&
     * &mctCustomerName=&customerExternalId=&
     * &customerName=finelson&taxId=&
     * end = &X-CSRFKey=meg4t6uc4a0831lvcqdvu88q6j
     */
    public static HashMap<QueryParametersEnum, String> getSearchForTransactionsUrl(AdmConSearchTransactionsDTO admConSearchTransactionsDTO) {

        HashMap<QueryParametersEnum, String> map = new HashMap<>();

        //Transaction Id
        map = (addMapEntryIfNecessary(admConSearchTransactionsDTO.getTransactionId(), admConSearchTransactionsDTO.getTransactionIdKey(), map));
        //ppTransactionId
        map = (addMapEntryIfNecessary(admConSearchTransactionsDTO.getPpTransactionId(), admConSearchTransactionsDTO.getPpTransactionIdKey(), map));
        //Merchant Reference
        map = (addMapEntryIfNecessary(admConSearchTransactionsDTO.getMerchantReference(), admConSearchTransactionsDTO.getMerchantReferenceKey(), map));
        //originalTransactionId
        map = (addMapEntryIfNecessary(admConSearchTransactionsDTO.getOriginalTransactionId(), admConSearchTransactionsDTO.getOriginalTransactionIdKey(), map));
        //merchantId
        map = (addMapEntryIfNecessary(admConSearchTransactionsDTO.getMerchantId(), admConSearchTransactionsDTO.getMerchantIdKey(), map));
        //paymentProviderId
        map = (addMapEntryIfNecessary(admConSearchTransactionsDTO.getPaymentProviderId(), admConSearchTransactionsDTO.getPaymentProviderIdKey(), map));
        //paymentId
        map = (addMapEntryIfNecessary(admConSearchTransactionsDTO.getPaymentId(), admConSearchTransactionsDTO.getPaymentIdKey(), map));
        //ppTrxStatusCode
        map = (addMapEntryIfNecessary(admConSearchTransactionsDTO.getPpTrxStatusCode(), admConSearchTransactionsDTO.getPpTrxStatusCodeKey(), map));
        //authorizationStatus
        map = (addMapEntryIfNecessary(admConSearchTransactionsDTO.getAuthorizationStatus(), admConSearchTransactionsDTO.getAuthorizationStatusKey(), map));
        //fingerprint
        map = (addMapEntryIfNecessary(admConSearchTransactionsDTO.getFingerprint(), admConSearchTransactionsDTO.getFingerprintKey(), map));
        //Customer Name
        map = (addMapEntryIfNecessary(admConSearchTransactionsDTO.getCustomerName(), admConSearchTransactionsDTO.getCustomerNameKey(), map));
        //taxId
        map = (addMapEntryIfNecessary(admConSearchTransactionsDTO.getTaxId(), admConSearchTransactionsDTO.getTaxIdKey(), map));
        //MCT Customer Name
        map = (addMapEntryIfNecessary(admConSearchTransactionsDTO.getMctCustomerName(), admConSearchTransactionsDTO.getMctCustomerNameKey(), map));
        //customerExternalId
        map = (addMapEntryIfNecessary(admConSearchTransactionsDTO.getCustomerExternalId(), admConSearchTransactionsDTO.getCustomerExternalIdKey(), map));
        //routingNumber
        map = (addMapEntryIfNecessary(admConSearchTransactionsDTO.getRoutingNumber(), admConSearchTransactionsDTO.getRoutingNumberKey(), map));
        //accountNumber
        map = (addMapEntryIfNecessary(admConSearchTransactionsDTO.getAccountNumber(), admConSearchTransactionsDTO.getAccountNumberKey(), map));
        //iban
        map = (addMapEntryIfNecessary(admConSearchTransactionsDTO.getIban(), admConSearchTransactionsDTO.getIbanKey(), map));
        //minRiskIndex
        map = (addMapEntryIfNecessary(admConSearchTransactionsDTO.getMinRiskIndex(), admConSearchTransactionsDTO.getMinRiskIndexKey(), map));
        //maxRiskIndex
        map = (addMapEntryIfNecessary(admConSearchTransactionsDTO.getMaxRiskIndex(), admConSearchTransactionsDTO.getMaxRiskIndexKey(), map));
        //deviceFingerprint
        map = (addMapEntryIfNecessary(admConSearchTransactionsDTO.getDeviceFingerprint(), admConSearchTransactionsDTO.getDeviceFingerprintKey(), map));
        //ipAddr
        map = (addMapEntryIfNecessary(admConSearchTransactionsDTO.getIpAddr(), admConSearchTransactionsDTO.getIpAddrKey(), map));
        //description
        map = (addMapEntryIfNecessary(admConSearchTransactionsDTO.getDescription(), admConSearchTransactionsDTO.getDescriptionKey(), map));
        //excludedFromReports
        map = (addMapEntryIfNecessary(admConSearchTransactionsDTO.getExcludedFromReports(), admConSearchTransactionsDTO.getExcludedFromReportsKey(), map));
        //verificationFICode
        map = (addMapEntryIfNecessary(admConSearchTransactionsDTO.getVerificationFICode(), admConSearchTransactionsDTO.getVerificationFICodeKey(), map));
        //verificationRoutingNumber
        map = (addMapEntryIfNecessary(admConSearchTransactionsDTO.getVerificationRoutingNumber(), admConSearchTransactionsDTO.getVerificationRoutingNumberKey(), map));
        //verificationAccountNumber
        map = (addMapEntryIfNecessary(admConSearchTransactionsDTO.getVerificationAccountNumber(), admConSearchTransactionsDTO.getVerificationAccountNumberKey(), map));
        //verified
        map = (addMapEntryIfNecessary(admConSearchTransactionsDTO.getVerified(), admConSearchTransactionsDTO.getVerifiedKey(), map));
        //verificationStatus
        map = (addMapEntryIfNecessary(admConSearchTransactionsDTO.getVerificationStatus(), admConSearchTransactionsDTO.getVerificationStatusKey(), map));
        //minAmount
        map = (addMapEntryIfNecessary(admConSearchTransactionsDTO.getMinAmount(), admConSearchTransactionsDTO.getMinAmountKey(), map));
        //maxAmount
        map = (addMapEntryIfNecessary(admConSearchTransactionsDTO.getMaxAmount(), admConSearchTransactionsDTO.getMaxAmountKey(), map));
        //minPaid
        map = (addMapEntryIfNecessary(admConSearchTransactionsDTO.getMinPaid(), admConSearchTransactionsDTO.getMinPaidKey(), map));
        //maxPaid
        map = (addMapEntryIfNecessary(admConSearchTransactionsDTO.getMaxPaid(), admConSearchTransactionsDTO.getMaxPaidKey(), map));
        //minRefunded
        map = (addMapEntryIfNecessary(admConSearchTransactionsDTO.getMinRefunded(), admConSearchTransactionsDTO.getMinRefundedKey(), map));
        //maxRefunded
        map = (addMapEntryIfNecessary(admConSearchTransactionsDTO.getMaxRefunded(), admConSearchTransactionsDTO.getMaxRefundedKey(), map));
        //startCreateDate
        map = (addMapEntryIfNecessary(admConSearchTransactionsDTO.getStartCreateDate(), admConSearchTransactionsDTO.getStartCreateDateKey(), map));
        //endCreateDate
        map = (addMapEntryIfNecessary(admConSearchTransactionsDTO.getEndCreateDate(), admConSearchTransactionsDTO.getEndCreateDateKey(), map));
        //startUpdateDate
        map = (addMapEntryIfNecessary(admConSearchTransactionsDTO.getStartUpdateDate(), admConSearchTransactionsDTO.getStartUpdateDateKey(), map));
        //endUpdateDate
        map = (addMapEntryIfNecessary(admConSearchTransactionsDTO.getEndUpdateDate(), admConSearchTransactionsDTO.getEndUpdateDateKey(), map));
        //startProcessedDate
        map = (addMapEntryIfNecessary(admConSearchTransactionsDTO.getStartProcessedDate(), admConSearchTransactionsDTO.getStartProcessedDateKey(), map));
        //endProcessedDate
        map = (addMapEntryIfNecessary(admConSearchTransactionsDTO.getEndProcessedDate(), admConSearchTransactionsDTO.getEndProcessedDateKey(), map));
        //startCompletedDate
        map = (addMapEntryIfNecessary(admConSearchTransactionsDTO.getStartCompletedDate(), admConSearchTransactionsDTO.getStartCompletedDateKey(), map));
        //endCompletedDate
        map = (addMapEntryIfNecessary(admConSearchTransactionsDTO.getEndCompletedDate(), admConSearchTransactionsDTO.getEndCompletedDateKey(), map));
        //customerCollectionRef
        map = (addMapEntryIfNecessary(admConSearchTransactionsDTO.getCustomerCollectionRef(), admConSearchTransactionsDTO.getCustomerCollectionRefKey(), map));
        //framework
        map = (addMapEntryIfNecessary(admConSearchTransactionsDTO.getFramework(), admConSearchTransactionsDTO.getFrameworkKey(), map));
        //excludedFromCollections
        map = (addMapEntryIfNecessary(admConSearchTransactionsDTO.getExcludedFromCollections(), admConSearchTransactionsDTO.getExcludedFromCollectionsKey(), map));
        //personId
        map = (addMapEntryIfNecessary(admConSearchTransactionsDTO.getPersonId(), admConSearchTransactionsDTO.getPersonIdKey(), map));
        //fiCustomerId
        map = (addMapEntryIfNecessary(admConSearchTransactionsDTO.getFiCustomerId(), admConSearchTransactionsDTO.getFiCustomerIdKey(), map));
        //orderBy
        map = (addMapEntryIfNecessary(admConSearchTransactionsDTO.getOrderBy(), admConSearchTransactionsDTO.getOrderByKey(), map));
        //sortOrder
        //map = (addMapEntryIfNecessary(adminConsoleSearchTransactionsDTO.getOrderBy(), admConSearchTransactionsDTO., map));
        //startIndex
        map = (addMapEntryIfNecessary(admConSearchTransactionsDTO.getStartIndex(), admConSearchTransactionsDTO.getStartIndexKey(), map));

        return map;


    }

    private static HashMap<QueryParametersEnum, String> addMapEntryIfNecessary(Object object, QueryParametersEnum key, HashMap<QueryParametersEnum, String> map) {

        map.put(key, GenericPredicates.checkIfNullOrEmpty.test(object) ? "" : object.toString());;

        return map;

    }




}
