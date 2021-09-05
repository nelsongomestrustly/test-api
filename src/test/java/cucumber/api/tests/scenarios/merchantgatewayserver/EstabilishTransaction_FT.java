package cucumber.api.tests.scenarios.merchantgatewayserver;

import cucumber.api.tests.CucumberTest;
import cucumber.api.tests.data.dto.merchantdemo.MerchantBasicInfoDTO;
import cucumber.api.tests.data.dto.merchantdemo.MerchantCreateSignatureDTO;
import cucumber.api.tests.support.cucumber.context.MyTestContext;
import cucumber.api.tests.test.merchantgatewayserver.actions.transactions.MerchantGatwayServerActions;
import cucumber.api.tests.samplefiles.common.suppliers.merchantgatewayserver.MerchantGatewaySeverEstabilishTransactionsDTOFileSampleSupplier;
import cucumber.api.tests.data.dto.merchantgatewayserver.EstabilishDataDTO;
import io.cucumber.java.en.Then;

import java.io.IOException;

import static cucumber.api.tests.configurations.resttemplate.common.enums.StatefulRestTemplateInterceptorKeyEnums.MERCHANT_GATEWAY_SERVER_INTERCEPTOR_MAP_KEY;

/**
 *     Merchante Gateway Server
 *     Transaction Admin Controller
 *
 *     Method
 *     @POST
 *     @SkipSecurityCheck
 *     @Consumes("application/x-protostuff")
 *        @Produces({"application/json;qs=1", "application/x-protostuff", "application/x-protobuf", "application/xml;qs=.5"})
 *    @Path("establish")
 *    public EstablishTransactionResponse establishTransaction(@HeaderParam("Authorization") String headerAuth,
 *                                                             @QueryParam("createTransaction") Boolean createTransaction,
 *                                                             @QueryParam("grp") String grp,
 * 															 EstablishData data) {
 * 		MDC.remove("transactionId");
 *
 * 		EstablishTransactionRequest request = new EstablishTransactionRequest();
 * 		request.setCreateTransaction(createTransaction != null ? createTransaction : true);
 * 		request.setGrp(grp);
 * 		request.setData(data);
 *
 * 		ClientUtil.Authorization auth = ClientUtil.getAuthorization(headerAuth);
 * 		request.setRequestSignature(auth.accessKey);
 * 		request.setAccessId(auth.accessId);
 *
 * 		return establishTransaction(request);
 *    }
 */
public class EstabilishTransaction_FT extends CucumberTest {


    @Then("The user estabilish a new Transaction using {string} and Expect Http Status {string}")
    public void theUserEstabilishANewTransactionUsingAndExpectHttpStatus(String estabilishDataFileName, String expectMerchantInfoHttpStatus) throws IOException {

        //Getting Basic Info
        MerchantBasicInfoDTO merchantBasicInfoDTO = MyTestContext.getMyTestContext().merchantDemoManager.getMerchantBasicInfoDTOList().get(0);

        //Getting Basic Info
        MerchantCreateSignatureDTO merchantCreateSignatureDTO = MyTestContext.getMyTestContext().merchantDemoManager.getMerchantCreateSignatureDTOList().get(0);

        //Getting Estabilish Transaction
        EstabilishDataDTO estabilishDataDTO = MerchantGatewaySeverEstabilishTransactionsDTOFileSampleSupplier.getEstabilishDataDTO(estabilishDataFileName, merchantCreateSignatureDTO, merchantBasicInfoDTO);

        //Process Information
        String s = MerchantGatwayServerActions.estabilishTransactions(estabilishDataDTO, Integer.parseInt(expectMerchantInfoHttpStatus), MERCHANT_GATEWAY_SERVER_INTERCEPTOR_MAP_KEY);

        //Adding to Context
        //Adding answer to Context

    }

}
