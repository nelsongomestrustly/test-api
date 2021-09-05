package cucumber.api.tests.samplefiles.common.suppliers.paymentpanel;

import cucumber.api.tests.common.mappers.FileMappers;
import cucumber.api.tests.samplefiles.common.enums.files.paymentpanel.PaymentPanelWidgetSampleFilesEnum;
import cucumber.api.tests.data.dto.paymentpanel.PaymentPanelCreateWidgetDTO;

import java.io.IOException;

public class CreatePaymentWidgetDTOFileSampleSupplier {

    public static PaymentPanelCreateWidgetDTO getSampleAdminConsoleSearchTransactionsDTO(String fileName) throws IOException {

        PaymentPanelWidgetSampleFilesEnum paymentPanelWidgetSampleFilesEnum = PaymentPanelWidgetSampleFilesEnum.fromFileName(fileName);

        return FileMappers.getFileMappers(
                paymentPanelWidgetSampleFilesEnum.getDirectory(), paymentPanelWidgetSampleFilesEnum.getFileName(), PaymentPanelCreateWidgetDTO.class);

    }



}
