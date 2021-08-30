package cucumber.api.tests.support.cucumber.mappers;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.DefaultDataTableCellTransformer;
import io.cucumber.java.DefaultDataTableEntryTransformer;
import io.cucumber.java.DefaultParameterTransformer;

import java.lang.reflect.Type;

public class CucumberMappers {

    @DefaultDataTableCellTransformer
    @DefaultDataTableEntryTransformer
    @DefaultParameterTransformer
    public static final Object transform(final Object from, final Type to) {
        return new ObjectMapper().convertValue(from, new ObjectMapper().constructType(to));
    }

}
