package cucumber.api.tests.scenarios.bankpanel;

import cucumber.api.tests.CucumberTest;
import cucumber.api.tests.data.context.MyTestContext;
import cucumber.api.tests.data.dto.bankpanel.accounts.BankPanelAccountLoginDTO;
import cucumber.api.tests.data.dto.bankpanel.login.BankPanelLoginInfoDTO;
import cucumber.api.tests.data.dto.frontend.FrontEndSetupDTO;
import cucumber.api.tests.conectors.bankpanel.BankPanelHttpActions;
import cucumber.api.tests.validations.bank.BankPanelValidation;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.net.URISyntaxException;

import static cucumber.api.tests.configurations.resttemplate.common.enums.StatefulRestTemplateInterceptorKeyEnums.BANK_PANEL_INTERCEPTOR_MAP_KEY;

@Slf4j
public class BankPanelAuthenticateLoginAvailableAccountsTransaction_FT extends CucumberTest {

    /**
     *
     * Request URL: http://192.168.1.54:9000/step/200005501/authentication/authenticate
     * accept: application/json; app=react
     *
     * lang: en
     * ppTransactionId: ptx-c_cwX_XT_nuqMSIODcWBPB5C-NAG
     * state: gA/zaqeEKv8IA191f+WJr8v9P2oAmH0ZPMlGzRI5EGTVsWDR9djyjAfiRmxZ7FMlCA+mS0xuWQuj1zzBWO6VNxkfjmj+UY2sn+QVAUf48+c3zdJYorna8+vOwK6jTncO8t78LZ5aq5oyi8W/nuQapJF6+XTt8K3usdci49SLj4uTeM3fQ7ais23fESag/wmW8myXGlNKdJL1d099VbHqnsGt6rDRR+tNG2rjcjuvkniS/gm39m49xcog4TWfgO4Rk4NnFEABYYRCDyc78+34GkQ2yNVh0W/8srbgkQ65oHGKuo+AczX4twjEsWkQKznYbxFAicX8/2CzBR2nUvwa6VK5TXkocCsSv4LgUeTc3kFE9tBfSOOR74vxBMu69ybYY2V5wHEs68a29oVzCVO1Uju0KOU3J1FlrGEiLuape8p1HgKx+V2UCdeE055YY3MHI+yu4veTxC3sHGrFxSr5VetpQJJw8ry+O78WVLgCwy2/FDCvJy6xawdAGekbnvCSK1aU6QGgd3gPwtkER6/bSnZvur4DwEnwaRRYcgT4JT7qYa7aN8MShXKX0XZQ83m7v5Z/VuyQb0RAR1Gn2RkcpC3zWuAvKVFCDk3kRvIKAm/tTqOG6+KtZN2njLQestIU9ZnVWVgMMdf/l6/en7bhPzYDOn5j5Qimtq3sa2VhS4QuucVs9nB90UUVrBpkfZX2DPp/t4/LY1zVOW6SS9tUK/cFEsB/krlTjpfTt0KxpBj3bAlM7Q32bWukhLlypgFJsv1uT1MLIapLIy8Jd7DUBubB/OG/GL0THbcoeit5RVU=
     * loginErrorCount: 0
     * principalName:
     * principalSignature:
     * fiCode: 200005501
     * forgotMyPasswordCustomError: false
     * prompt-username: 222
     * prompt-password: 222
     * gr: 0
     * username: 222
     * password: 222
     * timezoneAbbr: WEST
     * timezoneOffset: 60
     * lt: R3XPdH8Zp4ZKWaM3fuuqKw==:initial_load:/establish:1630936613016:1630936614126
     *
     *
     */

    @Then("The user should be able to Authenticate in the Bank and Get Available Accounts and Expect Http Status {string}")
    public void theUserShouldBeAbleToAuthenticateInTheBankAndGetAvailableAccountsAndExpectHttpStatus(String expectMerchantInfoHttpStatus) throws IOException, URISyntaxException {

        FrontEndSetupDTO firstFrontEndSetupDTO = MyTestContext.getMyTestContext().frontEndManager.getFirstFrontEndSetupDTO();
        BankPanelLoginInfoDTO firstBankPanelLoginInfoDTO = MyTestContext.getMyTestContext().bankManager.getFirstBankPanelLoginInfoDTO();

        BankPanelAccountLoginDTO bankPanelAccountLoginDTO = BankPanelHttpActions.getBankPanelAccountLoginDTO(
                "username",
                "password",
                firstBankPanelLoginInfoDTO,
                firstFrontEndSetupDTO,
                Integer.parseInt(expectMerchantInfoHttpStatus), BANK_PANEL_INTERCEPTOR_MAP_KEY);

        MyTestContext.getMyTestContext().bankManager.addBankPanelAccountLoginDTO(bankPanelAccountLoginDTO);

    }

    @And("The user should have a Bank Accounts information")
    public void theUserShouldHaveABankAccountsInformation() {

        BankPanelAccountLoginDTO bankPanelAccountLoginDTO = MyTestContext.getMyTestContext().bankManager.getFirstBankPanelAccountLoginDTO();

        BankPanelValidation.validateBankAccountLoginDTO.accept(bankPanelAccountLoginDTO);

    }


