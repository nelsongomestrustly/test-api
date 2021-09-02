Feature: the user logins in the application

  Background: Then Reset Test Context
    Then Reset Test Context
    Then Add "Merchant_Globex_Basic_Info.json" Information to the Context


  @MerchantDemo
    @CreateSignature
  Scenario Outline: Access Merchant Demo Signature Endpoint and Get a Signature

    Given Merchant Demo up and running and Expect Http Status <merDemHttpSta>
    When Access Merchant Demo and Create using "<merchantDemoCreateSignatureFilename>" a Valid Signature "<merDemCreSigHttpSta>"
    Then The user should have a Valid Signature
    Examples:
      | merDemHttpSta | merDemCreSigHttpSta | merchantDemoCreateSignatureFilename |
      | 200           | 200                 | Create_Signature_Instant.json       |
      | 200           | 200                 | Create_Signature_Recurring.json     |