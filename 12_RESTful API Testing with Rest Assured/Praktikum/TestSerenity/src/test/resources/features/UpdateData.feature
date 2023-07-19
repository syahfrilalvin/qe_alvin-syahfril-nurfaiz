Feature: Update data posts
  As a user
  I want to update data posts
  So i can manage them

  Scenario: Update data posts with valid request
    Given I have url update data posts
    When I request parameter update data posts with valid request url
    Then I get status code 200 OK
    And I can update data posts