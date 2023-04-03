# feature is a test suite
# scenario is a test case
Feature: login LG_02

  Background: 
    Given User navigate to the Web LG_02

 Scenario: User want to Login LG_02
    When User Click Button Masuk LG_02
    And Fill E-Mail that is not registered LG_02
    And Fill Password incorrect value LG_02
    And Click Button Masuk Submit Login LG_02
    Then Unsuccessful to Login LG_02
    

    


  