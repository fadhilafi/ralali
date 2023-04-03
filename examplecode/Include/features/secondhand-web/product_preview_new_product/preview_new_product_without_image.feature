
Feature: Preview new product prd02a

  Scenario: user want to preview new product without uploading image
    Given user go to homepage prd02a
    When user click jual button prd02a
    Then user enter credentials prd02a
    And user enter new product detail prd02a
    Then user click on preview button prd02a
    
