require 'selenium-webdriver'

options = Selenium::WebDriver::Chrome::Options.new
options.add_argument('--maximize')
options.add_argument('--incognito')
driver = Selenium::WebDriver.for:chrome,options:options

#Scenario: TC_1001 - User Signup with valid Email and Password
Given("User open https://www.ralali.com/marketplace") do
    driver.navigate.to 'https://www.ralali.com/marketplace'
    sleep(2)
    driver.find_element(:xpath,'//*[@id="__next"]/div/div[1]/div/div[2]/div[1]/a/button').click
    sleep(2)
end
And("User klik button Daftar") do
    driver.find_element(:xpath,'//*[@id="modal"]/div/div/div/div/form/div[2]/h6/a').click
    sleep(2)
end
And("User choose Jenis Kebutuhan") do
    driver.find_element(:id,'card-Bisnis').click
    sleep(2)
end
And("User Fill Field Nama Lengkap") do
    valid_nama = 'Fadhila'
    driver.find_element(:xpath,'//*[@id="fullname"]').send_keys(valid_nama)
    sleep(2)
end
And("User fill field Email atau No Ponsel") do
    valid_email = 'fadhilafi06@gmail.com'
    driver.find_element(:xpath,'//*[@id="username"]').send_keys(valid_email)
    sleep(2)
end
And("User fill field Password") do
    valid_pass = 'Maulana8$'
    driver.find_element(:xpath,'//*[@id="__next"]/div/main/div[2]/div/form/div[1]/div[4]/div/div/input').send_keys(valid_pass)
    sleep(2)
end
And("User fill field Ulangi Password") do
    valid_pass1 = 'Maulana8$'
    driver.find_element(:xpath,'//*[@id="__next"]/div/main/div[2]/div/form/div[1]/div[5]/div/div/input').send_keys(valid_pass1)
    sleep(2)
end
And("User Check Radio Button Syarat dan Ketentuan") do
    driver.find_element(:xpath,'//*[@id="__next"]/div/main/div[2]/div/form/div[1]/div[4]/div/span/span').click
    sleep(2)
end
And("User Click button Daftar") do
    driver.find_element(:xpath,'//*[@id="__next"]/div/main/div[2]/div/form/div[2]/button').click
    sleep(2)
end
And("User Click Verifikasi Email") do
    driver.find_element(:xpath,'///*[@id="modal"]/div/div/div/div/div/div[3]/div/div[1]/p[1]').click
    sleep(2)
end
And("User fill field Kode verifikasi") do
    valid_kode = '546783'
    driver.find_element(:xpath,'//*[@id="__next"]/div/main/div[2]/div/form/div[1]/div[5]/div/div/input').send_keys(valid_kode)
    sleep(2)
end
Then("User navigates to homepage marketplace Ralali") do
    driver.navigate.to 'https://www.ralali.com/marketplace'
    sleep(2)
end 


#Scenario: TC_1002 - User Signup with invalid Email and Password
Given("User open https://www.ralali.com/marketplace") do
    driver.navigate.to 'https://www.ralali.com/marketplace'
    sleep(2)
    driver.find_element(:xpath,'//*[@id="__next"]/div/div[1]/div/div[2]/div[1]/a/button').click
    sleep(2)
end
And("User klik button Daftar") do
    driver.find_element(:xpath,'//*[@id="modal"]/div/div/div/div/form/div[2]/h6/a').click
    sleep(2)
end
And("User choose Jenis Kebutuhan") do
    driver.find_element(:id,'card-Bisnis').click
    sleep(2)
end
And("User Fill Field Nama Lengkap") do
    valid_nama = 'Fadhila'
    driver.find_element(:xpath,'//*[@id="fullname"]').send_keys(valid_nama)
    sleep(2)
end
And("User fill field Email atau No Ponsel") do
    valid_email = 'fadhilatest@mailinator.com'
    driver.find_element(:xpath,'//*[@id="username"]').send_keys(valid_email)
    sleep(2)
end
And("User fill field Password") do
    valid_pass = 'Maulana8$'
    driver.find_element(:xpath,'//*[@id="__next"]/div/main/div[2]/div/form/div[1]/div[4]/div/div/input').send_keys(valid_pass)
    sleep(2)
end
And("User fill field Ulangi Password") do
    valid_pass1 = 'Maulana8$'
    driver.find_element(:xpath,'//*[@id="__next"]/div/main/div[2]/div/form/div[1]/div[5]/div/div/input').send_keys(valid_pass1)
    sleep(2)
end
And("User Check Radio Button Syarat dan Ketentuan") do
    driver.find_element(:xpath,'//*[@id="__next"]/div/main/div[2]/div/form/div[1]/div[4]/div/span/span').click
    sleep(2)
end
And("User Click button Daftar") do
    driver.find_element(:xpath,'//*[@id="__next"]/div/main/div[2]/div/form/div[2]/button').click
    sleep(2)
end
And("User Click Verifikasi Email") do
    driver.find_element(:xpath,'///*[@id="modal"]/div/div/div/div/div/div[3]/div/div[1]/p[1]').click
    sleep(2)
end
And("User fill field Kode verifikasi") do
    valid_kode = '546783'
    driver.find_element(:xpath,'//*[@id="__next"]/div/main/div[2]/div/form/div[1]/div[5]/div/div/input').send_keys(valid_kode)
    sleep(2)
end
Then("User navigates to popup email already been taken") do
    driver.find_element(:xpath,'//*[@id="modal"]/div/div/div/div/h4')
    sleep(2)
end 


