package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.SeleniumDriver;

public class MercuryLocators {

	@FindBy(xpath = "//input[@name='firstName']")
	public WebElement firstName;

	@FindBy(name = "lastName")
	public WebElement lastName;

	@FindBy(name = "phone")
	public WebElement phone;

	@FindBy(name = "userName")
	public WebElement email;

	@FindBy(name = "register")
	public WebElement register;

	@FindBy(name = "password")
	public WebElement password;
	
	@FindBy(name="login")
	public WebElement login;

	public MercuryLocators() {
		PageFactory.initElements(SeleniumDriver.getDriver(), this);
	}
}
