Feature: Logout bits application

  @sanity
  Scenario: User login and logout from application
    When user entered valid id and password
    Then logged in successful
    And click on profile button and click on logout