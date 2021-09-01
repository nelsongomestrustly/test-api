Feature: the user logins in the application

  Background: Then Reset Test Context
    Then Reset Test Context

  @MerchantDemo
    @MerchantInfo
  Scenario Outline: Client Gets Information About Merchant Info when access Merchant Demo

    Given Merchant Demo up and running and Expect Http Status <merDemHttpSta>
    When The user access Merchant Demo should get Merchant "<merName>" Info information and Expect Http Status "<merInfHttpSta>"
    Then The user should have a Not Empty and Not Null Merchant Info List Object
    Examples:
      | merDemHttpSta | merInfHttpSta | merName      |
      | 200           | 200           | GLOBEX_DEMO  |