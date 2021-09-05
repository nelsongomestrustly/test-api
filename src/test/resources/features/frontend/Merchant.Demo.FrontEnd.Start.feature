Feature: the user access front end

  Background: Then Reset Test Context
    Then Reset Test Context
    Then Add "Merchant_Globex_Basic_Info.json" Information to the Context


    #Not Being used
  @FrontEnd
    @MerchantDemo
  Scenario Outline: Client wants to setup Merchant Demo Front End

    Given Merchant Demo up and running and Expect Http Status <merDemHttpSta>
    #Testing in another test need a token
    # When The user access Merchant Demo Front End and Setup Information and Expect Http Status <merDemFroEndHttpSta>
    Examples:
      | merDemHttpSta | merDemFroEndHttpSta |
      | 200           | 302                 |