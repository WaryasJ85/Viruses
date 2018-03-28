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


RunConfiguration.setExecutionSettingFile('/var/folders/53/nbkx9j493tv0b_k4gs87msf81h06r3/T/Katalon/Test Cases/Logging_in_and_out/20180118_135231/execution.properties')

TestCaseMain.beforeStart()
try {
    
        TestCaseMain.runTestCaseRawScript(
'''import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
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

WebUI.setText(findTestObject('Ford_Reporting_Tool/Page_/input_Email'), 'jwaryas@bluewatertech.com')

WebUI.setText(findTestObject('Ford_Reporting_Tool/Page_/input_Password'), 'Droop420!')

WebUI.click(findTestObject('Ford_Reporting_Tool/Page_/input_btn btn-default right Fo'))

WebUI.click(findTestObject('Ford_Reporting_Tool/Page_/a_User Management'))

WebUI.click(findTestObject('Ford_Reporting_Tool/Page_/a_Reporting'))

WebUI.click(findTestObject('Ford_Reporting_Tool/Page_/a_User Management'))

WebUI.click(findTestObject('Ford_Reporting_Tool/Page_/a_Event Management'))

WebUI.click(findTestObject('Ford_Reporting_Tool/Page_/a_User Management'))

WebUI.click(findTestObject('Ford_Reporting_Tool/Page_/a_Reporting'))

WebUI.click(findTestObject('Ford_Reporting_Tool/Page_/a_User Management'))

WebUI.click(findTestObject('Ford_Reporting_Tool/Page_/a_Event Management'))

WebUI.click(findTestObject('Ford_Reporting_Tool/Page_/button_jwaryasbluewatertech.co'))

WebUI.closeBrowser()

''', 'Test Cases/Logging_in_and_out', new TestCaseBinding('Test Cases/Logging_in_and_out', [:]), FailureHandling.STOP_ON_FAILURE )
    
} catch (Exception e) {
    TestCaseMain.logError(e, 'Test Cases/Logging_in_and_out')
}
