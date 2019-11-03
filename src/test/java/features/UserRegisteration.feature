@ignore
Feature: User Registration
  I want to check that the user can register in Eventtus website

  Scenario: User Registration
    Given I am on the home page
    When I click on register link
    And I entered the user data
    Then The registration page displays successfully
