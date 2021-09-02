package cucumber.api.tests.samplefiles.common.enums.directories.merchantgatewayserver;

import lombok.Getter;

import static cucumber.api.tests.samplefiles.common.enums.directories.SampleFilesDirectoriesEnum.ADMIN_CONSOLE_SAMPLE_FILES_DIRECTORY;
import static cucumber.api.tests.samplefiles.common.enums.directories.SampleFilesDirectoriesEnum.MERCHANT_GATEWAY_SERVER_SAMPLE_FILES_DIRECTORY;

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
