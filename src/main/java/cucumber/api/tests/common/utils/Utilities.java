package cucumber.api.tests.common.utils;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import static java.lang.Integer.parseInt;

@Slf4j
public class Utilities {

    public static final String firstDay = "01";
    public static final String firstMonth = "January";
    public static final DateTimeFormatter dateFormat_MMM = DateTimeFormatter.ofPattern("MMM");
    public static final DateTimeFormatter dateFormat_ddMMMMyyyy = DateTimeFormatter.ofPattern("ddMMMMyyyy");
    public static final DateTimeFormatter dateFormat_ddMMMyyyy = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
    public static final DateTimeFormatter dateFormat_dMMMyyyy = DateTimeFormatter.ofPattern("d-MMM-yyyy");
    public static final DateTimeFormatter dateFormat_yyyy_MM_dd = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    public static final DateTimeFormatter dateFormat_yyyy_dd_MM = DateTimeFormatter.ofPattern("yyyy-dd-MM");
    public static final DateTimeFormatter dateFormat_dd_MM_yyyy = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    public static final DateTimeFormatter dateFormat_dd_MM_yyyy_slash = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public static final DateTimeFormatter dateFormat_MM_dd_yyyy = DateTimeFormatter.ofPattern("MM-dd-yyyy");
    public static final DateTimeFormatter dateFormat_MM_yyyy_dd = DateTimeFormatter.ofPattern("MM-yyyy-dd");
    public static final DateTimeFormatter dateFormat_dd_yyyy_MM = DateTimeFormatter.ofPattern("dd-yyyy-MM");
    public static final DateTimeFormatter dateFormat_DD_MM = DateTimeFormatter.ofPattern("dd/MM");
    public static final DateTimeFormatter dateFormat_dd_MMMM = DateTimeFormatter.ofPattern("dd MMMM");
    public static final DateTimeFormatter dateFormat_DD = DateTimeFormatter.ofPattern("dd");
    public static final DateTimeFormatter dateFormat_DD_MMM = DateTimeFormatter.ofPattern("dd MMM");
    public static final DateTimeFormatter timeFormat_HH_MM = DateTimeFormatter.ofPattern("HH:mm");
    public static final DateTimeFormatter timeFormat_HH = DateTimeFormatter.ofPattern("HH");
    public static final DateTimeFormatter timeFormat_MM = DateTimeFormatter.ofPattern("mm");
    public static final DateTimeFormatter dateTimeFormat_d_MMM_yyyy_HH_mm = DateTimeFormatter.ofPattern("d-MMM-yyyy HH:mm");
    public static final DateTimeFormatter dateTimeFormat_dd_MM_yyyy_HH_mm_ss = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    public static final DateTimeFormatter dateTimeFormat_dd_MM_HH_mm = DateTimeFormatter.ofPattern("dd/MM - HH:mm");
    public static final String intervalFormatterTo = "%s to %s";
    public static final String intervalFormatterDash = "%s - %s";
    public static final String intervalFormatterSpace = "%s %s";
    public static final String decimalFormat_decimalPlaces4 = "#.0000";
    public static final String timeZoneEuropeLondon = "Europe/London";
    public static final String timeZoneUTC = "UTC";
    private static String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    public static void pause(long time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException ex) {
            log.info("InterruptedException : ", ex);
        }
    }

    public static double getRandomDoubleInRange(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return min + (max - min) * r.nextDouble();
    }

    public static long getDateDifference(ChronoUnit chronoUnit, LocalDate date1, LocalDate date2) {
        return YearMonth.from(date1).until(date2, chronoUnit);
    }

    public static int getRandomIntInRange(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.ints(min, (max + 1)).findFirst().getAsInt();
    }

    public static String getRandomAlphanumericString(int count) {
        StringBuilder builder = new StringBuilder();
        while (count-- != 0) {
            int character = (int) (Math.random() * ALPHA_NUMERIC_STRING.length());
            builder.append(ALPHA_NUMERIC_STRING.charAt(character));
        }
        return builder.toString();
    }

    public static Enum getNewRandomEnum(Enum currentValue, Enum[] possibleValues) {
        //generate a random and different from current value
        var randomValue = possibleValues[Utilities.getRandomIntInRange(0, possibleValues.length - 1)];
        while (currentValue.equals(randomValue)) {
            randomValue = possibleValues[Utilities.getRandomIntInRange(0, possibleValues.length - 1)];
        }
        return randomValue;
    }

    public static String capitalizeString(String str) {
        StringBuffer s = new StringBuffer();
        // Declare a character of space
        // To identify that the next character is the starting
        // of a new word
        char ch = ' ';
        for (int i = 0; i < str.length(); i++) {

            // If previous character is space and current
            // character is not space then it shows that
            // current letter is the starting of the word
            if (ch == ' ' && str.charAt(i) != ' ')
                s.append(Character.toUpperCase(str.charAt(i)));
            else
                s.append(str.charAt(i));
            ch = str.charAt(i);
        }
        // Return the string with trimming
        return s.toString().trim();
    }

    // Returns dates interval in a format "dd/MM to dd/MM"
    public static String getDatesIntervalFormat(LocalDate startDate, DateTimeFormatter startDateFormatter, LocalDate endDate, DateTimeFormatter endDateFormatter, String formatter) {
        return String.format(formatter, startDate.format(startDateFormatter), endDate.format(endDateFormatter));
    }

    public static String getDateFormat(LocalDate date, DateTimeFormatter dateFormatter) {
        return String.format("%s", date.format(dateFormatter));
    }

    // Returns timestamp in a format "dd/MM - HH:mm"
    public static String getTimeStampFormat(LocalDateTime timeStamp, DateTimeFormatter dateFormatter, DateTimeFormatter timeFormatter, String formatter) {
        return String.format(formatter, timeStamp.format(dateFormatter), timeStamp.format(timeFormatter));
    }

    public static LocalDateTime getDateTimeWithTimezone(LocalDateTime timeStamp, String timeZone) {
        ZonedDateTime instant = ZonedDateTime.of(timeStamp, ZoneId.systemDefault());
        return instant.withZoneSameInstant(ZoneId.of(timeZone)).toLocalDateTime();
    }

    public static String getIntWithCommaSeparator(int number) {
        DecimalFormat df = new DecimalFormat();
        return df.format(number);
    }

    public static Long getTimeDifferenceInSeconds(LocalDateTime fromDateTime, LocalDateTime toDateTime) {
        LocalDateTime tempDateTime = LocalDateTime.from(fromDateTime);
        long seconds = tempDateTime.until(toDateTime, ChronoUnit.SECONDS);

        return seconds;
    }

    //Given two dates, it assures that 1 minute passes between them
    public static void waitForMinuteDifference(LocalDateTime fromDateTime, LocalDateTime toDateTime) {
        Long secondDiff = Utilities.getTimeDifferenceInSeconds(fromDateTime, toDateTime);

        if (secondDiff < 60) {
            Utilities.pause((60 - secondDiff) * 1000);
        }
    }

    public static void waitForMinuteToChange() {
        LocalDateTime from = LocalDateTime.now();
        //Set the target to next minute and zero seconds
        LocalDateTime to =  from.plusMinutes(1).withSecond(0);
        Long secondDiff = Utilities.getTimeDifferenceInSeconds(from, to);

        log.info("Difference between dates from '{}' to '{}' is '{}'", from, to, secondDiff);
        if (secondDiff > 0) {
            Utilities.pause(secondDiff * 1000);
        }
    }

    public static boolean areListsEqual(List<String> firstList, List<String> secondList) {
        firstList.replaceAll(String::toUpperCase);
        secondList.replaceAll(String::toUpperCase);
        Collections.sort(firstList);
        Collections.sort(secondList);
        return firstList.equals(secondList);
    }

    public static Double calculateAvgNumber(double[] numbers, int precisionPoints) {
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return roundDoubleNumber(sum / (double) numbers.length, precisionPoints);
    }

    private static double roundDoubleNumber(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        Double result = BigDecimal.valueOf(value)
                .setScale(places, RoundingMode.HALF_UP)
                .doubleValue();
        return result.doubleValue();
    }

    public static String getNormalizedPath(String path) {
        Path filePath = Paths.get(path);
        return filePath.normalize().toString() + "/";
    }

    public static List<String> getElementsThatAreNotInTheList(List<String> allElements, List<String> listToCompareAgainst) {
        List<String> newList = new ArrayList<>();
        allElements.forEach(p -> {
            if (!listToCompareAgainst.contains(p)) {
                newList.add(p);
            }
        });

        return newList;
    }

    /*
   Function that get startDate and a String ex:"1D+1M+1Y", "-(1D+1M+1Y)". Translate the string and add or subtract the value needed to the startDate var
       D = days, M = month, Y = year;
       ex:
       parseString = "1D", it should add 1 day to the LocalDate startDate
       parseString = "-1D", it should subtract 1 day from the LocalDate startDate
       parseString = "1D+1Y", it should add 1 day and 1 year to the startDate
       parseString = "-(1D+1Y)", it should subtract 1 day and 1 year from the startDate
       parseString = "1D8YM", this will fail as there are more letters than the recommended and no delimiter "+" between them
       parseString = "1D2", this will fail as the last char is not a letter in the case of D, M, Y.

       Additionally if we want to parse custom dates then we require the following format
       E.g. [01-01-1969] ->  01-01-1969.
       The left and right square bracket will be stripped out.
       Those are indicators for this method that will trigger that we wish to enter a custom date.
    */
    public static LocalDate calculateDateFromString(LocalDate startDate, String parseString) {
        var dateFinal = LocalDate.of(startDate.getYear(), startDate.getMonth(), startDate.getDayOfMonth());

        var arrayString = parseString.toUpperCase().split("\\+");

        String start = arrayString[0];
        String end = arrayString[(arrayString.length - 1)];
        char leftBracket = start.charAt(0);
        char rightBracket = end.charAt(end.length() - 1);

        if (start.startsWith("-") || start.startsWith("-(")) {
            if (start.startsWith("-(") && end.endsWith(")")) {
                arrayString[0] = start.replace("-(", "");
                arrayString[arrayString.length - 1] = end.replace(")", "");
            } else {
                arrayString[0] = start.replace("-", "");
            }
            return subtractTimeUnits(dateFinal, arrayString);
        }

        if (leftBracket == '[' && rightBracket == ']') {
            return LocalDate.parse(parseString.substring(1, parseString.length() - 1), dateFormat_dd_MM_yyyy);
        } else {
            return addTimeUnits(dateFinal, arrayString);
        }
    }

    private static LocalDate subtractTimeUnits(LocalDate dateFinal, String[] arrayString) {
        for (var string : arrayString) {

            int valueOfDate = parseInt(string.replaceAll("[^0-9]", ""));
            char dateChar = string.charAt(string.length() - 1);

            switch (dateChar) {
                case 'D':
                    dateFinal = dateFinal.minusDays(valueOfDate);
                    break;
                case 'M':
                    dateFinal = dateFinal.minusMonths(valueOfDate);
                    break;
                case 'Y':
                    dateFinal = dateFinal.minusYears(valueOfDate);
                    break;
                default:
                    throw new IllegalArgumentException("The format to decrease date is incorrect ex. 1D or 1M or 1Y");
            }
        }
        return dateFinal;
    }

    private static LocalDate addTimeUnits(LocalDate dateFinal, String[] arrayString) {
        for (var string : arrayString) {

            int valueOfDate = parseInt(string.replaceAll("[^0-9]", ""));
            char dateChar = string.charAt(string.length() - 1);

            switch (dateChar) {
                case 'D':
                    dateFinal = dateFinal.plusDays(valueOfDate);
                    break;
                case 'M':
                    dateFinal = dateFinal.plusMonths(valueOfDate);
                    break;
                case 'Y':
                    dateFinal = dateFinal.plusYears(valueOfDate);
                    break;
                default:
                    throw new IllegalArgumentException("The format to increase date is incorrect ex. 1D or 1M or 1Y");
            }
        }
        return dateFinal;
    }

    /**
     *
     * @return

    public static LocalDate convertThreeTenDateToJavaDate(org.threeten.bp.LocalDate date) {
        return LocalDate.of(date.getYear(), date.getMonthValue(), date.getDayOfMonth());
    }

    public static org.threeten.bp.LocalDate convertJavaDateToThreeTenDate(LocalDate date) {
        return org.threeten.bp.LocalDate.of(date.getYear(), date.getMonthValue(), date.getDayOfMonth());
    }

    public static org.threeten.bp.OffsetDateTime convertJavaDateToThreeTenOffsetDateTime(LocalDate date) {
        org.threeten.bp.LocalDate convertedDate = convertJavaDateToThreeTenDate(date);
        return org.threeten.bp.OffsetDateTime.of(convertedDate, org.threeten.bp.LocalTime.NOON, org.threeten.bp.ZoneOffset.UTC);
    }

    public static LocalDate epochSecondsToLocalDate(Long epoch) {
        return Instant.ofEpochSecond(epoch).atOffset(ZoneOffset.UTC).toLocalDate();
    }

     */

    public static Long localDateToEpochSeconds(LocalDate localDate) {
        return localDate.toEpochSecond(LocalTime.NOON, ZoneOffset.UTC);
    }

    public static LocalDateTime getTimestamp(String timestamp, DateTimeFormatter format) {
        DateTimeFormatterBuilder formatter = new DateTimeFormatterBuilder()
                .append(format)
                .parseDefaulting(ChronoField.YEAR_OF_ERA, Year.now().getValue());
        return LocalDateTime.parse(timestamp, formatter.toFormatter());
    }

    public static LocalDate getDate(String timestamp, DateTimeFormatter format) {
        DateTimeFormatterBuilder formatter = new DateTimeFormatterBuilder()
                .append(format)
                .parseDefaulting(ChronoField.YEAR_OF_ERA, Year.now().getValue());
        return LocalDate.parse(timestamp, formatter.toFormatter());
    }

    public static Number convertStringToNumber(String value, DecimalFormat decimalFormat) {
        try {
            return decimalFormat.parse(value);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return -1;
    }

    public static String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
