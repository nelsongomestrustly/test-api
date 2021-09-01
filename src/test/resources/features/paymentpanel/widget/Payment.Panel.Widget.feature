Feature: the user logins in the application

  Background: Then Reset Test Context
    Then Reset Test Context

  @MerchantDemo
    @MerchantInfo
  Scenario Outline: Client Gets Information About Merchant Info when access Merchant Demo

    Given Merchant Demo up and running and Expect Http Status <merDemHttpSta>
    When The user access Payment Panel Widget Endpoint should get Widget "<widgetName>" Info information and Expect Http Status "<payWidHttpSta>"
    Then The user should have a Valid Widget Object
    Examples:
      | merDemHttpSta | payWidHttpSta | widgetName                   |
      | 200           | 200           | Create_Widget_Instant.json   |
      | 200           | 200           | Create_Widget_Recurring.json |