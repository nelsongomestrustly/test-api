package cucumber.api.tests.support.cucumber.datatable;

import io.cucumber.datatable.DataTable;
import cucumber.api.tests.support.cucumber.common.DataTableEnum;
import cucumber.api.tests.support.cucumber.context.MyTestContext;
import cucumber.api.tests.support.cucumber.parses.AliasDataParser;

import static cucumber.api.tests.support.cucumber.common.DataTableHttpStatusEnum.HTTP_EXPECT_STATUS;

public class DataTableUtils {

    public static String getDataTableField(
            DataTable dataTable,
            MyTestContext context,
            DataTableEnum dataTableEnum) {

        return (String) AliasDataParser.parse(dataTable, context).get(dataTableEnum.getMapKey());

    }

    public static String getDataTableField(
            DataTable dataTable,
            DataTableEnum dataTableEnum) {

        return (String) AliasDataParser.parse(dataTable, null).get(dataTableEnum.getMapKey());

    }


    /**
     * Really Common Fields
     */
    public static Integer getExpectStatusFromDataTable(
            DataTable dataTable) {

        return Integer.valueOf((String) AliasDataParser.parse(dataTable, null).get(HTTP_EXPECT_STATUS.getHttpStatus()));

    }


}
