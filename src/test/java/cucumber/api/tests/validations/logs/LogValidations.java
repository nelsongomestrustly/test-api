package cucumber.api.tests.validations.logs;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.read.ListAppender;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;

import static java.util.Objects.nonNull;

@Slf4j
public class LogValidations {

    /**
     * Help Validate Log Classes
     */

    public static Function<Level, List<ILoggingEvent>> startGetLoggerMessagesWithLevel = (level) -> {
        ch.qos.logback.classic.Logger root = (ch.qos.logback.classic.Logger) LoggerFactory.getLogger(ch.qos.logback.classic.Logger.ROOT_LOGGER_NAME);

        if (nonNull(level)) {
            root.setLevel(level);
        }

        ListAppender<ILoggingEvent> listAppender = new ListAppender<>();
        listAppender.start();

        root.addAppender(listAppender);

        return listAppender.list;
    };


    public static BiConsumer<List<ILoggingEvent>, String> loggingEventsContainsString =
            (list, string) -> {
                Assertions.assertTrue(list.stream().anyMatch(x -> x.getMessage().contains(string)));
            };

}
