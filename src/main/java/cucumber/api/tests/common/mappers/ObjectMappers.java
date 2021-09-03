package cucumber.api.tests.common.mappers;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.module.paramnames.ParameterNamesModule;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

@Slf4j
public class ObjectMappers {

    public static final ObjectMapper MAPPER_SIMPLE = new ObjectMapper().registerModule(
            new ParameterNamesModule()).registerModule(new Jdk8Module()).registerModule(new JavaTimeModule()).findAndRegisterModules();

    public static final ObjectMapper MAPPER_DATE_AWARE =  new ObjectMapper().setSerializationInclusion(
            JsonInclude.Include.NON_DEFAULT).registerModule(new JavaTimeModule()).disable(
                    SerializationFeature.WRITE_DATES_AS_TIMESTAMPS).findAndRegisterModules();


    public static <T> String objectToJSON(T object) {

        String json = null;
        try {
            json = new ObjectMapper().writeValueAsString(object);
        } catch (JsonProcessingException e) {
            log.error("Error During objectToJSON : " + object);
        }
        return json;

    }

    public static <T> T jsonToObject(String json, Class<T> tipoClass) {

        T objectReturn = null;
        try {
            objectReturn = new ObjectMapper().readValue(json, tipoClass);
        } catch (JsonProcessingException e) {
            log.error("Error During jsonToObject : " + json + " / " + tipoClass);
        }
        return objectReturn;

    }

}
