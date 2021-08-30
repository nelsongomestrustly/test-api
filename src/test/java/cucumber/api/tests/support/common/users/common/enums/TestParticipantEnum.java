package cucumber.api.tests.support.common.users.common.enums;

import lombok.Getter;

@Getter
public enum TestParticipantEnum {

    ADMIN_CONSOLE_ADMIN_USER("admin_console_admin_user"),
    ADMIN_CONSOLE_ADMIN_USER_INVALID("admin_console_admin_user_invalid");

    private String testParticipantName;

    TestParticipantEnum(String testParticipantName) {
        this.testParticipantName = testParticipantName;
    }

    public static TestParticipantEnum fromString(String communicationStatus) {
        for (TestParticipantEnum b : TestParticipantEnum.values()) {
            if (b.testParticipantName.equalsIgnoreCase(communicationStatus)) {
                return b;
            }
        }
        return null;
    }

}
