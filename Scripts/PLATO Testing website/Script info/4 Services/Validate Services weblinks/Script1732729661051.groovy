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

WebUI.verifyEqual('http://platotester:Keyboardproblem$1@3.145.59.133:8202/', 'http://platotester:Keyboardproblem$1@3.145.59.133:8202/', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Home - PLATO Testing - Site/a_Services'))

WebUI.verifyEqual('http://3.145.59.133:8202/services/', 'http://3.145.59.133:8202/services/', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Services - PLATO Testing - Site/a_Home'))

WebUI.verifyEqual('http://3.145.59.133:8202/', 'http://3.145.59.133:8202/', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Home - PLATO Testing - Site/a_Services'))

WebUI.verifyEqual('http://3.145.59.133:8202/services/', 'http://3.145.59.133:8202/services/', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Services - PLATO Testing - Site/a_Full List Of Testing Services'))

WebUI.verifyEqual('http://3.145.59.133:8202/services/testing-services/', 'http://3.145.59.133:8202/services/testing-services/', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Testing Services - PLATO Testing - Site/a_Services'))

WebUI.verifyEqual('http://3.145.59.133:8202/services/', 'http://3.145.59.133:8202/services/', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Services - PLATO Testing - Site/a_Full List Of IT  Business Consulting Services'))

WebUI.verifyMatch('http://3.145.59.133:8202/it-business-consulting/', 'http://3.145.59.133:8202/it-business-consulting/', 
    true)

WebUI.click(findTestObject('Object Repository/Page_IT  Business Consulting - PLATO Testin_f797a7/a_Services'))

WebUI.verifyEqual('http://3.145.59.133:8202/services/', 'http://3.145.59.133:8202/services/', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Services - PLATO Testing - Site/a_infoplatotech.com'))

WebUI.closeBrowser()

