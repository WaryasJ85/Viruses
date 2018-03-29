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

not_run: WebUI.openBrowser('')

not_run: WebUI.delay(1)

not_run: WebUI.maximizeWindow()

not_run: WebUI.navigateToUrl('https://us-dev.gmli2.bluewatertech.host/')

WebUI.comment('Diabled for a reason. If you want to just run this test case enable then disable once you are done.')

WebUI.delay(2)

WebUI.click(findTestObject('Page_Home Page - US Leadgen/a_Sign In'))

WebUI.comment('Once this is selected the user can sign in')

WebUI.setText(findTestObject('Page_Log in - US Leadgen/input_Email'), 'jwaryas@bluewatertech.com')

WebUI.delay(1)

WebUI.setText(findTestObject('Page_Log in - US Leadgen/input_Password'), 'Droop420!')

WebUI.delay(1)

WebUI.click(findTestObject('Page_Log in - US Leadgen/input_btn btn-default'))

