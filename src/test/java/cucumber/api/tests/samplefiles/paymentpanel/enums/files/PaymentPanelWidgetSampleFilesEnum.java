package cucumber.api.tests.samplefiles.paymentpanel.enums.files;

import lombok.Getter;

import static cucumber.api.tests.samplefiles.paymentpanel.constants.PaymentPanelWidgetFileNames.PAYMENT_PANEL_CREATE_WIDGET_INSTANT;
import static cucumber.api.tests.samplefiles.paymentpanel.constants.PaymentPanelWidgetFileNames.PAYMENT_PANEL_CREATE_WIDGET_RECURRING;
import static cucumber.api.tests.samplefiles.paymentpanel.enums.directories.PaymentPanelSampleFilesDirectoriesEnum.PAYMENT_PANEL_WIDGET_CREATE_SAMPLE_FILES_DIRECTORY;

@Getter
public enum PaymentPanelWidgetSampleFilesEnum {

    /**
     * MERCHANT DEMO WIDGET
     */
    CREATE_WIDGET_INSTANT(PAYMENT_PANEL_WIDGET_CREATE_SAMPLE_FILES_DIRECTORY.getDirectory(), PAYMENT_PANEL_CREATE_WIDGET_INSTANT),
    CREATE_WIDGET_RECURRING(PAYMENT_PANEL_WIDGET_CREATE_SAMPLE_FILES_DIRECTORY.getDirectory(), PAYMENT_PANEL_CREATE_WIDGET_RECURRING);

    private String directory;
    private String fileName;

    PaymentPanelWidgetSampleFilesEnum(
            String directory,
            String fileName) {
        this.directory = directory;
        this.fileName = fileName;
    }

    public static PaymentPanelWidgetSampleFilesEnum fromFileName(String fileName) {
        for (PaymentPanelWidgetSampleFilesEnum b : PaymentPanelWidgetSampleFilesEnum.values()) {
            if (b.fileName.equalsIgnoreCase(fileName)) {
                return b;
            }
        }

        return null;
    }


}
