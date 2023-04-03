# feature is a test suite
# scenario is a test case
Feature: submit_offer

  Background: 
    Given User navigate to the Web BP05

  Scenario: Submit Offer BP05    
    When Click Product BP05
    Then Click Button Saya Tertarik BP05
