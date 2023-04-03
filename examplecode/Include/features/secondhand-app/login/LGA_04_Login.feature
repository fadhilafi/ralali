# feature is a test suite
# scenario is a test case
Feature: login LGA_04

  Background: 
    Given Open App to Login LGA_04

  Scenario: User want to Login
    When User Click on Akun button LGA_04
    And Click on Masuk button LGA_04
    And Fill in email without '@' character LGA_04
    And Fill in password field LGA_04
    And Click on Masuk Login Button LGA_04
    Then Unsuccessful to Login LGA_04