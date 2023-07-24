Feature: Add numbers
  As a user
  I want to add numbers
  So I know the sum of the two numbers

  Scenario: Add with correct numbers
    Given I click numbers one
    When I click button add numbers
    And I click numbers two
    Then I get sum of the two numbers

