# feature is a test suite
# scenario is a test case
Feature: login LGA_01

  Background: 
    Given Open App to Login LGA_01

  Scenario: User want to Login
    When User Click on Akun button LGA_01
    And Click on Masuk button LGA_01
    And Fill in Email Field LGA_01
    And Fill in Password Field LGA_01
    And Click on Masuk Login Button LGA_01
    Then Sucessfully Login LGA_01