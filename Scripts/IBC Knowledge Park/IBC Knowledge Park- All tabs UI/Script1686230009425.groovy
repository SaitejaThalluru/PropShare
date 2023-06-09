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

WebUI.navigateToUrl('https://staging.propsharecapital.com/')

WebUI.click(findTestObject('Object Repository/Existing User/Page_Propshare Capital  Alternative Investm_8fc5c6/button_Investor Login'))

WebUI.setText(findTestObject('Object Repository/Existing User/Page_Login  PropShare Capital/input_Email Id_email'), 'muthunivas_14920@mailinator.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Existing User/Page_Login  PropShare Capital/input_Password_password'), 
    '4x7jrnL2W0tdMvSa04lp0A==')

WebUI.click(findTestObject('Object Repository/Existing User/Page_Login  PropShare Capital/span_Sign In'))

WebUI.click(findTestObject('Object Repository/Existing User/Page_Propshare Capital  Alternative Investm_8fc5c6/a_Dashboard'))

WebUI.click(findTestObject('Object Repository/Test/Page_Login  Propshare Capital India/input_Enter your PIN_form-control pincode-i_c9f094'))

WebUI.setText(findTestObject('Test/Page_Login  Propshare Capital India/input_Enter your PIN_form-control pincode-i_c9f094'), 
    '2')
WebUI.setText(findTestObject('Existing User/Pin 2'), '0')

WebUI.setText(findTestObject('Existing User/pin 3'), '2')

WebUI.setText(findTestObject('Existing User/Pin 4'), '2')

WebUI.verifyElementPresent(findTestObject('Object Repository/Existing User/Page_Dashboard  Propshare Capital  Alternat_2012be/div_10                                 investments'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Existing User/Page_Dashboard  Propshare Capital  Alternat_2012be/div_2,60,00,000                            _de25f6'), 
    0)

WebUI.waitForPageLoad(30)

WebUI.click(findTestObject('Object Repository/IBC Knowledge Park/Page_Dashboard  Propshare Capital  Alternat_2012be/a_IBC Knowledge Park'))
WebUI.waitForPageLoad(30)

WebUI.takeScreenshot()

int scrollPosition = 0

int scrollIncrement = 500

int totalScrolls = 2

for (int i = 0; i < totalScrolls; i++) {
	scrollPosition = scrollPosition + scrollIncrement
	String scrollScript = "window.scrollTo(0, ${scrollPosition})"
	WebUI.executeJavaScript(scrollScript, null)
	WebUI.takeScreenshot()
	WebUI.delay(1)
	WebUI.scrollToPosition(0,0)
}


WebUI.click(findTestObject('Object Repository/IBC Knowledge Park/Page_Dashboard  Propshare Capital  Alternat_2012be/p_pricing'))
WebUI.waitForPageLoad(30)

WebUI.takeScreenshot()

int scrollPositionPricing = 0

int scrollIncrementPricing = 500

int totalScrollsPricing = 2

for (int i = 0; i < totalScrollsPricing; i++) {
	scrollPositionPricing = scrollPositionPricing + scrollIncrementPricing
	String scrollScriptPricing = "window.scrollTo(0, ${scrollPositionPricing})"
	WebUI.executeJavaScript(scrollScriptPricing, null)
	WebUI.takeScreenshot()
	WebUI.delay(1)
	WebUI.scrollToPosition(0,0)
}


WebUI.click(findTestObject('Object Repository/IBC Knowledge Park/Page_Dashboard  Propshare Capital  Alternat_2012be/p_tenancy'))
WebUI.waitForPageLoad(30)

WebUI.takeScreenshot()

int scrollPositionTenancy = 0

int scrollIncrementTenancy = 500

int totalScrollsTenancy = 2

for (int i = 0; i < totalScrollsTenancy; i++) {
	scrollPositionTenancy = scrollPositionTenancy + scrollIncrementTenancy
	String scrollScriptTenancy = "window.scrollTo(0, ${scrollPositionTenancy})"
	WebUI.executeJavaScript(scrollScriptTenancy, null)
	WebUI.takeScreenshot()
	WebUI.delay(1)
	WebUI.scrollToPosition(0,0)
}


WebUI.click(findTestObject('Object Repository/IBC Knowledge Park/Page_Dashboard  Propshare Capital  Alternat_2012be/p_financials'))
WebUI.waitForPageLoad(30)

WebUI.takeScreenshot()

int scrollPositionFinancials = 0

int scrollIncrementFinancials = 500

int totalScrollsFinancials = 6

for (int i = 0; i < totalScrollsFinancials; i++) {
	scrollPosition = scrollPositionFinancials + scrollIncrementFinancials
	String scrollScriptFinancials = "window.scrollTo(0, ${scrollPositionFinancials})"
	WebUI.executeJavaScript(scrollScriptFinancials, null)
	WebUI.takeScreenshot()
	WebUI.delay(1)
	WebUI.scrollToPosition(0,0)
}


WebUI.click(findTestObject('Object Repository/IBC Knowledge Park/Page_Dashboard  Propshare Capital  Alternat_2012be/p_documents'))
WebUI.waitForPageLoad(30)

WebUI.takeScreenshot()

int scrollPositionDocuments = 0

int scrollIncrementDocuments = 500

int totalScrollsDocuments = 2

for (int i = 0; i < totalScrollsDocuments; i++) {
	scrollPosition = scrollPositionDocuments + scrollIncrementDocuments
	String scrollScriptDocuments = "window.scrollTo(0, ${scrollPositionDocuments})"
	WebUI.executeJavaScript(scrollScriptDocuments, null)
	WebUI.takeScreenshot()
	WebUI.delay(1)
	WebUI.scrollToPosition(0,0)
}

WebUI.click(findTestObject('Object Repository/IBC Knowledge Park/Page_Dashboard  Propshare Capital  Alternat_2012be/p_updates'))
WebUI.waitForPageLoad(30)

WebUI.takeScreenshot()

int scrollPositionUpdates = 0

int scrollIncrementUpdates = 500

int totalScrollsUpdates = 2

for (int i = 0; i < totalScrollsUpdates; i++) {
	scrollPositionUpdates = scrollPositionUpdates + scrollIncrementUpdates
	String scrollScriptUpdates = "window.scrollTo(0, ${scrollPositionUpdates})"
	WebUI.executeJavaScript(scrollScriptUpdates, null)
	WebUI.takeScreenshot()
	WebUI.delay(1)
	WebUI.scrollToPosition(0,0)
}


WebUI.click(findTestObject('Object Repository/IBC Knowledge Park/Page_Dashboard  Propshare Capital  Alternat_2012be/p_investor Profiles'))

WebUI.click(findTestObject('Object Repository/IBC Knowledge Park/Page_Dashboard  Propshare Capital  Alternat_2012be/div_Back to Dashboard'))

WebUI.click(findTestObject('Object Repository/IBC Knowledge Park/Page_Dashboard  Propshare Capital  Alternat_2012be/span_Back to Dashboard_arrow_icon'))

WebUI.click(findTestObject('Object Repository/IBC Knowledge Park/Page_Dashboard  Propshare Capital  Alternat_2012be/span_Back to Dashboard_arrow_icon'))

WebUI.closeBrowser()

