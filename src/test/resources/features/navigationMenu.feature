
Feature: Navigation Menu

  Background:
    Given The user is on the login page
  @rerun
  Scenario: Navigation to Develppers Menu
    When The user enters valid credentials that belongs to Mike
    Then The user should be able to see Dashboard text
    And The user navigates to Developers menu
    Then The user should be able to see Developers text

  @developer
  Scenario: Navigation to Forms input menu
    When The user enters valid credentials that belongs to Jhon
    Then The user should be able to see Dashboard text
    And The user navigates to Forms input menu
    Then The user should be able to see  text of General Form

  @sdet
  Scenario: Navigation to My Profile menu
    When The user enters valid credentials that belongs to Eddie Murphy
    Then The user should be able to see Dashboard text
    And The user navigates to My Profile menu
    Then The user should be able to see  text of User Profile




