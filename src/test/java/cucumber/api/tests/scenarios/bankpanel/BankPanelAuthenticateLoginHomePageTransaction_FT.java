package cucumber.api.tests.scenarios.bankpanel;

import cucumber.api.tests.CucumberTest;
import cucumber.api.tests.data.context.MyTestContext;
import cucumber.api.tests.data.dto.bankpanel.BankPanelRedirectUrlDTO;
import cucumber.api.tests.data.dto.bankpanel.login.BankPanelLoginHomePageDTO;
import cucumber.api.tests.test.bankpanel.actions.BankPanelHttpActions;
import cucumber.api.tests.validations.bank.BankPanelValidation;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

import static cucumber.api.tests.configurations.resttemplate.common.enums.StatefulRestTemplateInterceptorKeyEnums.BANK_PANEL_INTERCEPTOR_MAP_KEY;

@Slf4j
public class BankPanelAuthenticateLoginHomePageTransaction_FT extends CucumberTest {

    /**
     *
     * BankPanel Project
     * Send BankRedirect Url
     *
     */
    @When("The user should be able to open Bank Authorization Screen and Get Login Home Page and Expect Http Status {string}")
    public void theUserShouldBeAbleToOpenBankAuthorizationScreenAndGetLoginInformationAndExpectHttpStatus(String expectMerchantInfoHttpStatus) throws IOException {

        BankPanelRedirectUrlDTO firstBankPanelRedirectUrlDTO = MyTestContext.getMyTestContext().bankManager.getFirstBankRedirectUrlDTO();

        BankPanelLoginHomePageDTO bankPanelLoginHomePageDTO = BankPanelHttpActions.getBankPanelLoginHomePageDTO(firstBankPanelRedirectUrlDTO, Integer.parseInt(expectMerchantInfoHttpStatus), BANK_PANEL_INTERCEPTOR_MAP_KEY);

        MyTestContext.getMyTestContext().bankManager.addBankPanelLoginHomePageDTO(bankPanelLoginHomePageDTO);

    }



    @And("The user should have a Valid Bank Panel Login Home Page")
    public void theUserShouldHaveAValidBankLoginInformation() {

        BankPanelLoginHomePageDTO firstBankPanelLoginHomePageDTO = MyTestContext.getMyTestContext().bankManager.getFirstBankPanelLoginHomePageDTO();

        BankPanelValidation.validateBankHomePageDTO.accept(firstBankPanelLoginHomePageDTO);

    }


