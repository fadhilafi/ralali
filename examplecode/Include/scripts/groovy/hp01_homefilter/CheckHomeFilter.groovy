package hp01_homefilter
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



public class CheckHomeFilter {
    /**
     * The step definitions below match with Katalon sample Gherkin steps
     */
    @Given("User navigate to the Web Secondhand to filter")
    def NavigateToHomeHF() {
        def url   = GlobalVariable.secondhand
        WebUI.callTestCase(findTestCase('secondhand-web/helper/general_command/open_browser'), [('url') :url], FailureHandling.STOP_ON_FAILURE)
    }
    @When("User Click Button Masuk to filter")
    def ClickButtonMasukHF() {
        WebUI.callTestCase(findTestCase('secondhand-web/helper/home/click_button_masuk'), null, FailureHandling.STOP_ON_FAILURE)
    }

    @And("Fill E-Mail to filter")
    def FillEmailHF() {
        WebUI.callTestCase(findTestCase('secondhand-web/helper/login/fill_email'),null, FailureHandling.STOP_ON_FAILURE)
    }

    @And("Fill Password to filter")
    def FillPasswordHF() {
        WebUI.callTestCase(findTestCase('secondhand-web/helper/login/fill_password'),null, FailureHandling.STOP_ON_FAILURE)
    }

    @And("Click Button Masuk Login to filter")
    def ClickButtonMasukLoginHF() {
        WebUI.callTestCase(findTestCase('secondhand-web/helper/login/click_button_masuk'), null, FailureHandling.STOP_ON_FAILURE)
    }
    @And("Click Button Hoby to filter")
    def ClickButtonHobyHF() {
        WebUI.callTestCase(findTestCase('secondhand-web/helper/home/click_filter_hoby_button'), null, FailureHandling.STOP_ON_FAILURE)
    }

    @Then("Product will show based on category filters to filter")
    def VerifyFilterHF() {
        WebUI.callTestCase(findTestCase('secondhand-web/helper/home/verify_text_hoby'), null , FailureHandling.STOP_ON_FAILURE)
    }
}
