Feature: the user logins in the application

  Background: Then Reset Test Context Before Start Test and Log in Admin Console

    Then Reset Test Context
    Then the user logs in Admin Console with "admin_console_admin_user" , Login Html Body "Login - Admin Console" , and Http Status "200" , "302" , "200"




  @AdminConsole
    @AdminConsoleSearchTransactions
  Scenario Outline: : Search Transactions in Admin Console and Receive X results

    When Search for Customer Name Transactions in Admin Console using Sample File "<adminConsoleFilename>" and Expect Http Status "<httpStaAdmConSeaTra>"

    Then Admin Console Transactions Search should be more than "<numberOfResults>" results

    Examples:
      | adminConsoleFilename                                           | httpStaAdmConSeaTra | numberOfResults |
      | Search_Admin_Console_Transactions_By_CustomerName_Valid_1.json | 200                 | 1               |
      | Search_Admin_Console_Transactions_By_CustomerName_Valid_2.json | 200                 | 1               |
      | Search_Admin_Console_Transactions_By_CustomerName_Valid_3.json | 200                 | 1               |



  @AdminConsole
    @AdminConsoleSearchTransactions
  Scenario Outline: : Search Transactions in Admin Console and Receive NO results

    When Search for Customer Name Transactions in Admin Console using Sample File "<adminConsoleFilename>" and Expect Http Status "<httpStaAdmConSeaTra>"

    Then Admin Console Transactions Search should return no results

    Examples:
      | adminConsoleFilename                                           | httpStaAdmConSeaTra |
      | Search_Admin_Console_Transactions_By_CustomerName_Invalid.json | 200                 |



  @AdminConsole
    @AdminConsoleSearchTransactions
  Scenario Outline: : Search for All Transactions in Admin Console and Receive more than X results

    When Search for Customer Name Transactions in Admin Console using Sample File "<adminConsoleFilename>" and Expect Http Status "<httpStaAdmConSeaTra>"

    Then Admin Console Transactions Search should return more than "<numberOfResults>" results

    Examples:
      | adminConsoleFilename                                         | httpStaAdmConSeaTra | numberOfResults |
      | Search_Admin_Console_Transactions_By_CustomerName_Empty.json | 200                 | 5               |





