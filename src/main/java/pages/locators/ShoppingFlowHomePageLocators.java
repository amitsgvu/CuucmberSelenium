package pages.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import util.SeleniumDriver;

public class ShoppingFlowHomePageLocators {

	public @FindBy(css = ".info-account") WebElement successMessageHomePage;

	public @FindBy(css = "div#center_column>div>p") WebElement InvalidMessageLogin;

	public ShoppingFlowHomePageLocators() {
		PageFactory.initElements(SeleniumDriver.getDriver(), this);
	}

	public @FindBy(xpath = "//a[.='Women']") WebElement productLink;
	public @FindBy(xpath = "//div[@id='block_top_menu']/ul/li/ul/li[2]//ul/li[1]/a") WebElement subProductLink;
	public @FindBy(css = "a.product_img_link>img") WebElement productImage;
	public @FindBy(xpath = "//span[.='Add to cart']") WebElement AdddCartButton;
	public @FindBy(css = "div.layer_cart_product>h2") WebElement AdddCartButtonSuccessMessage;
	public @FindBy(css = "div.button-container>span + a") WebElement checkOutCartButton;
	public @FindBy(css = "p.cart_navigation.clearfix>a>span") WebElement checkOutAddressScreenButton;
	public @FindBy(css = "button[name='processAddress']") WebElement processAddressButton;
	public @FindBy(css = "button[name='processCarrier']") WebElement processCarrier;
	public @FindBy(css = "p.payment_module") WebElement payment_module;
	public @FindBy(css = "button.button.btn.btn-default.button-medium") WebElement BankProcessButton;
	public @FindBy(css = "div.box") WebElement productDetails;
	public @FindBy(xpath = "//input[@id='cgv']") WebElement termsOfServiceCheckBox;
	public @FindBy(css = "h1.page-heading.product-listing>span:nth-child(1)") WebElement ProductPageTitle;
	public @FindBy(css = "input.search_query.form-control.ac_input") WebElement searchBox;
	public @FindBy(css = "button[name='submit_search']") WebElement searchIcon;
	public @FindBy(css = "span.heading-counter") WebElement resultPageCount;
	public @FindBys({
			@FindBy(xpath = "//div[@class='right-block']//div[@class='content_price']") }) List<WebElement> resultcountProduct;
	public @FindBy(css = "ul.myaccount-link-list>li>a:nth-child(1)") WebElement historyLink;

}
