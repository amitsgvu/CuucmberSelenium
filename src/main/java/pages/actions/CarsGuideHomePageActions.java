package pages.actions;

import org.openqa.selenium.support.PageFactory;

import pages.locators.CarsGuideHomePageLocators;
import util.SeleniumDriver;


public class CarsGuideHomePageActions {
	
	CarsGuideHomePageLocators carsGuideHomePageLocators=null;
	public CarsGuideHomePageActions()
	{
		
		this.carsGuideHomePageLocators=new CarsGuideHomePageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), carsGuideHomePageLocators);
	}

	public void clickOncontactUs()
	{
		//moveToCarsForSaleMenu();
		carsGuideHomePageLocators.contactUsLink.click();
		
	}

}
