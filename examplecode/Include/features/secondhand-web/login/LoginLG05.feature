# feature is a test suite
# scenario is a test case
Feature: login LG_05

  Background: 
    Given User navigate to the Web LG_05

 Scenario: User want to Login LG_05
    When User Click Button Masuk LG_05
    And Fill E-Mail LG_05
    And Fill out Password LG_05
    And Click Button Masuk Submit Login LG_05
    Then Unsuccessful to Login LG_05
   
    

    


  