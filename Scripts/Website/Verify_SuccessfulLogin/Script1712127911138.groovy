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

WebUI.openBrowser('http://34.128.87.8:8084/login')

WebUI.navigateToUrl(GlobalVariable.url_login)

WebUI.verifyElementPresent(findTestObject('Website/Login/verify_loginPage'), 5)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshotAsCheckpoint('Before Login', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Website/Login/txt_username'), 'Username Invalid')

WebUI.setText(findTestObject('Website/Login/txt_password'), 'Password Invalid')

WebUI.click(findTestObject('Website/Login/btn_login'))

WebUI.verifyElementPresent(findTestObject('Website/Login/verify_loginSuccess'), 10)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshotAsCheckpoint('Success Login', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

