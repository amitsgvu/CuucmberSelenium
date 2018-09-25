package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.SeleniumDriver;

public class OrderHistoryPageLocators {
	public @FindBy(css = "tr.first_item >td>span +a") WebElement orderReference;

	public @FindBy(css = "tr.first_item >td:nth-child(3)>span") WebElement totalPrice;

	public OrderHistoryPageLocators() {
		PageFactory.initElements(SeleniumDriver.getDriver(), this);
	}
}
