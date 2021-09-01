package cucumber.api.tests.samplefiles.common.enums.directories;

import lombok.Getter;

import static cucumber.api.tests.samplefiles.constants.SampleDirectories.SAMPLES_FILES_DIRECTORY;

@Getter
public enum SampleFilesDirectoriesEnum {

    /**
     * MAIN DIRECTORY
     */
    ADMIN_CONSOLE_SAMPLE_FILES_DIRECTORY(SAMPLES_FILES_DIRECTORY + "/adminconsole"),
    MERCHANT_DEMO_SAMPLE_FILES_DIRECTORY(SAMPLES_FILES_DIRECTORY + "/merchantdemo");

    private String directory;

    SampleFilesDirectoriesEnum(String directory) {
        this.directory = directory;
    }

}
