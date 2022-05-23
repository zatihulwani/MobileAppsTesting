@Android
Feature: Adding Numbers

  Background:
    Given user is on login page
    When user input username "admin"
    When user input password "admin"
    When user click button sign in
    Then user successfully login

  @add
  Scenario: Adding two numbers
    Given a is 1
    When I select operation
    When I select add operation
    And b is 2
    And I click button equal