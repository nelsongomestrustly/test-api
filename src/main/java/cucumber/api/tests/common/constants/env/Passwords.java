package cucumber.api.tests.common.constants.env;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class Passwords {

    public static String ADMIN_CONSOLE_ADMIN_PASSWORD;
    public static String ADMIN_CONSOLE_ADMIN_INVALID_PASSWORD;

    @Value("${admin.console.admin.password}")
    public void setAdminConsoleAdminPassword(String adminConsoleAdminPassword) {
        ADMIN_CONSOLE_ADMIN_PASSWORD = adminConsoleAdminPassword;
    }

    @Value("${admin.console.admin.password}")
    public void setAdminConsoleAdminInvalidPassword(String adminConsoleAdminPassword) {
        ADMIN_CONSOLE_ADMIN_INVALID_PASSWORD = adminConsoleAdminPassword + new Random().nextInt(10000);
    }

}
