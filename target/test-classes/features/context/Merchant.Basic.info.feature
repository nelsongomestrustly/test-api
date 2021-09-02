Feature: the user logins in the application

  Background: Then Reset Test Context
    Then Reset Test Context

  @MerchantDemo
    Scenario Outline: Validate that Merchant Information is available

    Then Add "<merFileName>" Information to the Context
    Examples:
    | merFileName |
    | Merchant_Globex_Basic_Info.json |
