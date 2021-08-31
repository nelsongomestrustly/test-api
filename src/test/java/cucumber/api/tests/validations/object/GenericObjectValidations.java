package cucumber.api.tests.validations.object;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.read.ListAppender;
import cucumber.api.tests.common.predicates.GenericPredicates;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;

import static java.util.Objects.nonNull;

@Slf4j
public class GenericObjectValidations {

    public static void validateIfAllFieldAreNotNullNotEmpty(List<?> objectList) {

        Assert.assertFalse(GenericPredicates.checkIfNullOrEmpty.test(objectList));
        Assert.assertTrue(GenericPredicates.allFieldAreNotNullNotEmpty.test(objectList));

    }

}
