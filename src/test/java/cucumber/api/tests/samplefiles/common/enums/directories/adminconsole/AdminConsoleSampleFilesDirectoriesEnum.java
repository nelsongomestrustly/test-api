package cucumber.api.tests.samplefiles.common.enums.directories.adminconsole;

import lombok.Getter;

import static cucumber.api.tests.samplefiles.constants.SampleDirectories.SAMPLES_FILES_DIRECTORY;

@Getter
public enum AdminConsoleSampleFilesDirectoriesEnum {

    /**
     * ADMIN CONSOLE DIRECTORY
     */
    ADMIN_CONSOLE_SAMPLE_FILES_DIRECTORY(SAMPLES_FILES_DIRECTORY + "/adminconsole");

    private String directory;

    AdminConsoleSampleFilesDirectoriesEnum(String directory) {
        this.directory = directory;
    }

}
