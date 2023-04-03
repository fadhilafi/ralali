# feature is a test suite
# scenario is a test case
Feature: submit_offer

  Background: 
    Given User navigate to the Web BP02

  Scenario: Submit Offer BP02
    When User Click Button Masuk BP02
    And Fill E-Mail BP02 
    And Fill Passwoord BP02
    And Click Button Masuk Login BP02
    And Click Product BP02
    And Click Button Saya Tertarik BP02
    And Fill Harga Tawar BP02
    Then Click Kirim BP02
