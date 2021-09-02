package cucumber.api.tests.common.constants.env;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class Users {

    public static String ADMIN_CONSOLE_ADMIN_USER;
    public static String ADMIN_CONSOLE_ADMIN_INVALID_USER;

    @Value("${admin.console.admin.user}")
    public void setAdminConsoleAdminUser(String adminConsoleAdminUser) {
        ADMIN_CONSOLE_ADMIN_USER = adminConsoleAdminUser;
    }

    @Value("${admin.console.admin.user}")
    public void setAdminConsoleAdminInvalidUser(String adminConsoleAdminUser) {
        ADMIN_CONSOLE_ADMIN_INVALID_USER = adminConsoleAdminUser + new Random().nextInt(10000);
    }

}
