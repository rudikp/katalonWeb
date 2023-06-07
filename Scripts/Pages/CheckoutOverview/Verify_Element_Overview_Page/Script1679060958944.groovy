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

WebUI.verifyElementVisible(findTestObject('CheckoutOverview/Text-checkoutOverview'))

WebUI.verifyElementVisible(findTestObject('CheckoutOverview/Text-description'))

WebUI.verifyElementVisible(findTestObject('CheckoutOverview/Text-itemTotal'))

WebUI.verifyElementVisible(findTestObject('CheckoutOverview/Text-namePayment'))

WebUI.verifyElementVisible(findTestObject('CheckoutOverview/Text-nameShipping'))

WebUI.verifyElementVisible(findTestObject('CheckoutOverview/Text-paymentInformation'))

WebUI.verifyElementVisible(findTestObject('CheckoutOverview/Text-priceTotal'))

WebUI.verifyElementVisible(findTestObject('CheckoutOverview/Text-productDescription'))

WebUI.verifyElementVisible(findTestObject('CheckoutOverview/Text-productName'))

WebUI.verifyElementVisible(findTestObject('CheckoutOverview/Text-productPrice'))

WebUI.verifyElementVisible(findTestObject('CheckoutOverview/Text-qty'))

WebUI.verifyElementVisible(findTestObject('CheckoutOverview/Text-shippingInformation'))

WebUI.verifyElementVisible(findTestObject('CheckoutOverview/Text-tax'))

WebUI.verifyElementVisible(findTestObject('CheckoutOverview/Text-total'))

WebUI.verifyElementVisible(findTestObject('CheckoutOverview/Div-quantity'))

WebUI.verifyElementVisible(findTestObject('CheckoutOverview/Button-cancel'))

WebUI.verifyElementVisible(findTestObject('CheckoutOverview/Button-finish'))

