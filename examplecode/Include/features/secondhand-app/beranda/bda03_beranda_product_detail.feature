# feature is a test suite
# scenario is a test case
Feature: app_product_detail

  Background: 
    Given Open App For Product Detail

  Scenario: Verify Product Detail
    When Tap Akun for Product Detail
    And Tap Masuk for Product Detail
    And Login for Product Detail
    And Click Icon Beranda for Product Detail
    And Tap Product Detail
    Then Product Detail Will Show
