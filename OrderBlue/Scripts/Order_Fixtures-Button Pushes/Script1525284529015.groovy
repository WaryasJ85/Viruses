import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.junit.After as After
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

WebUI.setText(findTestObject('Page_Orderblue/input_User.UserName'), 'Order')

WebUI.setText(findTestObject('Page_Orderblue/input_User.Password'), 'Fixtures')

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

WebUI.click(findTestObject('OrderFixtures User/a_Branded Components'))

WebUI.click(findTestObject('OrderFixtures User/a_Welcome Walls'))

WebUI.click(findTestObject('OrderFixtures User/a_Welcome Walls English'))

WebUI.click(findTestObject('OrderFixtures User/a_Welcome Walls EnglishChinese'))

WebUI.click(findTestObject('OrderFixtures User/a_Welcome Walls EnglishSpanish'))

WebUI.click(findTestObject('OrderFixtures User/a_Welcome Wall Accessories'))

WebUI.click(findTestObject('OrderFixtures User/a_Quote Walls'))

WebUI.click(findTestObject('OrderFixtures User/a_Quote Walls2'))

WebUI.click(findTestObject('OrderFixtures User/a_Quote Wall Accessories'))

WebUI.click(findTestObject('OrderFixtures User/a_Pin Mount Quotes'))

WebUI.click(findTestObject('Page_Index/a_Merchandising Components'))

WebUI.click(findTestObject('OrderFixtures User/a_Freestanding Fixtures'))

WebUI.click(findTestObject('OrderFixtures User/a_Promoter'))

WebUI.click(findTestObject('OrderFixtures User/a_Queue Line Kiosk'))

WebUI.click(findTestObject('OrderFixtures User/a_Wall Fixtures'))

WebUI.click(findTestObject('OrderFixtures User/a_Wall Mount Promoter'))

WebUI.click(findTestObject('OrderFixtures User/a_Poster Holders 22 x 28'))

WebUI.click(findTestObject('OrderFixtures User/a_Poster Holders 30 x 38'))

WebUI.click(findTestObject('OrderFixtures User/a_Teller Line'))

WebUI.click(findTestObject('OrderFixtures User/a_Acrylics'))

WebUI.click(findTestObject('Page_Index/a_Nameplate Holders2'))

WebUI.click(findTestObject('Page_Index/a_White Nameplates2'))

WebUI.click(findTestObject('Page_Index/a_Black Nameplates2'))

WebUI.click(findTestObject('OrderFixtures User/a_Teller Line NumbersMC'))

WebUI.click(findTestObject('Page_Index/a_Platform'))

WebUI.click(findTestObject('OrderFixtures User/a_Line Of Business Kiosks'))

WebUI.click(findTestObject('Page_Index/a_Nameplate Holders3'))

WebUI.click(findTestObject('Page_Index/a_White Nameplates3'))

WebUI.click(findTestObject('Page_Index/a_Black Nameplates3'))

WebUI.click(findTestObject('OrderFixtures User/a_Online'))

WebUI.click(findTestObject('OrderFixtures User/a_Counter Merchandiser'))

WebUI.click(findTestObject('OrderFixtures User/a_Sign In Fixtures'))

WebUI.click(findTestObject('Page_Index/a_Legal  Compliance Signs'))

WebUI.click(findTestObject('Page_index/a_FDIC Signs'))

WebUI.click(findTestObject('Page_Index/a_SIPC Decals'))

WebUI.click(findTestObject('Page_Index/a_Barrier Free Signs'))

WebUI.click(findTestObject('Page_Index/a_CFAP'))

WebUI.click(findTestObject('Page_Index/a_In-Store Hours Signs'))

WebUI.click(findTestObject('Page_Index/a_In-Store Hours Signs2'))

WebUI.click(findTestObject('Page_Index/a_In-Store Hours Signs Stanchi'))

WebUI.click(findTestObject('Page_Index/a_Acrylics'))

WebUI.click(findTestObject('Page_Index/a_Deposit Policy FIC'))

WebUI.click(findTestObject('Page_Index/a_Compliments  Complaints Sign'))

WebUI.click(findTestObject('OrderFixtures User/a_Bad Check  Stop Payment Sign'))

WebUI.click(findTestObject('Page_Index/a_Informational Signage'))

WebUI.click(findTestObject('Page_Index/a_Stanchion Signs'))

WebUI.click(findTestObject('Page_Index/a_In-Store Hours Signs3'))

WebUI.click(findTestObject('Page_Index/a_In-Store Hours Signs4'))

WebUI.click(findTestObject('Page_Index/a_In-Store Hours Signs Stanchi2'))

WebUI.click(findTestObject('OrderFixtures User/a_Room Signs'))

WebUI.click(findTestObject('Page_Index/a_Next Teller Please'))

WebUI.click(findTestObject('Page_Index/a_Business Services'))

WebUI.click(findTestObject('Page_Index/a_Foreign Exchange'))

WebUI.click(findTestObject('Page_Index/a_Safe Deposit'))

WebUI.click(findTestObject('OrderFixtures User/a_Restroom Signs'))

WebUI.click(findTestObject('OrderFixtures User/a_CA Title 24'))

WebUI.click(findTestObject('OrderFixtures User/a_Restroom Wall Signs'))

WebUI.click(findTestObject('OrderFixtures User/a_Teller Line Numbers'))

WebUI.click(findTestObject('Page_Index/a_Nameplates  Holders'))

WebUI.click(findTestObject('Page_Index/button_Continue to Nameplate'))

WebUI.click(findTestObject('Page_Index/a_Nameplate Holders'))

WebUI.click(findTestObject('Page_Index/a_White Nameplates'))

WebUI.click(findTestObject('Page_Index/a_Black Nameplates'))

WebUI.click(findTestObject('OrderFixtures User/a_Non-Retail Misc Nameplates'))

WebUI.click(findTestObject('Page_Index/button_Continue to Nameplate'))

WebUI.click(findTestObject('OrderFixtures User/a_Fort Mill SC Name units'))

WebUI.click(findTestObject('OrderFixtures User/a_Door Graphic Components'))

WebUI.click(findTestObject('OrderFixtures User/a_Drive Up Components'))

WebUI.click(findTestObject('OrderFixtures User/a_Compliance'))

WebUI.click(findTestObject('OrderFixtures User/a_Deposit Policy Decals FIC'))

WebUI.click(findTestObject('OrderFixtures User/a_Legacy Merchandisers'))

WebUI.click(findTestObject('OrderFixtures User/a_Freestanding Merchandisers'))

WebUI.click(findTestObject('OrderFixtures User/a_Business Services'))

WebUI.click(findTestObject('OrderFixtures User/a_Mortgage'))

WebUI.click(findTestObject('OrderFixtures User/a_Teller Queue Line'))

WebUI.click(findTestObject('OrderFixtures User/a_Replacement Acrylics'))

WebUI.click(findTestObject('OrderFixtures User/a_Poster Holders'))

WebUI.click(findTestObject('OrderFixtures User/a_Non-Retail Black Nameplates'))

WebUI.click(findTestObject('OrderFixtures User/a_Non-Retail Black Nameplates (1)'))

WebUI.click(findTestObject('OrderFixtures User/a_Name Plate Holders'))

WebUI.click(findTestObject('OrderFixtures User/a_QSP Nameplates'))

WebUI.click(findTestObject('Page_Index/button_Continue to Nameplate'))

WebUI.click(findTestObject('Page_Index/img'))

WebUI.click(findTestObject('Page_/a_Exit'))

