package pages.actions;

import pages.locators.OrderHistoryPageLocators;
import util.SeleniumDriver;
import util.SeleniumHelper;

public class OrderHistoryPageActions extends OrderHistoryPageLocators {
	
	public OrderHistoryPageActions() {
		super();
	}
	public void verifyPDFDetails() {
		// TODO Auto-generated method stub
		SeleniumHelper.waitForElement(orderReference);
		SeleniumHelper.highLightElement(orderReference);
		System.out.println("order reference is"+orderReference.getText());
		SeleniumHelper.waitForElement(totalPrice);
		SeleniumHelper.highLightElement(totalPrice);
		System.out.println("order price is "+ totalPrice.getText());
		SeleniumHelper.ReadPdfText();
	}

}
