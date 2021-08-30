package cucumber.api.tests.support.common.users.common.enums;

import cucumber.api.tests.common.constants.Passwords;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Getter
public enum PasswordsEnum {

    ADMIN_CONSOLE_ADMIN_PASSWORD(Passwords.ADMIN_CONSOLE_ADMIN_PASSWORD),
    ADMIN_CONSOLE_ADMIN_INVALID_PASSWORD(Passwords.ADMIN_CONSOLE_ADMIN_INVALID_PASSWORD);

    private final String passwword;




}
