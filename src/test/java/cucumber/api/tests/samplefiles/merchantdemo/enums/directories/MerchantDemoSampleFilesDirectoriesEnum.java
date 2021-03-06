package cucumber.api.tests.samplefiles.merchantdemo.enums.directories;

import lombok.Getter;

import static cucumber.api.tests.samplefiles.MainSampleFilesDirectoriesEnum.MERCHANT_DEMO_SAMPLE_FILES_DIRECTORY;

@Getter
public enum MerchantDemoSampleFilesDirectoriesEnum {

    /**
     * MERCHANT DEMO
     */
    MERCHANT_DEMO_BASIC_INFO_SAMPLE_FILES_DIRECTORY(MERCHANT_DEMO_SAMPLE_FILES_DIRECTORY.getDirectory() + "/merchant"),
    MERCHANT_DEMO_PAYMENT_FLOWS_SAMPLE_FILES_DIRECTORY(MERCHANT_DEMO_SAMPLE_FILES_DIRECTORY.getDirectory() + "/paymentflows"),
    MERCHANT_DEMO_SIGNATURE_SAMPLE_FILES_DIRECTORY(MERCHANT_DEMO_SAMPLE_FILES_DIRECTORY.getDirectory() + "/signatures"),
    MERCHANT_DEMO_WIDGET_SAMPLE_FILES_DIRECTORY(MERCHANT_DEMO_SAMPLE_FILES_DIRECTORY.getDirectory() + "/widget"),

    /**
     * MERCHANT DEMO SIGNATURE CREATE
     */
    MERCHANT_DEMO_SIGNATURE_CREATE_SAMPLE_FILES_DIRECTORY(MERCHANT_DEMO_SIGNATURE_SAMPLE_FILES_DIRECTORY.getDirectory() + "/create/"),


    /**
     * MERCHANT DEMO WIDGET CREATE
     */
    MERCHANT_DEMO_WIDGET_CREATE_SAMPLE_FILES_DIRECTORY(MERCHANT_DEMO_SIGNATURE_SAMPLE_FILES_DIRECTORY.getDirectory() + "/create/");


    private String directory;

    MerchantDemoSampleFilesDirectoriesEnum(String directory) {
        this.directory = directory;
    }


}
