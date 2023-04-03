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
Feature: product_terbit

  Background: 
    Given User navigate to web 01

  Scenario: 
    When User click Button login 01
    And User fill email with correct email 01
    And User fill password with correct password 01
    And User click Button submit 01
    And User click Button hamburger list 01
    And click the product 01
    And click Button Edit 01 
    And modify data 01
    And scrolldown 01
    Then Click terbitkan 01
