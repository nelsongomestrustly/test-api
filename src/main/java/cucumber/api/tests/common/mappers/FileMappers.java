package cucumber.api.tests.common.mappers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.module.paramnames.ParameterNamesModule;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

import static cucumber.api.tests.common.mappers.ObjectMappers.MAPPER_SIMPLE;

public class FileMappers {

    public static <T> T getFileMappers(String directory, String fileName, Class<T> clazz) throws IOException {

        return MAPPER_SIMPLE.readValue(Files.readString(Path.of(directory + fileName), StandardCharsets.UTF_8), clazz);

    }

}
