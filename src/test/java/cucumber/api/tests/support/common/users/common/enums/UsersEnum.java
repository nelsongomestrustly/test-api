package cucumber.api.tests.support.common.users.common.enums;

import cucumber.api.tests.common.constants.Users;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Getter
public enum UsersEnum {

    ADMIN_CONSOLE_ADMIN_USER(Users.ADMIN_CONSOLE_ADMIN_USER),
    ADMIN_CONSOLE_ADMIN_INVALID_USER(Users.ADMIN_CONSOLE_ADMIN_INVALID_USER);

    private final String user;

}
