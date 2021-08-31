Feature: the user logins in the application

  Background: Then Reset Test Context
    Then Reset Test Context

  @PaymentPanel
    @PaymentPanelSelectBank
  Scenario Outline: Client Gets Bank Redirect url when access Payment Panel - Select Bank Process

    #To Access Payment Panel you need Merchant Access Id
    Given Merchant Demo up and running and Expect Http Status <expectMerchantDemoHttpStatus>
    When The user access Merchant Demo should get Merchant "<merchantName>" Info information and Expect Http Status "<expectMerchantInfoHttpStatus>"
    Then The user should have a Not Empty and Not Null Merchant Info List Object

    #Create an Signaure to be used

    #We information above you can access Payment Panel and Get Bank Redirect Url
    Given Payment Panel up and running and We are using Widget "<widgetId>" Expect Http Status "<expectPaymentPanelHttpStatus>"
    When The user access Payment Panel and Select Bank "<bankName>" - should get Bank Redirect Url and Expect Http Status "<expectPaymentPanelHttpStatus>"
    Then The user should have a Valid Bank Redirect Url

    Examples:
      | expectPaymentPanelHttpStatus | bankName | expectMerchantDemoHttpStatus | expectMerchantInfoHttpStatus | merchantName | widgetId |
      | 200 | DEMO_BANK | 200 | 200 | GLOBEX_DEMO | WIDGET_1 |
      | 200 | CHASE_BANK | 200 | 200 | GLOBEX_DEMO | WIDGET_1 |

