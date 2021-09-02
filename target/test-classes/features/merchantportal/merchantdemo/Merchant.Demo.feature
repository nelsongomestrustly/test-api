Feature: the user logins in the application

  Background: Then Reset Test Context
    Then Reset Test Context
    Then Add "Merchant_Globex_Basic_Info.json" Information to the Context

  @MerchantDemo
  Scenario Outline: Validate that Merchant Demo is available

    Given Merchant Demo up and running and Expect Http Status <merDemHttpSta>
    Examples:
    | merDemHttpSta |
    | 200           |
