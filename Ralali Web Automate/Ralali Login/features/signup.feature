@Signup
Feature: Signup

@ValidLogin @smoke
Scenario: TC_1001 - User Signup with valid Email and Password
    Given User open www.ralali.com/marketplace
    And User klik button Daftar
    And User choose Jenis Kebutuhan
    And User Fill Field Nama Lengkap
    And User fill field Email atau No Ponsel
    And User fill field Password
    And User fill field Ulangi Password
    And User Check Radio Button Syarat dan Ketentuan
    And User Click button Daftar
    And User Click Verifikasi Email
    And User fill field Kode verifikasi
    Then User navigates to homepage ralali.com/marketplace

@InvalidLogin @smoke
Scenario: TC_1002 - User Signup invalid Email and Password
    Given User open www.ralali.com/marketplace
    And User klik button Daftar
    And User choose Jenis Kebutuhan
    And User Fill Field Nama Lengkap
    And User fill field invalid Email atau No Ponsel
    And User fill field Password
    And User fill field Ulangi Password
    And User Check Radio Button Syarat dan Ketentuan
    And User Click button Daftar
    And User Click Verifikasi Email
    And User fill field Kode verifikasi
    Then User get notification Signup failed with error message

