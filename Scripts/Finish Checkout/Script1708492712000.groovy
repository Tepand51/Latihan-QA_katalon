import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

// memanggil database dan membuat variabel
def data = findTestData('Data Files/Users')
def username = data.getObjectValue('Username',1)
def password = data.getObjectValue('Password',1)
WebUI.comment(username)
// Proses untuk merunning hasil test cases
WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.saucedemo.com/')
WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_Swag Labs_user-name'),username)
WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_Swag Labs_password'),password)
WebUI.click(findTestObject('Object Repository/Page_Swag Labs/input_Epic sadface Username is required_login-button'))
// klik salah satu barang
WebUI.click(findTestObject('Object Repository/Page_Swag Labs/div_Sauce Labs Backpack'))


//checkout
WebUI.click(findTestObject('Object Repository/coba/Page_Swag Labs/button_Add to cart'))
WebUI.click(findTestObject('Object Repository/coba/Page_Swag Labs/a_1'))
WebUI.click(findTestObject('Object Repository/checkout/Page_Swag Labs/button_Checkout'))

// Isi data Informasi

WebUI.setText(findTestObject('Object Repository/checkout/Page_Swag Labs/input_Checkout Your Information_firstName'),'Tegar Pandji')
WebUI.setText(findTestObject('Object Repository/checkout/Page_Swag Labs/input_Checkout Your Information_lastName'),'Asmoro')
WebUI.setText(findTestObject('Object Repository/checkout/Page_Swag Labs/input_Checkout Your Information_postalCode'),'17530')

WebUI.click(findTestObject('Object Repository/checkout/Page_Swag Labs/input_Cancel_continue'))

// Finish Checkout

WebUI.click(findTestObject('Object Repository/cek/Page_Swag Labs/button_Finish'))


