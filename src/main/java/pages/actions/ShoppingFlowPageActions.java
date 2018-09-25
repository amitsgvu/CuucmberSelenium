package pages.actions;

import com.cucumber.listener.Reporter;

import pages.locators.ShoppingFlowPageLocators;
import util.SeleniumHelper;

public class ShoppingFlowPageActions extends ShoppingFlowPageLocators {
	public ShoppingFlowPageActions() {
		super();
	}

	public void clickSignInButton() throws Exception {
		try {
			SeleniumHelper.waitForElement(signInButton);
			SeleniumHelper.highLightElement(signInButton);
			signInButton.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
			throw e;
			//System.out.println("faoiling==========================================================");
		}
	}

	public void enterUserName(String usernameValue) {

		SeleniumHelper.waitForElement(email);
		SeleniumHelper.highLightElement(email);
		email.click();
		email.clear();
		email.sendKeys(usernameValue);
	}

	public void enterPasswrd(String passwordValue) {
		SeleniumHelper.waitForElement(password);
		SeleniumHelper.highLightElement(password);
		password.click();
		Reporter.addStepLog("Step Log message goes here");
		password.clear();
		password.sendKeys(passwordValue);
	}

	public void clickLoginButton() {

		SeleniumHelper.waitForElement(loginButton);
		SeleniumHelper.highLightElement(loginButton);
		loginButton.click();

	}

	public void verifyLogin(String username, String passowrd) {
		enterUserName(username);
		enterPasswrd(passowrd);
		clickLoginButton();

	}

	
	
}
