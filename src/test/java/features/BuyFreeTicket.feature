Feature: Buying a free ticket
  I want to check that registered user can buy a free ticket

  Scenario: Buy a free ticket
    Given I am on the home page
    When I click on register link
    And I entered the user data
    And The registration page displays successfully
    When I open "Test Automation Event" event
    And I click "Get Tickets" button
    And I click Register button
    And I select Fill ticket details
    Then Order confirmation appears
    Then I log out
