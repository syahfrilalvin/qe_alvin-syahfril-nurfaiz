Feature: Distribution numbers
  As a user
  I want to distribution numbers
  So I know the sum of the two numbers

  Scenario: Distribution with correct numbers
    Given I click second number
    When I click button distribution numbers
    And I click first number
    Then I get sum distribution of the two numbers

