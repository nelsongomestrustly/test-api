package cucumber.api.tests.scenarios.myenv;

import cucumber.api.tests.CucumberTest;
import cucumber.api.tests.configurations.resttemplate.RestTemplateSupplier;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Assertions;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RequiredArgsConstructor
public class CucumberBasicTest extends CucumberTest {

    //@Before -> Before Each Scenario
    //@BeforeStep -> Before Each Step

    private ResponseEntity<String> forEntity;
    private static final String SERVER_PORT = "9999";

    @When("^the client calls /version$")
    public void the_client_issues_GET_version() throws Throwable{
        forEntity = RestTemplateSupplier.getRestTemplate.get().getForEntity("http://localhost:" + SERVER_PORT + "/version", String.class);
    }

    @Then("^the client receives status code of (\\d+)$")
    public void the_client_receives_status_code_of(int statusCode) {
        HttpStatus currentStatusCode = forEntity.getStatusCode();
        Assertions.assertEquals(currentStatusCode.value(), statusCode);
    }

    @And("^the client receives server version (.+)$")
    public void the_client_receives_server_version_body(String version) {
        Assertions.assertEquals(forEntity.getBody(), version);
    }

}
