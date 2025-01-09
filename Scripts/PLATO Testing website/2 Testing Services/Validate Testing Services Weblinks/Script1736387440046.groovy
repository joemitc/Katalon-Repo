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

WebUI.mouseOver(findTestObject('Home Page/a_Services'))

WebUI.click(findTestObject('Object Repository/Page_Home - PLATO Testing - Site/a_Testing Services'))

WebUI.verifyEqual('http://3.145.59.133:8202/services/testing-services/', 'http://3.145.59.133:8202/services/testing-services/')

WebUI.click(findTestObject('Object Repository/Page_Testing Services - PLATO Testing - Site/a_Home'))

WebUI.verifyEqual('http://3.145.59.133:8202/', 'http://3.145.59.133:8202/')

WebUI.mouseOver(findTestObject('Home Page/a_Services'))

WebUI.click(findTestObject('Object Repository/Page_Home - PLATO Testing - Site/a_Testing Services'))

WebUI.click(findTestObject('Object Repository/Page_Testing Services - PLATO Testing - Site/a_Services'))

WebUI.verifyEqual('http://3.145.59.133:8202/services/', 'http://3.145.59.133:8202/services/')

WebUI.mouseOver(findTestObject('Home Page/a_Services'))

WebUI.click(findTestObject('Object Repository/Page_Services - PLATO Testing - Site/a_Testing Services'))

WebUI.click(findTestObject('Object Repository/Page_Testing Services - PLATO Testing - Site/span_Learn more about Test Automation'))

WebUI.verifyEqual('http://3.145.59.133:8202/services/testing-services/test-automation/', 'http://3.145.59.133:8202/services/testing-services/test-automation/')

WebUI.mouseOver(findTestObject('Home Page/a_Services'))

WebUI.click(findTestObject('Object Repository/Page_Test Automation - PLATO Testing - Site/a_Testing Services'))

WebUI.click(findTestObject('Object Repository/Page_Testing Services - PLATO Testing - Site/span_Learn more about Functional Testing'))

WebUI.verifyEqual('http://3.145.59.133:8202/services/testing-services/functional-testing/', 'http://3.145.59.133:8202/services/testing-services/functional-testing/')

WebUI.mouseOver(findTestObject('Home Page/a_Services'))

WebUI.click(findTestObject('Object Repository/Page_Functional Testing - PLATO Testing - Site/a_Testing Services'))

WebUI.click(findTestObject('Object Repository/Page_Testing Services - PLATO Testing - Site/span_Learn more about Performance Testing'))

WebUI.verifyEqual('http://3.145.59.133:8202/services/testing-services/performance-testing/', 'http://3.145.59.133:8202/services/testing-services/performance-testing/')

WebUI.mouseOver(findTestObject('Home Page/a_Services'))

WebUI.click(findTestObject('Object Repository/Page_Performance Testing - PLATO Testing - Site/a_Testing Services'))

WebUI.click(findTestObject('Object Repository/Page_Testing Services - PLATO Testing - Site/span_Learn more about ERP Testing'))

WebUI.verifyEqual('http://3.145.59.133:8202/services/testing-services/enterprise-resource-planning-erp-testing/', 'http://3.145.59.133:8202/services/testing-services/enterprise-resource-planning-erp-testing/')

WebUI.mouseOver(findTestObject('Home Page/a_Services'))

WebUI.click(findTestObject('Object Repository/Page_Enterprise Resource Planning (ERP) Tes_901c89/a_Testing Services'))

WebUI.click(findTestObject('Object Repository/Page_Testing Services - PLATO Testing - Site/span_Learn more about Test Advisory'))

WebUI.verifyEqual('http://3.145.59.133:8202/services/testing-services/test-advisory/', 'http://3.145.59.133:8202/services/testing-services/test-advisory/')

WebUI.mouseOver(findTestObject('Home Page/a_Services'))

WebUI.click(findTestObject('Object Repository/Page_Test Advisory - PLATO Testing - Site/a_Testing Services'))

WebUI.click(findTestObject('Object Repository/Page_Testing Services - PLATO Testing - Site/span_Learn more about Accessibility Testing'))

WebUI.verifyEqual('http://3.145.59.133:8202/services/testing-services/accessibility-testing/', 'http://3.145.59.133:8202/services/testing-services/accessibility-testing/')

WebUI.mouseOver(findTestObject('Home Page/a_Services'))

WebUI.click(findTestObject('Object Repository/Page_Accessibility Testing - PLATO Testing - Site/a_Testing Services'))

WebUI.click(findTestObject('Object Repository/Page_Testing Services - PLATO Testing - Site/span_Learn more about Content Migration'))

WebUI.verifyEqual('http://3.145.59.133:8202/services/testing-services/content-migration-and-qa/', 'http://3.145.59.133:8202/services/testing-services/content-migration-and-qa/')

WebUI.mouseOver(findTestObject('Home Page/a_Services'))

WebUI.click(findTestObject('Object Repository/Page_Content Migration and QA - PLATO Testi_e12bc7/a_Testing Services'))

WebUI.click(findTestObject('Object Repository/Page_Testing Services - PLATO Testing - Site/span_Learn more about User Acceptance Testing'))

WebUI.verifyEqual('http://3.145.59.133:8202/services/testing-services/user-acceptance-testing/', 'http://3.145.59.133:8202/services/testing-services/user-acceptance-testing/')

WebUI.closeBrowser()

