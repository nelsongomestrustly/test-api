package cucumber.api.tests.support.common.connectors.resttemplate;

import cucumber.api.tests.configurations.resttemplate.RestTemplateSupplier;
import cucumber.api.tests.configurations.resttemplate.interceptors.StatefulRestTemplateInterceptor;
import cucumber.api.tests.configurations.resttemplate.common.enums.StatefulRestTemplateInterceptorKeyEnums;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.client.RestTemplate;

@Slf4j
@AllArgsConstructor
public final class RestTemplateConnectionManager {

    public static RestTemplate getConnection(StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) {

        StatefulRestTemplateInterceptor.cookieMapKey = statefulRestTemplateInterceptorKeyEnums;

        return getRestTemplate();
    }

    private static RestTemplate getRestTemplate() {
        return RestTemplateSupplier.getRestTemplate.get();
    }

}
