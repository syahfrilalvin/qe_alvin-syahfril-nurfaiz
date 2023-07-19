Feature: Delete data posts
  As a user
  I want to delete data posts
  So i can manage them

  Scenario: Delete data posts with valid request
    Given I have url delete data posts
    When I request paramater id data post with valid request url
    Then I get status 200 Ok
    And I can delete data posts