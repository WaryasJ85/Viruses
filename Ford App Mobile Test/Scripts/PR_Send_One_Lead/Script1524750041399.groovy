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

Mobile.startApplication('D:\\Projects\\2017\\Ford\\Version 2.7 PR\\com.bluewatertech.droid.ford.lg.prcca.apk', false)

Mobile.delay(5)

Mobile.tap(findTestObject('PR2 App/android.widget.Button0 - Begin Survey'), 0)

Mobile.tap(findTestObject('PR2 App/android.widget.Switch0 - OFF'), 0)

Mobile.tap(findTestObject('PR2 App/android.widget.EditText1'), 0)

Mobile.setText(findTestObject('PR2 App/android.widget.EditText0'), 'Jeff', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('PR2 App/android.widget.EditText2'), 0)

Mobile.setText(findTestObject('PR2 App/android.widget.EditText2 (1)'), 'Perrin', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('PR2 App/android.widget.EditText3'), 0)

Mobile.setText(findTestObject('PR2 App/android.widget.EditText3 (1)'), 'jeffperrin@mailinator.com', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('PR2 App/android.widget.EditText4'), 0)

Mobile.setText(findTestObject('PR2 App/android.widget.EditText4 (1)'), '12345678901234567', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('PR2 App/android.widget.EditText5'), 0)

Mobile.setText(findTestObject('PR2 App/android.widget.EditText5 (1)'), 'My Business', 0)

Mobile.hideKeyboard()

Mobile.scrollToText('Submit', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2)

Mobile.tap(findTestObject('PR2 App/android.widget.EditText2 - (Choose One)'), 0)

Mobile.tap(findTestObject('PR2 App/android.widget.TextView2 - Panama'), 0)

Mobile.tap(findTestObject('PR2 App/android.widget.EditText3 - (Choose One)'), 0)

Mobile.tap(findTestObject('PR2 App/android.widget.TextView1 - 0 - 30 Days'), 0)

Mobile.tap(findTestObject('PR2 App/android.widget.EditText4 - (Choose One Make)'), 0)

Mobile.tap(findTestObject('PR2 App/android.widget.TextView1 - Ford'), 0)

Mobile.tap(findTestObject('PR2 App/android.widget.EditText5 - (Choose One Model)'), 0)

Mobile.tap(findTestObject('PR2 App/android.widget.TextView12 - Fusion'), 0)

Mobile.tap(findTestObject('PR2 App/android.widget.EditText6 - (Choose One)'), 0)

Mobile.tap(findTestObject('PR2 App/android.widget.TextView2 - Ford Cincuentenario'), 0)

Mobile.tap(findTestObject('PR2 App/android.widget.Button1 - Submit'), 0)

Mobile.tap(findTestObject('PR2 App/android.widget.Button3 - Take Photo'), 0)

Mobile.tap(findTestObject('PR2 App/android.widget.Button3 - Keep'), 0)

