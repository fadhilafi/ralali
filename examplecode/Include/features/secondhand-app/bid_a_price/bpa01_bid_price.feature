# feature is a test suite
# scenario is a test case
Feature: app_bid_a_price

  Background: 
    Given Open App For Bid A Price

  Scenario: Bid A Price
    When Tap Akun for Bid A Price
    And Tap Masuk for Bid A Price
    And Login for Bid A Price
    And Click Icon Beranda for Bid A Price
    And Tap Product Detail for Bid A Price
    And Tap  Saya Tertarik Dan Ingin Nego button
    And Fill in Harga Tawar
    Then Click on Kirim button
