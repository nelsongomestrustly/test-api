package cucumber.api.tests.test.login.common.suppliers;

import cucumber.api.tests.support.common.users.data.TestParticipantDTO;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

public class LoginSuppliers {

    public static MultiValueMap<String, String> getLoginMultiValueMapForHttpRequest(TestParticipantDTO testParticipantDTO) {

        MultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();
        map.add("remember", "true");
        map.add("username", testParticipantDTO.getUserName().getUser());
        map.add("password", testParticipantDTO.getUserPassword().getPasswword());
        map.add("timezone", "Europe%2FLondon");
        map.add("originalUrl", "");
        map.add("X-CSRFKey", "");

        return map;

    }



}
