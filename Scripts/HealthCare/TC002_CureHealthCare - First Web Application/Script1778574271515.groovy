import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.click(findTestObject('CureHealthCare/Page_CURA Healthcare Service/h3_We Care About Your Health'))

WebUI.verifyElementText(findTestObject('CureHealthCare/Page_CURA Healthcare Service/h3_We Care About Your Health'), 'We Care About Your Health')

WebUI.click(findTestObject('CureHealthCare/Page_CURA Healthcare Service/a_btn-make-appointment'))

strUsername = WebUI.getAttribute(findTestObject('CureHealthCare/Page_CURA Healthcare Service/input_Username'), 'value')

GlobalVariable.G_CureUsername = strUsername

WebUI.comment(strUsername)

strPassword = WebUI.getAttribute(findTestObject('CureHealthCare/Page_CURA Healthcare Service/input_Password'), 'value')

GlobalVariable.G_CurePassword = strPassword

WebUI.comment(strPassword)

WebUI.closeBrowser()