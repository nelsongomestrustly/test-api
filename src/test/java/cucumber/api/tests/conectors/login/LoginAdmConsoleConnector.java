package cucumber.api.tests.conectors.login;

import cucumber.api.tests.configurations.resttemplate.common.enums.StatefulRestTemplateInterceptorKeyEnums;
import cucumber.api.tests.conectors.admconsole.endpoints.AdmConEndpoint;
import cucumber.api.tests.common.login.suppliers.LoginSuppliers;
import org.springframework.http.ResponseEntity;
import cucumber.api.tests.support.common.connectors.resttemplate.RestTemplateHttpConnector;
import cucumber.api.tests.support.common.users.data.TestParticipantDTO;

import java.io.IOException;

import static cucumber.api.tests.conectors.admconsole.endpoints.AdmConTransactionsEndpoint.ADM_CON_TRANSACTIONS_ENDPOINT;

public class LoginAdmConsoleConnector {

    protected static ResponseEntity<String> login(
            LoginAdmConsoleEndpoint loginAdmConsoleEndpoint,
            TestParticipantDTO testParticipantDTO,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) throws IOException {

        String url = loginAdmConsoleEndpoint.getEndpoint();
        return RestTemplateHttpConnector.httpPostWithFormData(url, LoginSuppliers.getLoginMultiValueMapForHttpRequest(testParticipantDTO), statefulRestTemplateInterceptorKeyEnums);

    }


    protected static ResponseEntity<String> logout(
            LoginAdmConsoleEndpoint loginAdmConsoleEndpoint,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) {

        String url = loginAdmConsoleEndpoint.getEndpoint();
        return RestTemplateHttpConnector.httpGet_Return_String(url, statefulRestTemplateInterceptorKeyEnums);

    }


    protected static ResponseEntity<String> isTheUserSessionExpired(
            LoginAdmConsoleEndpoint loginAdmConsoleEndpoint,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) {

        String url = loginAdmConsoleEndpoint.getEndpoint();
        return RestTemplateHttpConnector.httpGet_Return_String(url, statefulRestTemplateInterceptorKeyEnums);

    }


    protected static ResponseEntity<String> canAccess(
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) {

        String url = ADM_CON_TRANSACTIONS_ENDPOINT.getEndpoint();
        return RestTemplateHttpConnector.httpGet_Return_String(url, statefulRestTemplateInterceptorKeyEnums);

    }



}
