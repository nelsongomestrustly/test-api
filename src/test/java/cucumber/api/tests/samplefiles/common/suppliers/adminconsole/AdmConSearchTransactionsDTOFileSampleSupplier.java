package cucumber.api.tests.samplefiles.common.suppliers.adminconsole;

import cucumber.api.tests.common.mappers.FileMappers;
import cucumber.api.tests.samplefiles.common.enums.files.adminconsole.AdmConTransactionsSampleFilesEnum;
import cucumber.api.tests.test.admconsole.data.dto.AdmConSearchTransactionsDTO;

import java.io.IOException;

public class AdmConSearchTransactionsDTOFileSampleSupplier {

    public static AdmConSearchTransactionsDTO getSampleAdminConsoleSearchTransactionsDTO(String fileName) throws IOException {

        AdmConTransactionsSampleFilesEnum adminConsoleTransactionsSampleFilesNamesEnum = AdmConTransactionsSampleFilesEnum.fromFileName(fileName);

        return FileMappers.getFileMappers(
                adminConsoleTransactionsSampleFilesNamesEnum.getDirectory(), adminConsoleTransactionsSampleFilesNamesEnum.getFileName(), AdmConSearchTransactionsDTO.class);

    }



}
