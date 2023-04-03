package search_product
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



class HomepageHP03 {
    /**
     * The step definitions below match with Katalon sample Gherkin steps
     */
    @Given("User navigate to the Web HP_03")
    def NavigateToHome() {
        def url   = GlobalVariable.secondhand
        WebUI.callTestCase(findTestCase('Test Cases/secondhand-web/helper/general_command/open_browser'), [('url') :url], FailureHandling.STOP_ON_FAILURE)
    }
    @When("User Click Button Masuk HP_03")
    def ClickButtonMasuk() {
        WebUI.callTestCase(findTestCase('secondhand-web/helper/home/click_button_masuk'), null, FailureHandling.STOP_ON_FAILURE)
    }

    @And("Fill E-Mail HP_03")
    def FillEmail() {
        WebUI.callTestCase(findTestCase('secondhand-web/helper/login/fill_email'),null, FailureHandling.STOP_ON_FAILURE)
    }

    @And("Fill Password HP_03")
    def FillPassword() {
        WebUI.callTestCase(findTestCase('secondhand-web/helper/login/fill_password'),null, FailureHandling.STOP_ON_FAILURE)
    }

    @And("Click Button Masuk Submit Login HP_03")
    def ClickSubmitLogin() {
        WebUI.callTestCase(findTestCase('secondhand-web/helper/login/click_submit_login'),null, FailureHandling.STOP_ON_FAILURE)
    }


    @And("Typed in the keyword that is not exist in product on search field HP_03")
    def TypedInKeyword() {
        WebUI.callTestCase(findTestCase('secondhand-web/helper/search_product/fill_keyword_HP03'),null, FailureHandling.STOP_ON_FAILURE)
    }

    @Then("Product will not show HP_03")
    def VerifyProduct() {
        WebUI.callTestCase(findTestCase('secondhand-web/helper/search_product/verify_product_HP03'), null , FailureHandling.STOP_ON_FAILURE)
    }
}