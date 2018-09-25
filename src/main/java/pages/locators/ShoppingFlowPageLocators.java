package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.SeleniumDriver;

public class ShoppingFlowPageLocators {

	@FindBy(linkText = "Sign in")// changing
	public WebElement signInButton;

	public @FindBy(id = "email") WebElement email;

	public @FindBy(id = "passwd") WebElement password;

	public @FindBy(id = "SubmitLogin") WebElement loginButton;

	public ShoppingFlowPageLocators() {
		PageFactory.initElements(SeleniumDriver.getDriver(), this);
	}
}
