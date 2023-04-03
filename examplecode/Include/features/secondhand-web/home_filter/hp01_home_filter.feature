# feature is a test suite
# scenario is a test case
Feature: Home_Filter

  Background: 
    Given User navigate to the Web Secondhand to filter

  Scenario: See Product Detail to filter
    When User Click Button Masuk to filter
    And Fill E-Mail to filter
    And Fill Password to filter
    And Click Button Masuk Login to filter
    And Click Button Hoby to filter
    Then Product will show based on category filters to filter
