Feature: Create data posts
  As a user
  I want to create data posts
  So i can manage them

  Scenario: Create data posts with valid request
    Given I have url create data posts
    When I request parameter data post with valid request url
    Then I get status 201 Created
    And I can create data posts