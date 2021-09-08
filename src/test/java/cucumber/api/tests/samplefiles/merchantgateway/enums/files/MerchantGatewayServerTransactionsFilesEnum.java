package cucumber.api.tests.samplefiles.merchantgateway.enums.files;

import lombok.Getter;

import static cucumber.api.tests.samplefiles.merchantgateway.constants.MerchantGatewayServerTransactionsFileNamesEnum.MERCHANT_GATEWAY_SERVER_ESTABILISH_TRANSACTION_INSTANT;
import static cucumber.api.tests.samplefiles.merchantgateway.constants.MerchantGatewayServerTransactionsFileNamesEnum.MERCHANT_GATEWAY_SERVER_ESTABILISH_TRANSACTION_RECURRING;
import static cucumber.api.tests.samplefiles.merchantgateway.enums.directories.MerchantGatewayServerTransactionsSampleFilesDirectoriesEnum.MERCHANT_GATEWAY_SERVER_CREATE_TRANSACTIONS_SAMPLE_FILES_DIRECTORY;

@Getter
public enum MerchantGatewayServerTransactionsFilesEnum {

    /**
     * MERCHANT DEMO SIGNATURES
     */
    ESTABILISH_INSTANT_TRANSACTION(MERCHANT_GATEWAY_SERVER_CREATE_TRANSACTIONS_SAMPLE_FILES_DIRECTORY.getDirectory() + "/", MERCHANT_GATEWAY_SERVER_ESTABILISH_TRANSACTION_INSTANT),
    ESTABILISH_RECURRING_TRANSACTION(MERCHANT_GATEWAY_SERVER_CREATE_TRANSACTIONS_SAMPLE_FILES_DIRECTORY.getDirectory() + "/", MERCHANT_GATEWAY_SERVER_ESTABILISH_TRANSACTION_RECURRING);

    private String directory;
    private String fileName;

    MerchantGatewayServerTransactionsFilesEnum(
            String directory,
            String fileName) {
        this.directory = directory;
        this.fileName = fileName;
    }

    public static MerchantGatewayServerTransactionsFilesEnum fromFileName(String fileName) {
        for (MerchantGatewayServerTransactionsFilesEnum b : MerchantGatewayServerTransactionsFilesEnum.values()) {
            if (b.fileName.equalsIgnoreCase(fileName)) {
                return b;
            }
        }

        return null;
    }


}
