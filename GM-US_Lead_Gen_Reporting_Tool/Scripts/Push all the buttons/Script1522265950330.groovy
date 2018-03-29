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

WebUI.mouseOver(findTestObject('Page_Home Page - US Leadgen (1)/span_Administration'))

WebUI.comment('Mouse over is used to hover over "Administration"')

WebUI.delay(2)

WebUI.comment('Delay is used to let the web app load. ')

WebUI.click(findTestObject('Page_Home Page - US Leadgen (3)/a_Held Leads'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_- US Leadgen/a_Pending Groups'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_- US Leadgen/a_Overridden Leads Report'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_- US Leadgen/a_Pending Groups'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_- US Leadgen/a_Incoming Held Leads'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Page_Home Page - US Leadgen (1)/span_Administration'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_- US Leadgen/a_VMM Updates'))

WebUI.delay(1)

WebUI.mouseOver(findTestObject('Page_Home Page - US Leadgen (1)/span_Administration'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_- US Leadgen/a_Dealerships'))

WebUI.delay(1)

WebUI.mouseOver(findTestObject('Page_Home Page - US Leadgen (1)/span_Administration'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_- US Leadgen/a_Zip Codes'))

WebUI.delay(1)

WebUI.mouseOver(findTestObject('Page_Home Page - US Leadgen (1)/span_Administration'))

WebUI.delay(1)

WebUI.mouseOver(findTestObject('Page_Home Page - US Leadgen (1)/span_System'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_- US Leadgen/a_Events'))

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Page_Home Page - US Leadgen (1)/span_Administration'))

WebUI.delay(1)

WebUI.mouseOver(findTestObject('Page_Home Page - US Leadgen (1)/span_System'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_- US Leadgen/a_Source Codes'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Page_Home Page - US Leadgen (1)/span_Administration'))

WebUI.click(findTestObject('Page_- US Leadgen/a_System Settings'))

WebUI.click(findTestObject('Page_- US Leadgen/a_Plug In Management'))

WebUI.click(findTestObject('Page_- US Leadgen/a_Exporter Settings'))

WebUI.click(findTestObject('Page_- US Leadgen/a_Provision Keys'))

WebUI.click(findTestObject('Page_- US Leadgen/a_The Purginator'))

WebUI.click(findTestObject('Page_- US Leadgen/a_Purge History'))

WebUI.click(findTestObject('Page_- US Leadgen/a_Dashboard'))

WebUI.click(findTestObject('Page_Home Page - US Leadgen (3)/a_Daily Emails'))

WebUI.click(findTestObject('Page_- US Leadgen/a_EDC Lead Summary'))

WebUI.click(findTestObject('Page_- US Leadgen/i_fa fa-angle-double-left'))

WebUI.click(findTestObject('Page_- US Leadgen/i_fa fa-angle-double-left_1'))

WebUI.click(findTestObject('Page_- US Leadgen/button_uix-control-right'))

WebUI.click(findTestObject('Page_- US Leadgen/em_Submit'))

WebUI.click(findTestObject('Page_- US Leadgen/em_Back'))

WebUI.click(findTestObject('Page_- US Leadgen/a_Transmitted Leads'))

WebUI.click(findTestObject('Page_- US Leadgen/i_fa fa-angle-double-left'))

WebUI.click(findTestObject('Page_- US Leadgen/em_Submit'))

WebUI.click(findTestObject('Page_- US Leadgen/em_Back_1'))

WebUI.click(findTestObject('Page_- US Leadgen/a_Lead Details'))

WebUI.click(findTestObject('Page_- US Leadgen/i_fa fa-angle-double-left'))

WebUI.click(findTestObject('Page_- US Leadgen/em_Submit'))

WebUI.click(findTestObject('Page_- US Leadgen/a_Multi-Brand Details'))

WebUI.click(findTestObject('Page_- US Leadgen/i_fa fa-angle-double-left'))

WebUI.click(findTestObject('Page_- US Leadgen/em_Submit'))

WebUI.click(findTestObject('Page_- US Leadgen/a_Dashboard'))

WebUI.closeBrowser()

