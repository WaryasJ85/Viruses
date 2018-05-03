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


suiteProperties.put('id', 'Test Suites/GM-Staging Reporting Tool Suite')

suiteProperties.put('name', 'GM-Staging Reporting Tool Suite')

suiteProperties.put('description', 'For the GM Staging Server')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())



RunConfiguration.setExecutionSettingFile("D:\\Projects\\Katalon Studio\\GM-US_Lead_Gen_Reporting_Tool\\Reports\\GM-Staging Reporting Tool Suite\\20180503_153714\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/GM-Staging Reporting Tool Suite', suiteProperties, [new TestCaseBinding('Test Cases/Staging Server-Browser Start', 'Test Cases/Staging Server-Browser Start',  null), new TestCaseBinding('Test Cases/Logging In', 'Test Cases/Logging In',  null), new TestCaseBinding('Test Cases/Button Pushes', 'Test Cases/Button Pushes',  null), new TestCaseBinding('Test Cases/Logging Out', 'Test Cases/Logging Out',  null)])
