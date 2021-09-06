package cucumber.api.tests.test.bankpanel.connectors;


import cucumber.api.tests.common.enums.headers.HttpHeadersEnum;
import cucumber.api.tests.configurations.resttemplate.common.enums.StatefulRestTemplateInterceptorKeyEnums;
import cucumber.api.tests.data.dto.bankpanel.BankPanelRedirectUrlDTO;
import cucumber.api.tests.support.common.connectors.apache.ApacheConnectionManager;
import cucumber.api.tests.support.common.connectors.resttemplate.RestTemplateHttpConnector;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;

import java.io.IOException;
import java.util.List;

@Slf4j
public class BankPanelConnector {

    public static ResponseEntity<String> getBankPanelLoginInfoDTO(
            BankPanelRedirectUrlDTO bankRedirectUrlDT,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) {

        return RestTemplateHttpConnector.httpPost(
                bankRedirectUrlDT.getRedirectURL(),
                List.of(HttpHeadersEnum.ACCEPT_APPLICATION_JSON_APP_REACT),
                statefulRestTemplateInterceptorKeyEnums);

    }


    public static ResponseEntity<String> getBankPanelLoginHomePageDTO(
            BankPanelRedirectUrlDTO bankRedirectUrlDT,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) {

        return RestTemplateHttpConnector.httpPost(
                bankRedirectUrlDT.getRedirectURL(),
                statefulRestTemplateInterceptorKeyEnums);

    }


}
