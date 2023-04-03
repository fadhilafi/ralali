# feature is a test suite
# scenario is a test case
Feature: login LG_01

  Background: 
    Given User navigate to the Web LG_01

  Scenario: User want to Login
    When User Click Button Masuk LG_01
    And Fill E-Mail LG_01
    And Fill Password LG_01
    And Click Button Masuk Submit Login LG_01
    Then Sucessfully Login LG_01

    


  