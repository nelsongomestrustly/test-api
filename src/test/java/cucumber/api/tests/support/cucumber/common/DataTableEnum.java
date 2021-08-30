package cucumber.api.tests.support.cucumber.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum DataTableEnum {

    ADMIN_CONSOLE_FILENAME("adminConsoleFilename"),

    HTTP_EXPECT_STATUS("expectHttpStatus"),

    HTTP_STATUS_NOT_LOGGED("httpStatusNotLogged"),
    HTTP_STATUS_LOG_IN("httpStatusLogin"),
    HTTP_STATUS_LOGGED("httpStatusLogged"),
    HTTP_STATUS_LOG_OUT("httpStatusLogOut"),


    NOT_LOGGED_IN_ADMIN_CONSOLE_HTML_BODY("notLoggedInAdminConsoleHtmlBody"),
    SEARCH_NUMBER_RESULT("searchNumberResult"),
    SESSION_EXPIRED("sessionExpired"),

    TEST_PARTICIPANT("testParticipant");

    private final String mapKey;

}