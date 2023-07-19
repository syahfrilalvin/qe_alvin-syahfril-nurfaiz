Feature: Get Data Posts By Id
  As a user
  I want to get data posts by id
  So i can manage them

  Scenario: Get data posts by id valid request
    Given I have url get data post by id
    When I request get data post by id with valid request url
    Then I get status 200 OK
    And I get list data posts by id