    /**
     *
     * Response
     *
     * {
     *    "accountFields":[
     *       {
     *          "number":"****6576",
     *          "hasFunds":true,
     *          "iban":null,
     *          "name":"Demo Checking Account",
     *          "index":0,
     *          "supported":true
     *       },
     *       {
     *          "number":"****6213",
     *          "hasFunds":true,
     *          "iban":null,
     *          "name":"Demo Savings Account",
     *          "index":1,
     *          "supported":true
     *       }
     *    ],
     *    "askForAccountProfile":false,
     *    "stepId":"accounts",
     *    "selectedAccount":{
     *       "number":"****6576",
     *       "hasFunds":true,
     *       "iban":null,
     *       "name":"Demo Checking Account",
     *       "index":0,
     *       "supported":true
     *    },
     *    "page":{
     *       "finishButtonLabel":"ux.finishButtonLabel.payNowContinueWithdrawDeposit.pay"
     *    },
     *    "transaction":{
     *       "authorizationTextToken":null,
     *       "principalName":"signed:200005501:222",
     *       "principalSignature":"2dhR1jA7+VzIMFz1lZjFFbPapXc=",
     *       "state":"In4aoaT9T0PCIabKPoZINzMYh2r+3D5U6CybHjdKxnkfBpvZpsxRJa3u/NLsZcA/+kgh1LWwku490f60NuATs8oZRPJhAeGedbqfli4eofQCx4l9bWlULP1PsuDM7/HTPR+9imrMeImprNIObcmnGgbRnbLO43CC1KiPgGq7luuzwWo84yLzjO+yTPLTqe6mbEHZS9WQF8/MO7MT1ANCRapgAgqjRhbLF0nW0+3IjZm9EWbhwBQCgvxV3SrzBd0KfzGMP+S0KOxs0+L8sy8edXBNsAMqYshmvk9cXzZzJkYnASkJ8jOZDs0Ezxa78IYwcaNPy6M4GrlZHI4Hw9BjnEBSl6F/PO7dUJGuUzHwPBtIn5hlQ9mPnLXzHb1HIxmqag5tUPQu+5DGBPPTWrJgN2AoGejbzyNRoJbbF0uLuKMQDxTsAhm25je8rbM98MctO4sz2MjeGJJemN51xtbbGVe3MTP2KF0/b31RErE671bGp1Ez7vqTbiqTkKJ7w2Ds/8nhlLUgIdUl6fsS+u8xL0UVYPHQRJrgHLUaJbV7uVpRgJCsX0qYr1GwMhO3lflGgkn8HMpuzPaFUu0Dof92zAy8IIyOidQAd5mOFkypXt/NuCzHQoypGcWgtBqfWd9rN/1Si224o3BJj/ao9kChcgujsSXkejRs4Gk6AqsmcuNaBsTsg5bUBqeYudRGqSZ5yz+Yq8KuUwk3lPlxT1RxkQKXgDnKANfRJYesr9BnevUGguFmtq+4gsiDdtoB1pEhgIka9/a1tMlwlvrtd/EXkqWD4sGh4VT9G0E4/LDXLLj4v57AQ27OW7LFaxbnGi7VYHkoGelsI0FvsxMf5fr61Qm+Lk0HCBeGU7v3gjfWazzB9zZN1cVjp+I5IutdFRVj1d7SzSWhcgwC5tm9hFgGH+QF7B0CYM1y9r7lGUCHwTqRZu+9MQ8dyvyVxx2JrNvc",
     *       "authorizationText":"Globex (demo) Transaction Authorization\r\n\r\nToday, being 9/6/2021 02:57:00 PM WEST, by clicking \"Pay Now\", I agree to the [Terms of Use](https://www.trustly.net/us/terms-of-use) and authorize Globex (demo) to use my bank account, as identified below, as a payment method and to debit it via an electronic funds transfer (EFT) or draft for the full amount identified below, and also authorize credits to the same account to correct erroneous debits, if necessary.\r\n\r\nPayment: USD 1.00 \nFrom: {{account_name}} \nBank: Demo Bank \nBank Login: {{bank_login}} \nReference Number: 61145009FBD7F728 \r\n\r\nI understand that my payment will be processed within 1-2 banking days and may be presented to my bank multiple times if returned unpaid. If returned unpaid, I authorize Globex (demo) or its service provider(s) to collect the payment and my State's return item fee as set forth below and, if applicable, costs, by debiting my bank account via EFT(s) or draft(s), and, failing that, to contact me using the information I have provided to Globex (demo) or its service provider(s), directly or indirectly, and collect via another payment method.\r\n\r\nNote that some banks may charge a fee to pay from a savings account.\r\n\r\nStates' return item fees: https://www.trustly.net/us/states-return-fees\r\n\r\n**PLEASE PRINT A COPY OF THIS AUTHORIZATION FOR YOUR RECORDS. ALTERNATIVELY, CONTACT US TO LEARN HOW YOU CAN OBTAIN A COPY.**",
     *       "authorizationTimestamp":1630936620679,
     *       "ppId":"ptx-c_cwX_XT_nuqMSIODcWBPB5C-NAG"
     *    }
     * }
     *
     */


}