package cucumber.api.tests.support.common.users.services;

import cucumber.api.tests.common.predicates.GenericPredicates;
import lombok.Getter;
import cucumber.api.tests.support.common.users.common.enums.PasswordsEnum;
import cucumber.api.tests.support.common.users.common.enums.TestParticipantEnum;
import cucumber.api.tests.support.common.users.common.enums.UsersEnum;
import cucumber.api.tests.support.common.users.data.TestParticipantDTO;

import java.util.HashMap;

@Getter
public class TestParticipantServices {

    private static HashMap<TestParticipantEnum, TestParticipantDTO> testParticipantMap;

    private TestParticipantServices() {
    }

    public static TestParticipantDTO getTestParticipant(String testParticipantName) {
        if(GenericPredicates.checkIfNullOrEmpty.test(testParticipantMap)) {
            testParticipantMap = new HashMap<>();
            populateTestParticipantToMap();
        }

        return testParticipantMap.get(TestParticipantEnum.fromString(testParticipantName));
    }


    private static void populateTestParticipantToMap() {

        addTestParticipantToMap(TestParticipantEnum.ADMIN_CONSOLE_ADMIN_USER, UsersEnum.ADMIN_CONSOLE_ADMIN_USER, PasswordsEnum.ADMIN_CONSOLE_ADMIN_PASSWORD);
        addTestParticipantToMap(TestParticipantEnum.ADMIN_CONSOLE_ADMIN_USER_INVALID, UsersEnum.ADMIN_CONSOLE_ADMIN_INVALID_USER, PasswordsEnum.ADMIN_CONSOLE_ADMIN_INVALID_PASSWORD);

    }

    private static void addTestParticipantToMap(TestParticipantEnum testParticipant, UsersEnum users, PasswordsEnum password) {

        TestParticipantDTO testParticipantDTO = TestParticipantDTO.builder().userName(users).userPassword(password).build();
        testParticipantMap.put(testParticipant, testParticipantDTO);

    }

}
