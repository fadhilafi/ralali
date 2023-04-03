# feature is a test suite
# scenario is a test case
Feature: app_bid_a_price_String

  Background: 
    Given Open App For Bid A Price String

  Scenario: Bid A Price String
    When Tap Akun for Bid A Price String
    And Tap Masuk for Bid A Price String
    And Login for Bid A Price String
    And Click Icon Beranda for Bid A Price String
    And Tap Product Detail for Bid A Price String
    And Tap  Saya Tertarik Dan Ingin Nego button String
    And Fill in Harga Tawar String
    Then Click on Kirim button String
