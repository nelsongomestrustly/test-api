package cucumber.api.tests.samplefiles.common.enums.directories.adminconsole;

import lombok.Getter;

import static cucumber.api.tests.samplefiles.common.enums.directories.adminconsole.AdmConSampleFilesDirectoriesEnum.ADMIN_CONSOLE_SAMPLE_FILES_DIRECTORY;

@Getter
public enum AdmConTransactionsSampleFilesDirectoriesEnum {

    /**
     * ADMIN CONSOLE TRANSACTIONS
     */
    ADMIN_CONSOLE_TRANSACTIONS_SAMPLE_FILES_DIRECTORY(ADMIN_CONSOLE_SAMPLE_FILES_DIRECTORY.getDirectory() + "/transactions"),

    /**
     * ADMIN CONSOLE TRANSACTIONS CREATE
     */
    ADMIN_CONSOLE_TRANSACTIONS_CREATE_SAMPLE_FILES_DIRECTORY(ADMIN_CONSOLE_TRANSACTIONS_SAMPLE_FILES_DIRECTORY.getDirectory() + "/create"),

    /**
     * ADMIN CONSOLE TRANSACTIONS SEARCH
     */
    ADMIN_CONSOLE_TRANSACTIONS_SEARCH_SAMPLE_FILES_DIRECTORY(ADMIN_CONSOLE_TRANSACTIONS_SAMPLE_FILES_DIRECTORY.getDirectory() + "/search"),
    ADMIN_CONSOLE_TRANSACTIONS_SEARCH_BY_NAME_SAMPLE_FILES_DIRECTORY(ADMIN_CONSOLE_TRANSACTIONS_SEARCH_SAMPLE_FILES_DIRECTORY.getDirectory() + "/bycustomername/");


    private String directory;

    AdmConTransactionsSampleFilesDirectoriesEnum(String directory) {
        this.directory = directory;
    }


}
