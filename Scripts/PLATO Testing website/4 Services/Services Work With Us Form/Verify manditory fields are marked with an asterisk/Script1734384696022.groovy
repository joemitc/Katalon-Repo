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

WebUI.navigateToUrl('http://platotester:Keyboardproblem$1@3.145.59.133:8202/')

WebUI.verifyEqual('http://platotester:Keyboardproblem$1@3.145.59.133:8202/', 'http://platotester:Keyboardproblem$1@3.145.59.133:8202/')

WebUI.click(findTestObject('Object Repository/Page_Home - PLATO Testing - Site/a_Services'))

WebUI.verifyEqual('http://3.145.59.133:8202/services/', 'http://3.145.59.133:8202/services/')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Services - PLATO Testing - Site/font_'), 0)

WebUI.verifyTextPresent('First Name *', true)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Services - PLATO Testing - Site/font__1'), 0)

WebUI.verifyTextPresent('Last Name * ', true)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Services - PLATO Testing - Site/font__1_2'), 0)

WebUI.verifyTextPresent('Email * ', true)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Services - PLATO Testing - Site/font__1_2_3'), 0)

WebUI.verifyTextPresent('Phone *', true)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Services - PLATO Testing - Site/font__1_2_3_4'), 0)

WebUI.verifyTextPresent('Location you would like to reach out to: *', true)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Services - PLATO Testing - Site/font__1_2_3_4_5'), 0)

WebUI.verifyTextPresent('Tell us about your project: *', true)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Services - PLATO Testing - Site/font__1_2_3_4_5_6'), 0)

WebUI.verifyTextPresent('What is the timeline for your project kickoff? *', true)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Services - PLATO Testing - Site/font__1_2_3_4_5_6_7'), 
    0)

WebUI.verifyTextPresent('What is the budget for your project? *', true)

WebUI.closeBrowser()

