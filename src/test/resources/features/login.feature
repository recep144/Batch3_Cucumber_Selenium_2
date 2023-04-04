@login
Feature: Login
  #As a user, I should be able to login with my valid credentials so that I can reach
  # out to the app to use.Feature:
  # Acceptance Criteria :

  #  1. User should be able to login with valid credentials.
  #  2. User should not be login with invalid credentials
  #...
  #...
  Background:
    Given The user is on the login page
  @teacher  @krafttech  @smoke
  Scenario: Login as Mike

    When The user enters valid credentials that belongs to Mike
    Then The user should be able to login

  @student   @krafttech
  Scenario: Login as Jhon
    When The user enters valid credentials that belongs to Jhon
    Then The user should be able to login

  @developer  @krafttech  @smoke
  Scenario: Login as Eddie Murphy
    When The user enters valid credentials that belongs to Eddie Murphy
    Then The user should be able to login

  @SDET @junior @db
  Scenario: Login as Morgan Freeman
    When The user enters valid credentials that belongs to Morgan Freeman
    Then The user should be able to login