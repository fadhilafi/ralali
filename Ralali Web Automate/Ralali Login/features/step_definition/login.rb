require 'selenium-webdriver'

options = Selenium::WebDriver::Chrome::Options.new
options.add_argument('--maximize')
options.add_argument('--incognito')
driver = Selenium::WebDriver.for:chrome,options:options

#Scenario: TC_2001 - User login valid Email and Password
Given("User open https://www.ralali.com/marketplace") do
    driver.navigate.to 'https://www.ralali.com/marketplace'
    sleep(2)
    driver.find_element(:xpath,'//*[@id="__next"]/div/div[1]/div/div[2]/div[1]/a/button').click
    sleep(2)
end

And("User fill field Eamil atau Nomor Ponsel") do
    valid_email = 'fadhilafi08@gmail.com'
    driver.find_element(:xpath,'_//*[@id="username"]').send_keys(valid_email)
    sleep(2)
end
And("User fill field Password") do
    valid_pass = 'Maulana8$'
    driver.find_element(:xpath,'//*[@id="modal"]/div/div/div/div/form/div[1]/div[2]/div/div/input').send_keys(valid_pass)
    sleep(2)
end
And("User Click button Masuk") do
    driver.find_element(:xpath,'//*[@id="modal"]/div/div/div/div/form/div[2]/button').click
    sleep(2)
end
Then("User navigates to homepage marketplace Ralali") do
    driver.navigate.to 'https://app.privy.id/dashboard'
    sleep(2)
end 


#Scenario: TC_2002 - User login invalid Email and Password
Given("User open https://www.ralali.com/marketplace") do
    driver.navigate.to 'https://www.ralali.com/marketplace'
    sleep(2)
    driver.find_element(:xpath,'//*[@id="__next"]/div/div[1]/div/div[2]/div[1]/a/button').click
    sleep(2)
end

And("User fill field Eamil atau Nomor Ponsel") do
    valid_email = 'fadhilafi08@gmail.com'
    driver.find_element(:xpath,'_//*[@id="username"]').send_keys(valid_email)
    sleep(2)
end
And("User fill field Password") do
    valid_pass = 'Maulana88$'
    driver.find_element(:xpath,'//*[@id="modal"]/div/div/div/div/form/div[1]/div[2]/div/div/input').send_keys(valid_pass)
    sleep(2)
end
And("User Click button Masuk") do
    driver.find_element(:xpath,'//*[@id="modal"]/div/div/div/div/form/div[2]/button').click
    sleep(2)
end
Then("User get allert Email atau kata sandi yang Anda masukkan salah.") do
    driver.find_element(:xpath,'//*[@id="modal"]/div/div/div/div/form/div[1]/div[3]/div[2]').click
    sleep(2)
end 