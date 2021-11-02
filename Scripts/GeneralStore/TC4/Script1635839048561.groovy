import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startApplication('C:\\Users\\Lenovo\\Downloads\\General-Store.apk', true)

Mobile.tap(findTestObject('Object Repository/android.widget.Spinner'), 0)

Mobile.scrollToText('India')

Mobile.scrollToText('Iraq')

Mobile.scrollToText('India')

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - India'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Enter name here'), 'tejjj', 0)

Mobile.tap(findTestObject('Object Repository/android.widget.RadioButton - Female'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Lets  Shop (1)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - ADD TO CART'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.CheckBox - Send me e-mails on discounts related to selected products in future'), 
    0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Visit to the website to complete purchase'), 0)

Mobile.pressBack()

Mobile.closeApplication()

