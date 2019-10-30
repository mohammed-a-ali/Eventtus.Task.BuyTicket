@order = 2
Feature: User Login
  I want to check that the user can login to Eventtus website

  Scenario: User Login
    Given the user in the home page
    When I entered the login data
    Then The user is logged in