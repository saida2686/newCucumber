Feature: User Registration
  Scenario: user registration with different data
    Given User is on registration page
    When  User eneters following user details
          |  naveen | automation |nav@gmail.com|99999|Banglore|
           | tom|peter| tom@gmail.com |88888  |  London          |
    |  lisa |dsouza | lisa@gmail.com |6666666|Uzbekistan  |

     Then User registration should be sucessful