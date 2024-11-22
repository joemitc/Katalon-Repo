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

WebUI.mouseOver(findTestObject('Page_Home - PLATO Testing - Site/a_Services'))

WebUI.click(findTestObject('Object Repository/Page_Home - PLATO Testing - Site/a_Testing Services'))

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Testing Services - PLATO Testing - Site/img_Learn more about Functional Testing_att_e52954'), 
    0)

WebUI.verifyElementPresent(findTestObject('Page_Testing Services - PLATO Testing - Site/img_Learn more about Performance Testing_at_713c26'), 
    0)

WebUI.verifyElementPresent(findTestObject('Page_Testing Services - PLATO Testing - Site/img_Learn more about ERP Testing_attachment_d2cb2a'), 
    0)

WebUI.verifyElementPresent(findTestObject('Page_Testing Services - PLATO Testing - Site/img_Learn more about Test Advisory_attachme_558b6c'), 
    0)

WebUI.verifyElementPresent(findTestObject('Page_Testing Services - PLATO Testing - Site/img_Learn more about Accessibility Testing__524573'), 
    0)

WebUI.verifyElementPresent(findTestObject('Page_Testing Services - PLATO Testing - Site/img_Learn more about Content Migration_atta_9d5d48'), 
    0)

WebUI.verifyElementPresent(findTestObject('Page_Testing Services - PLATO Testing - Site/span_Learn more about User Acceptance Testing'), 
    0)

WebUI.closeBrowser()

