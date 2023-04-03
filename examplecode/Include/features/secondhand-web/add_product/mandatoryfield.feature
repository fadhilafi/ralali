# feature is a test suite
# scenario is a test case
Feature: mandatoryfield

  Background: 
    Given User navigate to the Web Secondhand PD03

  Scenario: Add product PD03
    When User Click Button Masuk PD03
    And Fill E-Mail PD03
    And Fill Password PD03
    And Click Button Masuk Login PD03
    And Click Button Jual PD03
    And Fill Nama Produk PD03
    And Choose Select Kategori PD03
    And Fill Harga Produk PD03
    And Fill Deskripsi PD03
    And Upload Foto PD03
    Then Click Button Terbitkan PDO3