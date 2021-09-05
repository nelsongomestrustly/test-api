Feature: the user logins in the application

  Background: Then Reset Test Context
    Then Reset Test Context
    Then Add "Merchant_Globex_Basic_Info.json" Information to the Context

  @MerchantDemo
    @MerchantInfo
  Scenario Outline: Client Gets Information About Merchant Info when access Merchant Demo

    Given Merchant Demo up and running and Expect Http Status <okStatus>
    When The user access Payment Panel Widget Endpoint should get Widget "<widgetName>" Info information and Expect Http Status "<okStatus>"
    Then The user should have a Valid Widget Object
    Examples:
      | okStatus | widgetName                   |
      | 200      | Create_Widget_Instant.json   |
      | 200      | Create_Widget_Recurring.json |