Feature: Register Page WEB 

  #Postive
  Scenario: User Register 
    Given User visit https://deployed-five.vercel.app/ from web browser RG_04
    When Click on Masuk button RG_04
    And Click on Daftar di sini RG_04
    And Fill in nama lengkap field RG_04
    And Fill in email field with incorrect format RG_04
    And Fill in password field RG_04
    And Click on Daftar button RG_04
    Then Cannot Register RG_04
