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

WebUI.openBrowser('')

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://orange.katalon.com/web/index.php/auth/login')
WebUI.takeScreenshot()
WebUI.setText(findTestObject('OrangeHRM/Page_OrangeHRM/input_Username'), 'mohit.kumar')

WebUI.setEncryptedText(findTestObject('OrangeHRM/Page_OrangeHRM/input_Password'), 'H0Q291REJi8mZmD6Fe3ZMw==')

WebUI.click(findTestObject('OrangeHRM/Page_OrangeHRM/button_Login'))

WebUI.click(findTestObject('OrangeHRM/Page_OrangeHRM/span_Admin'))
WebUI.takeScreenshot()
WebUI.setText(findTestObject('OrangeHRM/Page_OrangeHRM/input_oxd-input oxd-input-active'), 'mohit kumar')

WebUI.waitForElementPresent(findTestObject('OrangeHRM/Page_OrangeHRM/h5_System Users'), 10)
WebUI.takeScreenshot()
WebUI.verifyElementText(findTestObject('OrangeHRM/Page_OrangeHRM/h5_System Users'), 'System Users')

WebUI.waitForElementPresent(findTestObject('OrangeHRM/Page_OrangeHRM/h5_System Users'), 10)

WebUI.click(findTestObject('OrangeHRM/Page_OrangeHRM/button_Search'))

WebUI.waitForElementPresent(findTestObject('OrangeHRM/Page_OrangeHRM/span_No Records Found'), 10)
WebUI.takeScreenshot()
WebUI.verifyElementText(findTestObject('OrangeHRM/Page_OrangeHRM/span_No Records Found'), 'No Records Found')

WebUI.click(findTestObject('OrangeHRM/Page_OrangeHRM/span_Leave'))

WebUI.waitForElementPresent(findTestObject('OrangeHRM/Page_OrangeHRM/h5_Leave List'), 10)
WebUI.takeScreenshot()
WebUI.verifyElementText(findTestObject('OrangeHRM/Page_OrangeHRM/h5_Leave List'), 'Leave List')

WebUI.click(findTestObject('OrangeHRM/Page_OrangeHRM/span_Time'))

WebUI.waitForElementPresent(findTestObject('OrangeHRM/Page_OrangeHRM/h6_Select Employee'), 10)
WebUI.takeScreenshot()
WebUI.verifyElementText(findTestObject('OrangeHRM/Page_OrangeHRM/h6_Select Employee'), 'Select Employee')

WebUI.click(findTestObject('OrangeHRM/Page_OrangeHRM/span_My Info'))

WebUI.waitForElementPresent(findTestObject('OrangeHRM/Page_OrangeHRM/h6_Personal Details'), 10)
WebUI.takeScreenshot()
WebUI.verifyElementText(findTestObject('OrangeHRM/Page_OrangeHRM/h6_Personal Details'), 'Personal Details')

WebUI.click(findTestObject('OrangeHRM/Page_OrangeHRM/span_Maintenance'))

WebUI.waitForElementPresent(findTestObject('OrangeHRM/Page_OrangeHRM/h6_Administrator Access'), 10)
WebUI.takeScreenshot()
WebUI.verifyElementText(findTestObject('OrangeHRM/Page_OrangeHRM/h6_Administrator Access'), 'Administrator Access')

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

