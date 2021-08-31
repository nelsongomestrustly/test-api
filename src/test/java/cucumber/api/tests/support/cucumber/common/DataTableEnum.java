package cucumber.api.tests.support.cucumber.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum DataTableEnum {

    ADMIN_CONSOLE_FILENAME("adminConsoleFilename"),

    NOT_LOGGED_IN_ADMIN_CONSOLE_HTML_BODY("notLoggedInAdminConsoleHtmlBody"),
    SEARCH_NUMBER_RESULT("searchNumberResult"),
    SESSION_EXPIRED("sessionExpired"),

    TEST_PARTICIPANT("testParticipant");

    private final String mapKey;

}