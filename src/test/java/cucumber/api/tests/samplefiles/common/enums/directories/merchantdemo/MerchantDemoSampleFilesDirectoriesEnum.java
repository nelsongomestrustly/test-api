package cucumber.api.tests.samplefiles.common.enums.directories.merchantdemo;

import lombok.Getter;

import static cucumber.api.tests.samplefiles.common.enums.directories.SampleFilesDirectoriesEnum.ADMIN_CONSOLE_SAMPLE_FILES_DIRECTORY;
import static cucumber.api.tests.samplefiles.common.enums.directories.SampleFilesDirectoriesEnum.MERCHANT_DEMO_SAMPLE_FILES_DIRECTORY;

@Getter
public enum MerchantDemoSampleFilesDirectoriesEnum {

    /**
     * ADMIN CONSOLE TRANSACTIONS
     */
    MERCHANT_DEMO_MERCHANT_SAMPLE_FILES_DIRECTORY(MERCHANT_DEMO_SAMPLE_FILES_DIRECTORY.getDirectory() + "/merchant"),
    MERCHANT_DEMO_PAYMENT_FLOWS_SAMPLE_FILES_DIRECTORY(MERCHANT_DEMO_SAMPLE_FILES_DIRECTORY.getDirectory() + "/paymentflows"),
    MERCHANT_DEMO_SIGNATURE_SAMPLE_FILES_DIRECTORY(MERCHANT_DEMO_SAMPLE_FILES_DIRECTORY.getDirectory() + "/signatures"),

    /**
     * MERCHANT DEMO SIGNATURE CREATE
     */
    MERCHANT_DEMO_SIGNATURE_CREATE_SAMPLE_FILES_DIRECTORY(MERCHANT_DEMO_SIGNATURE_SAMPLE_FILES_DIRECTORY.getDirectory() + "/create");



    private String directory;

    MerchantDemoSampleFilesDirectoriesEnum(String directory) {
        this.directory = directory;
    }


}
