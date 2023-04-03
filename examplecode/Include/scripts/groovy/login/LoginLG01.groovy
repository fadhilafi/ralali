package login
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



class LoginLG01 {
    /**
     * The step definitions below match with Katalon sample Gherkin steps
     */
    @Given("User navigate to the Web LG_01")
    def NavigateToHome() {
        def url   = GlobalVariable.secondhand
        WebUI.callTestCase(findTestCase('Test Cases/secondhand-web/helper/general_command/open_browser'), [('url') :url], FailureHandling.STOP_ON_FAILURE)
    }
    @When("User Click Button Masuk LG_01")
    def ClickButtonMasuk() {
        WebUI.callTestCase(findTestCase('secondhand-web/helper/home/click_button_masuk'), null, FailureHandling.STOP_ON_FAILURE)
    }

    @And("Fill E-Mail LG_01")
    def FillEmail() {
        WebUI.callTestCase(findTestCase('secondhand-web/helper/login/fill_email'),null, FailureHandling.STOP_ON_FAILURE)
    }

    @And("Fill Password LG_01")
    def FillPassword() {
        WebUI.callTestCase(findTestCase('secondhand-web/helper/login/fill_password'),null, FailureHandling.STOP_ON_FAILURE)
    }

    @And("Click Button Masuk Submit Login LG_01")
    def ClickSubmitLogin() {
        WebUI.callTestCase(findTestCase('secondhand-web/helper/login/click_submit_login'),null, FailureHandling.STOP_ON_FAILURE)
    }


    @Then("Sucessfully Login LG_01")
    def VerifyBeranda() {
        WebUI.callTestCase(findTestCase('secondhand-web/helper/login/verify_beranda'), null , FailureHandling.STOP_ON_FAILURE)
    }
}