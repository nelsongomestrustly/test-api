package cucumber.api.tests.support.cucumber.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum DataTableEnum {

    ADMIN_CONSOLE_FILENAME("adminConsoleFilename"),

    MERCHANT_DEMO_CREATE_SIGNATURE_FILENAME("merchantDemoCreateSignatureFilename"),

    NOT_LOGGED_IN_ADMIN_CONSOLE_HTML_BODY("notLoggedInAdminConsoleHtmlBody"),

    SEARCH_NUMBER_RESULT("numberOfResults"),
    SESSION_EXPIRED("sessionExpired"),

    TEST_PARTICIPANT("testParticipant"),

    WIDGET_ID("widgetId"),
    WIDGET_NAME("widgetName");

    private final String mapKey;

}