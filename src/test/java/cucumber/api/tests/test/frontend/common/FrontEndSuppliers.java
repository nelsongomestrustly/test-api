package cucumber.api.tests.test.frontend.common;

import cucumber.api.tests.support.common.users.data.TestParticipantDTO;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

public class FrontEndSuppliers {

    public static MultiValueMap<String, String> getTokenMultiValueMapForHttpRequest(String token) {

        token = "O2z4XFIEfj35QNJXMpra53Q04up%2BN5N4Wl5j3%2FVhOT1Laz1g4OK4Fi7xMqfaUpsoI3vEjB%2BgpcrJyCP%2FBimTFW%2FW7g9%2FMoN3OS5M8iIjBh0NH6lqVYmxJi8IxuL%2FAOWWWkAn2Lqmeo2te4h%2FOCmMe9QJ3iCHzocBYZqhC2C49Xcywc457nYXPN0H74GdqEZlVW3h0GU1%2FYCzQYs0vLkKTlG2guylVZimTQLAsvzNLE8ECoPym6Myuax%2FLQiuNPSUykowcs0XXW%2BbWzEpwaZTuvyRhuQJtqVdFQAZ3zqbFfc3JRnNRba2iqKo2%2BFwJUGanK7jczF5zuTCf2yjgD4FO51Ft1g6sCGadP8VniB3xpblqFIPCohFeMc3lrrYfcAb6VDlv4G0NhMnHsaAessJWaQdi8JfdNDr%2BITuH8XL44L6folPsgnWwI9KbmA3zolz";

        MultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();
        map.add("cancelUrl", "");
        map.add("lt", "");
        map.add("token", token);

        return map;

    }



}
