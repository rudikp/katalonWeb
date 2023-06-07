package stepDefinition

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import cucumber.api.java.en.Then
import internal.GlobalVariable

public class Login {
	@Then("User click on LOGIN button")
	public void user_click_on_LOGIN_button() {
		WebUI.callTestCase(findTestCase('Pages/User_Login/Click_buttonLogin'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	
	@Then("error message {string} show")
	public void error_message_show(String expected){
		WebUI.callTestCase(findTestCase('Pages/User_Login/Read_errorMessage'), [('expected') : expected],FailureHandling.STOP_ON_FAILURE)
	}
	
	@Then("User input registered username only {string}")
	public void user_input_registered_username_only(String username) {
		WebUI.callTestCase(findTestCase('Pages/User_Login/Input_Username'), [('username') : username], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/User_Login/Input_Password'), [('password') : ''], FailureHandling.STOP_ON_FAILURE)
		
	}
	
	@Then("User input registered password only {string}")
	public void user_input_registered_password_only(String password) {
		WebUI.callTestCase(findTestCase('Pages/User_Login/Input_Username'), [('username') : ''], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/User_Login/Input_Password'), [('password') : password], FailureHandling.STOP_ON_FAILURE)
		
	}
	
	@Then("User input incorrect username {string}")
	public void user_input_incorrect_username(String username) {
		WebUI.callTestCase(findTestCase('Pages/User_Login/Input_Username'), [('username') : username], FailureHandling.STOP_ON_FAILURE)
		
	}
	
	@Then("User input incorrect password {string}")
	public void user_input_incorrect_password(String password) {
		WebUI.callTestCase(findTestCase('Pages/User_Login/Input_Password'), [('password') : password], FailureHandling.STOP_ON_FAILURE)
		
	}
	
	@Then("User input registered username {string}")
	public void user_input_registered_username(String username) {
		WebUI.callTestCase(findTestCase('Pages/User_Login/Input_Username'), [('username') : username], FailureHandling.STOP_ON_FAILURE)
		
	}
	
	@Then("User input registered password {string}")
	public void user_input_registered_password(String password) {
		WebUI.callTestCase(findTestCase('Pages/User_Login/Input_Password'), [('password') : password], FailureHandling.STOP_ON_FAILURE)
		
	}
}
