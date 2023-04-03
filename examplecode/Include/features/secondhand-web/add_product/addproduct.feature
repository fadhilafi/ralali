# feature is a test suite
# scenario is a test case
Feature: addproduct

  Background: 
    Given User navigate to the Web Secondhand PD01

  Scenario: Add product PD01
    When User Click Button Masuk PD01
    And Fill E-Mail PD01
    And Fill Password PD01
    And Click Button Masuk Login PD01
    And Click Button Jual PD01
    And Fill Nama Produk PD01
    And Choose Select Kategori PD01
    And Fill Harga Produk PD01
    And Fill Deskripsi PD01
    And Upload Foto PD01
    Then Click Button Terbitkan PDO1