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

WebUI.callTestCase(findTestCase('Log_in'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Page_Home Page - GM Canada (2)/span_Administration'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Home Page - GM Canada (1)/a_Events'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Page_Home Page - GM Canada (2)/span_Administration'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_- GM Canada/a_Exporter Settings'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Page_Home Page - GM Canada (2)/span_Administration'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_- GM Canada/a_Manage Plug Ins'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Page_Home Page - GM Canada (2)/span_Administration'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_- GM Canada/a_Postal Codes'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Page_Home Page - GM Canada (2)/span_Administration'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_- GM Canada/a_Provision Keys'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Page_Home Page - GM Canada (2)/span_Administration'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_- GM Canada/a_VMM Updates'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_- GM Canada/a_Dashboard'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Page_Home Page - GM Canada (2)/span_Reporting'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Home Page - GM Canada (1)/a_Nightly Emails'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Page_Home Page - GM Canada (2)/span_Reporting'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_- GM Canada/a_Transmitted Leads'))

WebUI.delay(10)

WebUI.mouseOver(findTestObject('Page_Home Page - GM Canada/Page_Home Page - GM Canada/span_Account'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Home Page - GM Canada/Page_Home Page - GM Canada/span_Sign Out'))

WebUI.delay(5)

WebUI.closeBrowser()

