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
Feature: product_diminati_terjual
 
Background: 
  Given User has navigate to web PDT 02

  Scenario Outline: User verify text Terjual
    When User click Button login PDT 02
    And User fill email PDT 02
    And User fill password PDT 02
    And User click Button submit PDT 02
    And User click Button Hamburger PDT 02
    Then User verify Button Terjual PDT 02
