package pdt02_product_terjual
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



class ProductTerjual {
    /**
     * The step definitions below match with Katalon sample Gherkin steps
     */
    @Given("User has navigate to web PDT 02")
    def NavigateToWebAndLoginPDT01() {
        def url   = GlobalVariable.secondhand
        WebUI.callTestCase(findTestCase('secondhand-web/helper/product_diminati_terjual/open_web'), [('url') :url], FailureHandling.STOP_ON_FAILURE)
    }

    @When("User click Button login PDT 02")
    def clicklogin() {
        WebUI.callTestCase(findTestCase('secondhand-web/helper/product_diminati_terjual/click_login'), null, FailureHandling.STOP_ON_FAILURE)
    }

    @And("User fill email PDT 02")
    def FillCorrectEmail() {
        WebUI.callTestCase(findTestCase('secondhand-web/helper/product_diminati_terjual/fill_email01'), null, FailureHandling.STOP_ON_FAILURE)
    }

    @And("User fill password PDT 02")
    def FillCorrectPass() {
        WebUI.callTestCase(findTestCase('secondhand-web/helper/product_diminati_terjual/fill_passw'), null, FailureHandling.STOP_ON_FAILURE)
    }

    @And("User click Button submit PDT 02")
    def ClickSubmit() {
        WebUI.callTestCase(findTestCase('secondhand-web/helper/product_diminati_terjual/click_submit'), null, FailureHandling.STOP_ON_FAILURE)
    }

    @And("User click Button Hamburger list PDT 02")
    def ClickHamburgerlist02(int value) {
        WebUI.callTestCase(findTestCase('secondhand-web/helper/product_diminati_terjual/click_hamburger'), null, FailureHandling.STOP_ON_FAILURE)
    }

    @Then("User verify Button Terjual PDT 02")
    def ClickTerjual() {
        WebUI.callTestCase(findTestCase('secondhand-web/helper/product_diminati_terjual/verify_terjual'), null, FailureHandling.STOP_ON_FAILURE)
    }
}