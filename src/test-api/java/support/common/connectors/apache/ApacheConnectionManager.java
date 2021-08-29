package support.common.connectors.apache;

import support.common.users.common.enums.TestParticipantEnum;

import java.util.HashMap;
import java.util.Map;

public final class ApacheConnectionManager {

    private ApacheConnectionManager() {
        throw new IllegalStateException("Utility class");
    }

    private static final Map<String, Map<String, ApacheHttpConnector>> connections = new HashMap<>();
    private static HashMap<String, ApacheHttpConnector> requesters;

    public static ApacheHttpConnector getConnection(TestParticipantEnum testParticipant, String userName) {

        //String testParticipantName = testParticipant.getName();

        if (requesters == null) {
            requesters = new HashMap<>();
        }

        //User user = testParticipant.getUsers().get(userName);
        ApacheHttpConnector apacheHttpConnector = new ApacheHttpConnector();
        requesters.put(userName, apacheHttpConnector);
        //connections.put(testParticipantName, requesters);

        return requesters.get(userName);

    }

}
