package cucumber.api.tests.configurations.resttemplate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.function.Supplier;

@Service
@Getter
public class RestTemplateSupplier implements InitializingBean {

    private RestTemplate restTemplate;

    @Autowired
    private RestTemplateBuilder restTemplateBuilder;

    @PostConstruct
    public void RestTemplateSupplier() {
        this.restTemplate = restTemplateBuilder.build();
    }

    private static RestTemplate staticRestTemplate;

    @Override
    public void afterPropertiesSet() throws Exception {
        staticRestTemplate = this.getRestTemplate();
    }

    public void resetRestTemplate() {
        this.restTemplate = restTemplateBuilder.build();
        staticRestTemplate = new RestTemplate();
    }

    public static Supplier<RestTemplate> getRestTemplate = () -> staticRestTemplate;

    public static RestTemplate get() {
        return staticRestTemplate;
    }



}
