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

WebUI.navigateToUrl('http://lg-dev.ford.bluewatertech.host/Account/Login?ReturnUrl=%2F')

WebUI.setText(findTestObject('Ford_Reporting_Tool/Page_ (1)/input_Email'), 'jwaryas@bluewatertech.com')

WebUI.setText(findTestObject('Ford_Reporting_Tool/Page_ (1)/input_Password'), 'Droop420!')

WebUI.click(findTestObject('Ford_Reporting_Tool/Page_ (1)/input_btn btn-default right Fo'))

WebUI.click(findTestObject('Ford_Reporting_Tool/Page_ (1)/a_User Management'))

WebUI.click(findTestObject('Ford_Reporting_Tool/Page_ (1)/button_Add New User'))

WebUI.setText(findTestObject('Ford_Reporting_Tool/Page_ (1)/input_firstName'), 'User')

WebUI.setText(findTestObject('Ford_Reporting_Tool/Page_ (1)/input_lastName'), 'Test')

WebUI.setText(findTestObject('Ford_Reporting_Tool/Page_ (1)/input_email (1)'), 'testuser103@mailinator.com')

WebUI.setText(findTestObject('Ford_Reporting_Tool/Page_ (1)/input_password (1)'), 'test123')

WebUI.setText(findTestObject('Ford_Reporting_Tool/Page_ (1)/input_confirmPassword'), 'test123')

WebUI.selectOptionByValue(findTestObject('Ford_Reporting_Tool/Page_ (1)/select_userRole'), 'number:4', true)

WebUI.click(findTestObject('Ford_Reporting_Tool/Page_ (1)/button_Create'))

WebUI.closeBrowser()

