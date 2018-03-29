import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/GM- Reporting tool suite')

suiteProperties.put('name', 'GM- Reporting tool suite')

suiteProperties.put('description', 'Just a start')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\THE FRANKENSTINE\\Katalon Studio\\GM-US_Lead_Gen_Reporting_Tool\\Reports\\GM- Reporting tool suite\\20180329_151648\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/GM- Reporting tool suite', suiteProperties, [new TestCaseBinding('Test Cases/Browser Start', 'Test Cases/Browser Start',  null), new TestCaseBinding('Test Cases/Logging In', 'Test Cases/Logging In',  null), new TestCaseBinding('Test Cases/Push all the buttons', 'Test Cases/Push all the buttons',  null), new TestCaseBinding('Test Cases/Logging Out', 'Test Cases/Logging Out',  null), new TestCaseBinding('Test Cases/Regression - Logging in and Logging out', 'Test Cases/Regression - Logging in and Logging out',  null)])
