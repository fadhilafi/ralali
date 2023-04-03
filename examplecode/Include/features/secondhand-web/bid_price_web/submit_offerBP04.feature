# feature is a test suite
# scenario is a test case
Feature: submit_offer

  Background: 
    Given User navigate to the Web BP04

  Scenario: Submit Offer BP04
    When User Click Button Masuk BP04
    And Fill E-Mail BP04 
    And Fill Passwoord BP04
    And Click Button Masuk Login BP04
    And Click Product BP04
    And Click Button Saya Tertarik BP04
    And Fill Harga Tawar BP04
    Then Click Kirim BP04
