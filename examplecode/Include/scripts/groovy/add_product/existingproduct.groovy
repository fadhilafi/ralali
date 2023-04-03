package add_product
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



class existingproduct {
    /**
     * The step definitions below match with Katalon sample Gherkin steps
     */
    @Given("User navigate to the Web Secondhand PD05")
    def NavigateToHome() {
        def url   = GlobalVariable.secondhand
        WebUI.callTestCase(findTestCase('Test Cases/secondhand-web/helper/general_command/open_browser'), [('url') :url], FailureHandling.STOP_ON_FAILURE)
    }
    @When("User Click Button Masuk PD05")
    def ClickButtonMasuk() {
        WebUI.callTestCase(findTestCase('secondhand-web/helper/home/click_button_masuk'), null, FailureHandling.STOP_ON_FAILURE)
    }

    @And("Fill E-Mail PD05")
    def FillEmail() {
        WebUI.callTestCase(findTestCase('secondhand-web/helper/login/fill_email'),null, FailureHandling.STOP_ON_FAILURE)
    }

    @And("Fill Password PD05")
    def FillPassword() {
        WebUI.callTestCase(findTestCase('secondhand-web/helper/login/fill_password'),null, FailureHandling.STOP_ON_FAILURE)
    }

    @And("Click Button Masuk Login PD05")
    def ClickButtonMasukLogin() {
        WebUI.callTestCase(findTestCase('secondhand-web/helper/login/click_submit_login'), null, FailureHandling.STOP_ON_FAILURE)
    }
    @And("Click Button Jual PD05")
    def ClickButtonJual() {
        WebUI.callTestCase(findTestCase('secondhand-web/helper/add_product/addproduct'), null, FailureHandling.STOP_ON_FAILURE)
    }
    @And("Fill Nama Produk PD05")
    def FillNamaProduk() {
        WebUI.callTestCase(findTestCase('secondhand-web/helper/add_product/fill_namaproduk'),null, FailureHandling.STOP_ON_FAILURE)
    }

    @And("Fill Harga Produk PD05")
    def FillHargaProduk() {
        WebUI.callTestCase(findTestCase('secondhand-web/helper/add_product/fill_hargaproduk_string'),null, FailureHandling.STOP_ON_FAILURE)
    }

    @And("Choose Select Kategori PD05")
    def Selectkategori() {
        WebUI.callTestCase(findTestCase('secondhand-web/helper/add_product/select_kategori'),null, FailureHandling.STOP_ON_FAILURE)
    }

    @And("Fill Deskripsi PD05")
    def FillDeskripsi() {
        WebUI.callTestCase(findTestCase('secondhand-web/helper/add_product/fill_deskripsi'),null, FailureHandling.STOP_ON_FAILURE)
    }

    @And("Upload Foto PD05")
    def UploadFoto() {
        WebUI.callTestCase(findTestCase('Test Cases/secondhand-web/helper/add_product/select_photo'),null, FailureHandling.STOP_ON_FAILURE)
    }

    @Then("Click Button Terbitkan PD05")
    def Clickterbitkan() {
        WebUI.callTestCase(findTestCase('secondhand-web/helper/add_product/submit_product'),null, FailureHandling.STOP_ON_FAILURE)
    }
}