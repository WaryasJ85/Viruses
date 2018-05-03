import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())


RunConfiguration.setExecutionSettingFile('C:\\Users\\NOTOSX~1\\AppData\\Local\\Temp\\Katalon\\Test Cases\\Order_Fixtures-Button Pushes\\20180502_143848\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCaseRawScript(
'''import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
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

not_run: WebUI.openBrowser('')

not_run: WebUI.maximizeWindow()

not_run: WebUI.navigateToUrl('http://qa.orderblue.com/')

not_run: WebUI.setText(findTestObject('Page_Orderblue/input_User.UserName'), 'Order')

not_run: WebUI.setText(findTestObject('Page_Orderblue/input_User.Password'), 'Fixtures')

not_run: WebUI.setText(findTestObject('Page_Orderblue/input_AUNumber'), '0000001')

not_run: WebUI.click(findTestObject('Page_Orderblue/input'))

not_run: WebUI.click(findTestObject('Page_Index/a_View Cart'))

not_run: WebUI.click(findTestObject('Page_/a_Order History'))

not_run: WebUI.click(findTestObject('Page_Index/a_Reference Documents'))

not_run: WebUI.click(findTestObject('Page_Standards Manual/a_Customer Service'))

not_run: WebUI.click(findTestObject('Page_Index/a_Reference Documents'))

not_run: WebUI.click(findTestObject('Page_Standards Manual/a_Order History'))

not_run: WebUI.click(findTestObject('Page_Index/a_View Cart'))

not_run: WebUI.click(findTestObject('Page_/a_PRODUCTS'))

not_run: WebUI.click(findTestObject('OrderFixtures User/a_Branded Components'))

not_run: WebUI.click(findTestObject('OrderFixtures User/a_Welcome Walls'))

not_run: WebUI.click(findTestObject('OrderFixtures User/a_Welcome Walls English'))

not_run: WebUI.click(findTestObject('OrderFixtures User/a_Welcome Walls EnglishSpanish'))

not_run: WebUI.click(findTestObject('OrderFixtures User/a_Welcome Walls EnglishChinese'))

not_run: WebUI.click(findTestObject('OrderFixtures User/a_Welcome Wall Accessories'))

not_run: WebUI.click(findTestObject('OrderFixtures User/a_Quote Walls'))

not_run: WebUI.click(findTestObject('OrderFixtures User/a_Quote Walls2'))

not_run: WebUI.click(findTestObject('OrderFixtures User/a_Quote Wall Accessories'))

not_run: WebUI.click(findTestObject('OrderFixtures User/a_Pin Mount Quotes'))

not_run: WebUI.click(findTestObject('Page_Index/a_Merchandising Components'))

not_run: WebUI.click(findTestObject('OrderFixtures User/a_Freestanding Fixtures'))

not_run: WebUI.click(findTestObject('OrderFixtures User/a_Promoter'))

not_run: WebUI.click(findTestObject('OrderFixtures User/a_Queue Line Kiosk'))

not_run: WebUI.click(findTestObject('OrderFixtures User/a_Wall Fixtures'))

not_run: WebUI.click(findTestObject('OrderFixtures User/a_Wall Mount Promoter'))

not_run: WebUI.click(findTestObject('OrderFixtures User/a_Poster Holders 22 x 28'))

not_run: WebUI.click(findTestObject('OrderFixtures User/a_Poster Holders 30 x 38'))

not_run: WebUI.click(findTestObject('OrderFixtures User/a_Teller Line'))

not_run: WebUI.click(findTestObject('OrderFixtures User/a_Acrylics'))

not_run: WebUI.click(findTestObject('Page_Index/a_Nameplate Holders2'))

not_run: WebUI.click(findTestObject('Page_Index/a_White Nameplates2'))

not_run: WebUI.click(findTestObject('Page_Index/a_Black Nameplates2'))

not_run: WebUI.click(findTestObject('OrderFixtures User/a_Teller Line Numbers'))

not_run: WebUI.click(findTestObject('Page_Index/a_Platform'))

not_run: WebUI.click(findTestObject('OrderFixtures User/a_Line Of Business Kiosks'))

not_run: WebUI.click(findTestObject('Page_Index/a_Nameplate Holders3'))

not_run: WebUI.click(findTestObject('Page_Index/a_White Nameplates3'))

not_run: WebUI.click(findTestObject('Page_Index/a_Black Nameplates3'))

not_run: WebUI.click(findTestObject('OrderFixtures User/a_Online'))

not_run: WebUI.click(findTestObject('OrderFixtures User/a_Counter Merchandiser'))

not_run: WebUI.click(findTestObject('OrderFixtures User/a_Sign In Fixtures'))

not_run: WebUI.click(findTestObject('Page_Index/a_Legal  Compliance Signs'))

not_run: WebUI.click(findTestObject('Page_index/a_FDIC Signs'))

not_run: WebUI.click(findTestObject('Page_Index/a_SIPC Decals'))

not_run: WebUI.click(findTestObject('Page_Index/a_Barrier Free Signs'))

not_run: WebUI.click(findTestObject('Page_Index/a_CFAP'))

not_run: WebUI.click(findTestObject('Page_Index/a_In-Store Hours Signs'))

not_run: WebUI.click(findTestObject('Page_Index/a_In-Store Hours Signs2'))

not_run: WebUI.click(findTestObject('Page_Index/a_In-Store Hours Signs Stanchi'))

not_run: WebUI.click(findTestObject('Page_Index/a_Acrylics'))

not_run: WebUI.click(findTestObject('Page_Index/a_Deposit Policy FIC'))

WebUI.click(findTestObject('Page_Index/a_Compliments  Complaints Signs'))

WebUI.click(findTestObject('OrderFixtures User/a_Bad Check Stop Payment Sign'))

WebUI.click(findTestObject('Page_Index/a_Informaional Signage'))

WebUI.click(findTestObject('Page_Index/a_Stanchion Signs'))

WebUI.click(findTestObject('Page_Index/a_In-Store Hours Sign3'))

WebUI.click(findTestObject('Page_Index/a_In-Store Hours Sign4'))

WebUI.click(findTestObject('Page_Index/a_In-Store Hours Signs Stanchi2'))

WebUI.click(findTestObject('OrderFixtures User/a_Room Signs'))

WebUI.click(findTestObject('Page_Index/a_Next Teller Please'))

WebUI.click(findTestObject('Page_Index/a_Business Services'))

WebUI.click(findTestObject('Page_Index/a_Foreign Exchage'))

WebUI.click(findTestObject('Page_Index/a_Safe Deposit'))

WebUI.click(findTestObject('OrderFixtures User/a_Restroom Signs'))

WebUI.click(findTestObject('OrderFixtures User/a_CA Title 24'))

WebUI.click(findTestObject('OrderFixtures User/a_Restroom Wall Signs'))

WebUI.click(findTestObject('OrderFixtures User/a_Teller Line Numbers'))

WebUI.click(findTestObject('Page_Index/a_Nameplates Holders'))

WebUI.click(findTestObject('Page_Index/button_Coninue to Nameplates'))

WebUI.click(findTestObject('Page_Index/a_Nameplate Holders'))

WebUI.click(findTestObject('Page_Index/a_White Nameplates'))

WebUI.click(findTestObject('Page_Index/a_Black Nameplates'))

WebUI.click(findTestObject('OrderFixtures User/a_Non-Retail Misc Nameplates'))

WebUI.click(findTestObject('Page_Index/button_Continue to Nameplate'))

WebUI.click(findTestObject('OrderFixtures User/a_Fort Mill SC Name units'))

WebUI.click(findTestObject('OrderFixtures User/a_Door Graphic Components'))

WebUI.click(findTestObject('OrderFixtures User/a_Drive Up Components'))

WebUI.click(findTestObject('OrderFixtures User/a_Compliance'))

WebUI.click(findTestObject('OrderFixtures User/a_Depsoit Policy Decals FIC'))

WebUI.click(findTestObject('OrderFixtures User/a_Legacy Merchandisers'))

WebUI.click(findTestObject('OrderFixtures User/a_Freestanding Merchandiers'))

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

''', 'Test Cases/Order_Fixtures-Button Pushes', new TestCaseBinding('Test Cases/Order_Fixtures-Button Pushes', [:]), FailureHandling.STOP_ON_FAILURE , false)
    
