package cucumber.api.tests.samplefiles.merchantgateway.enums.directories;

import lombok.Getter;

import static cucumber.api.tests.samplefiles.MainSampleFilesDirectoriesEnum.MERCHANT_GATEWAY_SERVER_SAMPLE_FILES_DIRECTORY;

@Getter
public enum MerchantGatewayServerTransactionsSampleFilesDirectoriesEnum {

    /**
     * MERCHANT GATEWAY SERVER TRANSACTIONS
     */
    MERCHANT_GATEWAY_SERVER_TRANSACTIONS_SAMPLE_FILES_DIRECTORY(MERCHANT_GATEWAY_SERVER_SAMPLE_FILES_DIRECTORY.getDirectory() + "/transactions"),

    /**
     * MERCHANT GATEWAY SERVER TRANSACTIONS CREATE
     */
    MERCHANT_GATEWAY_SERVER_CREATE_TRANSACTIONS_SAMPLE_FILES_DIRECTORY(MERCHANT_GATEWAY_SERVER_TRANSACTIONS_SAMPLE_FILES_DIRECTORY.getDirectory() + "/create"),

    /**
     * MERCHANT GATEWAY SERVER TRANSACTIONS SEARCH
     */
    MERCHANT_GATEWAY_SERVER_SEARCH_TRANSACTIONS_SAMPLE_FILES_DIRECTORY(MERCHANT_GATEWAY_SERVER_TRANSACTIONS_SAMPLE_FILES_DIRECTORY.getDirectory() + "/search");


    private String directory;

    MerchantGatewayServerTransactionsSampleFilesDirectoriesEnum(String directory) {
        this.directory = directory;
    }


}
