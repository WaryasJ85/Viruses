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

WebUI.callTestCase(findTestCase('Log_in'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Page_Home Page - GM Canada (2)/span_Administration'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Home Page - GM Canada (4)/a_Events'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_- GM Canada (1)/a_Add New Event'))

WebUI.delay(2)

WebUI.setText(findTestObject('Page_- GM Canada (1)/input_Name'), 'Katalon Test Event')

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Page_- GM Canada (3)/span_k-icon k-i-calendar'))

WebUI.delay(0)

WebUI.click(findTestObject('Page_- GM Canada (3)/span_k-icon k-i-calendar'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_- GM Canada (1)/a_28'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Page_- GM Canada (2)/span_k-link k-link-date (1)'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_- GM Canada (1)/span_k-icon k-i-calendar_1'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_- GM Canada (1)/a_1'))

WebUI.delay(2)

WebUI.setText(findTestObject('Page_- GM Canada (1)/input_EventCode'), 'TESTTEST')

WebUI.click(findTestObject('Page_- GM Canada (1)/input_Include750OfferQuestion'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_- GM Canada (1)/a_Update'))

WebUI.delay(5)

WebUI.mouseOver(findTestObject('Page_- GM Canada (2)/a_k-link k-pager-nav k-pager-l'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_- GM Canada (1)/span_k-icon k-i-refresh'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Page_- GM Canada (2)/a_k-link k-pager-nav k-pager-l'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_- GM Canada (1)/span_k-icon k-i-seek-e'))

WebUI.delay(5)

WebUI.mouseOver(findTestObject('Page_- GM Canada (2)/a_Delete'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_- GM Canada (1)/a_Delete'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_- GM Canada (1)/button_OK'))

