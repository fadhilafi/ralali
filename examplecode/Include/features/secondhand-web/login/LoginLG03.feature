# feature is a test suite
# scenario is a test case
Feature: login LG_03

  Background: 
    Given User navigate to the Web LG_03

 Scenario: User want to Login LG_03
    When User Click Button Masuk LG_03
    And Fill out E-Mail LG_03
    And Fill out Password LG_03
    And Click Button Masuk Submit Login LG_03
    Then Unsuccessful to Login LG_03
    

    


  