package cucumber.api.tests.support.common.connectors.resttemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import cucumber.api.tests.common.enums.queries.QueryParametersEnum;
import cucumber.api.tests.configurations.resttemplate.common.enums.StatefulRestTemplateInterceptorKeyEnums;
import cucumber.api.tests.test.merchantgatewayserver.data.dto.EstabilishDataDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import static cucumber.api.tests.support.common.connectors.resttemplate.RestTemplateConnectionManager.getConnection;
import static cucumber.api.tests.support.common.connectors.utils.HttpConnectorsUtils.getEndpointWithQueryParam;
import static cucumber.api.tests.support.common.connectors.utils.HttpConnectorsUtils.getHttpEntityRequest;

@Slf4j
public class RestTemplateHttpConnector {


    /**
     * HTTP GET
     */

    public static ResponseEntity<String> httpGet_Return_String(
            String endpoint,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) {

        log.info("performing http get (String) request to {}", endpoint);

        ResponseEntity<String> forEntity = getConnection(statefulRestTemplateInterceptorKeyEnums).getForEntity(endpoint, String.class);

        log.info("http get (String) request status code {}", forEntity.getStatusCode());

        return forEntity;

    }

    public static ResponseEntity<String> httpGet_Return_String(
            String endpoint,
            Map<QueryParametersEnum, String> queryParam,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) {

        log.info("performing http get (String) request to {}", endpoint);

        String endpointWithQueryParam = getEndpointWithQueryParam(endpoint, queryParam);

        ResponseEntity<String> forEntity = getConnection(statefulRestTemplateInterceptorKeyEnums).getForEntity(endpointWithQueryParam, String.class);

        log.info("http get (String) request status code {}", forEntity.getStatusCode());

        return forEntity;

    }



    public static ResponseEntity<Object> httpGet_Return_Object(
            String endpoint,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) {

        log.info("performing http get (Object) request to {}", endpoint);

        ResponseEntity<Object> forEntity = getConnection(statefulRestTemplateInterceptorKeyEnums).getForEntity(endpoint, Object.class);

        log.info("http get (Object) request status code {}", forEntity.getStatusCode());

        return forEntity;

    }

    public static ResponseEntity<Object[]> httpGet_Return_ObjectList(
            String endpoint,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) {

        log.info("performing http get (Object) request to {}", endpoint);

        ResponseEntity<Object[]> forEntity = getConnection(statefulRestTemplateInterceptorKeyEnums).getForEntity(endpoint, Object[].class);


        log.info("http get (Object) request status code {}", forEntity.getStatusCode());

        return forEntity;

    }


    //https://www.baeldung.com/spring-resttemplate-json-list
    public static ResponseEntity<List<?>> httpGet_Return_ObjectList2(
            String endpoint,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) {

        log.info("performing http get (Object) request to {}", endpoint);

        ResponseEntity<List<?>> forEntity = getConnection(statefulRestTemplateInterceptorKeyEnums).exchange(
                endpoint,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<>() {
                }
        );

        log.info("http get (Object) request status code {}", forEntity.getStatusCode());

        return forEntity;

    }



    /**
     *
     * HTTP POST
     * //remember=true&originalUrl=&username=admin&password=superadmin&timezone=Europe%2FLondon&X-CSRFKey=
     *
     */


    /**
     * POST WITH HEADERS
     */


    public static ResponseEntity<String> httpPostWithFormData(
            String endpoint,
            MultiValueMap<String, String> map,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) {
        return httpPostFormData(endpoint, map, statefulRestTemplateInterceptorKeyEnums);
    }

    //With Test Participant, used most of times to login
    private static <E> ResponseEntity<String> httpPostFormData(
            String endpoint,
            MultiValueMap<String, String> map,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) {

        log.info("performing http post (endpoint, testParticipantDTO) request to {}", endpoint);

        HttpHeaders headers = new HttpHeaders();
        //headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

        HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<MultiValueMap<String, String>>(map, headers);

        ResponseEntity<String> response = getConnection(statefulRestTemplateInterceptorKeyEnums).postForEntity( endpoint, request , String.class );

        log.info("http post request status code {}", response.getStatusCode());

        return response;

    }



    /**
     * POST WITH QUERY PARAMETERS
     */


