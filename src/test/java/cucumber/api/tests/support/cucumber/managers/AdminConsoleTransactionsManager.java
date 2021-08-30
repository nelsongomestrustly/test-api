package cucumber.api.tests.support.cucumber.managers;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import cucumber.api.tests.test.admconsole.data.dto.AdmConSearchTransactionsDTO;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Getter
@Setter
public class AdminConsoleTransactionsManager {

    //Object To Search
    private AdmConSearchTransactionsDTO admConSearchTransactionsDTO;

    //Admin Console Html Search Result Body
    private String adminConsoleHtmlSearchResultsBodyTransactions;

    //Object to Store the Results of the Search
    private List<AdmConSearchTransactionsDTO> adminConsoleSearchResultsTransactionsDTOList;

    public AdminConsoleTransactionsManager() {
        adminConsoleSearchResultsTransactionsDTOList = new ArrayList<>();
        admConSearchTransactionsDTO = new AdmConSearchTransactionsDTO();
    }

    public void add(AdmConSearchTransactionsDTO admConSearchTransactionsDTO) {
        adminConsoleSearchResultsTransactionsDTOList.add(admConSearchTransactionsDTO);
    }

    public AdmConSearchTransactionsDTO getFirst() {
        return adminConsoleSearchResultsTransactionsDTOList.get(0);
    }

    public AdmConSearchTransactionsDTO getLast() {
        return adminConsoleSearchResultsTransactionsDTOList.get(adminConsoleSearchResultsTransactionsDTOList.size() -1);
    }

    public AdmConSearchTransactionsDTO getByIndex(int index) {
        //Get the by index (zero-based index)
        return adminConsoleSearchResultsTransactionsDTOList.get(index-1);
    }

    public int getIndex(AdmConSearchTransactionsDTO admConSearchTransactionsDTO) {
        //Get the index of the object (zero-based index)
        return adminConsoleSearchResultsTransactionsDTOList.indexOf(admConSearchTransactionsDTO) + 1;
    }


}
