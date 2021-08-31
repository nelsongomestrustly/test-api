package cucumber.api.tests.common.mappers;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import org.springframework.http.ResponseEntity;

import java.io.IOException;
import java.util.List;

import static cucumber.api.tests.common.mappers.ObjectMappers.MAPPER_SIMPLE;

public class HttpMappers {

    public static <T> T readResponse(HttpResponse httpResponse, Class<T> clazz) throws IOException {
        MAPPER_SIMPLE.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return MAPPER_SIMPLE.readValue(EntityUtils.toString(httpResponse.getEntity()), clazz);
    }

    public static String readResponse(HttpResponse httpResponse) throws IOException {
        return EntityUtils.toString(httpResponse.getEntity(), "UTF-8");
    }

    public static <T> List<T> readResponse(ResponseEntity<?> objectResponseEntity) throws IOException {
        return new ObjectMapper().readValue(objectResponseEntity.getBody().toString(), new TypeReference<>() {});
    }

}
