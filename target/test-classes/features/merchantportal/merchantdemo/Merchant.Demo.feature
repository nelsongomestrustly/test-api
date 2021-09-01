Feature: the user logins in the application

  Background: Then Reset Test Context
    Then Reset Test Context

  @MerchantDemo
  Scenario Outline: Validate that Merchant Demo is available

    Given Merchant Demo up and running and Expect Http Status <expectMerchantDemoHttpStatus>
    Examples:
    | expectMerchantDemoHttpStatus |
    | 200 |
