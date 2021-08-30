package cucumber.api.tests.test.login.utils;

import cucumber.api.tests.common.predicates.GenericPredicates;
import org.junit.jupiter.api.Assertions;
import org.springframework.http.ResponseEntity;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static cucumber.api.tests.test.login.common.LoginConstants.COOKIE_END;
import static cucumber.api.tests.test.login.common.LoginConstants.COOKIE_START;
import static cucumber.api.tests.test.login.common.LoginConstants.FIRST_COOKIE_END;
import static cucumber.api.tests.test.login.common.LoginConstants.FIRST_COOKIE_START;
import static cucumber.api.tests.test.login.common.LoginConstants.SECOND_COOKIE_END;
import static cucumber.api.tests.test.login.common.LoginConstants.SECOND_COOKIE_START;
import static cucumber.api.tests.test.login.common.LoginConstants.THIRD_COOKIE_END;
import static cucumber.api.tests.test.login.common.LoginConstants.THIRD_COOKIE_START;

//TODO DELETE
public class LoginUtils {

    /**
     *
     * Cookie Received Body (Rest Template ) -> Set-Cookie:"tz=Europe%2FLondon;Path=/admin-console;HttpOnly", "rememberMe=deleteMe; Path=/admin-console; Max-Age=0; Expires=Wed, 25-Aug-2021 15:00:44 GMT",
     *  "auth=EfYMC4sFhbmJ+yzqAllKg2SFngPyTwThFc/V1OHUhGdahl2zNkajOR9XFjyXM4yDxc10ihBA630zzHSguASKyyowMYmZIFL9od5KNCOG+9x2/UW+mStgS4pwL8Y+PSE3T1I6wXtecemUog8JEns9KA==;
     *  Max-Age=1800; path=/admin-console; HttpOnly"
     *
     * Cookie Sent to Transaction Home Page
     *
     *  Set-Cookie: tz=Europe/London;Path=/admin-console;HttpOnly
     *  Set-Cookie: rememberMe=deleteMe; Path=/admin-console; Max-Age=0; Expires=Wed, 25-Aug-2021 15:02:20 GMT
     *  Set-Cookie: auth=nYJCfyT/MmQsUw4CtnjYFw6q2ew6UI9tllBvLBE7FpvfelURqRdKtEuoqjF8PhmSTcsAencD9XDuHIrg8HncR9NS3zXhMSUI2un2vwNFby7dwSuZuYlQ6LCZD0MftbTgaBUC+aOgF7zkD3g7fie+Bw==; Max-Age=1800; path=/admin-console; HttpOnly
     *
     * @return
     * @throws IOException
     */
    public static List<String> getCookiesFromHtmlBody(ResponseEntity<String> responseEntity) {

        String htmlBody = responseEntity.toString();
        Assertions.assertFalse(GenericPredicates.checkIfNullOrEmpty.test(htmlBody));

        List<String> cookiesList = new ArrayList<>();
        cookiesList.add(getFirstCookie(htmlBody));
        cookiesList.add(getSecondCookie(htmlBody));
        cookiesList.add(getThirdCookie(htmlBody));

        return cookiesList;

    }

    private static String getFirstCookie(String htmlBody) {

        int firstCookieStart = htmlBody.indexOf(FIRST_COOKIE_START);
        int firstCookieEnd = htmlBody.indexOf(FIRST_COOKIE_END);

        return htmlBody.substring(firstCookieStart, firstCookieEnd);

    }

    private static String getSecondCookie(String htmlBody) {

        int secondCookieStart = htmlBody.indexOf(SECOND_COOKIE_START);
        int secondCookieEnd = htmlBody.indexOf(SECOND_COOKIE_END);

        return htmlBody.substring(secondCookieStart, secondCookieEnd);

    }

    private static String getThirdCookie(String htmlBody) {

        int thirdCookieStart = htmlBody.indexOf(THIRD_COOKIE_START);
        int thirdCookieEnd = htmlBody.indexOf(THIRD_COOKIE_END);

        return htmlBody.substring(thirdCookieStart, thirdCookieEnd);

    }



    public static String getCookiesFromHtmlBody2(ResponseEntity<String> responseEntity) {

        String htmlBody = responseEntity.toString();

        Assertions.assertFalse(GenericPredicates.checkIfNullOrEmpty.test(htmlBody));

        int start = htmlBody.indexOf(COOKIE_START);
        int end = htmlBody.indexOf(COOKIE_END);

        String cookieWithStart = htmlBody.substring(start, end);
        cookieWithStart = cookieWithStart.replace(COOKIE_START, "");

        return cookieWithStart;

    }

}
