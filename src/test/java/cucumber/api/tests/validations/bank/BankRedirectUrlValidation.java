package cucumber.api.tests.validations.bank;

import cucumber.api.tests.common.predicates.GenericPredicates;
import cucumber.api.tests.data.dto.bank.BankRedirectUrlDTO;
import cucumber.api.tests.data.dto.frontend.FrontEndSetupDTO;
import org.junit.jupiter.api.Assertions;

import java.util.function.Consumer;

public class BankRedirectUrlValidation {

    public static Consumer<BankRedirectUrlDTO> validateBankRedirectUrlDTO = (bankRedirectUrlDTO) -> {

        Assertions.assertFalse(GenericPredicates.checkIfNullOrEmpty.test(bankRedirectUrlDTO));
        Assertions.assertFalse(GenericPredicates.checkIfNullOrEmpty.test(bankRedirectUrlDTO.getRedirectURL()));
        Assertions.assertFalse(GenericPredicates.checkIfNullOrEmpty.test(bankRedirectUrlDTO.getRedirectURL().startsWith("http")));
        Assertions.assertFalse(GenericPredicates.checkIfNullOrEmpty.test(bankRedirectUrlDTO.getRedirectURL().contains("authentication")));
        Assertions.assertFalse(GenericPredicates.checkIfNullOrEmpty.test(bankRedirectUrlDTO.getRedirectURL().contains("ppTransactionId")));
        Assertions.assertFalse(GenericPredicates.checkIfNullOrEmpty.test(bankRedirectUrlDTO.getRedirectURL().contains("requestSignature")));

    };


}
