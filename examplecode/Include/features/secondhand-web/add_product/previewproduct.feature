# feature is a test suite
# scenario is a test case
Feature: addproduct

  Background: 
    Given User navigate to the Web Secondhand PD02

  Scenario: Preview product PD02
    When User Click Button Masuk PD02
    And Fill E-Mail PD02
    And Fill Password PD02
    And Click Button Masuk Login PD02
    And Click Button Jual PD02
    And Fill Nama Produk PD02
    And Choose Select Kategori PD02
    And Fill Harga Produk PD02
    And Fill Deskripsi PD02
    And Upload Foto PD02
    Then Click Button Preview PDO2