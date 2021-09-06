package cucumber.api.tests.validations.bank;

import cucumber.api.tests.common.predicates.GenericPredicates;
import cucumber.api.tests.data.dto.bankpanel.BankPanelRedirectUrlDTO;
import cucumber.api.tests.data.dto.bankpanel.login.BankPanelLoginHomePageDTO;
import cucumber.api.tests.data.dto.bankpanel.login.BankPanelLoginInfoDTO;
import org.junit.jupiter.api.Assertions;

import java.util.function.Consumer;

public class BankPanelValidation {

    public static Consumer<BankPanelRedirectUrlDTO> validateBankRedirectUrlDTO = (bankRedirectUrlDTO) -> {

        Assertions.assertFalse(GenericPredicates.checkIfNullOrEmpty.test(bankRedirectUrlDTO));
        Assertions.assertFalse(GenericPredicates.checkIfNullOrEmpty.test(bankRedirectUrlDTO.getRedirectURL()));
        Assertions.assertFalse(GenericPredicates.checkIfNullOrEmpty.test(bankRedirectUrlDTO.getRedirectURL().startsWith("http")));
        Assertions.assertFalse(GenericPredicates.checkIfNullOrEmpty.test(bankRedirectUrlDTO.getRedirectURL().contains("authentication")));
        Assertions.assertFalse(GenericPredicates.checkIfNullOrEmpty.test(bankRedirectUrlDTO.getRedirectURL().contains("ppTransactionId")));
        Assertions.assertFalse(GenericPredicates.checkIfNullOrEmpty.test(bankRedirectUrlDTO.getRedirectURL().contains("requestSignature")));

    };

    public static Consumer<BankPanelLoginInfoDTO> validateBankLoginInfoDTO = (bankPanelLoginInfoDTO) -> {

        Assertions.assertFalse(GenericPredicates.checkIfNullOrEmpty.test(bankPanelLoginInfoDTO));
        Assertions.assertFalse(GenericPredicates.checkIfNullOrEmpty.test(bankPanelLoginInfoDTO.getAuthFields()));
        Assertions.assertFalse(GenericPredicates.checkIfNullOrEmpty.test(bankPanelLoginInfoDTO.getPage()));
        Assertions.assertFalse(GenericPredicates.checkIfNullOrEmpty.test(bankPanelLoginInfoDTO.getStepId().equalsIgnoreCase("login")));

        Assertions.assertFalse(GenericPredicates.checkIfNullOrEmpty.test(bankPanelLoginInfoDTO.getTransaction()));
        Assertions.assertFalse(GenericPredicates.checkIfNullOrEmpty.test(bankPanelLoginInfoDTO.getTransaction().getBankId()));
        Assertions.assertFalse(GenericPredicates.checkIfNullOrEmpty.test(bankPanelLoginInfoDTO.getTransaction().getPpId()));
        Assertions.assertFalse(GenericPredicates.checkIfNullOrEmpty.test(bankPanelLoginInfoDTO.getTransaction().getState()));

    };


    public static Consumer<BankPanelLoginHomePageDTO> validateBankHomePageDTO = (bankPanelLoginHomePageDTO) -> {

        Assertions.assertFalse(GenericPredicates.checkIfNullOrEmpty.test(bankPanelLoginHomePageDTO));
        Assertions.assertFalse(GenericPredicates.checkIfNullOrEmpty.test(bankPanelLoginHomePageDTO.getBankPanelLoginHomePage()));
        Assertions.assertTrue(bankPanelLoginHomePageDTO.getBankPanelLoginHomePage().contains("username"));
        Assertions.assertTrue(bankPanelLoginHomePageDTO.getBankPanelLoginHomePage().contains("password"));

    };





}
