# feature is a test suite
# scenario is a test case
Feature: login LG_06

  Background: 
    Given User navigate to the Web LG_06

 Scenario: User want to Login LG_06
    When User Click Button Masuk LG_06
    And Fill E-Mail without '@' character LG_06
    And Fill Password LG_06
    And Click Button Masuk Submit Login LG_06
    Then Unsuccessful to Login LG_06
    

    


  