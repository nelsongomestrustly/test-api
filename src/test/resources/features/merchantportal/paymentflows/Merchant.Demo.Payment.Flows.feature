Feature: the user logins in the application

  Background: Then Reset Test Context
    Then Reset Test Context

  @MerchantDemo
    @PaymentFlows
  Scenario Outline: Client Gets Information About Payment Flows when access Merchant Demo

    Given Merchant Demo up and running and Expect Http Status <merDemHttpSta>
    When The user access Merchant Demo should get Payment Flows information and Expect Http Status <payFloHttpSta>
    Then The user should have a Not Empty and Not Null Payment Flows List Object
    Examples:
      | merDemHttpSta | payFloHttpSta |
      | 200           | 200           |


