# feature is a test suite
# scenario is a test case
Feature: login LGA_03

  Background: 
    Given Open App to Login LGA_03

  Scenario: User want to Login
    When User Click on Akun button LGA_03
    And Click on Masuk button LGA_03
    And Fill out email field LGA_03
    And Fill out password field LGA_03
    And Click on Masuk Login Button LGA_03
    Then Unsuccessful to Login LGA_03