package cucumber.api.tests.support.common.connectors.resttemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import cucumber.api.tests.configurations.resttemplate.common.enums.StatefulRestTemplateInterceptorKeyEnums;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import cucumber.api.tests.support.common.users.data.TestParticipantDTO;
import java.io.IOException;

import static cucumber.api.tests.common.mappers.ObjectMappers.MAPPER_SIMPLE;
import static cucumber.api.tests.support.common.connectors.resttemplate.RestTemplateConnectionManager.getConnection;

@Slf4j
public class RestTemplateHttpConnector {


    /**
     * HTTP GET
     */

    public static ResponseEntity<String> httpGet_Return_String(
            String endpoint,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) {

        log.info("performing http get request to {}", endpoint);

        ResponseEntity<String> forEntity = getConnection(statefulRestTemplateInterceptorKeyEnums).getForEntity(endpoint, String.class);

        log.info("http get request status code {}", forEntity.getStatusCode());

        return forEntity;

    }

    public static ResponseEntity<Object> httpGet(
            String endpoint,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) {

        log.info("performing http get request to {}", endpoint);

        ResponseEntity<Object> forEntity = getConnection(statefulRestTemplateInterceptorKeyEnums).getForEntity(endpoint, Object.class);

        log.info("http get request status code {}", forEntity.getStatusCode());

        return forEntity;

    }



    /**
     *
     * HTTP POST
     * //remember=true&originalUrl=&username=admin&password=superadmin&timezone=Europe%2FLondon&X-CSRFKey=
     *
     */

    public static ResponseEntity<String> httpPostLogin(
            String endpoint,
            TestParticipantDTO testParticipantDTO,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) {
        return httpPost(endpoint, testParticipantDTO, statefulRestTemplateInterceptorKeyEnums);
    }


    public static <E> ResponseEntity<Object> httpPost(
            String endpoint,
            E e,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) throws IOException {
        return httpPost(endpoint, MAPPER_SIMPLE, e, statefulRestTemplateInterceptorKeyEnums);
    }

    public static ResponseEntity<Object> httpPost(
            String endpoint,
            ObjectMapper objectMapper,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) throws IOException {
        return httpPost(endpoint, objectMapper, statefulRestTemplateInterceptorKeyEnums);
    }


    public static <E> ResponseEntity<Object> httpPost(
            String endpoint,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) {

        log.info("performing http post (endpoint) request to {}", endpoint);

        ResponseEntity<Object> objectResponseEntity = getConnection(statefulRestTemplateInterceptorKeyEnums).postForEntity(endpoint, null, null);

        log.info("http post request status code {}", objectResponseEntity.getStatusCode());

        return objectResponseEntity;

    }


    public static <E> ResponseEntity<Object> httpPost(
            String endpoint,
            ObjectMapper objectMapper,
            E e,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) throws IOException {

        log.info("performing http post request to {}", endpoint);

        ResponseEntity<Object> objectResponseEntity = getConnection(statefulRestTemplateInterceptorKeyEnums).postForEntity(endpoint, null, null);

        log.info("http post request status code {}", objectResponseEntity.getStatusCode());

        return objectResponseEntity;

    }


    public static <E> ResponseEntity<String> httpPost(
            String endpoint,
            TestParticipantDTO testParticipantDTO,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) {

        log.info("performing http post (endpoint, testParticipantDTO) request to {}", endpoint);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

        MultiValueMap<String, String> map= new LinkedMultiValueMap<String, String>();
        map.add("remember", "true");
        map.add("username", testParticipantDTO.getUserName().getUser());
        map.add("password", testParticipantDTO.getUserPassword().getPasswword());
        map.add("timezone", "Europe%2FLondon");
        map.add("originalUrl", "");
        map.add("X-CSRFKey", "");

        HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<MultiValueMap<String, String>>(map, headers);

        ResponseEntity<String> response = getConnection(statefulRestTemplateInterceptorKeyEnums).postForEntity( endpoint, request , String.class );

        log.info("http post request status code {}", response.getStatusCode());

        return response;

    }


}
