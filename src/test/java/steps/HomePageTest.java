package steps;

import java.io.File;
import java.util.List;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;

import com.cucumber.listener.Reporter;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.CarsGuideContactPageActions;
import pages.actions.CarsGuideHomePageActions;
import pages.actions.MercuryActions;
import pages.actions.OrderHistoryPageActions;
import pages.actions.ShoppingFlowHomePageActions;
import pages.actions.ShoppingFlowPageActions;
import util.SeleniumDriver;
import util.SeleniumHelper;

public class HomePageTest {

	CarsGuideHomePageActions carsGuideHomePageActions = new CarsGuideHomePageActions();
	CarsGuideContactPageActions carsGuideContactPageActions = new CarsGuideContactPageActions();
	MercuryActions mercuryactions = new MercuryActions();
	ShoppingFlowPageActions shoppingFlowPageActions = new ShoppingFlowPageActions();
	ShoppingFlowHomePageActions ShoppingFlowHomePageActions = new ShoppingFlowHomePageActions();
	OrderHistoryPageActions orderHistoryPageActions = new OrderHistoryPageActions();

	@Given("^I navigate to the login page \"([^\"]*)\"$")
	public void i_navigate_to_the_login_page(String url) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("========Before feature=============");
		SeleniumDriver.openPage(url);
	}

	@When("^I submit username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void i_submit_username_and_password(String usernamevalue, String passwordvalue) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Reporter.addScenarioLog("Scenario Log message goes here");
		File scrFile = ((TakesScreenshot) SeleniumDriver.getDriver()).getScreenshotAs(OutputType.FILE);
		// The below method will save the screen shot in d drive with name
		// "screenshot.png"
	
		
		File srcFile = ((TakesScreenshot)SeleniumDriver.getDriver()).getScreenshotAs(OutputType.FILE);
		com.cucumber.listener.Reporter.addScreenCaptureFromPath(srcFile.getAbsolutePath());
		mercuryactions.clickLogin(usernamevalue, passwordvalue);
	}

	@Then("^I should be logged in$")
	public void i_should_be_logged_in() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// System.out.println("titile is==============>"+mercuryactions.getTitle());
		Assert.assertEquals(mercuryactions.getTitle(), "");
		Thread.sleep(3000);
	}

	@Given("^I am on the Home Page \"([^\"]*)\" of  Website$")
	public void i_am_on_the_Home_Page_of_Website(String arg1) {
		// Write code here that turns the phrase above into concrete actions

		SeleniumDriver.openPage(arg1);

	}

	@Given("^User enters Credentials to LogIn$")
	public void user_enters_Credentials_to_LogIn(DataTable usercredentials) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)
		// Write the code to handle Data Table
		List<List<String>> data = usercredentials.raw();
		mercuryactions.clickLogin(data);
	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@And("^i enter below details$")
	public void i_enter_below_details(DataTable dt) throws Throwable {
		/*
		 * List<Map<String, String>> list = dt.asMaps(String.class, String.class);
		 * 
		 * mercuryactions.enterRegistartion(list);
		 */

	}

	@Given("^i enter below details in form \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_enter_below_details_in_form_and_and_and(String FirstName, String LastName, String Phone,
			String Email) {
		mercuryactions.enterRegistartionoutline(FirstName, LastName, Phone, Email);

	}

	@Given("^i enter  details \"([^\"]*)\"$")
	public void i_enter_details(String arg1, DataTable arg2) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc).
		// Field names for YourType must match the column names in
		// your feature file (except for spaces and capitalization).
		System.out.println("name is      ===========" + arg1);
		List<List<String>> data = arg2.raw();
		System.out.println("result is=========>" + data.get(0).get(0));
	}

	@Then("^i scroll down bottom of the page$")
	public void i_scroll_down_bottom_of_the_page() throws Throwable {
		SeleniumHelper.scrollBottom();
	}

	@And("^i click on Link ContactUs$")
	public void i_click_on_link_contactus() throws Throwable {
		carsGuideHomePageActions.clickOncontactUs();

	}

	@And("^i scroll down little$")
	public void i_scroll_down_little() throws Throwable {
		SeleniumHelper.scrollDown();
	}

	@Then("^i select Enquiery \"([^\"]*)\"$")
	public void i_select_enquiery_something(String value) throws Throwable {
		carsGuideContactPageActions.selectEnquiryDropDown(value);

		System.out.println("ajx checking");
		// Wait.isjQueryLoaded(SeleniumDriver.getDriver());
		SeleniumDriver.openPage("https://game.com/#/");
		System.out.println("ajx checking");
		// Wait.isjQueryLoaded(SeleniumDriver.getDriver());
	}
	// ======================================================================//

	@Given("^user is  on homepage$")
	public void user_is_on_homepage() {
		// Write code here that turns the phrase above into concrete actions
		SeleniumDriver.openPage("http://automationpractice.com/index.php");

	}

	@When("^user navigates to Login Page$")
	public void user_navigates_to_Login_Page() throws Throwable {

		// SeleniumDriver.getDriver().findElement(By.linkText("Sign in")).click();
		shoppingFlowPageActions.clickSignInButton();

	}

	@When("^user enters username \"([^\"]*)\" and Password \"([^\"]*)\"$")
	public void user_enters_username_and_Password(String username, String password) throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		/*
		 * SeleniumDriver.getDriver().findElement(By.id("email")).sendKeys(username);
		 * SeleniumDriver.getDriver().findElement(By.id("passwd")).sendKeys(password);
		 * SeleniumDriver.getDriver().findElement(By.id("SubmitLogin")).click();
		 */

		shoppingFlowPageActions.verifyLogin(username, password);

	}

	@Then("^success message is displayed$")
	public void success_message_is_displayed() throws Throwable {
		/*
		 * WebDriverWait wait = new WebDriverWait(SeleniumDriver.getDriver(), 5);
		 * WebElement ele = null; boolean flag = true; try { ele =
		 * wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(
		 * ".info-account"))); flag = true; } catch (Exception e) { // TODO
		 * Auto-generated catch block // e.printStackTrace(); flag = false; }
		 * 
		 * if (flag) { String exp_message =
		 * "Welcome to your account. Here you can manage all of your personal information and orders."
		 * ;
		 * 
		 * String Stringactual = ele.getText();
		 * System.out.println("valid login scenario"); Assert.assertEquals(exp_message,
		 * Stringactual); } else { ele =
		 * wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(
		 * "div#center_column>div>p")));
		 * 
		 * if (ele.isDisplayed()) { System.out.println("Invalid login scenario"); } }
		 */
	}

	// ==========================Search Product=======================

	@Given("^user move mouse on on Link \"([^\"]*)\"$")
	public void user_move_mouse_on_on_Link(String arg1) {
		System.out.println("===============after checking2==========");
		ShoppingFlowHomePageActions.hooverProductLink();

	}

	@When("^user click on Link \"([^\"]*)\"$")
	public void user_click_on_Link(String arg1) {
		// Write code here that turns the phrase above into concrete actions
		ShoppingFlowHomePageActions.clickProductLink();
	}

	@Then("^page of Casual Dresses should display$")
	public void page_of_Casual_Dresses_should_display() {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(ShoppingFlowHomePageActions.verifyProductcDetails(), "CASUAL DRESSES ");
	}

	@When("^user hoover on product$")
	public void user_hoover_on_product() {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
		ShoppingFlowHomePageActions.hooverProduct();

	}

	@Then("^user clicks on add to cart button$")
	public void user_clicks_on_add_to_cart_button() throws Exception {

		ShoppingFlowHomePageActions.addToCartProduct();

	}

	@Then("^user verify product details$")
	public void user_verify_product_details() throws Throwable {
		// Assert.assertEquals(ShoppingFlowHomePageActions.verifyCartProductDetails(),false);
		ShoppingFlowHomePageActions.verifyCartProductDetails();
	}

	@Then("^user click on checkout$")
	public void user_click_on_checkout() {
		ShoppingFlowHomePageActions.clickCheckout();
	}

	@Given("^user is on address details page$")
	public void user_is_on_address_details_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// verify address details page

		ShoppingFlowHomePageActions.verifyAddressDetails();

	}

	@Then("^user verify address details$")
	public void user_verify_address_details() throws Throwable {
		// ShoppingFlowHomePageActions.verifyAddressDetails();
	}

	@Given("^user is on shipping details page$")
	public void user_is_on_shipping_details_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		ShoppingFlowHomePageActions.verifyShipingDetails();

	}

	@Then("^user verify shipping details$")
	public void user_verify_shipping_details() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
		// ShoppingFlowHomePageActions.verifyShipingDetails();
	}

	@Given("^user is on payment page$")
	public void user_is_on_payment_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// click on payment options
		ShoppingFlowHomePageActions.verifyPaymentScreenDetails();
	}

	@Then("^user verify payment details$")
	public void user_verify_payment_details() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
		// ShoppingFlowHomePageActions.verifyPaymentScreenDetails();
	}

	@Given("^user is on Net banking page$")
	public void user_is_on_Net_banking_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
		// ShoppingFlowHomePageActions.verifyNetBankingDetails();
	}

	@Then("^user verify Net banking details$")
	public void user_verify_Net_banking_details() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// click on net banking option
		ShoppingFlowHomePageActions.verifyNetBankingDetails();
	}

	@Given("^user is on Final Product Page$")
	public void user_is_on_Final_Product_Page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
	}

	@Then("^user verify product details page$")
	public void user_verify_product_details_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// verify product details

		ShoppingFlowHomePageActions.verifyFinalProductOrderDetails();

	}

	// =========================SearchDress========================
	@Given("^i enter \"([^\"]*)\" into search bar$")
	public void i_enter_something_into_search_bar(String productName) throws Throwable {
		ShoppingFlowHomePageActions.searchProduct(productName);
	}

	@Then("^i should see result page$")
	public void i_should_see_result_page() throws Throwable {
		Assert.assertEquals(ShoppingFlowHomePageActions.verifyResultPage(), true);

	}

	@And("^i click enter$")
	public void i_click_enter() throws Throwable {
		ShoppingFlowHomePageActions.search();
	}

	@Then("^i verify all product details$")
	public void i_verify_all_product_details() throws Throwable {
		ShoppingFlowHomePageActions.verifyProductDetailsResultPage();

	}

	@When("^i write product details to excel$")
	public void i_write_product_details_to_excel() throws Throwable {
		ShoppingFlowHomePageActions.writetoexcel();

	}

	@Given("^i click on back button$")
	public void i_click_on_back_button() throws Throwable {
		SeleniumDriver.getDriver().navigate().back();
	}

	@Then("^i click on Link Order history and Details$")
	public void i_click_on_link_order_history_and_details() throws Throwable {
		ShoppingFlowHomePageActions.clickOrderHistryDetails();
	}

	@Then("^i verify odf details$")
	public void i_verify_odf_details() throws Throwable {
		orderHistoryPageActions.verifyPDFDetails();
	}
}
