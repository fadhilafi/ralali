# feature is a test suite
# scenario is a test case
Feature: addproduct

  Background: 
    Given User navigate to the Web Secondhand PD05

  Scenario: Add product PD05
    When User Click Button Masuk PD05
    And Fill E-Mail PD05
    And Fill Password PD05
    And Click Button Masuk Login PD05
    And Click Button Jual PD05
    And Fill Nama Produk PD05
    And Choose Select Kategori PD05
    And Fill Harga Produk PD05
    And Fill Deskripsi PD05
    And Upload Foto PD05
    Then Click Button Terbitkan PD05