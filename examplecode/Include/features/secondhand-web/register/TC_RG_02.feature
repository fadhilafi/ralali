Feature: Register Page WEB 

  #Postive
  Scenario: User Register 
    Given User visit https://deployed-five.vercel.app/ from web browser RG_02
    When Click on Masuk button RG_02
    And Click on Daftar di sini RG_02
    And Fill in nama lengkap field RG_02
    And Fill in email field using email that already registered RG_02
    And Fill in password field RG_02
    And Click on Daftar button RG_02
    Then Cannot Register RG_02