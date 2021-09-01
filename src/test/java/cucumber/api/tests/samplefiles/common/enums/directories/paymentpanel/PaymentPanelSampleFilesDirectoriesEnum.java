package cucumber.api.tests.samplefiles.common.enums.directories.paymentpanel;

import lombok.Getter;

import static cucumber.api.tests.samplefiles.common.enums.directories.SampleFilesDirectoriesEnum.ADMIN_CONSOLE_SAMPLE_FILES_DIRECTORY;
import static cucumber.api.tests.samplefiles.common.enums.directories.SampleFilesDirectoriesEnum.PAYMENT_PANEL_SAMPLE_FILES_DIRECTORY;

@Getter
public enum PaymentPanelSampleFilesDirectoriesEnum {

    /**
     * ADMIN CONSOLE TRANSACTIONS
     */
    PAYMENT_PANEL_WIDGET_SAMPLE_FILES_DIRECTORY(PAYMENT_PANEL_SAMPLE_FILES_DIRECTORY.getDirectory() + "/widget"),

    /**
     * ADMIN CONSOLE TRANSACTIONS CREATE
     */
    PAYMENT_PANEL_WIDGET_CREATE_SAMPLE_FILES_DIRECTORY(PAYMENT_PANEL_WIDGET_SAMPLE_FILES_DIRECTORY.getDirectory() + "/create/");


    private String directory;

    PaymentPanelSampleFilesDirectoriesEnum(String directory) {
        this.directory = directory;
    }


}
