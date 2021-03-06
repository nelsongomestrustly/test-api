Feature: the user logins in the application

  Background: Then Reset Test Context
    Then Reset Test Context
    Then Add "Merchant_Globex_Basic_Info.json" Information to the Context

     #Not Being used by front end process
  @PaymentPanel
    @PaymentPanelSelectBank
  Scenario Outline: Client Gets Bank Redirect url when access Payment Panel - Select Bank Process


    #To Access Payment Panel you need Merchant Access Id
    Given Merchant Demo up and running and Expect Http Status <okStatus>
    When The user access Merchant Demo should get Merchant "<merName>" Info information and Expect Http Status "<okStatus>"
    Then The user should have a Not Empty and Not Null Merchant Info List Object

    #Create an Signature to be used
    When Access Merchant Demo and Create using "<merchantDemoCreateSignatureFilename>" a Valid Signature "<okStatus>"
    Then The user should have a Valid Signature

    #Generate Widget
    #When The user access Payment Panel Widget Endpoint should get Widget "<widgetName>" Info information and Expect Http Status "<okStatus>"
    #Then The user should have a Valid Widget Object

    #Generate Token

    #Estabilish Transaction
    #Then The user estabilish a new Transaction using "<estabilishTransactionFilename>" and Expect Http Status "<okStatus>"

    #We information above you can access Payment Panel and Get Bank Redirect Url
    #Given Payment Panel up and running and We are using Merchant Signature "<merchantDemoCreateSignatureFilename>" Expect Http Status "<redirectStatus>"
    #When The user access Payment Panel and Select Bank "<bankName>" - should get Bank Redirect Url and Expect Http Status "<redirectStatus>"
    #Then The user should have a Valid Bank Redirect Url


    Examples:
      | redirectStatus | okStatus | merName     | merchantDemoCreateSignatureFilename | widgetName                    | estabilishTransactionFilename         |
      | 302            | 200      | GLOBEX_DEMO | Create_Signature_Instant.json       | Create_Widget_Instant.json    | Estabilish_Transaction_Instant.json   |
      | 302            | 200      | GLOBEX_DEMO | Create_Signature_Recurring.json     | Create_Widget_Recurring.json  | Estabilish_Transaction_Recurring.json |

