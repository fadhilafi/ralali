# feature is a test suite
# scenario is a test case
Feature: Homepage HP_02

  Background: 
    Given User navigate to the Web HP_02

  Scenario: User  able to search product HP_02
    When User Click Button Masuk HP_02
    And Fill E-Mail HP_02
    And Fill Password HP_02
    And Click Button Masuk Submit Login HP_02
    And Typed in the keyword on search field HP_02
    Then Product will show based on keyword searched HP_02
