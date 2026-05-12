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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.click(findTestObject('CureHealthCare/Page_CURA Healthcare Service/h3_We Care About Your Health'))

WebUI.verifyElementText(findTestObject('CureHealthCare/Page_CURA Healthcare Service/h3_We Care About Your Health'), 'We Care About Your Health')

WebUI.click(findTestObject('CureHealthCare/Page_CURA Healthcare Service/a_btn-make-appointment'))

WebUI.click(findTestObject('CureHealthCare/Page_CURA Healthcare Service/input_Username'))

WebUI.setText(findTestObject('CureHealthCare/Page_CURA Healthcare Service/input_Username_1'), 'John Doe')

WebUI.click(findTestObject('CureHealthCare/Page_CURA Healthcare Service/input_Password'))

WebUI.setEncryptedText(findTestObject('CureHealthCare/Page_CURA Healthcare Service/input_Password_1'), 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.click(findTestObject('CureHealthCare/Page_CURA Healthcare Service/button_btn-login'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('CureHealthCare/Page_CURA Healthcare Service/select_Facility'), 'Hongkong CURA Healthcare Center', 
    false)

WebUI.click(findTestObject('CureHealthCare/Page_CURA Healthcare Service/input_Apply for hospital readmission'))

WebUI.click(findTestObject('CureHealthCare/Page_CURA Healthcare Service/input_radio_program_medicaid'))

WebUI.click(findTestObject('CureHealthCare/Page_CURA Healthcare Service/input_dd_mm_yyyy'))

WebUI.click(findTestObject('CureHealthCare/Page_CURA Healthcare Service/td_12'))

WebUI.setText(findTestObject('CureHealthCare/Page_CURA Healthcare Service/textarea_Comment'), 'Test Demo')

WebUI.click(findTestObject('CureHealthCare/Page_CURA Healthcare Service/button_btn-book-appointment'))

WebUI.click(findTestObject('CureHealthCare/Page_CURA Healthcare Service/label_Facility'))

WebUI.verifyElementText(findTestObject('CureHealthCare/Page_CURA Healthcare Service/label_Facility'), 'Facility')

WebUI.verifyElementText(findTestObject('CureHealthCare/Page_CURA Healthcare Service/p_Facility'), 'Hongkong CURA Healthcare Center')

WebUI.verifyElementText(findTestObject('CureHealthCare/Page_CURA Healthcare Service/label_Apply for hospital readmission'), 
    'Apply for hospital readmission')

WebUI.verifyElementText(findTestObject('CureHealthCare/Page_CURA Healthcare Service/p_Apply for hospital readmission'), 
    'Yes')

WebUI.verifyElementText(findTestObject('CureHealthCare/Page_CURA Healthcare Service/label_Healthcare Program'), 'Healthcare Program')

WebUI.verifyElementText(findTestObject('CureHealthCare/Page_CURA Healthcare Service/p_Healthcare Program'), 'Medicaid')

WebUI.verifyElementText(findTestObject('CureHealthCare/Page_CURA Healthcare Service/label_Comment'), 'Comment')

WebUI.verifyElementText(findTestObject('CureHealthCare/Page_CURA Healthcare Service/p_Comment'), 'Test Demo')

WebUI.verifyElementText(findTestObject('CureHealthCare/Page_CURA Healthcare Service/label_Visit Date'), 'Visit Date')

WebUI.verifyElementText(findTestObject('CureHealthCare/Page_CURA Healthcare Service/p_Visit Date'), '12/05/2026')

WebUI.closeBrowser()

