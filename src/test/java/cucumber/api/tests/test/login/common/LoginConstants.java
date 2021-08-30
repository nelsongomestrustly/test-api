package cucumber.api.tests.test.login.common;

public class LoginConstants {

    public static final String FIRST_COOKIE_START = "Set-Cookie:\"";
    public static final String FIRST_COOKIE_END = "\", \"rememberMe=";

    public static final String SECOND_COOKIE_START = "rememberMe=";
    public static final String SECOND_COOKIE_END = "\", \"auth=";

    public static final String THIRD_COOKIE_START = "auth=";
    public static final String THIRD_COOKIE_END = "\", Content-Type:\"";

    public static final String COOKIE_START = "Set-Cookie:\"";
    public static final String COOKIE_END = "\", Content-Type:";
}
