package cucumber.api.tests.samplefiles.admconsole.suppliers;

import cucumber.api.tests.common.mappers.FileMappers;
import cucumber.api.tests.samplefiles.admconsole.enums.files.AdmConTransactionsSampleFilesEnum;
import cucumber.api.tests.data.dto.admconsole.AdmConSearchTransactionsDTO;

import java.io.IOException;

public class AdmConSearchTransactionsDTOFileSampleSupplier {

    public static AdmConSearchTransactionsDTO getSampleAdminConsoleSearchTransactionsDTO(String fileName) throws IOException {

        AdmConTransactionsSampleFilesEnum adminConsoleTransactionsSampleFilesNamesEnum = AdmConTransactionsSampleFilesEnum.fromFileName(fileName);

        return FileMappers.getFileMappers(
                adminConsoleTransactionsSampleFilesNamesEnum.getDirectory(), adminConsoleTransactionsSampleFilesNamesEnum.getFileName(), AdmConSearchTransactionsDTO.class);

    }



}
