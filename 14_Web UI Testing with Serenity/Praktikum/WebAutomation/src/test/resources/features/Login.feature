Feature: Login
  As a user
  I want to login
  So I can access the product page

  Scenario: Login with correct username and password
    Given I am on login page
    When I input correct username and correct password
    And I click login button
    Then I will go to product page

    Scenario: Login with invalid username and password
      Given I am on login page
      When I input invalid username and password
      And I click login button
      Then I still on login page

      Scenario: Login with empty username and filled password
        Given I am on login page
        When I input empty username and filled valid password
        And I click login button
        Then I still on login page and show error message

        Scenario: Login with empty username and password
          Given I am on login page
          When I input empty username and password
          And I click login button
          Then I still on login page and show error message

          Scenario: Login with filled valid username and empty password
            Given I am on login page
            When I input username and empty password
            And I click login button
            Then I still on login page and show error message