package support.common.connectors.resttemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.binary.Base64;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import support.common.users.data.TestParticipantDTO;
import java.io.IOException;
import java.nio.charset.Charset;

import static cucumber.api.tests.common.mappers.ObjectMappers.MAPPER_SIMPLE;
import static support.common.connectors.resttemplate.RestTemplateConnectionManager.getConnection;

@Slf4j
public class RestTemplateHttpConnector {


    /**
     * HTTP GET
     */

    public static ResponseEntity<String> httpGet_Return_String(String endpoint) throws IOException {

        log.info("performing http get request to {}", endpoint);

        ResponseEntity<String> forEntity = getConnection().getForEntity(endpoint, String.class);

        log.info("http get request status code {}", forEntity.getStatusCode());

        return forEntity;

    }

    public static ResponseEntity<Object> httpGet(String endpoint) throws IOException {

        log.info("performing http get request to {}", endpoint);

        ResponseEntity<Object> forEntity = getConnection().getForEntity(endpoint, Object.class);

        log.info("http get request status code {}", forEntity.getStatusCode());

        return forEntity;

    }



    /**
     * HTTP POST
     */

    public static ResponseEntity<String> httpPostLogin(String endpoint, TestParticipantDTO testParticipantDTO) throws IOException {
        //remember=true&originalUrl=&username=admin&password=superadmin&timezone=Europe%2FLondon&X-CSRFKey=
        return httpPost(endpoint, testParticipantDTO);
    }

    public static ResponseEntity<Object> httpPost(String endpoint) throws IOException {
        return httpPost(endpoint, MAPPER_SIMPLE);
    }

    public static <E> ResponseEntity<Object> httpPost(String endpoint, E e) throws IOException {
        return httpPost(endpoint, MAPPER_SIMPLE, e);
    }

    public static ResponseEntity<Object> httpPost(String endpoint, ObjectMapper objectMapper) throws IOException {
        return httpPost(endpoint, objectMapper, null);
    }

    public static <E> ResponseEntity<Object> httpPost(String endpoint, ObjectMapper objectMapper, E e) throws IOException {

        log.info("performing http post request to {}", endpoint);

        ResponseEntity<Object> objectResponseEntity = getConnection().postForEntity(endpoint, null, null);

        log.info("http post request status code {}", objectResponseEntity.getStatusCode());

        return objectResponseEntity;

    }


    public static <E> ResponseEntity<String> httpPost(String endpoint, TestParticipantDTO testParticipantDTO) throws IOException {

        log.info("performing http post request to {}", endpoint);

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

        ResponseEntity<String> response = getConnection().postForEntity( endpoint, request , String.class );

        log.info("http post request status code {}", response.getStatusCode());

        return response;

    }


}
