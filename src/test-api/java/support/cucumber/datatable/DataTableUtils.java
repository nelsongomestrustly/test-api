package support.cucumber.datatable;

import io.cucumber.datatable.DataTable;
import support.cucumber.common.DataTableEnum;
import support.cucumber.context.MyTestContext;
import support.cucumber.parses.AliasDataParser;
import test.admconsole.data.dto.AdminConsoleSearchTransactionsDTO;

import static support.cucumber.common.DataTableEnum.HTTP_EXPECT_STATUS;

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

        return Integer.valueOf((String) AliasDataParser.parse(dataTable, null).get(HTTP_EXPECT_STATUS.getMapKey()));

    }


}
