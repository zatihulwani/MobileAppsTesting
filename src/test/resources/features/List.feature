@Android
Feature: List

  Background:
    Given user is on login page
    When user input username "admin"
    When user input password "admin"
    When user click button sign in
    Then user successfully login


  @test @positive
  Scenario: Verify user successfully access list menu
    When user go to list menu
    When user do swipe up on list data
    When user do Long Press on list data
    When user do Tap Multiple Times on list data