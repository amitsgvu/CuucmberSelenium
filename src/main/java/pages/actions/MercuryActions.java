package pages.actions;

import java.util.List;
import java.util.Map;

import pages.locators.MercuryLocators;
import util.SeleniumDriver;
import util.SeleniumHelper;

public class MercuryActions extends MercuryLocators {
	MercuryLocators mercuryLocators = null;

	public MercuryActions() {
		/*
		 * this.mercuryLocators = new MercuryLocators();
		 * PageFactory.initElements(SeleniumDriver.getDriver(), mercuryLocators);
		 */
		super();
	}

	public void enterFirstName(String firstNamevalue) {

		SeleniumHelper.waitForElement(firstName);

		firstName.click();
		firstName.sendKeys(firstNamevalue);
	}

	public void enterLastName(String lastNamevalue) {
		String ln = lastNamevalue;
		SeleniumHelper.waitForElement(lastName);
		lastName.click();
		lastName.sendKeys(lastNamevalue);
	}

	public void enterPhone(String phonevalue) {
		SeleniumHelper.waitForElement(phone);
		phone.click();
		phone.sendKeys(phonevalue);
	}

	public void enterEmail(String emailvalue) {
		SeleniumHelper.waitForElement(email);
		email.click();
		email.sendKeys(emailvalue);
	}

	public void clickSubmit() {

		register.submit();
	}

	public void clickPassword(String passwordvalue) {
		SeleniumHelper.waitForElement(password);
		password.click();
		password.sendKeys(passwordvalue);
	}

	public void enterRegistartion(List<Map<String, String>> listvalue) {

		List<Map<String, String>> list = listvalue;

		enterFirstName(listvalue.get(0).get("FirstName"));
		enterLastName(listvalue.get(0).get("LastName"));
		enterPhone(listvalue.get(0).get("Phone"));
		enterEmail(listvalue.get(0).get("Email"));
		clickSubmit();
	}

	public void clickcLogin() {
		login.submit();
	}

	public void enterRegistartionoutline(String firstname, String lastname, String phone, String email) {
		enterFirstName(firstname);
		enterLastName(lastname);
		enterPhone(phone);
		enterEmail(email);
		clickSubmit();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SeleniumDriver.getDriver().get("http://newtours.demoaut.com/mercuryregister.php");
	}

	public void clickLogin(List<List<String>> data) {
		// TODO Auto-generated method stub
		enterEmail(data.get(0).get(0));
		clickPassword(data.get(0).get(1));
		clickcLogin();
	}

	public void clickLogin(String usernamevalue, String passwordvalue) {
		// TODO Auto-generated method stub
		enterEmail(usernamevalue);
		clickPassword(passwordvalue);
		clickcLogin();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getTitle() {
		// TODO Auto-generated method stub
		return "";
	}

}
