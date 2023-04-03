package edit_product
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



class ProductTerbit01 {
    /**
     * The step definitions below match with Katalon sample Gherkin steps
     */
    @Given("User navigate to web 01")
    def NavigateToWebAndLogin() {
        def url   = GlobalVariable.secondhand
        WebUI.callTestCase(findTestCase('secondhand-web/helper/product_edit/edit_terbitkan/open_web'), [('url') :url], FailureHandling.STOP_ON_FAILURE)
    }

    @When("User click Button login 01")
    def ClickLogin() {
        WebUI.callTestCase(findTestCase('secondhand-web/helper/product_edit/edit_terbitkan/click_login'), null, FailureHandling.STOP_ON_FAILURE)
    }

    @And("User fill email with correct email 01")
    def FillCorrectEmail() {
        WebUI.callTestCase(findTestCase('secondhand-web/helper/product_edit/edit_terbitkan/fill_email01'), null, FailureHandling.STOP_ON_FAILURE)
    }

    @And("User fill password with correct password 01")
    def FillCorrectPassword() {
        WebUI.callTestCase(findTestCase('secondhand-web/helper/product_edit/edit_terbitkan/fill_passw'), null, FailureHandling.STOP_ON_FAILURE)
    }

    @And("User click Button submit 01")
    def ClickSubmit() {
        WebUI.callTestCase(findTestCase('secondhand-web/helper/product_edit/edit_terbitkan/click_submit'), null, FailureHandling.STOP_ON_FAILURE)
    }

    @And("User click Button hamburger list 01")
    def ClickButtonHamburger() {
        WebUI.callTestCase(findTestCase('secondhand-web/helper/product_edit/edit_terbitkan/click_hamburger'), null, FailureHandling.STOP_ON_FAILURE)
    }

    @And("click the product 01")
    def ClickProductterbit() {
        WebUI.callTestCase(findTestCase('secondhand-web/helper/product_edit/edit_terbitkan/click_product'),null, FailureHandling.STOP_ON_FAILURE)
    }

    @And("click Button Edit 01")
    def ClickEdit01() {
        WebUI.callTestCase(findTestCase('secondhand-web/helper/product_edit/edit_terbitkan/click_edit'),null, FailureHandling.STOP_ON_FAILURE)
    }

    @And("modify data 01")
    def FillModify() {
        WebUI.callTestCase(findTestCase('secondhand-web/helper/product_edit/edit_terbitkan/modify_text'),null, FailureHandling.STOP_ON_FAILURE)
    }

    @And("scrolldown 01")
    def ScrolltoDown() {
        WebUI.callTestCase(findTestCase('secondhand-web/helper/product_edit/edit_terbitkan/scrolldown_click_terbitkan'), null, FailureHandling.STOP_ON_FAILURE)
    }

    @Then("Click terbitkan 01")
    def ClickTerbitkan() {
        WebUI.callTestCase(findTestCase('secondhand-web/helper/product_edit/edit_terbitkan/click_terbitkan'), null , FailureHandling.STOP_ON_FAILURE)
    }
}