    public static <E> ResponseEntity<String> httpPost(
            String endpoint,
            Map<QueryParametersEnum, String> queryParam,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) {
        return httPost(endpoint, queryParam, statefulRestTemplateInterceptorKeyEnums);

    }

    public static <E> ResponseEntity<String> httpPost(
            String endpoint,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) {
        return httPost(endpoint, null, statefulRestTemplateInterceptorKeyEnums);
    }


    private static <E> ResponseEntity<String> httPost(
            String endpoint,
            Map<QueryParametersEnum, String> queryParam,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) {

        log.info("performing adding query Parameters to Endpoint {}", endpoint);

        String endpointWithQueryParam = getEndpointWithQueryParam(endpoint, queryParam);

        log.info("performing http post for entity request to {}", endpoint);

        ResponseEntity<String> responseEntity = getConnection(statefulRestTemplateInterceptorKeyEnums).postForEntity(
                endpointWithQueryParam, getHttpEntityRequest(), String.class);

        log.info("http post for entity status code {}", responseEntity.getStatusCode());

        return responseEntity;

    }

    /**
     * POST WITH TOKEN
     */

    public static <E> ResponseEntity<String> httpPostWithToken(
            String endpoint,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) {
        return httPostToken(endpoint, statefulRestTemplateInterceptorKeyEnums);
    }

    private static <E> ResponseEntity<String> httPostToken(
            String endpoint,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) {

        //ResponseEntity<String> exchange = getConnection(statefulRestTemplateInterceptorKeyEnums).exchange(endpoint, HttpMethod.POST, null, String.class);

        HttpHeaders requestHeaders = new HttpHeaders();
        //requestHeaders.setContentType(MediaType.XX);
        //requestHeaders.set("User-Agent", "PostmanRuntime/7.28.4");
        requestHeaders.set("content-type", MediaType.APPLICATION_FORM_URLENCODED.toString());
        requestHeaders.set("accept", MediaType.APPLICATION_JSON.toString());

        HttpEntity<Object> objectHttpEntity = new HttpEntity<>(requestHeaders);

        log.info("performing http post for entity request to {}", endpoint);

        ResponseEntity<String> response =
                getConnection(statefulRestTemplateInterceptorKeyEnums).exchange(endpoint, HttpMethod.POST, objectHttpEntity, String.class);

        ResponseEntity<String> responseEntity = getConnection(statefulRestTemplateInterceptorKeyEnums).postForEntity(
                endpoint, requestHeaders, String.class);

        log.info("http post for entity status code {}", responseEntity.getStatusCode());

        return responseEntity;

    }


    /**
     * POST WITH OBJECT
     */

    public static void testeForObject(String endpoint,
                             EstabilishDataDTO estabilishDataDTO,
                             StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) {

        HttpHeaders headers = new HttpHeaders();
        headers.add("CONTENT_TYPE", "application/x-protostuff");
        headers.add("CONTENT_LENGTH", String.valueOf(estabilishDataDTO.toString().length()));
        headers.add("headerAuth", "Basic QTQ4QjczRjY5NEM0QzhFRTYzMDY6");


        HttpEntity<String> request =
                new HttpEntity<String>(estabilishDataDTO.toString(), headers);

        String personResultAsJsonStr =
                getConnection(statefulRestTemplateInterceptorKeyEnums).postForObject(endpoint, request, String.class);
        try {
            JsonNode root = new ObjectMapper().readTree(personResultAsJsonStr);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

    }



    /**
     * BACKUP
     */

    public static <E> ResponseEntity<E> httPostBackUp(
            String endpoint,
            E e,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) {
        return null;
        //return httPostBackUp(endpoint, MAPPER_SIMPLE, e, statefulRestTemplateInterceptorKeyEnums);
    }

    public static ResponseEntity<Object> httpPostWithLogin(
            String endpoint,
            ObjectMapper objectMapper,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) throws IOException {
        return httpPostWithLogin(endpoint, objectMapper, statefulRestTemplateInterceptorKeyEnums);
    }


    public static <E> ResponseEntity<Object> httpPostWithLogin(
            String endpoint,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) {

        log.info("performing http post (endpoint) request to {}", endpoint);

        ResponseEntity<Object> objectResponseEntity = getConnection(statefulRestTemplateInterceptorKeyEnums).postForEntity(endpoint, null, null);

        log.info("http post request status code {}", objectResponseEntity.getStatusCode());

        return objectResponseEntity;

    }


}

