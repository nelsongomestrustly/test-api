package cucumber.api.tests.support.cucumber.context;

import cucumber.api.tests.support.cucumber.managers.MerchantDemoManager;
import cucumber.api.tests.support.cucumber.managers.PaymentPanelManager;
import lombok.extern.slf4j.Slf4j;
import cucumber.api.tests.support.cucumber.managers.AdminConsoleTransactionsManager;
import cucumber.api.tests.support.cucumber.managers.LoginManager;
import cucumber.api.tests.support.cucumber.managers.TestParticipantManager;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public abstract class BaseCucumberContext {

    public AdminConsoleTransactionsManager adminConsoleTransactionsManager;
    public LoginManager loginDTOManager;
    public MerchantDemoManager merchantDemoManager;
    public PaymentPanelManager paymentPanelManager;
    public TestParticipantManager testParticipantDTOManagers;

    public BaseCucumberContext(){

        adminConsoleTransactionsManager = new AdminConsoleTransactionsManager();
        loginDTOManager = new LoginManager();
        merchantDemoManager = new MerchantDemoManager();
        paymentPanelManager = new PaymentPanelManager();
        testParticipantDTOManagers = new TestParticipantManager();

    }


}
