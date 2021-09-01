package cucumber.api.tests.test.admconsole.common.suppliers.dto;

import cucumber.api.tests.common.mappers.FileMappers;
import cucumber.api.tests.samplefiles.common.enums.files.adminconsole.AdmConTransactionsSampleFilesEnum;
import cucumber.api.tests.test.admconsole.data.dto.AdmConSearchTransactionsDTO;

import java.io.IOException;

public class AdmConSearchTransactionsDTOSameSupplier {

    public static AdmConSearchTransactionsDTO getSampleAdminConsoleSearchTransactionsDTO(String fileName) throws IOException {

        AdmConTransactionsSampleFilesEnum adminConsoleTransactionsSampleFilesNamesEnum = AdmConTransactionsSampleFilesEnum.fromFileName(fileName);

        return FileMappers.getFileMappers(
                adminConsoleTransactionsSampleFilesNamesEnum.getDirectory(), adminConsoleTransactionsSampleFilesNamesEnum.getFileName(), AdmConSearchTransactionsDTO.class);

    }



}
