package cucumber.api.tests.samplefiles.merchantdemo.suppliers;

import cucumber.api.tests.common.mappers.FileMappers;
import cucumber.api.tests.common.suppliers.MerchantSupplier;
import cucumber.api.tests.data.dto.merchantdemo.MerchantCreateSignatureDTO;
import cucumber.api.tests.samplefiles.merchantdemo.enums.files.MerchantDemoSignatureSampleFilesEnum;

import java.io.IOException;

public class MerchantDemoCreateSignatureDTOFileSampleSupplier {

    public static MerchantCreateSignatureDTO getSampleMerchantCreateSignatureDTO(
            String fileName) throws IOException {

        MerchantDemoSignatureSampleFilesEnum merchantDemoSignatureSampleFilesEnum = MerchantDemoSignatureSampleFilesEnum.fromFileName(fileName);

        MerchantCreateSignatureDTO merchantCreateSignatureDTO = FileMappers.getFileMappers(
                merchantDemoSignatureSampleFilesEnum.getDirectory(), merchantDemoSignatureSampleFilesEnum.getFileName(), MerchantCreateSignatureDTO.class);

        //How Mechant identify transaction
        merchantCreateSignatureDTO.setMerchantReference(MerchantSupplier.getMerchantReference.get());

        return merchantCreateSignatureDTO;

    }



}
