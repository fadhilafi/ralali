# feature is a test suite
# scenario is a test case
Feature: login LGA_02

  Background: 
    Given Open App to Login LGA_02

  Scenario: User want to Login
    When User Click on Akun button LGA_02
    And Click on Masuk button LGA_02
    And Fill in Email that is not registered LGA_02
    And Fill in  incorrect Password LGA_02
    And Click on Masuk Login Button LGA_02
    Then Unsuccessful to Login LGA_02