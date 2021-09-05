package cucumber.api.tests.data.context;

import cucumber.api.tests.data.manager.FrontEndManager;
import cucumber.api.tests.data.manager.MerchantDemoManager;
import cucumber.api.tests.data.manager.PaymentPanelManager;
import cucumber.api.tests.data.manager.TokenManager;
import lombok.extern.slf4j.Slf4j;
import cucumber.api.tests.data.manager.AdminConsoleTransactionsManager;
import cucumber.api.tests.data.manager.LoginManager;
import cucumber.api.tests.data.manager.TestParticipantManager;

@Slf4j
public abstract class BaseCucumberContext {

    public AdminConsoleTransactionsManager adminConsoleTransactionsManager;
    public FrontEndManager frontEndManager;
    public LoginManager loginDTOManager;
    public MerchantDemoManager merchantDemoManager;
    public PaymentPanelManager paymentPanelManager;
    public TestParticipantManager testParticipantDTOManagers;
    public TokenManager tokenManager;

    public BaseCucumberContext(){

        adminConsoleTransactionsManager = new AdminConsoleTransactionsManager();
        loginDTOManager = new LoginManager();
        merchantDemoManager = new MerchantDemoManager();
        paymentPanelManager = new PaymentPanelManager();
        testParticipantDTOManagers = new TestParticipantManager();
        tokenManager = new TokenManager();
        frontEndManager = new FrontEndManager();

    }


}
