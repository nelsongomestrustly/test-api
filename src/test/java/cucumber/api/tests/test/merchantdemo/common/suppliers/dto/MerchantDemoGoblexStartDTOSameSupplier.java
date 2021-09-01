package cucumber.api.tests.test.merchantdemo.common.suppliers.dto;

import cucumber.api.tests.common.mappers.FileMappers;
import cucumber.api.tests.samplefiles.common.enums.files.nerchantdemo.MerchantDemoGlobexStartFilesEnum;
import cucumber.api.tests.samplefiles.common.enums.files.paymentpanel.PaymentPanelWidgetSampleFilesEnum;
import cucumber.api.tests.test.merchantdemo.data.dto.MerchantGlobexStartDTO;
import cucumber.api.tests.test.paymentpanel.data.dto.PaymentPanelCreateWidgetDTO;

import java.io.IOException;

public class MerchantDemoGoblexStartDTOSameSupplier {

    public static MerchantGlobexStartDTO getSampleMerchantGlobexStartDTO(String fileName) throws IOException {

        MerchantDemoGlobexStartFilesEnum merchantDemoGlobexStartFilesEnum = MerchantDemoGlobexStartFilesEnum.fromFileName(fileName);

        return FileMappers.getFileMappers(
                merchantDemoGlobexStartFilesEnum.getDirectory(), merchantDemoGlobexStartFilesEnum.getFileName(), MerchantGlobexStartDTO.class);

    }



}
