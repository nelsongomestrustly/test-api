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

    #We information above you can access Payment Panel and Get Bank Redirect Url
    Then The user opens "<bankName>" and Expect Http Status "<redirectStatus>"
    Then The user should have a Valid Token

    #Build Bank Panel using Front End Setup Call
    Then The user access Merchant Demo Front End and Build Bank Panel and Expect Http Status <okStatus>

    #Get Transaction Information using Front End Setup Call
    Then The user access Merchant Demo Front End Setup and Receive Transactions Information <okStatus>
    Then The user should have a Valid Transaction Id and a Transaction PP Id

    #Get Bank Redirect Url Selecting Bank in Bank Panel
    Then The user access Payment Panel should get Bank Redirect Url and Expect Http Status "<okStatus>"
    And The user should have a Valid Bank Redirect Url

    #Open Bank Authentication Page and Get Login Home page
    Then The user should be able to open Bank Authorization Screen and Get Login Home Page and Expect Http Status "<okStatus>"
    And The user should have a Valid Bank Panel Login Home Page

    #Open Bank Authentication Page and Get Login Information
    Then The user should be able to open Bank Authorization Screen and Get Login Information and Expect Http Status "<okStatus>"
    And The user should have a Valid Bank Panel Login information

    #Authenticate in the Bank Get Bank Account Available Info
    Then The user should be able to Authenticate in the Bank and Get Available Accounts and Expect Http Status "<okStatus>"
    And The user should have a Bank Accounts information

    #Authorize Transaction /// Not Authorize
    Then The user shoud be able to Select Account "<selectAccount>" and Confirm Transaction and Expect Http Status "<okStatus>"


    #Validate Creation /// Validate Not Creation


    Examples:
      | redirectStatus | okStatus | merName     | merchantDemoCreateSignatureFilename | widgetName                    | bankName  | selectAccount |
      | 302            | 200      | GLOBEX_DEMO | Create_Signature_Recurring.json     | Create_Widget_Recurring.json  | DEMO_BANK | 0             |
      | 302            | 200      | GLOBEX_DEMO | Create_Signature_Instant.json       | Create_Widget_Instant.json    | DEMO_BANK | 0             |
      | 302            | 200      | GLOBEX_DEMO | Create_Signature_Deferred.json      | Create_Widget_Instant.json    | DEMO_BANK | 0             |
      | 302            | 200      | GLOBEX_DEMO | Create_Signature_Disbursement.json  | Create_Widget_Instant.json    | DEMO_BANK | 0             |
      | 302            | 200      | GLOBEX_DEMO | Create_Signature_Retrieval.json     | Create_Widget_Instant.json    | DEMO_BANK | 0             |
