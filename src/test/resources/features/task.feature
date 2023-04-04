@taskScenarioOutlineTask
Feature: Login with Scenario Outline

  @scenarioOutlineTask
  Scenario Outline: Negative Login Test with Different Users
    Given The user is on the login page
    When The user logs in using "<userEmail>" and "<password>"
    Then Verify that "<text>" is visible on the login page


    Examples:
      | userEmail      | password  | text                                     |
      | john@          | John1234. | Email address is incorrect. Please check |
      | john@gmail.com | John12    | Password is incorrect. Please check      |
      | johngmail.com  | John1234. | Email address is incorrect. Please check |

  @scenarioOutlineTask2
  Scenario Outline: Negative Login Test with Different Users
    Given The user is on the login page
    When The user logs in using "<userEmail>" and "<password>"
    Then Verify that email "<text>" is visible on the login page

    Examples:
      | userEmail | password  | text                     |
      |           | John1234. | Please enter your email. |
      |           |           | Please enter your email. |

  @scenarioOutlineTask3
  Scenario Outline: Negative Login Test with Different Users
    Given The user is on the login page
    When The user logs in using "<userEmail>" and "<password>"
    Then Verify that password "<text>" is visible on the login page

    Examples:
      | userEmail        | password | text                        |
      | eddiem@kraft.com |          | Please enter your password! |
      |                  |          | Please enter your password! |