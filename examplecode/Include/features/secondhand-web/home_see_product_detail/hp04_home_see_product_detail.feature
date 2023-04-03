# feature is a test suite
# scenario is a test case
Feature: Home_See_Product_Detail

  Background: 
    Given User navigate to the Web SH

  Scenario: See Product Detail
    When User Click Button Masuk
    And Fill E-Mail SH
    And Fill Password SH
    And Click Button Masuk Login SH
    And Click Product
    Then Product detail will show
