package prd02_preview_new_product
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



class preview_new_product {
    /**
     * The step definitions below match with Katalon sample Gherkin steps
     */
    @Given("user go to homepage prd02")
    def usergotohomepage () {
        println "user go to homepage"
        
        WebUI.openBrowser('https://deployed-five.vercel.app/')
    }

    @When("user click jual button prd02")
    def clickjualbutton () {
        println "user click jual button prd02"
        WebUI.click(findTestObject('Object Repository/Page_Secondhand Store/a_Jual'))
    }

    @Then("user enter credentials prd02")
    def entercredentials () {
        println "user enter credentials prd02"
        
        WebUI.setText(findTestObject('Object Repository/Page_Secondhand Store/input_Email_exampleInputEmail1'), 'binarqae1@gmail.com')
        WebUI.setText(findTestObject('Object Repository/Page_Secondhand Store/input_Password_exampleInputPassword1'), 'students1234')
        
        WebUI.click(findTestObject('Object Repository/Page_Secondhand Store/button_Masuk'))
    }
    
    @And("user enter new product detail prd02")
    def enterproductdetails () {
        println "user enter new product detail prd02"
        WebUI.click(findTestObject('Object Repository/Page_Secondhand Store/a_Jual'))
        
        WebUI.setText(findTestObject('Object Repository/Page_Secondhand Store/input_Nama Produk_nm_produk'), 'iphone14')
        
        WebUI.setText(findTestObject('Object Repository/Page_Secondhand Store/input_Harga Produk_harga_produk'), 'iphone14')
        
        WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Secondhand Store/select_Pilih KategoriHobyKendaraanBajuElekt_b1877d'),
            '4', true)
        
        WebUI.setText(findTestObject('Object Repository/Page_Secondhand Store/textarea_iphone14'), 'iphone14')
        
        WebUI.click(findTestObject('Object Repository/Page_Secondhand Store/svg_Foto Produk_bi bi-plus-square-dotted mt-2'))
    }
    
    @Then("user click on preview button prd02")
    def clickpreview () {
        println "user click on preview button prd02"
        WebUI.click(findTestObject('Object Repository/Page_Secondhand Store/button_Preview'))
    }
}