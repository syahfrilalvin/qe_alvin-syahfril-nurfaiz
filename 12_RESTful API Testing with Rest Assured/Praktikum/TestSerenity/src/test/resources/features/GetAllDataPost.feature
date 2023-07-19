Feature: Get All Data Post
  As a user
  I want to get all data post
  So i can manage them

  Scenario: Get all data post with valid request
    Given I have url get all data post
    When I request get all data post with valid request url
    Then I get status is 200 OK
    And I get list data all post