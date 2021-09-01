package cucumber.api.tests.support.common.connectors.resttemplate;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import cucumber.api.tests.common.enums.queries.QueryParametersEnum;
import cucumber.api.tests.common.mappers.HttpMappers;
import cucumber.api.tests.configurations.resttemplate.common.enums.StatefulRestTemplateInterceptorKeyEnums;
import cucumber.api.tests.test.merchantdemo.data.dto.PaymentFlowsDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import cucumber.api.tests.support.common.users.data.TestParticipantDTO;
import org.springframework.web.util.UriComponentsBuilder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
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




    public static ResponseEntity<String> httpPostWithFormData(
            String endpoint,
            MultiValueMap<String, String> map,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) {
        return httpPost(endpoint, map, statefulRestTemplateInterceptorKeyEnums);
    }

    //With Test Participant, used most of times to login
    public static <E> ResponseEntity<String> httpPost(
            String endpoint,
            MultiValueMap<String, String> map,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) {

        log.info("performing http post (endpoint, testParticipantDTO) request to {}", endpoint);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

        HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<MultiValueMap<String, String>>(map, headers);

        ResponseEntity<String> response = getConnection(statefulRestTemplateInterceptorKeyEnums).postForEntity( endpoint, request , String.class );

        log.info("http post request status code {}", response.getStatusCode());

        return response;

    }





    public static <E> ResponseEntity<String> httpPostForObject(
            String endpoint,
            Map<QueryParametersEnum, String> queryParam,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) {
        String endpointWithQueryParam = getEndpointWithQueryParam(endpoint, queryParam);
        return httPost(endpointWithQueryParam, statefulRestTemplateInterceptorKeyEnums);

    }

    public static <E> ResponseEntity<String> httpPostForObject(
            String endpoint,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) {
        return httPost(endpoint, statefulRestTemplateInterceptorKeyEnums);
    }


    private static <E> ResponseEntity<String> httPost(
            String endpoint,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) {

        log.info("performing http post for entity request to {}", endpoint);

        ResponseEntity<String> responseEntity = getConnection(statefulRestTemplateInterceptorKeyEnums).postForEntity(
                endpoint, getHttpEntityRequest(), String.class);

        log.info("http post for entity status code {}", responseEntity.getStatusCode());

        return responseEntity;

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