    /**
     * Response :
     * {
     *    "authFields":[
     *       {
     *          "name":"username",
     *          "options":null,
     *          "label":"demobank.username",
     *          "fieldType":"Text",
     *          "value":null
     *       },
     *       {
     *          "name":"password",
     *          "options":null,
     *          "label":"demobank.password",
     *          "fieldType":"Password",
     *          "value":null
     *       },
     *       {
     *          "name":"pwmb_remember",
     *          "options":null,
     *          "label":"login.remembermybank",
     *          "fieldType":"Checkbox",
     *          "value":"off"
     *       }
     *    ],
     *    "stepId":"login",
     *    "errorMessage":null,
     *    "page":{
     *       "mfa":false
     *    },
     *    "bankDictionary":{
     *       "demobank.manyInformation.option9":"E-mail address vit..brazil@paywithmybank.com",
     *       "demobank.manyInformation.option6":"E-mail address r..o@paywithmybank.com",
     *       "demobank.manyInformation.option5":"Phone number xxx-xxx-4663 Voice",
     *       "demobank.manyInformation.option8":"E-mail address rwc..usa@paywithmybank.com",
     *       "demobank.phonenumber.text":"Text: {0}",
     *       "demobank.multiFactorAuthentication.call":"Call: {0}",
     *       "demobank.manyInformation.option7":"E-mail address paywith..bank@paywithmybank.com",
     *       "demobank.stresstest.url":"Stress URL",
     *       "demobank.multiFactorAuthentication.accesscoderequired":"We need to send you an authorization code. How would you like to receive it?",
     *       "login.challengequestions":"Challenge Questions",
     *       "demobank.manyInformation.option2":"Phone number xxx-xxx-0016 Text",
     *       "demobank.manyInformation.option1":"Phone number xxx-xxx-2390 Voice",
     *       "demobank.manyInformation.option4":"Phone number xxx-xxx-4663 Text",
     *       "demobank.manyInformation.option3":"Phone number xxx-xxx-0016 Voice",
     *       "login.challengequestion":"Challenge Question",
     *       "demobank.emailmfa.howtoreceive":"We need to send you an authorization code. How would you like to receive it?",
     *       "demobank.manyInformation.option0":"Phone number xxx-xxx-2390 Text",
     *       "demobank.error.invalidanswer":"Incorrect answer. Please enter the valid answer.",
     *       "demobank.error.invalidmfa":"Incorrect MFA code. Please try again.",
     *       "demobank.mixedmfa.code":"Authorization Code:",
     *       "demobank.username":"Username",
     *       "demobank.mixedmfa.option3":"Call: xxx-xxx-4557",
     *       "demobank.mixedmfa.option2":"Text: xxx-xxx-5874",
     *       "demobank.mixedmfa.option1":"Text: xxx-xxx-4663",
     *       "login.answerchallenges":"<p class='svp-password-message fic-optional-message'>Answer your challenge questions so we can verify your identity. </p>",
     *       "demobank.name":"Demo Bank",
     *       "demobank.emailmfa.option2":"Email: ef..s@paywithmybank.com",
     *       "demobank.emailmfa.option3":"Email: rp..o@paywithmybank.com",
     *       "demobank.emailmfa.option1":"Email: cc..o@paywithmybank.com",
     *       "demobank.emailmfa.option6":"Email: jd..o@paywithmybank.com",
     *       "login.remembermybank":"Remember my bank",
     *       "demobank.emailmfa.option7":"Email: vb..o@paywithmybank.com",
     *       "demobank.multiFactorAuthentication.email":"Email: {0}",
     *       "demobank.emailmfa.option4":"Email: vo..o@paywithmybank.com",
     *       "demobank.emailmfa.option5":"Email: ds..o@paywithmybank.com",
     *       "demobank.password":"Password",
     *       "demobank.multiFactorAuthentication.please":"Please enter your temporary identification code",
     *       "demobank.requestChallenge.question0":"If two witches would watch two watches, which witch would watch which watch?",
     *       "demobank.multiFactorAuthentication.text":"Text: {0}",
     *       "demobank.prompt.type":"Prompt Type: [C]heckbox [T]ext [P]assword [E]mail [R]adio [I]mage [S]elect [O]neChar Password [J]avaScript [L]ink",
     *       "login.answerchallenge":"<p class='svp-password-message fic-optional-message'>Answer your challenge question so we can verify your identity. </p>",
     *       "demobank.emailmfa.option8":"Email: ak..o@paywithmybank.com",
     *       "demobank.stresstest.loadtime":"Stress Load Time (milliseconds)",
     *       "demobank.email":"Email: {0}",
     *       "demobank.pleaseselectoneoption":"Please select one option",
     *       "demobank.requestChallenge.question2":"How can a clam cram in a clean cream can?",
     *       "demobank.requestChallenge.question1":"Six sick hicks nick six slick bricks with picks and sticks. If Stu chews shoes, should Stu choose the shoes he chews?",
     *       "demobank.requestChallenge.question4":"How much wood would a woodchuck chuck if a woodchuck would chuck wood?",
     *       "demobank.requestChallenge.question3":"Can you can a can as a canner can can a can?",
     *       "demobank.requestChallenge.question5":"Fuzzy Wuzzy was a bear. Fuzzy Wuzzy had no hair. Fuzzy Wuzzy wasn't very fuzzy, was he?",
     *       "demobank.phonenumber.voice":"Call: {0}"
     *    },
     *    "transaction":{
     *       "currentPpId":"200005501",
     *       "institutionForegroundColor":null,
     *       "resetPasswordUrl":null,
     *       "teleCheck":{
     *          "teleCheckSessionId":null,
     *          "teleCheckEnabled":false,
     *          "teleCheckProfilingDomain":"h.online-metrix.net",
     *          "teleCheckOrganizationId":"s0b500qh"
     *       },
     *       "ppId":"ptx-WRWtnQeqrIAY21CR5mO1O6qr-NAG",
     *       "institutionLogoUrl":"http://192.168.1.54:8000/start/assets/institutions/200005501.png",
     *       "bankId":"200005501",
     *       "originalTransactionId":null,
     *       "institutionName":"Demo Bank",
     *       "institutionShortName":"Demo Bank",
     *       "hasBusinessAccountSupport":true,
     *       "state":"wSE+/3oRK8vai9XjAOB0ab3tvOyWSPwHygoK9Xsf8bNoF9bwRYItwTtz/b+ztEHzMa0cucYwLis7x0XxtdAosM8DYjoXcXkbvTok/+29ijeukmv4vKV8NbGN+mRpwVnSYg9mOUEeFF4U0xfx6cvawI1M0OppfH3R2cfDcXvXc9UNyumLuS683sgtZNxVZ+PcpZGjseF+vci5Nk2J1DsmwbgBuK6t7oFukKPQhp+Of0+xuIg9ZZSp3HPF6F+H73XRcTAoznYzrr8mP2rGRtILxjLdoeaQQIkZbQIFDWTgG4ipRfhCLYW5sI8K68Xwj4oPRBgMmejYVZf05s1WvobJJTdJNvaCKBKi/FsGNQqHwv0Ff5UJuYLibBq+8Z2cc+6PGFbVILIP5hiSi8DCOCcVgaxa1JJjEGaI627dyRwcKmNQdLwCHpb7R6KEv4DEmPkvss2RZZwv+cMXuCtj0RGMHX03CHHs70fwxAkRkIjlTzh1mjv7hkDDljuVt0uJgXUtY/QXZAnUw/wE/FhogBM4IDk2AKEBfG2702icAw9u7iWkcNlNFbvdsv62dRpuQvjd1EdeUFGVOWg57OSr1gzoSufFMz1g1MTEwQDqKhY4LKqo/IoNTmAH/jbRfReqP4cuXyZUAGORjbvpIOoF7jNVJ8b2tu0PXKHymsf2xGkY3fbGgceOIiPRiBWyEBHxFC3sVrNvhcxAKDWs46G+KzjdJsXKynnjfZjHiZXpfynrQ2D7A9Qd1YoHCnRQcvfMNEiv0fH1XUIrT7r7sJieXYaTzGlI2fiv4kfmOs3ltbCY2jo=",
     *       "allowResetPasswordButton":false,
     *       "mobileResetPasswordUrl":null,
     *       "institutionColor":null,
     *       "institutionIconUrl":"http://192.168.1.54:8000/start/assets/institutions/icons/200005501.png"
     *    }
     * }
     */


}