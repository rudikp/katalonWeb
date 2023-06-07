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

WebUI.callTestCase(findTestCase('Step_Definition/Login/LG01-User want to login with correct credential'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Products/Click_addToCart'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/ProductDetails/Click_ShoppingCart'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/YourCart/Click_buttonCheckout'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/CheckoutYourInformation/Input_FirstName'), [('firstName') : 'Rudi'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/CheckoutYourInformation/Input_lastName'), [('lastName') : 'putra'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/CheckoutYourInformation/Input_zipCode'), [('zipCode') : '1234'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/CheckoutYourInformation/click_buttonContinue'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

