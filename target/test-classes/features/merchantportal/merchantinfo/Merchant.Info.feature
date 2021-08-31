Feature: the user logins in the application

  Background: Then Reset Test Context
    Then Reset Test Context

  @MerchantPortal
    @MerchantInfo
  Scenario Outline: Client Gets Information About Merchant Info when access Merchant Demo

    Given Merchant Demo up and running and Expect Http Status <expectMerchantDemoHttpStatus>
    When The user access Merchant Demo should get Merchant "<merchantName>" Info information and Expect Http Status "<expectMerchantInfoHttpStatus>"
    Then The user should have a Not Empty and Not Null Merchant Info List Object
    Examples:
      | expectMerchantDemoHttpStatus | expectMerchantInfoHttpStatus | merchantName |
      | 200 | 200 | GLOBEX_DEMO |