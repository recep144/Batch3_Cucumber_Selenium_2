@LoginWithParameter  @rerun
Feature: Log in as different user

  Background:
    Given The user is on the login page

    @wip
  Scenario: Login as Mike with parameter
    When The user logs in using "mike@gmail.com" and "mike1234"
    Then The user should be able to login
    And The user name should be "mike"

  Scenario: Login as Jhon with parameter
    When The user logs in using "john@gmail.com" and "John1234."
    Then The user should be able to login
    And The user name should be "John"

  Scenario: Login as Eddie with parameter
    When The user logs in using "eddiem@kraft.com" and "eddiem12"
    Then The user should be able to login
    And The user name should be "Eddie Murphy"

  Scenario: Login as Morgan with parameter
    When The user logs in using "morganfreeman@kraft.com" and "mfreeman"
    Then The user should be able to login
    And The user name should be "Morgan Freeman"