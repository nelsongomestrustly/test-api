package cucumber.api.tests.test.merchantgatewayserver.common.suppliers;

import cucumber.api.tests.common.constants.env.Ips;
import cucumber.api.tests.common.enums.DeviceCategoryEnum;
import cucumber.api.tests.common.enums.DeviceOsEnum;
import cucumber.api.tests.common.enums.DeviceTypeEnum;
import cucumber.api.tests.common.mappers.FileMappers;
import cucumber.api.tests.common.predicates.GenericPredicates;
import cucumber.api.tests.samplefiles.common.enums.files.adminconsole.AdmConTransactionsSampleFilesEnum;
import cucumber.api.tests.samplefiles.common.enums.files.merchantgatewayserver.MerchantGatewayServerTransactionsFilesEnum;
import cucumber.api.tests.test.admconsole.data.dto.AdmConSearchTransactionsDTO;
import cucumber.api.tests.test.merchantdemo.data.dto.MerchantBasicInfoDTO;
import cucumber.api.tests.test.merchantdemo.data.dto.MerchantCreateSignatureDTO;
import cucumber.api.tests.test.merchantgatewayserver.data.dto.EstabilishDataDTO;

import java.io.IOException;

public class MerchantGatewaySeverEstabilishTransactionsDTOSampleSupplier {

    public static EstabilishDataDTO getEstabilishDataDTO(
            String fileName,
            MerchantCreateSignatureDTO merchantCreateSignatureDTO,
            MerchantBasicInfoDTO merchantBasicInfoDTO) throws IOException {

        //MerchantGatewayServerTransactionsFilesEnum merchantGatewayServerTransactionsFilesEnum = MerchantGatewayServerTransactionsFilesEnum.fromFileName(fileName);

        //EstabilishDataDTO estabilishDataDTO = FileMappers.getFileMappers(
        //        merchantGatewayServerTransactionsFilesEnum.getDirectory(), merchantGatewayServerTransactionsFilesEnum.getFileName(), EstabilishDataDTO.class);

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
        estabilishDataDTO.setPaymentType(merchantCreateSignatureDTO.getPaymentType());
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
