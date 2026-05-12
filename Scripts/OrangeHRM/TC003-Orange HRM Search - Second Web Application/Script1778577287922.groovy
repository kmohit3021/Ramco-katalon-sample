import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://orange.katalon.com/web/index.php/auth/login')

WebUI.comment(GlobalVariable.G_CureUsername)

WebUI.setText(findTestObject('OrangeHRM/Page_OrangeHRM/input_Username'), GlobalVariable.G_CureUsername)

WebUI.comment(GlobalVariable.G_CurePassword)

WebUI.setText(findTestObject('OrangeHRM/Page_OrangeHRM/input_Password'), GlobalVariable.G_CurePassword)
WebUI.takeScreenshot()
WebUI.click(findTestObject('OrangeHRM/Page_OrangeHRM/button_Login'))

WebUI.closeBrowser()