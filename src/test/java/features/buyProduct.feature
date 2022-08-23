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
Feature: Buy a product

    @BuyProduct
		Scenario: Send correct information and buy a product
		Given Initialize the browser with chrome
    Given Open the chrome browser and launch the application
    And Hover on Womens link
    And ClickTShirt Sub Menu
    And Get Name of displayed Text
    And Enter the name on search bar
    Then Click on search Button
    