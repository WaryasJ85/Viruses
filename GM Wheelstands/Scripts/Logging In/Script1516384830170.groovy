import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.openBrowser('')

WebUI.navigateToUrl('https://us-dev.ws.gm.bluewatertech.host/Account/Login?ReturnUrl=%2F')

WebUI.setText(findTestObject('Logging In/Page_/input_Email'), 'jwaryas@bluewatertech.com')

WebUI.setText(findTestObject('Logging In/Page_/input_Password'), 'Droop420!')

WebUI.click(findTestObject('Logging In/Page_/input_btn btn-primary'))

WebUI.click(findTestObject('Logging In/Page_/input_country'))

WebUI.click(findTestObject('Logging In/Page_/input_btnLogin'))

WebUI.click(findTestObject('Logging In/Page_/a_Add Vehicle'))

WebUI.setText(findTestObject('Logging In/Page_/input_vinNum'), 'Test Car One')

WebUI.setText(findTestObject('Logging In/Page_/input_vehModel'), 'Some Car')

WebUI.selectOptionByValue(findTestObject('Logging In/Page_/select_vehBrand'), 'string:Cadillac', true)

WebUI.click(findTestObject('Logging In/Page_/div_ng-scope'))

WebUI.click(findTestObject('Logging In/Page_/button_Save Vehicle'))

WebUI.closeBrowser()

WebUI.navigateToUrl('https://us-dev.ws.gm.bluewatertech.host/Account/Login?ReturnUrl=%2F')

WebUI.closeBrowser()

