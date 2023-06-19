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

WebUI.setText(findTestObject('Object Repository/Existing User/Page_Login  PropShare Capital/input_Email Id_email'), Email)

WebUI.setEncryptedText(findTestObject('Object Repository/Existing User/Page_Login  PropShare Capital/input_Password_password'), 
    Password)

WebUI.click(findTestObject('Object Repository/Existing User/Page_Login  PropShare Capital/span_Sign In'))

if (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Propshare Capital  Alternative Investment Fund Manager in India/aDashboard Button'), 10)) 
{
        println("Login Success")
    } 
else {
       println("Login Failed")
    }

