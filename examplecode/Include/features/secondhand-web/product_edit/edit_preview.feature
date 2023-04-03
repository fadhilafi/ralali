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
@tag
Feature: product_preview
 
  Background:  
		Given User navigate to web 02

  Scenario: 
    When User click Button login 02
    And User fill email 02
    And User fill password 02
    And User click Button submit 02
    And User click Button Hamburger list 02
    And User click the product 02
    And User click Button Edit 02
    And User Modify the data 02
    And User scrolldown 02
    Then User click Button Preview 02
