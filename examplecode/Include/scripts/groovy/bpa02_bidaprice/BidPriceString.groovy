package bpa02_bidaprice
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



class BidPriceString {
    /**
     * The step definitions below match with Katalon sample Gherkin steps
     */

    @Given("Open App For Bid A Price String")
    def OpenAppBidAPriceString() {
        Mobile.callTestCase(findTestCase('secondhand-app/helper/start_application'), null , FailureHandling.STOP_ON_FAILURE)
    }

    @When("Tap Akun for Bid A Price String")
    def TapAkunBidAPriceString() {
        Mobile.callTestCase(findTestCase('secondhand-app/helper/beranda/click_akun'), null, FailureHandling.STOP_ON_FAILURE)
    }

    @And("Tap Masuk for Bid A Price String")
    def MasukBidAPriceString() {
        Mobile.callTestCase(findTestCase('secondhand-app/helper/beranda/click_masuk'),null, FailureHandling.STOP_ON_FAILURE)
    }
    @And("Login for Bid A Price String")
    def LoginBidAPriceString() {
        Mobile.callTestCase(findTestCase('secondhand-app/helper/login'),null, FailureHandling.STOP_ON_FAILURE)
    }

    @And("Click Icon Beranda for Bid A Price String")
    def ClickBerandaBidAPriceString() {
        Mobile.callTestCase(findTestCase('secondhand-app/helper/beranda/click_icon_beranda'),null, FailureHandling.STOP_ON_FAILURE)
    }

    @And("Tap Product Detail for Bid A Price String")
    def TapProductDetailBidPriceString() {
        Mobile.callTestCase(findTestCase('secondhand-app/helper/beranda/click_product'),null, FailureHandling.STOP_ON_FAILURE)
    }

    @And("Tap  Saya Tertarik Dan Ingin Nego button String")
    def TapButtonSayaTertarikdanInginNegoString() {
        Mobile.callTestCase(findTestCase('secondhand-app/helper/bid_a_price/click_saya_tertarik_dan_nego'),null, FailureHandling.STOP_ON_FAILURE)
    }

    @And("Fill in Harga Tawar String")
    def FillHargaTawarString() {
        Mobile.callTestCase(findTestCase('secondhand-app/helper/bid_a_price/set_bid_a_price_string'),null, FailureHandling.STOP_ON_FAILURE)
    }

    @Then("Click on Kirim button String")
    def ClickButtonBidAPriceString() {
        Mobile.callTestCase(findTestCase('secondhand-app/helper/bid_a_price/kirim_button_bidaprice'), null , FailureHandling.STOP_ON_FAILURE)
    }
}