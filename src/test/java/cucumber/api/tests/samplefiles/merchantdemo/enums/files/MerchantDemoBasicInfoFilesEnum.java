package cucumber.api.tests.samplefiles.merchantdemo.enums.files;

import lombok.Getter;

import static cucumber.api.tests.samplefiles.merchantdemo.constants.MerchantDemoGlobexStartFileNames.MERCHANT_GLOBEX_BASIC_INFO;
import static cucumber.api.tests.samplefiles.merchantdemo.enums.directories.MerchantDemoSampleFilesDirectoriesEnum.MERCHANT_DEMO_BASIC_INFO_SAMPLE_FILES_DIRECTORY;

@Getter
public enum MerchantDemoBasicInfoFilesEnum {

    /**
     * MERCHANT DEMO SIGNATURES
     */
    MERCHANT_DEMO_GLOBEX_START(MERCHANT_DEMO_BASIC_INFO_SAMPLE_FILES_DIRECTORY.getDirectory() + "/", MERCHANT_GLOBEX_BASIC_INFO);

    private String directory;
    private String fileName;

    MerchantDemoBasicInfoFilesEnum(
            String directory,
            String fileName) {
        this.directory = directory;
        this.fileName = fileName;
    }

    public static MerchantDemoBasicInfoFilesEnum fromFileName(String fileName) {
        for (MerchantDemoBasicInfoFilesEnum b : MerchantDemoBasicInfoFilesEnum.values()) {
            if (b.fileName.equalsIgnoreCase(fileName)) {
                return b;
            }
        }

        return null;
    }


}
