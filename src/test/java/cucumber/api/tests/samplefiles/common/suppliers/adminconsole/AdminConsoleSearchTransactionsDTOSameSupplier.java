package cucumber.api.tests.samplefiles.common.suppliers.adminconsole;

import cucumber.api.tests.common.mappers.FileMappers;
import cucumber.api.tests.samplefiles.common.enums.files.adminconsole.AdminConsoleTransactionsSampleFilesEnum;
import cucumber.api.tests.test.admconsole.data.dto.AdminConsoleSearchTransactionsDTO;

import java.io.IOException;

public class AdminConsoleSearchTransactionsDTOSameSupplier {

    public static AdminConsoleSearchTransactionsDTO getSampleAdminConsoleSearchTransactionsDTO(String fileName) throws IOException {

        AdminConsoleTransactionsSampleFilesEnum adminConsoleTransactionsSampleFilesNamesEnum = AdminConsoleTransactionsSampleFilesEnum.fromFileName(fileName);

        return FileMappers.getFileMappers(
                adminConsoleTransactionsSampleFilesNamesEnum.getDirectory(), adminConsoleTransactionsSampleFilesNamesEnum.getFileName(), AdminConsoleSearchTransactionsDTO.class);

    }



}
