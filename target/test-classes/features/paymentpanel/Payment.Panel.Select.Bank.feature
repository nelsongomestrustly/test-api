Feature: the user logins in the application

  Background: Then Reset Test Context
    Then Reset Test Context

  @PaymentPanel
    @PaymentPanelSelectBank
  Scenario Outline: Client Gets Bank Redirect url when access Payment Panel - Select Bank Process


    #To Access Payment Panel you need Merchant Access Id
    Given Merchant Demo up and running and Expect Http Status <merDemHttpSta>
    When The user access Merchant Demo should get Merchant "<merName>" Info information and Expect Http Status "<merInfHttpSta>"
    Then The user should have a Not Empty and Not Null Merchant Info List Object


    #Create an Signature to be used
    When Access Merchant Demo and Create using "<merchantDemoCreateSignatureFilename>" a Valid Signature "<merDemCreSignHttpSta>"
    Then The user should have a Valid Signature


    #We information above you can access Payment Panel and Get Bank Redirect Url
    Given Payment Panel up and running and We are using Widget "<widgetId>" Expect Http Status "<payPanHttpSta>"
    When The user access Payment Panel and Select Bank "<bankName>" - should get Bank Redirect Url and Expect Http Status "<payPanHttpSta>"
    Then The user should have a Valid Bank Redirect Url


    Examples:
      | payPanHttpSta | merDemCreSignHttpSta | merDemHttpSta | merInfHttpSta | bankName   | merName     | widgetId | merchantDemoCreateSignatureFilename |
      | 200           | 200                  | 200           | 200           | DEMO_BANK  | GLOBEX_DEMO | WIDGET_1 | Create_Signature_Recurring.json     |
      | 200           | 200                  | 200           | 200           | CHASE_BANK | GLOBEX_DEMO | WIDGET_1 | Create_Signature_Recurring.json     |

