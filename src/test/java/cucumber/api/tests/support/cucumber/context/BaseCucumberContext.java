package cucumber.api.tests.support.cucumber.context;

import lombok.extern.slf4j.Slf4j;
import cucumber.api.tests.support.cucumber.managers.AdminConsoleTransactionsManager;
import cucumber.api.tests.support.cucumber.managers.LoginManager;
import cucumber.api.tests.support.cucumber.managers.TestParticipantManager;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public abstract class BaseCucumberContext {

    public AdminConsoleTransactionsManager adminConsoleTransactionsManager;
    public Map<String, Object> variablesMap;
    public LoginManager loginDTOManager;
    public TestParticipantManager testParticipantDTOManagers;

    public BaseCucumberContext(){

        adminConsoleTransactionsManager = new AdminConsoleTransactionsManager();
        loginDTOManager = new LoginManager();
        testParticipantDTOManagers = new TestParticipantManager();
        variablesMap = new HashMap<>();

    }


}
