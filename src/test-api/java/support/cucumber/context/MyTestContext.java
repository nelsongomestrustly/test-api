package support.cucumber.context;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
public class MyTestContext extends BaseCucumberContext {


    private static MyTestContext myTestContext;

    private MyTestContext() {
    }

    public static MyTestContext getMyTestContext() {
        if(myTestContext == null) {
            myTestContext = new MyTestContext();
        }

        return myTestContext;
    }

    public static MyTestContext resetMyTestContext() {

        myTestContext = new MyTestContext();
        return myTestContext;

    }


}
