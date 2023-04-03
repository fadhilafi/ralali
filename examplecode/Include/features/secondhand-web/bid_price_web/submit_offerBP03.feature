# feature is a test suite
# scenario is a test case
Feature: submit_offer

  Background: 
    Given User navigate to the Web BP03

  Scenario: Submit Offer BP03
    When User Click Button Masuk BP03
    And Fill E-Mail BP03 
    And Fill Passwoord BP03
    And Click Button Masuk Login BP03
    And Click Product BP03
    And Click Button Saya Tertarik BP03
    And Fill Harga Tawar BP03
    Then Click Kirim BP03
