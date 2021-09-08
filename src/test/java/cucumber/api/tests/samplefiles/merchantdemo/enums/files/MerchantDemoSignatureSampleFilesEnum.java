package cucumber.api.tests.samplefiles.merchantdemo.enums.files;

import lombok.Getter;

import static cucumber.api.tests.samplefiles.merchantdemo.constants.MerchantDemoSignatureFileNames.MERCHANT_DEMO_CREATE_SIGNATURE_DEFERRED;
import static cucumber.api.tests.samplefiles.merchantdemo.constants.MerchantDemoSignatureFileNames.MERCHANT_DEMO_CREATE_SIGNATURE_DISBURSEMENT;
import static cucumber.api.tests.samplefiles.merchantdemo.constants.MerchantDemoSignatureFileNames.MERCHANT_DEMO_CREATE_SIGNATURE_INSTANT;
import static cucumber.api.tests.samplefiles.merchantdemo.constants.MerchantDemoSignatureFileNames.MERCHANT_DEMO_CREATE_SIGNATURE_RECURRING;
import static cucumber.api.tests.samplefiles.merchantdemo.constants.MerchantDemoSignatureFileNames.MERCHANT_DEMO_CREATE_SIGNATURE_RETRIEVAL;
import static cucumber.api.tests.samplefiles.merchantdemo.enums.directories.MerchantDemoSampleFilesDirectoriesEnum.MERCHANT_DEMO_SIGNATURE_CREATE_SAMPLE_FILES_DIRECTORY;

@Getter
public enum MerchantDemoSignatureSampleFilesEnum {

    /**
     * MERCHANT DEMO SIGNATURES
     */
    CREATE_SIGNATURE_INSTANT(MERCHANT_DEMO_SIGNATURE_CREATE_SAMPLE_FILES_DIRECTORY.getDirectory(), MERCHANT_DEMO_CREATE_SIGNATURE_INSTANT),
    CREATE_SIGNATURE_RECURRING(MERCHANT_DEMO_SIGNATURE_CREATE_SAMPLE_FILES_DIRECTORY.getDirectory(), MERCHANT_DEMO_CREATE_SIGNATURE_RECURRING),
    CREATE_SIGNATURE_DEFERRED(MERCHANT_DEMO_SIGNATURE_CREATE_SAMPLE_FILES_DIRECTORY.getDirectory(), MERCHANT_DEMO_CREATE_SIGNATURE_DEFERRED),
    CREATE_SIGNATURE_DISBURSEMENT(MERCHANT_DEMO_SIGNATURE_CREATE_SAMPLE_FILES_DIRECTORY.getDirectory(), MERCHANT_DEMO_CREATE_SIGNATURE_DISBURSEMENT),
    CREATE_SIGNATURE_RETRIEVAL(MERCHANT_DEMO_SIGNATURE_CREATE_SAMPLE_FILES_DIRECTORY.getDirectory(), MERCHANT_DEMO_CREATE_SIGNATURE_RETRIEVAL);

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
