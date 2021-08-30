package cucumber.api.tests.examples;


import java.sql.Timestamp;
import java.util.List;

public abstract class AbstractTestClass {

    /**
     * MAIN TEST URL
     */

    public static final String MAIN_URL = "localhost";
    public static final String MAIN_PORT = "8080";


    /**
     * TEST TAGS
     */

    public static final String TAG_FUNCTIONAL = "functional";
    public static final String TAG_ENVIRONMENT = "environment";


    /**
     * Expect Error Status List
     */
    public static final List<Integer> EXPECT_ERROR_STATUS_LIST = List.of(400, 402, 404, 422, 500);

   public class Example {


        public final List<Timestamp> timestamp_List_1_2_3 = null;


    }


}