package pages.actions;

import org.openqa.selenium.support.PageFactory;

import pages.locators.CarsGuideContactusPageLocators;
import util.SeleniumDriver;
import util.SeleniumHelper;

public class CarsGuideContactPageActions extends CarsGuideContactusPageLocators {
	CarsGuideContactusPageLocators carsGuideContactusPageLocators = null;

	public CarsGuideContactPageActions() {

		this.carsGuideContactusPageLocators = new CarsGuideContactusPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), carsGuideContactusPageLocators);
	}

	public void selectEnquiryDropDown(String value) {
		// moveToCarsForSaleMenu();
		SeleniumHelper.selectValue(EnruiryDropDown, value);
		// Select select=new Select(EnruiryDropDown);
		// select.selectByVisibleText(value);
	}

}
