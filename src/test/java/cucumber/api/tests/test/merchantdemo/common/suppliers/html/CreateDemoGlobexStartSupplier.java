package cucumber.api.tests.test.merchantdemo.common.suppliers.html;

import cucumber.api.tests.common.enums.queries.QueryParametersEnum;
import cucumber.api.tests.common.predicates.GenericPredicates;
import cucumber.api.tests.test.merchantdemo.data.dto.MerchantCreateSignatureDTO;
import cucumber.api.tests.test.merchantdemo.data.dto.MerchantGlobexStartDTO;

import java.util.HashMap;

public class CreateDemoGlobexStartSupplier {


    public static HashMap<QueryParametersEnum, String> getLoginMultiValueMapForHttpRequest(MerchantGlobexStartDTO merchantGlobexStartDTO) {

        HashMap<QueryParametersEnum, String> map = new HashMap<>();

        map = (addMapEntryIfNecessary(merchantGlobexStartDTO.getAccessId(), merchantGlobexStartDTO.getAccessIdKey(), map));
        map = (addMapEntryIfNecessary(merchantGlobexStartDTO.getGrp(), merchantGlobexStartDTO.getGrpKey(), map));
        map = (addMapEntryIfNecessary(merchantGlobexStartDTO.getV(), merchantGlobexStartDTO.getVKey(), map));
        map = (addMapEntryIfNecessary(merchantGlobexStartDTO.getWidgetId(), merchantGlobexStartDTO.getWidgetIdKey(), map));

        return map;

    }

    private static HashMap<QueryParametersEnum, String> addMapEntryIfNecessary(Object object, QueryParametersEnum key, HashMap<QueryParametersEnum, String> map) {

        if (GenericPredicates.checkIfNullOrEmpty.negate().test(object)) {
            map.put(key, object.toString());
        }

        return map;

    }


}
