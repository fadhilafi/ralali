# feature is a test suite
# scenario is a test case
Feature: app_bid_a_price_zero

  Background: 
    Given Open App For Bid A Price Zero

  Scenario: Bid A Price Zero
    When Tap Akun for Bid A Price Zero
    And Tap Masuk for Bid A Price Zero
    And Login for Bid A Price Zero
    And Click Icon Beranda for Bid A Price Zero
    And Tap Product Detail for Bid A Price Zero
    And Tap  Saya Tertarik Dan Ingin Nego button Zero
    And Fill in Harga Tawar Zero
    Then Click on Kirim button Zero
