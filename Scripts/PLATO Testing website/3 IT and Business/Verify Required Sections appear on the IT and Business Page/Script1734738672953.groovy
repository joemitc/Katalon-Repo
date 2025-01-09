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

WebUI.navigateToUrl('http://platotester:Keyboardproblem$1@3.145.59.133:8202/')

WebUI.verifyEqual('http://platotester:Keyboardproblem$1@3.145.59.133:8202/', 'http://platotester:Keyboardproblem$1@3.145.59.133:8202/')

WebUI.mouseOver(findTestObject('LandingPage/a_Services'))

WebUI.click(findTestObject('LandingPage/a_IT  Business Consulting'))

WebUI.verifyEqual('http://3.145.59.133:8202/it-business-consulting/', 'http://3.145.59.133:8202/it-business-consulting/')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_IT  Business Consulting - PLATO Testin_f797a7/h2_Our network of quality and skilled IT co_7fb40a'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_IT  Business Consulting - PLATO Testin_f797a7/h2_Why Consultants Work with PLATO'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_IT  Business Consulting - PLATO Testin_f797a7/h2_Become a PLATO Consultant Today'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_IT  Business Consulting - PLATO Testin_f797a7/h2_Why Businesses Work with PLATO'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_IT  Business Consulting - PLATO Testin_f797a7/h2_Our Services'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_IT  Business Consulting - PLATO Testin_f797a7/h1_Expanding Career Choice for our Indigenous Team'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_IT  Business Consulting - PLATO Testin_f797a7/h2_The key pillars to the PLATO approach include'), 
    0)

WebUI.closeBrowser()

