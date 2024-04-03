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

WebUI.callTestCase(findTestCase('Website/Verify_SuccessfulLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Website/Master News/menu_masterNews'))

WebUI.verifyElementText(findTestObject('Website/verify_currentPage'), 'Master News')

WebUI.click(findTestObject('Website/Master News/btn_addNews'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('Before Add News')

WebUI.selectOptionByValue(findTestObject('Website/Master News/select_category'), 'Calendar Event', false)

WebUI.delay(2)

WebUI.setText(findTestObject('Website/Master News/txt_titleNews'), 'Automation Katalon Event')

WebUI.delay(2)

WebUI.uploadFile(findTestObject('Website/Master News/upload_file'), 'C:\\Users\\1556\\OneDrive\\Pictures\\Screenshot%202024-03-15%20135521.png')

WebUI.delay(2)

WebUI.setMaskedText(findTestObject('Website/Master News/txt_summary'), 'summary test')

WebUI.delay(2)

WebUI.setText(findTestObject('Website/Master News/txt_content'), 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Sit amet massa vitae tortor condimentum lacinia. Tincidunt augue interdum velit euismod in pellentesque massa placerat duis. Faucibus interdum posuere lorem ipsum dolor sit amet consectetur adipiscing. Elementum sagittis vitae et leo. Id neque aliquam vestibulum morbi. Ac turpis egestas integer eget aliquet nibh praesent tristique magna. Maecenas volutpat blandit aliquam etiam erat velit. Id semper risus in hendrerit gravida rutrum quisque non tellus. Id volutpat lacus laoreet non curabitur gravida arcu. Purus sit amet volutpat consequat mauris nunc congue nisi vitae. Iaculis eu non diam phasellus. Eget est lorem ipsum dolor sit. Fringilla ut morbi tincidunt augue interdum velit euismod. Nam aliquam sem et tortor. Ipsum nunc aliquet bibendum enim. Elit sed vulputate mi sit amet. Nec ultrices dui sapien eget mi proin sed libero enim.')

WebUI.delay(2)

WebUI.check(findTestObject('Website/Master News/checkbox_active'))

WebUI.delay(2)

WebUI.click(findTestObject('Website/btn_save'))

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshotAsCheckpoint('After Add News')

WebUI.delay(3)

