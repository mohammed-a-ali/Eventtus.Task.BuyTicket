@order = 1
Feature: User Registration
  I want to check that the user can register in Eventtus website

  Scenario: User Registration
    Given the user in the home page
    When I click on register link
    And I entered the user data
    Then The registration page displays successfully
