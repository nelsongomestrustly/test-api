package support.cucumber.managers;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import test.admconsole.data.dto.AdminConsoleSearchTransactionsDTO;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Getter
@Setter
public class AdminConsoleTransactionsManager {

    //Object To Search
    private AdminConsoleSearchTransactionsDTO adminConsoleSearchTransactionsDTO;

    //Admin Console Html Search Result Body
    private String adminConsoleHtmlSearchResultsBodyTransactions;

    //Object to Store the Results of the Search
    private List<AdminConsoleSearchTransactionsDTO> adminConsoleSearchResultsTransactionsDTOList;

    public AdminConsoleTransactionsManager() {
        adminConsoleSearchResultsTransactionsDTOList = new ArrayList<>();
        adminConsoleSearchTransactionsDTO = new AdminConsoleSearchTransactionsDTO();
    }

    public void add(AdminConsoleSearchTransactionsDTO adminConsoleSearchTransactionsDTO) {
        adminConsoleSearchResultsTransactionsDTOList.add(adminConsoleSearchTransactionsDTO);
    }

    public AdminConsoleSearchTransactionsDTO getFirst() {
        return adminConsoleSearchResultsTransactionsDTOList.get(0);
    }

    public AdminConsoleSearchTransactionsDTO getLast() {
        return adminConsoleSearchResultsTransactionsDTOList.get(adminConsoleSearchResultsTransactionsDTOList.size() -1);
    }

    public AdminConsoleSearchTransactionsDTO getByIndex(int index) {
        //Get the by index (zero-based index)
        return adminConsoleSearchResultsTransactionsDTOList.get(index-1);
    }

    public int getIndex(AdminConsoleSearchTransactionsDTO adminConsoleSearchTransactionsDTO) {
        //Get the index of the object (zero-based index)
        return adminConsoleSearchResultsTransactionsDTOList.indexOf(adminConsoleSearchTransactionsDTO) + 1;
    }


}
