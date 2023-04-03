# feature is a test suite
# scenario is a test case
Feature: addproduct

  Background: 
    Given User navigate to the Web Secondhand PD04

  Scenario: Add product PD04
    When User Click Button Masuk PD04
    And Fill E-Mail PD04
    And Fill Password PD04
    And Click Button Masuk Login PD04
    And Click Button Jual PD04
    And Fill Nama Produk PD04
    And Choose Select Kategori PD04
    And Fill Harga Produk PD04
    And Fill Deskripsi PD04
    And Upload Foto PD04
    Then Click Button Terbitkan PDO4