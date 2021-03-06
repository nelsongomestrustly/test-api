package cucumber.api.tests.support.common.connectors.apache;

import cucumber.api.tests.support.common.users.common.enums.TestParticipantEnum;

import java.util.HashMap;
import java.util.Map;

public final class ApacheConnectionManager {

    private ApacheConnectionManager() {
        throw new IllegalStateException("Utility class");
    }

    private static final Map<String, Map<String, ApacheHttpConnector>> connections = new HashMap<>();
    private static HashMap<String, ApacheHttpConnector> requesters;

    public static ApacheHttpConnector getConnection() {

        //String testParticipantName = testParticipant.getName();

        if (requesters == null) {
            requesters = new HashMap<>();
        }

        //User user = testParticipant.getUsers().get(userName);
        ApacheHttpConnector apacheHttpConnector = new ApacheHttpConnector();
        //connections.put(testParticipantName, requesters);

        return apacheHttpConnector;

    }

}
