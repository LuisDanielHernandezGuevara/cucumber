Feature: Enter a wrong email and submit it
   @EmailError
   Scenario: User does not register correct info
   	Given Initialize the browser with chrome
    Given Open the chrome browser and launch the application
    And Clicks on te sign in button
    And Enter an email with "TestWithoutEmail"
    And User tries to create an account
    Then An error message is displayed