package cucumber.api.tests.samplefiles;

import lombok.Getter;

import static cucumber.api.tests.samplefiles.MainSampleDirectories.SAMPLES_FILES_DIRECTORY;

@Getter
public enum MainSampleFilesDirectoriesEnum {

    /**
     * MAIN DIRECTORY
     */
    ADMIN_CONSOLE_SAMPLE_FILES_DIRECTORY(SAMPLES_FILES_DIRECTORY + "/adminconsole"),
    MERCHANT_DEMO_SAMPLE_FILES_DIRECTORY(SAMPLES_FILES_DIRECTORY + "/merchantdemo"),
    PAYMENT_PANEL_SAMPLE_FILES_DIRECTORY(SAMPLES_FILES_DIRECTORY + "/paymentpanel"),
    MERCHANT_GATEWAY_SERVER_SAMPLE_FILES_DIRECTORY(SAMPLES_FILES_DIRECTORY + "/merchantgatewayserver");

    private String directory;

    MainSampleFilesDirectoriesEnum(String directory) {
        this.directory = directory;
    }

}
