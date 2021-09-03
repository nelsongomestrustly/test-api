Feature: the user logins in the application

  Background: Then Reset Test Context
    Then Reset Test Context
    Then Add "Merchant_Globex_Basic_Info.json" Information to the Context

  @PaymentPanel
    @PaymentPanelSelectBank
  Scenario Outline: Client Gets Bank Redirect url when access Payment Panel - Select Bank Process


    #To Access Payment Panel you need Merchant Access Id
    Given Merchant Demo up and running and Expect Http Status <okStatus>
    When The user access Merchant Demo should get Merchant "<merName>" Info information and Expect Http Status "<okStatus>"
    Then The user should have a Not Empty and Not Null Merchant Info List Object

    #Create an Signature to be used
    When Access Merchant Demo and Create using "<merchantDemoCreateSignatureFilename>" a Valid Signature "<okStatus>"
    Then The user should have a Valid Signature

    #Generate Widget
    When The user access Payment Panel Widget Endpoint should get Widget "<widgetName>" Info information and Expect Http Status "<okStatus>"
    Then The user should have a Valid Widget Object

    #Generate Token

    #We information above you can access Payment Panel and Get Bank Redirect Url
    Then The user opens "<bankName>" and Expect Http Status "<redirectStatus>"
    Then The user should have a Valid Token

    #Build Bank Panel
    Then The user access Merchant Demo Front End and Build Bank Panel and Expect Http Status <okStatus>

    #Setup Bank Panel
    #Then The user access Merchant Demo Front End and Setup Bank Panel and Expect Http Status <okStatus>


    Examples:
      | redirectStatus | okStatus | merName     | merchantDemoCreateSignatureFilename | widgetName                    | bankName  |
      | 302            | 200      | GLOBEX_DEMO | Create_Signature_Recurring.json     | Create_Widget_Recurring.json  | DEMO_BANK |
      | 302            | 200      | GLOBEX_DEMO | Create_Signature_Instant.json       | Create_Widget_Instant.json    | DEMO_BANK |

