package cucumber.api.tests.test.merchantdemo.common.suppliers.dto;

import cucumber.api.tests.common.mappers.FileMappers;
import cucumber.api.tests.samplefiles.common.enums.files.nerchantdemo.MerchantDemoSignatureSampleFilesEnum;
import cucumber.api.tests.test.merchantdemo.data.dto.MerchantCreateSignatureDTO;

import java.io.IOException;

public class MerchantDemoCreateSignatureDTOSameSupplier {

    public static MerchantCreateSignatureDTO getSampleAdminConsoleSearchTransactionsDTO(String fileName) throws IOException {

        MerchantDemoSignatureSampleFilesEnum merchantDemoSignatureSampleFilesEnum = MerchantDemoSignatureSampleFilesEnum.fromFileName(fileName);

        return FileMappers.getFileMappers(
                merchantDemoSignatureSampleFilesEnum.getDirectory(), merchantDemoSignatureSampleFilesEnum.getFileName(), MerchantCreateSignatureDTO.class);

    }



}
