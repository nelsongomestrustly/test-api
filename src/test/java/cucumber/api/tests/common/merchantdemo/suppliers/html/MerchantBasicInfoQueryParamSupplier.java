package cucumber.api.tests.common.merchantdemo.suppliers.html;

import cucumber.api.tests.common.enums.queries.QueryParametersEnum;
import cucumber.api.tests.common.predicates.GenericPredicates;
import cucumber.api.tests.data.dto.merchantdemo.MerchantBasicInfoDTO;

import java.util.HashMap;

public class MerchantBasicInfoQueryParamSupplier {


    public static HashMap<QueryParametersEnum, String> getLoginMultiValueMapForHttpRequest(MerchantBasicInfoDTO merchantBasicInfoDTO) {

        HashMap<QueryParametersEnum, String> map = new HashMap<>();

        map = (addMapEntryIfNecessary(merchantBasicInfoDTO.getAccessId(), merchantBasicInfoDTO.getAccessIdKey(), map));
        map = (addMapEntryIfNecessary(merchantBasicInfoDTO.getMerchantId(), merchantBasicInfoDTO.getMerchantIdKey(), map));
        map = (addMapEntryIfNecessary(merchantBasicInfoDTO.getWidgetId(), merchantBasicInfoDTO.getWidgetIdKey(), map));
        map = (addMapEntryIfNecessary(merchantBasicInfoDTO.getId(), merchantBasicInfoDTO.getIdKey(), map));
        map = (addMapEntryIfNecessary(merchantBasicInfoDTO.getGrp(), merchantBasicInfoDTO.getGrpKey(), map));
        map = (addMapEntryIfNecessary(merchantBasicInfoDTO.getV(), merchantBasicInfoDTO.getVKey(), map));
        map = (addMapEntryIfNecessary(merchantBasicInfoDTO.getDescription(), merchantBasicInfoDTO.getDescriptionKey(), map));
        map = (addMapEntryIfNecessary(merchantBasicInfoDTO.getLogoUrl(), merchantBasicInfoDTO.getLogoUrlKey(), map));
        map = (addMapEntryIfNecessary(merchantBasicInfoDTO.getName(), merchantBasicInfoDTO.getNameKey(), map));
        map = (addMapEntryIfNecessary(merchantBasicInfoDTO.getDeviceType(), merchantBasicInfoDTO.getDeviceTypeKey(), map));

        return map;

    }

    private static HashMap<QueryParametersEnum, String> addMapEntryIfNecessary(Object object, QueryParametersEnum key, HashMap<QueryParametersEnum, String> map) {

        if (GenericPredicates.checkIfNullOrEmpty.negate().test(object)) {
            map.put(key, object.toString());
        }

        return map;

    }


}
