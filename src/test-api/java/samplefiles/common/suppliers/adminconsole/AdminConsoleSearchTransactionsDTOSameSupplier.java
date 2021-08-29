package samplefiles.common.suppliers.adminconsole;

import samplefiles.common.enums.files.adminconsole.AdminConsoleTransactionsSampleFilesNamesEnum;
import test.admconsole.data.dto.AdminConsoleSearchTransactionsDTO;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

import static cucumber.api.tests.common.mappers.ObjectMappers.MAPPER_SIMPLE;

public class AdminConsoleSearchTransactionsDTOSameSupplier {

    public static AdminConsoleSearchTransactionsDTO getSampleAdminConsoleSearchTransactionsDTO(String fileName) throws IOException {

        AdminConsoleTransactionsSampleFilesNamesEnum adminConsoleTransactionsSampleFilesNamesEnum = AdminConsoleTransactionsSampleFilesNamesEnum.fromFileName(fileName);

        return MAPPER_SIMPLE.readValue(Files.readString(Path.of(
                adminConsoleTransactionsSampleFilesNamesEnum.getDirectory() + adminConsoleTransactionsSampleFilesNamesEnum.getFileName()),
                StandardCharsets.UTF_8), AdminConsoleSearchTransactionsDTO.class);

    }



}
