package cucumber.api.tests.samplefiles.common.suppliers.merchantdemo;

import cucumber.api.tests.common.mappers.FileMappers;
import cucumber.api.tests.common.suppliers.MerchantSupplier;
import cucumber.api.tests.samplefiles.common.enums.files.nerchantdemo.MerchantDemoSignatureSampleFilesEnum;
import cucumber.api.tests.test.merchantdemo.data.dto.MerchantCreateSignatureDTO;

import java.io.IOException;

public class MerchantDemoCreateSignatureDTOFileSampleSupplier {

    public static MerchantCreateSignatureDTO getSampleMerchantCreateSignatureDTO(String fileName) throws IOException {

        MerchantDemoSignatureSampleFilesEnum merchantDemoSignatureSampleFilesEnum = MerchantDemoSignatureSampleFilesEnum.fromFileName(fileName);

        MerchantCreateSignatureDTO fileMappers = FileMappers.getFileMappers(
                merchantDemoSignatureSampleFilesEnum.getDirectory(), merchantDemoSignatureSampleFilesEnum.getFileName(), MerchantCreateSignatureDTO.class);

        //How Mechant identify transaction
        fileMappers.setMerchantReference(MerchantSupplier.getMerchantReference.get());

        return fileMappers;

    }



}
