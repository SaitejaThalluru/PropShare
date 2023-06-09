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

WebUI.click(findTestObject('Object Repository/IBC Overview/Page_Dashboard  Propshare Capital  Alternat_2012be/a_IBC Knowledge Park'))

WebUI.verifyElementPresent(findTestObject('Object Repository/IBC Overview/Page_Dashboard  Propshare Capital  Alternat_2012be/li_Date of Investment Sep 2019'), 0)

String text_InvestmentDate = WebUI.getText(findTestObject('Object Repository/IBC Overview/Page_Dashboard  Propshare Capital  Alternat_2012be/li_Date of Investment Sep 2019'))
println("The Investement Date is : " + text_InvestmentDate)
assert text_InvestmentDate == "Date of Investment: Sep 2019"

WebUI.verifyElementPresent(findTestObject('Object Repository/IBC Overview/Page_Dashboard  Propshare Capital  Alternat_2012be/li_Purchase Price   40 crores'), 0)

String text_PurchasePrice = WebUI.getText(findTestObject('Object Repository/IBC Overview/Page_Dashboard  Propshare Capital  Alternat_2012be/li_Purchase Price   40 crores'))
println("The Purchasing Price is : " + text_PurchasePrice)
assert text_PurchasePrice == "Purchase Price: 40 crores"

WebUI.verifyElementPresent(findTestObject('Object Repository/IBC Overview/Page_Dashboard  Propshare Capital  Alternat_2012be/li_Tenant LG'), 0)
String text_Tenant = WebUI.getText(findTestObject('Object Repository/IBC Overview/Page_Dashboard  Propshare Capital  Alternat_2012be/li_Tenant LG'))
println("The Tenant type is : " + text_Tenant)
assert text_Tenant == "Tenant: LG"

WebUI.verifyElementPresent(findTestObject('Object Repository/IBC Overview/Page_Dashboard  Propshare Capital  Alternat_2012be/li_Area 32,277 SF'), 0)
String text_Area = WebUI.getText(findTestObject('Object Repository/IBC Overview/Page_Dashboard  Propshare Capital  Alternat_2012be/li_Area 32,277 SF'))
println("The Area Size is : " + text_Area)
assert text_Area == "Area: 32,277 SF"

WebUI.verifyElementPresent(findTestObject('Object Repository/IBC Overview/Page_Dashboard  Propshare Capital  Alternat_2012be/li_Car Parks 44'),  0)
String text_CarParks = WebUI.getText(findTestObject('Object Repository/IBC Overview/Page_Dashboard  Propshare Capital  Alternat_2012be/li_Car Parks 44'))
println("The number of car parks are : " + text_CarParks)
assert text_CarParks == 'Car Parks: 44'

WebUI.verifyElementPresent(findTestObject('Object Repository/IBC Overview/Page_Dashboard  Propshare Capital  Alternat_2012be/li_Car Park Ratio 1729 SF'), 0)
String text_CarParksRatio = WebUI.getText(findTestObject('Object Repository/IBC Overview/Page_Dashboard  Propshare Capital  Alternat_2012be/li_Car Park Ratio 1729 SF'))
println("The car park Ratio is : " + text_CarParksRatio)
assert text_CarParksRatio == 'Car Park Ratio: 1:729 SF'

WebUI.closeBrowser()

