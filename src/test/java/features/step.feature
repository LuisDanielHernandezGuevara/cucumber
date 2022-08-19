#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
#@tag
Feature: Title of your feature
#  I want to use this template for my feature file

  @CreateAccount
  Scenario: User creates an account
  	Given Initialize the browser with chrome
    Given Open the chrome browser and launch the application
    And Clicks on te sign in button
    And Enter an email with "tes@mymail.com"
    Then User tries to create an account
    And Select a gender
    And Enter a name with "raul"
    And Enter a lastname with "Sanchez"
    And Enter "12345" as a password
    And select a day option
    And select a month option
    And select a year option
    And Check newsletter option
    And Check option birthday
    And Enter "Hexaware" as company
    And Enter "WalK Street Avenue" ad address
    And Enter "Walk Street Aveniue Tousand Franklin" ad address2
    And Enter "Washington D.C" as a city
    And Select the dropdown State
    And Enter "00000" as a postal code
    And Select dropdown Country
    And set "33523523" as a telephone number
    And Set "556677889900" as a mobile number
    Then User sends Account Information
    
   @EmailError
   Scenario: User does not register correct info
   	Given Initialize the browser with chrome
    Given Open the chrome browser and launch the application
    And Clicks on te sign in button
    And Enter an email with "TestWithoutEmail"
    And User tries to create an account
    Then An error message is displayed

		@BlankFieldsInformation
		Scenario: Leave create account fields in blank
		Given Initialize the browser with chrome
    Given Open the chrome browser and launch the application
    And Clicks on te sign in button
    And Enter an email with "try@mail.com"
    And User tries to create an account
    Then User sends no Information
    Then An error message blank fields is displayed
  
  	@WrongFieldsInformation
		Scenario: Leave create account fields in blank
		Given Initialize the browser with chrome
    Given Open the chrome browser and launch the application
    And Clicks on te sign in button
    And Enter an email with "try@mail.com"
    And User tries to create an account
    And Select a gender
    And Enter a name with "raul"
    And Enter a lastname with "Sanchez"
    And Enter "12345" as a password
    And select a day option
    And select a month option
    And select a year option
    And Check newsletter option
    And Check option birthday
    And Enter "Hexaware" as company
    And Enter "WalK Street Avenue" ad address
    And Enter "Walk Street Aveniue Tousand Franklin" ad address2
    And Enter "Washington D.C" as a city
    And Select the dropdown State
    And Enter "00000" as a postal code
    And Select dropdown Country
    And set "33523523" as a telephone number
    And Set "556677889900" as a mobile number
    Then An error message blank fields is displayed
    
   	
   
   # When I complete action
    #And some other action
   # And yet another action
   # Then I validate the outcomes
   # And check more outcomes

  #@tag2
  #Scenario Outline: Title of your scenario outline
   # Given I want to write a step with <name>
   # When I check for the <value> in step
   # Then I verify the <status> in step

    #Examples: 
    #  | name  | value | status  |
    #  | name1 |     5 | success |
    #  | name2 |     7 | Fail    |
