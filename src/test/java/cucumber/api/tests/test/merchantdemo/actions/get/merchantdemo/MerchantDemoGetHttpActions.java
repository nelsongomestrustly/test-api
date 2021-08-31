package cucumber.api.tests.test.merchantdemo.actions.get.merchantdemo;


import cucumber.api.tests.configurations.resttemplate.common.enums.StatefulRestTemplateInterceptorKeyEnums;
import cucumber.api.tests.test.merchantdemo.connectors.merchantdemo.MerchantDemoConnector;
import cucumber.api.tests.validations.resttemplate.RestTemplateValidations;
import org.springframework.http.ResponseEntity;


public class MerchantDemoGetHttpActions {


    public static void getMerchantDemo(
            Integer expectedStatus,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums)  {

        ResponseEntity<String> responseEntity = MerchantDemoConnector.getMerchantDemo(statefulRestTemplateInterceptorKeyEnums);

        RestTemplateValidations.validateStatus(expectedStatus, responseEntity);

    }




}
