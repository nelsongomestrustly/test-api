package samplefiles.common.enums.files.adminconsole;

import lombok.Getter;

import static samplefiles.common.constants.adminconsole.AdminConsoleSearchTransactions.SEARCH_ADMIN_CONSOLE_TRANSACTIONS_FILE_NAME_BY_CUSTOMER_NAME_EMPTY;
import static samplefiles.common.constants.adminconsole.AdminConsoleSearchTransactions.SEARCH_ADMIN_CONSOLE_TRANSACTIONS_FILE_NAME_BY_CUSTOMER_NAME_INVALID;
import static samplefiles.common.constants.adminconsole.AdminConsoleSearchTransactions.SEARCH_ADMIN_CONSOLE_TRANSACTIONS_FILE_NAME_BY_CUSTOMER_NAME_VALID_1;
import static samplefiles.common.constants.adminconsole.AdminConsoleSearchTransactions.SEARCH_ADMIN_CONSOLE_TRANSACTIONS_FILE_NAME_BY_CUSTOMER_NAME_VALID_2;
import static samplefiles.common.constants.adminconsole.AdminConsoleSearchTransactions.SEARCH_ADMIN_CONSOLE_TRANSACTIONS_FILE_NAME_BY_CUSTOMER_NAME_VALID_3;
import static samplefiles.common.enums.directories.adminconsole.AdminConsoleTransactionsSampleFilesDirectoriesEnum.ADMIN_CONSOLE_TRANSACTIONS_SEARCH_BY_NAME_SAMPLE_FILES_DIRECTORY;

@Getter
public enum AdminConsoleTransactionsSampleFilesNamesEnum {

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

    AdminConsoleTransactionsSampleFilesNamesEnum(
            String directory,
            String fileName) {
        this.directory = directory;
        this.fileName = fileName;
    }

    public static AdminConsoleTransactionsSampleFilesNamesEnum fromFileName(String fileName) {
        for (AdminConsoleTransactionsSampleFilesNamesEnum b : AdminConsoleTransactionsSampleFilesNamesEnum.values()) {
            if (b.fileName.equalsIgnoreCase(fileName)) {
                return b;
            }
        }

        return null;
    }


}
