Feature: Buying a ticket
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
    And I click Submit button
    Then Order confirmation appears
    Then I log out

    Scenario: Buy a non-free ticket
      Given I am on the home page
      When I click on register link
      And I entered the user data
      And The registration page displays successfully
      When I open FIFA2022 event
      And I click "Get Tickets" button
      And I click Register button
      And I select Fill ticket details
      And I click Pay button
      And I select Credit Card
      And I fill Credit Card Data
      Then Order confirmation appears
      Then I log out