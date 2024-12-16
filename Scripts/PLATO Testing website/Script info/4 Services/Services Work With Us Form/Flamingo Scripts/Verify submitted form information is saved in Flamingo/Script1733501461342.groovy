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

WebUI.setText(findTestObject('Object Repository/Page_Services - PLATO Testing - Site/input__your-name'), 'joe')

WebUI.setText(findTestObject('Object Repository/Page_Services - PLATO Testing - Site/input__text-66'), 'doe')

WebUI.setText(findTestObject('Object Repository/Page_Services - PLATO Testing - Site/input__your-email'), 'joedoe@hotmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Services - PLATO Testing - Site/input__tel-131'), '1234567890')

WebUI.setText(findTestObject('Object Repository/Page_Services - PLATO Testing - Site/input_Company_text-132'), 'Company 2')

WebUI.setText(findTestObject('Object Repository/Page_Services - PLATO Testing - Site/textarea__textarea-734'), 'project 2')

WebUI.click(findTestObject('Object Repository/Page_Services - PLATO Testing - Site/input__wpcf7-form-control wpcf7-submit has-spinner'))

WebUI.newTab('')

WebUI.navigateToUrl('http://3.145.59.133:8202/wp-login.php')

WebUI.verifyEqual('http://3.145.59.133:8202/wp-login.php', 'http://3.145.59.133:8202/wp-login.php')

WebUI.click(findTestObject('Object Repository/Page_Log In  PLATO Testing  Site  WordPress/body_document.body.className  document.body_3b8cee'))

WebUI.setText(findTestObject('Object Repository/Page_Log In  PLATO Testing  Site  WordPress/input_Username or Email Address_log'), 
    'testuser')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Log In  PLATO Testing  Site  WordPress/input_Password_pwd'), 
    'Ll8tCZzDm/hZiXjl0VNBIw==')

WebUI.click(findTestObject('Object Repository/Page_Log In  PLATO Testing  Site  WordPress/input_Remember Me_wp-submit'))

WebUI.click(findTestObject('Object Repository/Page_Profile  PLATO Testing - Site  WordPress/div_Flamingo'))

WebUI.click(findTestObject('Object Repository/Page_Flamingo Inbound Messages  PLATO Testi_5d08a4/a_your-subject'))

