package cucumber.api.tests.scenarios.merchantdemo.merchantdemo;

import cucumber.api.tests.CucumberTest;
import cucumber.api.tests.common.predicates.GenericPredicates;
import cucumber.api.tests.support.cucumber.context.MyTestContext;
import cucumber.api.tests.test.merchantdemo.actions.get.merchantdemo.MerchantDemoGetHttpActions;
import cucumber.api.tests.test.merchantdemo.common.suppliers.dto.MerchantDemoCreateSignatureDTOSameSupplier;
import cucumber.api.tests.test.merchantdemo.data.dto.MerchantCreateSignatureDTO;
import cucumber.api.tests.test.merchantdemo.data.dto.MerchantSignatureDTO;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;

import java.io.IOException;

import static cucumber.api.tests.configurations.resttemplate.common.enums.StatefulRestTemplateInterceptorKeyEnums.MERCHANT_DEMO_INTERCEPTOR_MAP_KEY;

@Slf4j
public class MerchantDemoSignature_FT extends CucumberTest {


    //TODO GET METCHANT INFO FROM CONTEXT
    //Merchant-Demo
    //GlobexDemoController
    //createSignature
    @When("Access Merchant Demo and Create using {string} a Valid Signature {string}")
    public void accessMerchantDemoAndCreateUsingAValidSignature(String fileName, String expectMerchantDemoCreateSignatureHttpStatus) throws IOException {

        //Get AdminConsoleSearchTransactionsDTO from Sample Files
        MerchantCreateSignatureDTO merchantCreateSignatureDTO
                = MerchantDemoCreateSignatureDTOSameSupplier.getSampleAdminConsoleSearchTransactionsDTO(fileName);

        MerchantSignatureDTO merchantDemoSignature = MerchantDemoGetHttpActions.getMerchantDemoSignature(
                merchantCreateSignatureDTO,
                Integer.parseInt(expectMerchantDemoCreateSignatureHttpStatus),
                MERCHANT_DEMO_INTERCEPTOR_MAP_KEY);

        MyTestContext.getMyTestContext().merchantDemoManager.addMerchantSignatureDTO(merchantDemoSignature);

    }


    @Then("The user should have a Valid Signature")
    public void theUserShouldHaveAValidSignature() {

        Assertions.assertTrue(GenericPredicates.checkIfNullOrEmpty.negate().test(MyTestContext.getMyTestContext().merchantDemoManager.getMerchantSignatureDTOList()));

    }

}
