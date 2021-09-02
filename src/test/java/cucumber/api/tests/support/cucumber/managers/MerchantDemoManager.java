package cucumber.api.tests.support.cucumber.managers;

import cucumber.api.tests.test.merchantdemo.data.dto.MerchantBasicInfoDTO;
import cucumber.api.tests.test.merchantdemo.data.dto.MerchantCreateSignatureDTO;
import cucumber.api.tests.test.merchantdemo.data.dto.PaymentFlowDTO;
import cucumber.api.tests.test.merchantdemo.data.dto.PaymentFlowsDTO;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Data
public class MerchantDemoManager {

    private List<MerchantCreateSignatureDTO> merchantCreateSignatureDTOList;

    private List<MerchantBasicInfoDTO> merchantBasicInfoDTOList;

    private List<PaymentFlowsDTO> paymentFlowsDTOList;

    private List<PaymentFlowDTO> paymentFlowDTOList;

    public MerchantDemoManager() {
        this.merchantBasicInfoDTOList = new ArrayList<>();
        this.paymentFlowsDTOList = new ArrayList<>();
        this.paymentFlowDTOList = new ArrayList<>();
        this.merchantCreateSignatureDTOList = new ArrayList<>();
    }


    /**
     * MerchantInfoDTO
     */

    public void addMerchantInfoDTO(MerchantBasicInfoDTO merchantBasicInfoDTO) {
        merchantBasicInfoDTOList.add(merchantBasicInfoDTO);
    }

    public void addAllMerchantInfoDTO(List<MerchantBasicInfoDTO> merchantBasicInfoDTOS) {
        merchantBasicInfoDTOList.addAll(merchantBasicInfoDTOS);
    }

    public MerchantBasicInfoDTO getFirstMerchantInfoDTO() {
        return merchantBasicInfoDTOList.get(0);
    }

    public MerchantBasicInfoDTO getLastMerchantInfoDTO() {
        return merchantBasicInfoDTOList.get(merchantBasicInfoDTOList.size() -1);
    }


    /**
     * MerchantCreateSignatureDTO
     */

    public void addMerchantCreateSignatureDTO(MerchantCreateSignatureDTO merchantCreateSignatureDTO) {
        merchantCreateSignatureDTOList.add(merchantCreateSignatureDTO);
    }

    public void addAllMerchantCreateSignatureDTO(List<MerchantCreateSignatureDTO> merchantCreateSignatureDTOS) {
        merchantCreateSignatureDTOList.addAll(merchantCreateSignatureDTOS);
    }

    public MerchantCreateSignatureDTO getFirstMerchantCreateSignatureDTO() {
        return merchantCreateSignatureDTOList.get(0);
    }

    public MerchantCreateSignatureDTO getLastMerchantCreateSignatureDTO() {
        return merchantCreateSignatureDTOList.get(merchantCreateSignatureDTOList.size() -1);
    }



    /**
     * PaymentFlowsDTO
     */

    public void addPaymentFlowsDTO(PaymentFlowsDTO paymentFlowsDTO) {
        paymentFlowsDTOList.add(paymentFlowsDTO);
    }

    public void addAllPaymentFlowsDTO(List<PaymentFlowsDTO> paymentFlowsDTOS) {
        paymentFlowsDTOList.addAll(paymentFlowsDTOS);
    }

    public PaymentFlowsDTO getFirstPaymentFlowsDTO() {
        return paymentFlowsDTOList.get(0);
    }

    public PaymentFlowsDTO getLastPaymentFlowsDTO() {
        return paymentFlowsDTOList.get(paymentFlowsDTOList.size() -1);
    }


    /**
     * PaymentFlowDTO
     */

    public void addPaymentFlowDTO(PaymentFlowDTO paymentFlowDTO) {
        paymentFlowDTOList.add(paymentFlowDTO);
    }

    public void addAllPaymentFlowDTO(List<PaymentFlowDTO> paymentFlowDTOS) {
        paymentFlowDTOS.addAll(paymentFlowDTOS);
    }

    public PaymentFlowDTO getFirstPaymentFlowDTO() {
        return paymentFlowDTOList.get(0);
    }

    public PaymentFlowDTO getLastPaymentFlowDTO() {
        return paymentFlowDTOList.get(paymentFlowDTOList.size() -1);
    }


}
