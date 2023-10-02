Feature: Login bits application

  @smoke
  Scenario: User login
    When user entered valid id and password
    Then logged in successful