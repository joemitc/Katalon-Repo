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

WebUI.mouseOver(findTestObject('Object Repository/LandingPage/a_Services'))

WebUI.click(findTestObject('Object Repository/LandingPage/a_Testing Services'))

WebUI.verifyEqual('http://3.145.59.133:8202/services/testing-services/', 'http://3.145.59.133:8202/services/testing-services/')

WebUI.click(findTestObject('Object Repository/Page_Testing Services - PLATO Testing - Site/img_Testing Services_attachment-full size-f_0b10c3'))

WebUI.verifyEqual('http://3.145.59.133:8202/services/testing-services/test-automation/', 'http://3.145.59.133:8202/services/testing-services/test-automation/')

WebUI.back()

WebUI.click(findTestObject('Object Repository/Page_Testing Services - PLATO Testing - Site/img_Learn more about Test Automation_attach_654f49'))

WebUI.verifyEqual('http://3.145.59.133:8202/services/testing-services/functional-testing/', 'http://3.145.59.133:8202/services/testing-services/functional-testing/')

WebUI.back()

WebUI.click(findTestObject('Object Repository/Page_Testing Services - PLATO Testing - Site/img_Learn more about Performance Testing_at_713c26'))

WebUI.verifyEqual('http://3.145.59.133:8202/services/testing-services/performance-testing/', 'http://3.145.59.133:8202/services/testing-services/performance-testing/')

WebUI.back()

WebUI.click(findTestObject('Object Repository/Page_Testing Services - PLATO Testing - Site/img_Learn more about ERP Testing_attachment_d2cb2a'))

WebUI.verifyEqual('http://3.145.59.133:8202/services/testing-services/enterprise-resource-planning-erp-testing/', 'http://3.145.59.133:8202/services/testing-services/enterprise-resource-planning-erp-testing/')

WebUI.back()

WebUI.click(findTestObject('Object Repository/Page_Testing Services - PLATO Testing - Site/img_Learn more about Test Advisory_attachme_558b6c'))

WebUI.verifyEqual('http://3.145.59.133:8202/services/testing-services/test-advisory/', 'http://3.145.59.133:8202/services/testing-services/test-advisory/')

WebUI.back()

WebUI.click(findTestObject('Object Repository/Page_Testing Services - PLATO Testing - Site/img_Learn more about Accessibility Testing__524573'))

WebUI.verifyEqual('http://3.145.59.133:8202/services/testing-services/accessibility-testing/', 'http://3.145.59.133:8202/services/testing-services/accessibility-testing/')

WebUI.back()

WebUI.click(findTestObject('Object Repository/Page_Testing Services - PLATO Testing - Site/img_Learn more about Content Migration_atta_9d5d48'))

WebUI.verifyEqual('http://3.145.59.133:8202/services/testing-services/content-migration-and-qa/', 'http://3.145.59.133:8202/services/testing-services/content-migration-and-qa/')

WebUI.back()

WebUI.click(findTestObject('Page_Testing Services - PLATO Testing - Site/img_Learn more about Content Migration_atta_9d5d48'))

WebUI.verifyEqual('http://3.145.59.133:8202/services/testing-services/user-acceptance-testing/', 'http://3.145.59.133:8202/services/testing-services/user-acceptance-testing/')

WebUI.closeBrowser()

