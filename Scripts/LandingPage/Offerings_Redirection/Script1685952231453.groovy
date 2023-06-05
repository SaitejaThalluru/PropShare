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
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://staging.propsharecapital.com/')
WebDriver driver = DriverFactory.getWebDriver()

String currentUrl = driver.getCurrentUrl()

println('Current URL is: ' + currentUrl)

WebUI.click(findTestObject('Object Repository/offerings/Page_Propshare Capital  Alternative Investm_8fc5c6/a_Offerings'))
WebUI.waitForPageLoad(30)


WebDriver driverNew = DriverFactory.getWebDriver()

String redirectedUrl = driverNew.getCurrentUrl()

println('Redirected URL is: ' + redirectedUrl)

assert currentUrl != redirectedUrl

assert redirectedUrl == 'https://staging.propsharecapital.com/offerings'

WebUI.takeScreenshot()

int scrollPosition = 0

int scrollIncrement = 500

int totalScrolls = 4

for (int i = 0; i < totalScrolls; i++) {
	scrollPosition = scrollPosition + scrollIncrement
	String scrollScript = "window.scrollTo(0, ${scrollPosition})"
	WebUI.executeJavaScript(scrollScript, null)
	WebUI.takeScreenshot()
	WebUI.delay(1)
}

WebUI.scrollToPosition(0,0)

WebUI.takeScreenshot()


WebUI.verifyElementPresent(findTestObject('Object Repository/offerings/Page_Products and Offerings  Propshare Capi_5e54d7/span_Institutional access enabled by tech'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/offerings/Page_Products and Offerings  Propshare Capi_5e54d7/h2_Our Products'), 
    0)

WebUI.closeBrowser()

