Feature: Login Feature
  Scenario Outline: Login fail - possible combination
    Given User is on Application landing page
    When User clicks on Sign in button
    Then User is displayed login screen
    When User enters "<Username>" in username field
    And User enters "<Password>" in password field
    And User clicks Sign in button
    Then User gets login failed error message


    Examples:
      | Username                        |  Password             |
      | incorrectUsername               |   123456              |
      | naveenautomation                |   incorrectpassword   |