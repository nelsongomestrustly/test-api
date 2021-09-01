Feature: the user logins in the application

  Background: Then Reset Test Context
    Then Reset Test Context


  @MerchantDemo
    @CreateSignature
  Scenario Outline: Access Merchant Demo Signature Endpoint and Get a Signature

    Given Merchant Demo up and running and Expect Http Status <expectMerchantDemoHttpStatus>
    When Access Merchant Demo and Create a Valid Signature <expectMerchantDemoCreateSignatureHttpStatus>
    Then The user should have a Valid Signature
    Examples:
      | expectMerchantDemoHttpStatus | expectMerchantDemoCreateSignatureHttpStatus |
      | 200 | 302 |