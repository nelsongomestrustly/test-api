package cucumber.api.tests.test.merchantdemo.common.suppliers.dto.info;

import cucumber.api.tests.common.mappers.FileMappers;
import cucumber.api.tests.samplefiles.common.enums.files.nerchantdemo.MerchantDemoBasicInfoFilesEnum;
import cucumber.api.tests.test.merchantdemo.data.dto.MerchantBasicInfoDTO;

import java.io.IOException;

public class MerchantDemoBasicInfoDTOSampleSupplier {

    public static MerchantBasicInfoDTO getSampleMerchantBasicInfoDTO(String fileName) throws IOException {

        MerchantDemoBasicInfoFilesEnum merchantDemoBasicInfoFilesEnum = MerchantDemoBasicInfoFilesEnum.fromFileName(fileName);

        return FileMappers.getFileMappers(
                merchantDemoBasicInfoFilesEnum.getDirectory(), merchantDemoBasicInfoFilesEnum.getFileName(), MerchantBasicInfoDTO.class);

    }



}
