import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(Cucumber.class)
@SpringBootTest
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber-reports/cucumber-reports.html"},
        tags = "",
        monochrome = true,
        features = "src/test-api/resources/features")
public class CucumberTest {


}
