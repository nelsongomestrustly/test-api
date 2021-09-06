package cucumber.api.tests.samplefiles.common.suppliers.merchantgatewayserver;

import cucumber.api.tests.common.constants.env.Ips;
import cucumber.api.tests.common.enums.device.DeviceCategoryEnum;
import cucumber.api.tests.common.enums.device.DeviceOsEnum;
import cucumber.api.tests.common.enums.device.DeviceTypeEnum;
import cucumber.api.tests.common.mappers.FileMappers;
import cucumber.api.tests.common.predicates.GenericPredicates;
import cucumber.api.tests.data.dto.merchantdemo.MerchantBasicInfoDTO;
import cucumber.api.tests.data.dto.merchantdemo.MerchantCreateSignatureDTO;
import cucumber.api.tests.samplefiles.common.enums.files.merchantgatewayserver.MerchantGatewayServerTransactionsFilesEnum;
import cucumber.api.tests.data.dto.merchantgatewayserver.EstabilishDataDTO;

import java.io.IOException;

public class MerchantGatewaySeverEstabilishTransactionsDTOFileSampleSupplier {

    public static EstabilishDataDTO getEstabilishDataDTO(
            String fileName,
            MerchantCreateSignatureDTO merchantCreateSignatureDTO,
            MerchantBasicInfoDTO merchantBasicInfoDTO) throws IOException {

        MerchantGatewayServerTransactionsFilesEnum merchantGatewayServerTransactionsFilesEnum = MerchantGatewayServerTransactionsFilesEnum.fromFileName(fileName);

        EstabilishDataDTO estabilishDataDTO = FileMappers.getFileMappers(
                merchantGatewayServerTransactionsFilesEnum.getDirectory(), merchantGatewayServerTransactionsFilesEnum.getFileName(), EstabilishDataDTO.class);

        return populateEstabilishDataDTO(null, merchantCreateSignatureDTO, merchantBasicInfoDTO);

    }



    private static EstabilishDataDTO populateEstabilishDataDTO(
            EstabilishDataDTO estabilishDataDTO,
            MerchantCreateSignatureDTO merchantCreateSignatureDTO,
            MerchantBasicInfoDTO merchantBasicInfoDTO) {

        if (GenericPredicates.checkIfNullOrEmpty.test(estabilishDataDTO)) {
            estabilishDataDTO = new EstabilishDataDTO();
        }

        //MerchantCreateSignatureDTO
        estabilishDataDTO.setAmount(merchantCreateSignatureDTO.getAmount());
        estabilishDataDTO.setCancelUrl(merchantCreateSignatureDTO.getCancelUrl());
        estabilishDataDTO.setCurrency(merchantCreateSignatureDTO.getCurrency());
        estabilishDataDTO.setDescription(merchantCreateSignatureDTO.getDescription());
        estabilishDataDTO.setMerchantReference(merchantCreateSignatureDTO.getMerchantReference());
        //estabilishDataDTO.setPaymentType(merchantCreateSignatureDTO.getPaymentType().getValue());
        estabilishDataDTO.setReturnUrl(merchantCreateSignatureDTO.getReturnUrl());

        //MerchantBasicInfoDTO
        estabilishDataDTO.setMerchantId(merchantBasicInfoDTO.getMerchantId());

        //Populating Device with Default Values
        if (GenericPredicates.checkIfNullOrEmpty.test(estabilishDataDTO.getDeviceCategory())) {
            estabilishDataDTO.setDeviceCategory(DeviceCategoryEnum.DESKTOP.getName());
        }
        if (GenericPredicates.checkIfNullOrEmpty.test(estabilishDataDTO.getDeviceOs())) {
            estabilishDataDTO.setDeviceOs(DeviceOsEnum.MAC_INTEL.getName());
        }
        if (GenericPredicates.checkIfNullOrEmpty.test(estabilishDataDTO.getDeviceType())) {
            estabilishDataDTO.setDeviceType(DeviceTypeEnum.WEB.getName());
        }

        //Populating IP with Default Values
        if (GenericPredicates.checkIfNullOrEmpty.test(estabilishDataDTO.getIp())) {
            estabilishDataDTO.setIp(Ips.LOCAL_IP_ADDR);
        }

        return estabilishDataDTO;

    }





}
