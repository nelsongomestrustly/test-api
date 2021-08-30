package cucumber.api.tests.samplefiles.common.enums.files.adminconsole;

import lombok.Getter;

import static cucumber.api.tests.samplefiles.constants.adminconsole.AdminConsoleSearchTransactions.SEARCH_ADMIN_CONSOLE_TRANSACTIONS_FILE_NAME_BY_CUSTOMER_NAME_EMPTY;
import static cucumber.api.tests.samplefiles.constants.adminconsole.AdminConsoleSearchTransactions.SEARCH_ADMIN_CONSOLE_TRANSACTIONS_FILE_NAME_BY_CUSTOMER_NAME_INVALID;
import static cucumber.api.tests.samplefiles.constants.adminconsole.AdminConsoleSearchTransactions.SEARCH_ADMIN_CONSOLE_TRANSACTIONS_FILE_NAME_BY_CUSTOMER_NAME_VALID_1;
import static cucumber.api.tests.samplefiles.constants.adminconsole.AdminConsoleSearchTransactions.SEARCH_ADMIN_CONSOLE_TRANSACTIONS_FILE_NAME_BY_CUSTOMER_NAME_VALID_2;
import static cucumber.api.tests.samplefiles.constants.adminconsole.AdminConsoleSearchTransactions.SEARCH_ADMIN_CONSOLE_TRANSACTIONS_FILE_NAME_BY_CUSTOMER_NAME_VALID_3;
import static cucumber.api.tests.samplefiles.common.enums.directories.adminconsole.AdminConsoleTransactionsSampleFilesDirectoriesEnum.ADMIN_CONSOLE_TRANSACTIONS_SEARCH_BY_NAME_SAMPLE_FILES_DIRECTORY;

@Getter
public enum AdminConsoleTransactionsSampleFilesEnum {

    /**
     * ADMIN CONSOLE TRANSACTIONS
     */
    SEARCH_BY_EMPTY_CUSTOMER_NAMES(ADMIN_CONSOLE_TRANSACTIONS_SEARCH_BY_NAME_SAMPLE_FILES_DIRECTORY.getDirectory(), SEARCH_ADMIN_CONSOLE_TRANSACTIONS_FILE_NAME_BY_CUSTOMER_NAME_EMPTY),
    SEARCH_BY_INVALID_CUSTOMER_NAMES(ADMIN_CONSOLE_TRANSACTIONS_SEARCH_BY_NAME_SAMPLE_FILES_DIRECTORY.getDirectory(), SEARCH_ADMIN_CONSOLE_TRANSACTIONS_FILE_NAME_BY_CUSTOMER_NAME_INVALID),
    SEARCH_BY_VALID_CUSTOMER_NAME(ADMIN_CONSOLE_TRANSACTIONS_SEARCH_BY_NAME_SAMPLE_FILES_DIRECTORY.getDirectory(), SEARCH_ADMIN_CONSOLE_TRANSACTIONS_FILE_NAME_BY_CUSTOMER_NAME_VALID_1),
    SEARCH_BY_VALID_FI_CUSTOMER_NAME(ADMIN_CONSOLE_TRANSACTIONS_SEARCH_BY_NAME_SAMPLE_FILES_DIRECTORY.getDirectory(), SEARCH_ADMIN_CONSOLE_TRANSACTIONS_FILE_NAME_BY_CUSTOMER_NAME_VALID_2),
    SEARCH_BY_VALID_CUSTOMER_NAME_AND_FI_CUSTOMER_NAME(ADMIN_CONSOLE_TRANSACTIONS_SEARCH_BY_NAME_SAMPLE_FILES_DIRECTORY.getDirectory(), SEARCH_ADMIN_CONSOLE_TRANSACTIONS_FILE_NAME_BY_CUSTOMER_NAME_VALID_3);

    private String directory;
    private String fileName;

    AdminConsoleTransactionsSampleFilesEnum(
            String directory,
            String fileName) {
        this.directory = directory;
        this.fileName = fileName;
    }

    public static AdminConsoleTransactionsSampleFilesEnum fromFileName(String fileName) {
        for (AdminConsoleTransactionsSampleFilesEnum b : AdminConsoleTransactionsSampleFilesEnum.values()) {
            if (b.fileName.equalsIgnoreCase(fileName)) {
                return b;
            }
        }

        return null;
    }


}
