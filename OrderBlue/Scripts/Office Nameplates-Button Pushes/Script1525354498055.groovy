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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://qa.orderblue.com/')

WebUI.setText(findTestObject('Page_Orderblue/input_User.UserName'), 'Office')

WebUI.setText(findTestObject('Page_Orderblue/input_User.Password'), 'Nameplates')

WebUI.setText(findTestObject('Page_Orderblue/input_AUNumber'), '0000001')

WebUI.click(findTestObject('Page_Orderblue/input'))

WebUI.click(findTestObject('Page_Index/a_View Cart'))

WebUI.click(findTestObject('Page_/a_Order History'))

WebUI.click(findTestObject('Page_Index/a_Reference Documents'))

WebUI.click(findTestObject('Page_Standards Manual/a_Customer Service'))

WebUI.click(findTestObject('Page_Index/a_Reference Documents'))

WebUI.click(findTestObject('Page_Standards Manual/a_Order History'))

WebUI.click(findTestObject('Page_Index/a_View Cart'))

WebUI.click(findTestObject('Page_/a_PRODUCTS'))

WebUI.click(findTestObject('OrderFixtures User/a_Non-Retail Misc Nameplates'))

WebUI.click(findTestObject('Page_Index/button_Continue to Nameplate'))

WebUI.click(findTestObject('OrderFixtures User/a_Fort Mill SC Name units'))

WebUI.click(findTestObject('OrderFixtures User/a_Non-Retail Black Nameplates'))

WebUI.click(findTestObject('OrderFixtures User/a_Non-Retail Black Nameplates (1)'))

WebUI.click(findTestObject('OrderFixtures User/a_Name Plate Holders'))

WebUI.click(findTestObject('OrderFixtures User/a_QSP Nameplates'))

WebUI.click(findTestObject('Page_Index/button_Continue to Nameplate'))

WebUI.click(findTestObject('Page_Index/img'))

WebUI.click(findTestObject('Page_/a_Exit'))
