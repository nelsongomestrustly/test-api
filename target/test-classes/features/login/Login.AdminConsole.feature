Feature: the user logins in the application

  Background: Then Reset Test Context
    Then Reset Test Context
    Then Add "Merchant_Globex_Basic_Info.json" Information to the Context

  @Login
    @AdminConsole
  Scenario Outline: : Client need to Login in Admin Console

    Given The following "<testParticipant>"
    Then The Test Participant Should be Valid
    When The user is not logged in Admin Console should receive in HtmlBody "<notLoggedInAdminConsoleHtmlBody>" and Http Status "<httpStaNotLogged>"
    Then The user should be able to Login in Admin Console and receive Http Status <httpStaLogin>
    And The user should be able to access Admin Console Home Page and not receive in HtmlBody "<notLoggedInAdminConsoleHtmlBody>" and Http Status "<httpStaLogged>"

    Examples:
      | testParticipant                  | notLoggedInAdminConsoleHtmlBody | httpStaNotLogged | httpStaLogin | httpStaLogged |
      | admin_console_admin_user         | Login - Admin Console           | 200              | 302          | 200           |
      | admin_console_admin_user_invalid | Login - Admin Console           | 200              | 200          | 200           |

  @Login
    @AdminConsole
  Scenario Outline: : Client need to Login in Admin Console as a BackGround Task

    Then the user logs in Admin Console with "<testParticipant>" , Login Html Body "<notLoggedInAdminConsoleHtmlBody>" , and Http Status "<httpStaNotLogged>" , "<httpStaLogin>" , "<httpStaLogged>"

    Examples:
      | testParticipant          | notLoggedInAdminConsoleHtmlBody | httpStaNotLogged | httpStaLogin | httpStaLogged |
      | admin_console_admin_user | Login - Admin Console           | 200              | 302          | 200           |

  @Logout
    @AdminConsole
  Scenario Outline: : Client need to Logout from Admin Console

    Then the user logout from Admin Console and receive a Http Status <httpStaLogout>

    Examples:
      | httpStaLogout |
      | 200 |