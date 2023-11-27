Feature: Amazon Search
@Smoke
  Scenario: Search a Product Mac Book Air
    Given I have a search field on Amazon Page
    When I search for a product with name "Apple MacBook Pro" and price 1000
    Then Product with name "Apple MacBook Pro" should be displayed
  Scenario: Search a Product Iphone
    Given I have a search field on Amazon Page
    When I search for a product with name "Apple Iphone  Pro" and price 15
    Then Product with name "Apple Iphone Pro" should be displayed
