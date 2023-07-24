Feature: Subtraction numbers
  As a user
  I want to subtraction numbers
  So I know the sum of the two numbers

  Scenario: Subtraction with correct numbers
    Given I click second number
    When I click button subtraction numbers
    And I click first number
    Then I get sum subtraction of the two numbers

