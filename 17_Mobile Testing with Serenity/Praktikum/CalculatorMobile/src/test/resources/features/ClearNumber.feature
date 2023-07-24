Feature: Clear numbers
  As a user
  I want to clear numbers
  So on my page calculator clean from numbers

  Scenario: Clear with correct numbers
    Given I click number
    When I click button AC on screen
    Then I get my page clean from numbers or reset number

