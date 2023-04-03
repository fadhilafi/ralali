# feature is a test suite
# scenario is a test case
Feature: submit_offer

  Background: 
    Given User navigate to the Web BP01

  Scenario: Submit Offer BP01
    When User Click Button Masuk BP01
    And Fill E-Mail BP01 
    And Fill Passwoord BP01
    And Click Button Masuk Login BP01
    And Click Product BP01
    And Click Button Saya Tertarik BP01
    And Fill Harga Tawar BP01
    Then Click Kirim BP01
