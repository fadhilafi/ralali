Feature: Register Page WEB 

  #Negative
  Scenario: User Register With Unvalid Data
    Given User visit https://deployed-five.vercel.app/ from web browser RG_03
    When Click on Masuk button RG_03
    And Click on Daftar di sini RG_03
    And Fill out nama lengkap field RG_03
    And Fill out email field RG_03
    And Fill out password field RG_03
    And Click on Daftar button RG_03
    Then Unsucessfully sign up RG_03
