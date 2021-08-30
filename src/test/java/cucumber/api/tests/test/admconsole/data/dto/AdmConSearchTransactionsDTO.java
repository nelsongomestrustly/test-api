package cucumber.api.tests.test.admconsole.data.dto;

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

    private Integer ppTransactionId;

    private String merchantReference;

    private Integer originalTransactionId;

    private Integer merchantId;

    private Integer paymentProviderId;

    private Integer paymentId;

    private Integer ppTrxStatusCode;

    private Integer authorizationStatus;

    private Integer fingerprint;

    //FI Customer Name (Front End)
    private String customerName;

    private String taxId;

    //Customer Name (Front End)
    private String mctCustomerName;

    private Integer customerExternalId;

    private Integer routingNumber;

    private Integer accountNumber;

    private Integer iban;

    private Integer minRiskIndex;

    private Integer maxRiskIndex;

    private Integer deviceFingerprint;

    private Integer ipAddr;

    private String description;

    private String excludedFromReports;

    private Integer verificationFICode;

    private Integer verificationRoutingNumber;

    private Integer verificationAccountNumber;

    private Integer verified;

    private Integer verificationStatus;

    private Integer minAmount;

    private Integer maxAmount;

    private Integer minPaid;

    private Integer maxPaid;

    private Integer minRefunded;

    private Integer maxRefunded;

    private Integer startCreateDate;

    private Integer endCreateDate;

    private Integer startUpdateDate;

    private Integer endUpdateDate;

    private Integer startProcessedDate;

    private Integer endProcessedDate;

    private Integer startCompletedDate;

    private Integer endCompletedDate;

    private Integer customerCollectionRef;

    private Integer framework;

    private Integer excludedFromCollections;

    private Integer personId;

    private Integer fiCustomerId;

    //Default Values

    private String orderBy;

    private String sortOrder;

    private Integer startIndex;

}
