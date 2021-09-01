package cucumber.api.tests.samplefiles.common.enums.files.nerchantdemo;

import lombok.Getter;

import static cucumber.api.tests.samplefiles.common.constants.merchantdemo.MerchantDemoGlobexStart.MERCHANT_GLOBEX_START;
import static cucumber.api.tests.samplefiles.common.constants.merchantdemo.MerchantDemoSignature.MERCHANT_DEMO_CREATE_SIGNATURE_INSTANT;
import static cucumber.api.tests.samplefiles.common.constants.merchantdemo.MerchantDemoSignature.MERCHANT_DEMO_CREATE_SIGNATURE_RECURRING;
import static cucumber.api.tests.samplefiles.common.enums.directories.merchantdemo.MerchantDemoSampleFilesDirectoriesEnum.MERCHANT_DEMO_MERCHANT_SAMPLE_FILES_DIRECTORY;
import static cucumber.api.tests.samplefiles.common.enums.directories.merchantdemo.MerchantDemoSampleFilesDirectoriesEnum.MERCHANT_DEMO_SIGNATURE_CREATE_SAMPLE_FILES_DIRECTORY;

@Getter
public enum MerchantDemoGlobexStartFilesEnum {

    /**
     * MERCHANT DEMO SIGNATURES
     */
    MERCHANT_DEMO_GLOBEX_START(MERCHANT_DEMO_MERCHANT_SAMPLE_FILES_DIRECTORY.getDirectory() + "/", MERCHANT_GLOBEX_START);

    private String directory;
    private String fileName;

    MerchantDemoGlobexStartFilesEnum(
            String directory,
            String fileName) {
        this.directory = directory;
        this.fileName = fileName;
    }

    public static MerchantDemoGlobexStartFilesEnum fromFileName(String fileName) {
        for (MerchantDemoGlobexStartFilesEnum b : MerchantDemoGlobexStartFilesEnum.values()) {
            if (b.fileName.equalsIgnoreCase(fileName)) {
                return b;
            }
        }

        return null;
    }


}
