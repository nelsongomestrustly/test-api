package cucumber.api.tests.samplefiles.common.suppliers.merchantdemo;

import cucumber.api.tests.common.mappers.FileMappers;
import cucumber.api.tests.samplefiles.common.enums.files.adminconsole.AdmConTransactionsSampleFilesEnum;
import cucumber.api.tests.samplefiles.common.enums.files.nerchantdemo.MerchantDemoSignatureSampleFilesEnum;
import cucumber.api.tests.test.admconsole.data.dto.AdmConSearchTransactionsDTO;
import cucumber.api.tests.test.merchantdemo.data.dto.CreateSignatureDTO;

import java.io.IOException;

public class MerchantDemoCreateSignatureDTOSameSupplier {

    public static CreateSignatureDTO getSampleAdminConsoleSearchTransactionsDTO(String fileName) throws IOException {

        MerchantDemoSignatureSampleFilesEnum merchantDemoSignatureSampleFilesEnum = MerchantDemoSignatureSampleFilesEnum.fromFileName(fileName);

        return FileMappers.getFileMappers(
                merchantDemoSignatureSampleFilesEnum.getDirectory(), merchantDemoSignatureSampleFilesEnum.getFileName(), CreateSignatureDTO.class);

    }



}
