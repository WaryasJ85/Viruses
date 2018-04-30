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

Mobile.startApplication('D:\\Projects\\2017\\Ford\\Version 2.8 SK\\com.bluewatertech.droid.ford.lg.sk.apk', false)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.Button0 - Begin Survey'), 15)

not_run: Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.tapAndHoldAtPosition(140, 130, 5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.Switch0 - OFF'), 15)

not_run: Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('Business', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.EditText1'), 0)

not_run: Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('android.widget.EditText0'), 'Test', 15)

not_run: Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.hideKeyboard()

not_run: Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.EditText2'), 0)

not_run: Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('android.widget.EditText1L'), 'Test', 15)

not_run: Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.hideKeyboard()

not_run: Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.EditText3'), 0)

not_run: Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('android.widget.EditText2E'), 'jason@mailinator.com', 15)

not_run: Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.hideKeyboard()

not_run: Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.EditText4'), 0)

not_run: Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('android.widget.EditText3P'), '12345678901234567', 15)

not_run: Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.hideKeyboard()

not_run: Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.EditText5'), 0)

not_run: Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('android.widget.EditText4B'), 'Test Business', 15)

not_run: Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.hideKeyboard()

not_run: Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.EditText6'), 15)

not_run: Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.TextView10 - Jeju-do'), 15)

not_run: Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('Submit', FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.view.ViewGroup30'), 15)

not_run: Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.TextView1 - 0 - 30 Days'), 15)

not_run: Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.view.ViewGroup32'), 15)

not_run: Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.TextView1 - Customer Contact Center Contacting Me'), 15)

not_run: Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.view.ViewGroup36'), 15)

not_run: Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.TextView1 - Ford'), 15)

not_run: Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.view.ViewGroup40'), 15)

not_run: Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.TextView3 - Mondeo'), 15)

not_run: Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.view.ViewGroup42'), 15)

not_run: Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.TextView1 - Jeju Exhibition Center (Premier Motors)'), 15)

not_run: Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.Button1 - Submit'), 15)

not_run: Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.Button3 - Take Photo'), 15)

not_run: Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.Button3 - Keep'), 15)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.comment('This below can be enabled to send more leads if needed for short tests')

Mobile.tap(findTestObject('android.widget.Button0 - Begin Survey'), 15)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.tapAndHoldAtPosition(140, 130, 5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.Switch0 - OFF'), 15)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('Business', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.EditText1'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('android.widget.EditText0'), 'Test', 15)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.hideKeyboard()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.EditText2'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('android.widget.EditText1L'), 'Test', 15)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.hideKeyboard()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.EditText3'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('android.widget.EditText2E'), 'jason@mailinator.com', 15)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.hideKeyboard()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.EditText4'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('android.widget.EditText3P'), '12345678901234567', 15)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.hideKeyboard()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.EditText5'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('android.widget.EditText4B'), 'Test Business', 15)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.hideKeyboard()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.EditText6'), 15)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.TextView10 - Jeju-do'), 15)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('Submit', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.view.ViewGroup30'), 15)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.TextView1 - 0 - 30 Days'), 15)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.view.ViewGroup32'), 15)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.TextView1 - Customer Contact Center Contacting Me'), 15)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.view.ViewGroup36'), 15)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.TextView1 - Ford'), 15)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.view.ViewGroup40'), 15)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.TextView3 - Mondeo'), 15)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.view.ViewGroup42'), 15)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.TextView1 - Jeju Exhibition Center (Premier Motors)'), 15)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.Button1 - Submit'), 15)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.Button3 - Take Photo'), 15)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.Button3 - Keep'), 15)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.Button0 - Begin Survey'), 15)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.tapAndHoldAtPosition(140, 130, 5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.Switch0 - OFF'), 15)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('Business', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.EditText1'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('android.widget.EditText0'), 'Test', 15)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.hideKeyboard()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.EditText2'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('android.widget.EditText1L'), 'Test', 15)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.hideKeyboard()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.EditText3'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('android.widget.EditText2E'), 'jason@mailinator.com', 15)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.hideKeyboard()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.EditText4'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('android.widget.EditText3P'), '12345678901234567', 15)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.hideKeyboard()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.EditText5'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('android.widget.EditText4B'), 'Test Business', 15)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.hideKeyboard()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.EditText6'), 15)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.TextView10 - Jeju-do'), 15)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('Submit', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.view.ViewGroup30'), 15)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.TextView1 - 0 - 30 Days'), 15)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.view.ViewGroup32'), 15)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.TextView1 - Customer Contact Center Contacting Me'), 15)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.view.ViewGroup36'), 15)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.TextView1 - Ford'), 15)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.view.ViewGroup40'), 15)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.TextView3 - Mondeo'), 15)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.view.ViewGroup42'), 15)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.TextView1 - Jeju Exhibition Center (Premier Motors)'), 15)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.Button1 - Submit'), 15)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.Button3 - Take Photo'), 15)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.Button3 - Keep'), 15)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.Button0 - Begin Survey'), 15)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.tapAndHoldAtPosition(140, 130, 5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.Switch0 - OFF'), 15)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('Business', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.EditText1'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('android.widget.EditText0'), 'Test', 15)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.hideKeyboard()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.EditText2'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('android.widget.EditText1L'), 'Test', 15)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.hideKeyboard()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.EditText3'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('android.widget.EditText2E'), 'jason@mailinator.com', 15)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.hideKeyboard()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.EditText4'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('android.widget.EditText3P'), '12345678901234567', 15)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.hideKeyboard()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.EditText5'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('android.widget.EditText4B'), 'Test Business', 15)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.hideKeyboard()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.EditText6'), 15)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.TextView10 - Jeju-do'), 15)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('Submit', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.view.ViewGroup30'), 15)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.TextView1 - 0 - 30 Days'), 15)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.view.ViewGroup32'), 15)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.TextView1 - Customer Contact Center Contacting Me'), 15)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.view.ViewGroup36'), 15)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.TextView1 - Ford'), 15)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.view.ViewGroup40'), 15)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.TextView3 - Mondeo'), 15)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.view.ViewGroup42'), 15)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.TextView1 - Jeju Exhibition Center (Premier Motors)'), 15)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.Button1 - Submit'), 15)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.Button3 - Take Photo'), 15)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.Button3 - Keep'), 15)

