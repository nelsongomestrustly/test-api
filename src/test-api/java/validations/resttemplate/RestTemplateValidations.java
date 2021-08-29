package validations.resttemplate;

import org.junit.jupiter.api.Assertions;
import org.springframework.http.ResponseEntity;

import static org.junit.Assert.assertEquals;

public class RestTemplateValidations {

    public static void validateStatus(int expectedStatus, ResponseEntity<?> responseEntity) {

        int actualStatus = responseEntity.getStatusCode().value();
        Assertions.assertEquals(expectedStatus, actualStatus);
    }

}
