Feature: Register Page WEB 

  #Postive
  Scenario: User Register With Valid Data
    Given User visit https://deployed-five.vercel.app/ from web browser RG_01
    When Click on Masuk button RG_01
    And Click on Daftar di sini RG_01
    And Fill in nama lengkap field RG_01
    And Fill in email field RG_01
    And Fill in password field RG_01 
    And Click on Daftar button RG_01
    Then Sucessfully sign up RG_01
