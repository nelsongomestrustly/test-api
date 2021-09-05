package cucumber.api.tests.samplefiles.common.suppliers.merchantdemo;

import cucumber.api.tests.common.mappers.FileMappers;
import cucumber.api.tests.data.dto.merchantdemo.MerchantBasicInfoDTO;
import cucumber.api.tests.samplefiles.common.enums.files.nerchantdemo.MerchantDemoBasicInfoFilesEnum;

import java.io.IOException;

public class MerchantDemoBasicInfoDTOSampleSupplier {

    public static MerchantBasicInfoDTO getSampleMerchantBasicInfoDTO(String fileName) throws IOException {

        MerchantDemoBasicInfoFilesEnum merchantDemoBasicInfoFilesEnum = MerchantDemoBasicInfoFilesEnum.fromFileName(fileName);

        return FileMappers.getFileMappers(
                merchantDemoBasicInfoFilesEnum.getDirectory(), merchantDemoBasicInfoFilesEnum.getFileName(), MerchantBasicInfoDTO.class);

    }



}
