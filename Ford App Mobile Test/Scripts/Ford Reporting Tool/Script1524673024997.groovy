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

import org.junit.After
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://lg-dev.ford.bluewatertech.host/Account/Login?ReturnUrl=%2F')

WebUI.delay(10)

WebUI.setText(findTestObject('Page_/input_Email'), 'admin@bluewatertech.com')

WebUI.delay(3)

WebUI.setText(findTestObject('Page_/input_Password'), 'Bluewater08')

WebUI.delay(3)

WebUI.click(findTestObject('Page_/input_btn btn-default right Fo'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_/a_User Management'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_/a_Reporting'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_/a_Settings'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_/a_Reporting'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_/a_User Management'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_/a_Event Management'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_/a_Reporting'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_/a_User Management'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_/a_Event Management'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Page_/select_South KoreaMiddle East'), 'number:2', true)

WebUI.delay(2)

WebUI.click(findTestObject('Page_/button_Add New Event'))

WebUI.delay(2)

WebUI.setText(findTestObject('Page_/input_eventName'), 'Katalon Test Event1 ')

WebUI.delay(2)

WebUI.click(findTestObject('Page_/input_startDatePicker'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_/a_25'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Object Repository/Page_/button_Create'),15)

WebUI.delay(2)

WebUI.click(findTestObject('Page_/input_endDatePicker'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_/a_30'))

WebUI.delay(2)

WebUI.setText(findTestObject('Page_/input_overlayText'), 'Katalon Studio Test')

WebUI.delay(2)

WebUI.click(findTestObject('Page_/button_Create'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_/button_adminbluewatertech.com'))



