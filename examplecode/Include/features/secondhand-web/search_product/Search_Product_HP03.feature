# feature is a test suite
# scenario is a test case
Feature: Homepage HP_03

  Background: 
    Given User navigate to the Web HP_03

  Scenario: User  able to search product HP_03
    When User Click Button Masuk HP_03
    And Fill E-Mail HP_03
    And Fill Password HP_03
    And Click Button Masuk Submit Login HP_03
    And Typed in the keyword that is not exist in product on search field HP_03
    Then Product will not show HP_03