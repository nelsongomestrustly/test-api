package cucumber.api.tests.validations.frontend;

import cucumber.api.tests.common.predicates.GenericPredicates;
import cucumber.api.tests.data.dto.frontend.FrontEndSetupDTO;
import org.junit.jupiter.api.Assertions;

import java.util.function.Consumer;

public class FrontEndValidations {

    public static Consumer<FrontEndSetupDTO> validateFrontEndSetupDTO = (frontEndSetupDTO) -> {

        Assertions.assertFalse(GenericPredicates.checkIfNullOrEmpty.test(frontEndSetupDTO));
        Assertions.assertFalse(GenericPredicates.checkIfNullOrEmpty.test(frontEndSetupDTO.getTransaction()));
        Assertions.assertFalse(GenericPredicates.checkIfNullOrEmpty.test(frontEndSetupDTO.getTransaction().getId()));
        Assertions.assertFalse(GenericPredicates.checkIfNullOrEmpty.test(frontEndSetupDTO.getTransaction().getPpId()));

    };

}
