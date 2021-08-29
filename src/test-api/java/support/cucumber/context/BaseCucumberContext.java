package support.cucumber.context;

import lombok.extern.slf4j.Slf4j;
import support.cucumber.managers.AdminConsoleTransactionsManager;
import support.cucumber.managers.LoginManager;
import support.cucumber.managers.TestParticipantManager;
import test.admconsole.data.dto.AdminConsoleSearchTransactionsDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
