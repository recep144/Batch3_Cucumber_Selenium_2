Feature: Profile Test

  Background:
    Given The user is on the login page

  @scenario @wip
  Scenario: user should be able to edit profile
    When The user logs in using "john@gmail.com" and "John1234."
    And The user should be able to login
    And User should go to my profile "John"
    And User should navigate to "Edit Profile"
    #And User should fill out necessary input boxes  and tap on save changes button
    #Then Then User should verify the profile updated message

  @scenario2
  Scenario: User should fill out necessary input boxes  and tap on save changes button
    When The user logs in using "morganfreeman@kraft.com" and "mfreeman"
    And The user should be able to login
    And User should go to my profile "Morgan Freeman"
    And User should navigate to "Edit Profile"
    And User should fill out "Actor", "Hollywood and Kraft","SDET","https://www.amazon.com/","USA","Java, Cucumber",input box
    Then User should verify the "Profile Updated" message
