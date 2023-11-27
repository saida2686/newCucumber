Feature: Uber booking Feature
  @Smoke
  Scenario: Booking Cab Sedan
    Given User wants to select a car type "sedan" from uber app
    When User select car  "Sedan" and pick up point "Banglore" and drop loction "Pune"
    Then Driver stasrts the journey
    And Driver ends the journey
    Then  User pays 1000 USD

  Scenario: Booking Cab SUV
    Given User wants to select a car type "SUV" from uber app
    When User select car "SUV" and pick up point "Punjab" and drop loction  "Pune"
    Then Driver stasrts the journey
    And Driver ends the journey
    Then  User pays 1000 USD

  Scenario: Booking Cab Van
    Given User wants to select a car type "Van" from uber app
    When User select car "Cab Van" and pick up point  "Banglore" and drop loction "Pune"
    Then Driver stasrts the journey
    And Driver ends the journey
    Then  User pays 1000 USD