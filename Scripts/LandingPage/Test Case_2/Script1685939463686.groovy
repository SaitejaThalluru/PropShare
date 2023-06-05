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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.Dimension;
import static org.junit.Assert.assertEquals
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.common.WebUiCommonHelper;
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://staging.propsharecapital.com/')

WebUI.verifyElementPresent(findTestObject('Object Repository/Landing Page Objects/Page_Propshare Capital  Alternative Investm_8fc5c6/img'), 
    0)
// Asserting Position, size and Text of PropShare logo

logo = findTestObject('Object Repository/Landing Page Objects/Page_Propshare Capital  Alternative Investm_8fc5c6/img')
def logoPosition = WebUI.getElementLeftPosition(findTestObject('Object Repository/Landing Page Objects/Page_Propshare Capital  Alternative Investm_8fc5c6/img'))
println(logoPosition)
assert logoPosition == 76
Dimension size = WebUiCommonHelper.findWebElement(logo, 30).getSize()
println("The element's size is " + size.width + " x " + size.height)
assertEquals("The element's width is not 93 pixels", 93, size.width)
assertEquals("The element's height is not 17 pixels", 17, size.height)
String text_logo = WebUI.getText(findTestObject('Object Repository/Landing Page Objects/Page_Propshare Capital  Alternative Investm_8fc5c6/img'))
println("The text of the element is: " + text_logo)

// Asserting Position, size and Text of Offerings Button
offerings = findTestObject('Object Repository/Landing Page Objects/Page_Propshare Capital  Alternative Investm_8fc5c6/a_Offerings')
offeringsPosition = WebUI.getElementLeftPosition(findTestObject('Object Repository/Landing Page Objects/Page_Propshare Capital  Alternative Investm_8fc5c6/a_Offerings'))
println(offeringsPosition)
assert offeringsPosition == 519
Dimension size_offerings = WebUiCommonHelper.findWebElement(offerings, 30).getSize()
println("The element's size is " + size_offerings.width + " x " + size_offerings.height)
assertEquals("The element's width is not 48 pixels", 48, size_offerings.width)
assertEquals("The element's height is not 17 pixels", 14, size_offerings.height)
String text_offerings = WebUI.getText(findTestObject('Object Repository/Landing Page Objects/Page_Propshare Capital  Alternative Investm_8fc5c6/a_Offerings'))
println("The text of the element is: " + text_logo)



WebUI.verifyElementPresent(findTestObject('Object Repository/Landing Page Objects/Page_Propshare Capital  Alternative Investm_8fc5c6/a_Offerings'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Landing Page Objects/Page_Propshare Capital  Alternative Investm_8fc5c6/a_About Us'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Landing Page Objects/Page_Propshare Capital  Alternative Investm_8fc5c6/a_Contact Us'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Landing Page Objects/Page_Propshare Capital  Alternative Investm_8fc5c6/button_Investor Login'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Landing Page Objects/Page_Propshare Capital  Alternative Investm_8fc5c6/div_1,000                                Investors'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Landing Page Objects/Page_Propshare Capital  Alternative Investm_8fc5c6/div_35 mn                                As_35bf4a'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Landing Page Objects/Page_Propshare Capital  Alternative Investm_8fc5c6/div_1 billion                              _8810da'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Landing Page Objects/Page_Propshare Capital  Alternative Investm_8fc5c6/button_View Opportunities'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Landing Page Objects/Page_Propshare Capital  Alternative Investm_8fc5c6/div_Focused                                _c024cb'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Landing Page Objects/Page_Propshare Capital  Alternative Investm_8fc5c6/div_Opportunistic                          _2e2136'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Landing Page Objects/Page_Propshare Capital  Alternative Investm_8fc5c6/div_Disciplined                            _288c1a'), 
    0)

WebUI.click(findTestObject('Object Repository/Landing Page Objects/Page_Propshare Capital  Alternative Investm_8fc5c6/img_1'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Landing Page Objects/Page_Propshare Capital  Alternative Investm_8fc5c6/img_1'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Landing Page Objects/Page_Propshare Capital  Alternative Investm_8fc5c6/div_Our Investors Are Our Partners_img-wrap_0cf8cf'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Landing Page Objects/Page_Propshare Capital  Alternative Investm_8fc5c6/div_Our Investors Are Our Partners_company'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Landing Page Objects/Page_Propshare Capital  Alternative Investm_8fc5c6/div_Our Investors Are Our Partners_company'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Landing Page Objects/Page_Propshare Capital  Alternative Investm_8fc5c6/div_Our Investors Are Our Partners_company'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Landing Page Objects/Page_Propshare Capital  Alternative Investm_8fc5c6/div_Our Investors Are Our Partners_img-wrap_1accea'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Landing Page Objects/Page_Propshare Capital  Alternative Investm_8fc5c6/div_Company                        Contact _69118c'), 
    0)

WebUI.closeBrowser()

