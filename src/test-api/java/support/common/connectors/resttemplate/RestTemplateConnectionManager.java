package support.common.connectors.resttemplate;

import cucumber.api.tests.configurations.resttemplate.RestTemplateSupplier;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import support.common.users.data.TestParticipantDTO;

@Slf4j
@AllArgsConstructor
public final class RestTemplateConnectionManager {

    public static RestTemplate getConnection() {
        return getRestTemplate();
    }

    private static RestTemplate getRestTemplate() {
        return RestTemplateSupplier.getRestTemplate.get();
    }

}
