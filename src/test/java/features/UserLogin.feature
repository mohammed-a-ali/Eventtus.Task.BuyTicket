Feature: User Login
  I want to check that the user can login to Eventtus website

  Scenario: User Login
    Given I am on the home page
    When I entered the login data
    Then I am logged in
    And I log out