package cucumber.api.tests.configurations.resttemplate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.function.Supplier;

@Service
@Getter
public class RestTemplateSupplier implements InitializingBean {

    private final RestTemplate restTemplate;

    public RestTemplateSupplier(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    private static RestTemplate staticRestTemplate;

    @Override
    public void afterPropertiesSet() throws Exception {
        staticRestTemplate = this.getRestTemplate();
    }

    public static void resetRestTemplate() {
        staticRestTemplate = new RestTemplate();
    }

    public static Supplier<RestTemplate> getRestTemplate = () -> staticRestTemplate;

    public static RestTemplate get() {
        return staticRestTemplate;
    }



}
