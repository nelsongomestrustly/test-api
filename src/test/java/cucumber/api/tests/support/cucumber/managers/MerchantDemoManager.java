package cucumber.api.tests.support.cucumber.managers;

import cucumber.api.tests.test.merchantdemo.data.dto.MerchantInfoDTO;
import cucumber.api.tests.test.merchantdemo.data.dto.MerchantSignatureDTO;
import cucumber.api.tests.test.merchantdemo.data.dto.PaymentFlowDTO;
import cucumber.api.tests.test.merchantdemo.data.dto.PaymentFlowsDTO;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Data
public class MerchantDemoManager {

    private List<MerchantSignatureDTO> merchantSignatureDTOList;

    private List<MerchantInfoDTO> merchantInfoDTOList;

    private List<PaymentFlowsDTO> paymentFlowsDTOList;

    private List<PaymentFlowDTO> paymentFlowDTOList;

    public MerchantDemoManager() {
        this.merchantInfoDTOList = new ArrayList<>();
        this.paymentFlowsDTOList = new ArrayList<>();
        this.paymentFlowDTOList = new ArrayList<>();
        this.merchantSignatureDTOList = new ArrayList<>();
    }


    /**
     * MerchantInfoDTO
     */

    public void addMerchantInfoDTO(MerchantInfoDTO merchantInfoDTO) {
        merchantInfoDTOList.add(merchantInfoDTO);
    }

    public void addAllMerchantInfoDTO(List<MerchantInfoDTO> merchantInfoDTOS) {
        merchantInfoDTOList.addAll(merchantInfoDTOS);
    }

    public MerchantInfoDTO getFirstMerchantInfoDTO() {
        return merchantInfoDTOList.get(0);
    }

    public MerchantInfoDTO getLastMerchantInfoDTO() {
        return merchantInfoDTOList.get(merchantInfoDTOList.size() -1);
    }

    /**
     * MerchantSignatureDTO
     */

    public void addMerchantSignatureDTO(MerchantSignatureDTO merchantSignatureDTO) {
        merchantSignatureDTOList.add(merchantSignatureDTO);
    }

    public void addAllMerchantSignatureDTO(List<MerchantSignatureDTO> merchantSignatureDTOList) {
        merchantSignatureDTOList.addAll(merchantSignatureDTOList);
    }

    public MerchantSignatureDTO getFirstMerchantSignatureDTO() {
        return merchantSignatureDTOList.get(0);
    }

    public MerchantSignatureDTO getLastMerchantSignatureDTO() {
        return merchantSignatureDTOList.get(merchantSignatureDTOList.size() -1);
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
