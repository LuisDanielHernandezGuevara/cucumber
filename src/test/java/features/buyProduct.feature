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
    And Click on more button
    And Increment items
    And Select size
    And Select orange color
    And Click add to cart button
    And Proceed to process payment
    And Send "mymailLuis245@mailSelenium.com" as an email field 
    And Send "123456" as a password field
    And Click on the submit login button
        And Click button in process address
    And Click on checkbox agreement
    And Click process carrier button
    And Click on bankwire button
    Then Confirm order button
    Then Take screenshot
    