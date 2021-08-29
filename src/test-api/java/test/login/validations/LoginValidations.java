package test.login.validations;

import cucumber.api.tests.common.predicates.GenericPredicates;
import org.junit.jupiter.api.Assertions;
import org.springframework.http.ResponseEntity;
import support.common.users.data.TestParticipantDTO;

public class LoginValidations {

    public static void isTestParticipantDTOValid(TestParticipantDTO testParticipantDTO) {

        Assertions.assertFalse(GenericPredicates.checkIfNullOrEmpty.test(testParticipantDTO));
        Assertions.assertFalse(GenericPredicates.checkIfNullOrEmpty.test(testParticipantDTO.getUserName()));
        Assertions.assertFalse(GenericPredicates.checkIfNullOrEmpty.test(testParticipantDTO.getUserPassword()));

    }

    public static boolean isTheUserLoggedIn(ResponseEntity<String> responseEntity, String notLoggedInHtmlBody) {

        Assertions.assertFalse(GenericPredicates.checkIfNullOrEmpty.test(responseEntity));
        Assertions.assertFalse(GenericPredicates.checkIfNullOrEmpty.test(responseEntity.getBody()));
        Assertions.assertFalse(GenericPredicates.checkIfNullOrEmpty.test(notLoggedInHtmlBody));

        return !responseEntity.getBody().contains(notLoggedInHtmlBody);

    }



    public static boolean isTheUserLogSessionExpired(ResponseEntity<String> responseEntity, String sessionExpired) {

        Assertions.assertFalse(GenericPredicates.checkIfNullOrEmpty.test(responseEntity));
        Assertions.assertFalse(GenericPredicates.checkIfNullOrEmpty.test(responseEntity.getBody()));
        Assertions.assertFalse(GenericPredicates.checkIfNullOrEmpty.test(sessionExpired));

        return responseEntity.getBody().contains(sessionExpired);

    }

}
