package register
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



public class TC_RG_03 {
    /**
     * The step definitions below match with Katalon sample Gherkin steps
     */
    @Given("User visit https://deployed-five.vercel.app/ from web browser RG_03")
    def navigateToRegister_03Url() {
        def url = GlobalVariable.secondhand
        WebUI.callTestCase(findTestCase('secondhand-web/helper/general_command/open_browser'), [('url') : url], FailureHandling.STOP_ON_FAILURE)
    }

    @When("Click on Masuk button RG_03")
    def clickMasukButton() {
        WebUI.callTestCase(findTestCase('secondhand-web/helper/register/button_masuk'), null, FailureHandling.STOP_ON_FAILURE)
    }

    @And("Click on Daftar di sini RG_03")
    def clickDaftarDisini() {
        WebUI.callTestCase(findTestCase('secondhand-web/helper/register/button_daftar_disni'), null, FailureHandling.STOP_ON_FAILURE)
    }

    @And("Fill out nama lengkap field RG_03")
    def clickfieldnama() {
        WebUI.callTestCase(findTestCase('secondhand-web/helper/register/fill_out_nama_lengkap'), null, FailureHandling.STOP_ON_FAILURE)
    }

    @And("Fill out email field RG_03")
    def clickfieldemail() {
        WebUI.callTestCase(findTestCase('secondhand-web/helper/register/fill_out_email'), null, FailureHandling.STOP_ON_FAILURE)
    }

    @And("Fill out password field RG_03")
    def clickfieldpassword() {
        WebUI.callTestCase(findTestCase('secondhand-web/helper/register/fill_out_password'), null, FailureHandling.STOP_ON_FAILURE)
    }

    @And("Click on Daftar button RG_03")
    def clickDaftarButton() {
        WebUI.callTestCase(findTestCase('secondhand-web/helper/register/button_daftar'), null, FailureHandling.STOP_ON_FAILURE)
    }

    @Then("Unsucessfully sign up RG_03")
    def I_verify_the_status_in_step() {
        println 'Unsucessfully sign up (test case RG_03)'
    }
}
