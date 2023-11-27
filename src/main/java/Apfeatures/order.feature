Feature: Amazon Order Page
  In order to check my order details
  As a registered user
  I want to specify the features of order details page
  Background:
    Given a registered user exits
    Given user is on Amazon login page
    When user enters username
    And user enters password
    And user clicks on login button
    Then user navigates to order page


  Scenario: Check prevoius order details
    When user clicks on Order link
    Then user checks the previous order details



    Scenario: Check open order details
      When user clicks on Ordered link
      Then user checks open ordered details

      Scenario: Check canselled oredr details
        When user clicks on canselled order details
        Then user pressed on canselled order details

