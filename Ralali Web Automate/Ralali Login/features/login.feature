@Login
Feature: Login

@ValidLogin @smoke
Scenario: TC_2001 - User login valid Email and Password
    Given User open www.ralali.com/marketplace
    And User fill field Eamil atau Nomor Ponsel
    And User fill field Password
    And User Click button Masuk
    Then User navigates to homepage ralali.com/marketplace

@InvalidLogin @smoke
Scenario: TC_2002 - User login invalid Email and Password
    Given User open www.ralali.com/marketplace
    And User fill field Eamil atau Nomor Ponsel
    And User fill field Invalid Password
    And User Click button Masuk
    Then System should be show error notification Login failed with error message

