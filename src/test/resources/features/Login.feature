@Login @Android
Feature: Login

  @positive
  Scenario: Verify user successfully login when using valid username and password
    Given user is on login page
    When user input username "admin"
    When user input password "admin"
    When user click button sign in
    Then user successfully login
    When user go to list menu
