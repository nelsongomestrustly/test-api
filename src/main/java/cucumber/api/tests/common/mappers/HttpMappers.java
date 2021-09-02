package cucumber.api.tests.common.mappers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import org.springframework.http.ResponseEntity;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


import static cucumber.api.tests.common.mappers.ObjectMappers.MAPPER_SIMPLE;

@Slf4j
public class HttpMappers {

    public static <T> T readRHttpResponse(HttpResponse httpResponse, Class<T> clazz) throws IOException {
        MAPPER_SIMPLE.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return MAPPER_SIMPLE.readValue(EntityUtils.toString(httpResponse.getEntity()), clazz);
    }

    public static String readRHttpResponse(HttpResponse httpResponse) throws IOException {
        return EntityUtils.toString(httpResponse.getEntity(), "UTF-8");
    }

    //public static List readListResponse(ResponseEntity<?> objectResponseEntity) throws IOException {

    //    return new ObjectMapper().readValue(objectResponseEntity.getBody().toString(), new TypeReference<>() {});

    //}

    public static <T> T readListResponse(ResponseEntity<?> objectResponseEntity, TypeReference<T> typeRef) throws JsonProcessingException {

        return new ObjectMapper().readValue(objectResponseEntity.getBody().toString(), typeRef);

    }

    public static <T> T readResponse(ResponseEntity<?> objectResponseEntity, Class<T> clazz) throws JsonProcessingException {

        return new ObjectMapper().readValue(objectResponseEntity.getBody().toString(), clazz);

    }

    public static String readResponse(ResponseEntity<?> objectResponseEntity) throws JsonProcessingException {

        return new ObjectMapper().readValue(objectResponseEntity.getBody().toString(), String.class);

    }



}
