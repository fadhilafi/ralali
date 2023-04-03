package akn01_see_akun
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class See_akun {
    /**
     * The step definitions below match with Katalon sample Gherkin steps
     */
    @Given("user go to homepage akn01")
    def gotohomeakn01() {
        
        WebUI.openBrowser('https://deployed-five.vercel.app/')
    }

    @Then("user click login and enter credentials akn01")
    def clickloginandentercredenticalakn01() {
        
        WebUI.click(findTestObject('Object Repository/secondhand-web/see_akun/Page_Secondhand Store/a_Masuk'))
        
        WebUI.setText(findTestObject('Object Repository/secondhand-web/see_akun/Page_Secondhand Store/input_Email_exampleInputEmail1'),
            'binarqae1@gmail.com')
        
        WebUI.setText(findTestObject('Object Repository/secondhand-web/see_akun/Page_Secondhand Store/input_Password_exampleInputPassword1'),
            'students1234')
        
        WebUI.click(findTestObject('Object Repository/secondhand-web/see_akun/Page_Secondhand Store/button_Masuk'))
    }

    @Then("user click on profile button akn01")
    def clickprofilebuttonakno1() {
        
        WebUI.click(findTestObject('Object Repository/secondhand-web/see_akun/Page_Secondhand Store/button_Log Out_user'))
    }
    
    @Then("user click on akun button akn01")
    def clickakunbuttonakn01() {
        WebUI.click(findTestObject('Object Repository/secondhand-web/see_akun/Page_Secondhand Store/a_Profile'))
    }
}