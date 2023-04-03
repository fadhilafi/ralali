# feature is a test suite
# scenario is a test case
Feature: login LG_04

  Background: 
    Given User navigate to the Web LG_04

 Scenario: User want to Login LG_04
    When User Click Button Masuk LG_04
    And Fill out E-Mail LG_04
    And Fill Password LG_04
    And Click Button Masuk Submit Login LG_04
    Then Unsuccessful to Login LG_04
    

    


  