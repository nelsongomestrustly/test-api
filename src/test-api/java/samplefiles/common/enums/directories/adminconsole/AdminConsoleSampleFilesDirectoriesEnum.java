package samplefiles.common.enums.directories.adminconsole;

import lombok.Getter;

import static samplefiles.common.constants.SampleDirectories.SAMPLES_FILES_DIRECTORY;

@Getter
public enum AdminConsoleSampleFilesDirectoriesEnum {

    /**
     * ADMIN CONSOLE DIRECTORY
     */
    ADMIN_CONSOLE_SAMPLE_FILES_DIRECTORY(SAMPLES_FILES_DIRECTORY + "/adminconsole/");

    private String directory;

    AdminConsoleSampleFilesDirectoriesEnum(String directory) {
        this.directory = directory;
    }

}
