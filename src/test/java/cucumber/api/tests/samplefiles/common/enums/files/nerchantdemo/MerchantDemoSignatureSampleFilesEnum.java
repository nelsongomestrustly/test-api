package cucumber.api.tests.samplefiles.common.enums.files.nerchantdemo;

import lombok.Getter;

import static cucumber.api.tests.samplefiles.common.constants.merchantdemo.MerchantDemoCreateSignature.MERCHANT_DEMO_CREATE_SIGNATURE_INSTANT;
import static cucumber.api.tests.samplefiles.common.constants.merchantdemo.MerchantDemoCreateSignature.MERCHANT_DEMO_CREATE_SIGNATURE_RECURRING;
import static cucumber.api.tests.samplefiles.common.enums.directories.adminconsole.AdmConTransactionsSampleFilesDirectoriesEnum.ADMIN_CONSOLE_TRANSACTIONS_SEARCH_BY_NAME_SAMPLE_FILES_DIRECTORY;
import static cucumber.api.tests.samplefiles.common.enums.directories.merchantdemo.MerchantDemoSampleFilesDirectoriesEnum.MERCHANT_DEMO_SIGNATURE_CREATE_SAMPLE_FILES_DIRECTORY;
import static cucumber.api.tests.samplefiles.constants.adminconsole.AdmConSearchTransactions.SEARCH_ADMIN_CONSOLE_TRANSACTIONS_FILE_NAME_BY_CUSTOMER_NAME_EMPTY;
import static cucumber.api.tests.samplefiles.constants.adminconsole.AdmConSearchTransactions.SEARCH_ADMIN_CONSOLE_TRANSACTIONS_FILE_NAME_BY_CUSTOMER_NAME_INVALID;
import static cucumber.api.tests.samplefiles.constants.adminconsole.AdmConSearchTransactions.SEARCH_ADMIN_CONSOLE_TRANSACTIONS_FILE_NAME_BY_CUSTOMER_NAME_VALID_1;
import static cucumber.api.tests.samplefiles.constants.adminconsole.AdmConSearchTransactions.SEARCH_ADMIN_CONSOLE_TRANSACTIONS_FILE_NAME_BY_CUSTOMER_NAME_VALID_2;
import static cucumber.api.tests.samplefiles.constants.adminconsole.AdmConSearchTransactions.SEARCH_ADMIN_CONSOLE_TRANSACTIONS_FILE_NAME_BY_CUSTOMER_NAME_VALID_3;

@Getter
public enum MerchantDemoSignatureSampleFilesEnum {

    /**
     * ADMIN CONSOLE TRANSACTIONS
     */
    CREATE_SIGNATURE_INSTANT(MERCHANT_DEMO_SIGNATURE_CREATE_SAMPLE_FILES_DIRECTORY.getDirectory(), MERCHANT_DEMO_CREATE_SIGNATURE_INSTANT),
    CREATE_SIGNATURE_RECURRING(MERCHANT_DEMO_SIGNATURE_CREATE_SAMPLE_FILES_DIRECTORY.getDirectory(), MERCHANT_DEMO_CREATE_SIGNATURE_RECURRING);

    private String directory;
    private String fileName;

    MerchantDemoSignatureSampleFilesEnum(
            String directory,
            String fileName) {
        this.directory = directory;
        this.fileName = fileName;
    }

    public static MerchantDemoSignatureSampleFilesEnum fromFileName(String fileName) {
        for (MerchantDemoSignatureSampleFilesEnum b : MerchantDemoSignatureSampleFilesEnum.values()) {
            if (b.fileName.equalsIgnoreCase(fileName)) {
                return b;
            }
        }

        return null;
    }


}
