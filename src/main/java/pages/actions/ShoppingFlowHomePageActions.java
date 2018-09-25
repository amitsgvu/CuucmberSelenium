package pages.actions;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import pages.locators.ShoppingFlowHomePageLocators;
import productdetailsresult.ProductPrice;
import util.SeleniumDriver;
import util.SeleniumHelper;

public class ShoppingFlowHomePageActions extends ShoppingFlowHomePageLocators {

	public ShoppingFlowHomePageActions() {
		super();
	}

	static ArrayList<ProductPrice> list = new ArrayList<ProductPrice>();
	static ArrayList<ProductPrice> maplist;

	static Map<Integer, List<String>> map = new TreeMap<Integer, List<String>>();

	public void verifyLogin() {

		// WebDriverWait wait = new WebDriverWait(SeleniumDriver.getDriver(), 5);
		// WebElement ele = null;
		boolean flag = true;
		try {
			// ele =
			// wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".info-account")));
			SeleniumHelper.waitForElement(successMessageHomePage);
			flag = true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			flag = false;
		}

		if (flag) {
			String exp_message = "Welcome to your account. Here you can manage all of your personal information and orders.";

			String Stringactual = successMessageHomePage.getText();
			System.out.println("valid login scenario");
			Assert.assertEquals(exp_message, Stringactual);
		} else {
			// ele =
			// wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div#center_column>div>p")));
			SeleniumHelper.waitForElement(InvalidMessageLogin);

			if (InvalidMessageLogin.isDisplayed()) {
				System.out.println("Invalid login scenario");
			}
		}
	}

	public void hooverProductLink() {

		SeleniumHelper.waitForElement(productLink);
		SeleniumHelper.highLightElement(productLink);
		SeleniumHelper.hooverProduct(productLink);
	}

	public void clickProductLink() {
		// TODO Auto-generated method stub

		SeleniumHelper.waitForElement(subProductLink);
		SeleniumHelper.highLightElement(subProductLink);
		SeleniumHelper.hooverProduct(subProductLink);
		subProductLink.click();

	}

	public String verifyProductcDetails() {
		// Casual Dresses
		SeleniumHelper.waitForElement(ProductPageTitle);
		return ProductPageTitle.getText();
	}

	public void hooverProduct() {
		SeleniumHelper.scrollDown();
		SeleniumHelper.waitForElement(productImage);
		SeleniumHelper.highLightElement(productImage);
		SeleniumHelper.hooverProduct(productImage);

	}

	public void addToCartProduct() throws Exception {
		SeleniumHelper.waitForElement(AdddCartButton);
		SeleniumHelper.highLightElement(AdddCartButton);
		SeleniumHelper.hooverProduct(AdddCartButton);

		AdddCartButton.click();
		// Thread.sleep(2000);
		SeleniumDriver.getDriver().switchTo().activeElement();

	}

	public boolean verifyCartProductDetails() {
		// TODO Auto-generated method stub
		try {
			SeleniumHelper.waitForElement(AdddCartButtonSuccessMessage);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String textValue = AdddCartButtonSuccessMessage.getAttribute("innerHTML");
		if (textValue.contains("Product successfully added to your shopping cart")) {
			System.out.println("test is passed");
			return true;
		}
		System.out.println("test is failed");
		return false;

	}

	public void clickCheckout() {

		// SeleniumHelper.waitForElement(checkOutCartButton);
		// checkOutCartButton.click();
		SeleniumHelper.highLightElement(
				SeleniumDriver.getDriver().findElement(By.cssSelector("div.button-container>span + a")));
		SeleniumDriver.getDriver().findElement(By.cssSelector("div.button-container>span + a")).click();
	}

	public void verifyAddressDetails() {
		SeleniumHelper.scrollBottom();
		SeleniumHelper.waitForElement(checkOutAddressScreenButton);
		checkOutAddressScreenButton.click();

		SeleniumHelper.scrollBottom();
		SeleniumHelper.waitForElement(processAddressButton);
		SeleniumHelper.highLightElement(processAddressButton);
		processAddressButton.click();

	}

	public void verifyShipingDetails() throws Exception {
		// TODO Auto-generated method stub

		SeleniumHelper.scrollDown();
		// Thread.sleep(2000);
		SeleniumDriver.getDriver().findElement(By.xpath("//input[@id='cgv']")).click();
		// SeleniumHelper.waitForElement(termsOfServiceCheckBox);

		// termsOfServiceCheckBox.click();
		// SeleniumDriver.getDriver().findElement(By.xpath("//input[@id='cgv']")).click();
		// int value =
		// SeleniumDriver.getDriver().findElements(By.tagName("iframe")).size();
		// System.out.println("value is========" + value);
		SeleniumHelper.waitForElement(processCarrier);
		SeleniumHelper.highLightElement(processCarrier);
		processCarrier.click();

	}

	public void verifyPaymentScreenDetails() {
		// TODO Auto-generated method stub

		SeleniumHelper.scrollDown();
		SeleniumHelper.waitForElement(payment_module);
		SeleniumHelper.highLightElement(payment_module);
		payment_module.click();
	}

	public void verifyNetBankingDetails() {
		// TODO Auto-generated method stub

		SeleniumHelper.scrollBottom();
		SeleniumHelper.waitForElement(BankProcessButton);
		SeleniumHelper.highLightElement(BankProcessButton);
		BankProcessButton.click();

	}

	public void verifyFinalProductOrderDetails() {
		// TODO Auto-generated method stub

		SeleniumHelper.waitForElement(productDetails);
		System.out.println(productDetails.getText());

	}

	public void searchProduct(String productName) {
		// TODO Auto-generated method stub
		SeleniumHelper.highLightElement(searchBox);
		SeleniumHelper.waitForElement(searchBox).sendKeys(productName);
	}

	public boolean verifyResultPage() {
		SeleniumHelper.waitForElement(resultPageCount);
		if (resultPageCount.isDisplayed())
			return true;
		return false;

	}

	public void search() {
		// TODO Auto-generated method stub
		SeleniumHelper.highLightElement(searchIcon);
		SeleniumHelper.waitForElement(searchIcon).click();
	}

	public void verifyProductDetailsResultPage() {
		// TODO Auto-generated method stub

		// System.out.println("total count is" +
		// Integer.parseInt(Character.toString(resultPageCount.getText().charAt(0))));

		// SeleniumHelper.waitForElement(resultcountProduct);
		System.out.println("totoal image of product is" + resultcountProduct.size());
		ProductPrice productPrice;
		Integer serialNumber = 1;
		for (WebElement elediv : resultcountProduct) {

			productPrice = new ProductPrice();
			ArrayList<String> maplist = new ArrayList<String>();

			// System.out.println("total span for" +
			// elediv.findElements(By.tagName("span")).size());
			List<WebElement> elespan = elediv.findElements(By.tagName("span"));
			productPrice = new ProductPrice();

			for (WebElement ele : elespan) {

				if (ele.getAttribute("class").equals("price product-price")) {
					productPrice.setNewPrice(ele.getText());
					maplist.add(ele.getText());
				}

				if (ele.getAttribute("class").contains("old")) {
					productPrice.setOldPrice(ele.getText());
					maplist.add(ele.getText());

				}
				if (ele.getAttribute("class").contains("reduction")) {
					productPrice.setDiscount(ele.getText());

					maplist.add(ele.getText());
				}

			}
			list.add(productPrice);

			map.put(serialNumber, maplist);
			serialNumber++;
		}

		Set<Entry<Integer, List<String>>> entry = map.entrySet();
		for (Map.Entry<Integer, List<String>> e : entry) {
			// System.out.print("values" + e.getKey());
			// System.out.print("values" + e.getValue());

		}

	}

	public void writetoexcel() throws Exception {

		Workbook workbook = new XSSFWorkbook(); // new HSSFWorkbook()

		// Create a Sheet
		org.apache.poi.ss.usermodel.Sheet sheet = workbook.createSheet("Product");

		Set<Integer> set = map.keySet();
		// Create a Font for styling header cells
		Font headerFont = workbook.createFont();
		headerFont.setBold(true);
		headerFont.setFontHeightInPoints((short) 14);
		headerFont.setColor(IndexedColors.RED.getIndex());

		// Create a CellStyle with the font
		CellStyle headerCellStyle = workbook.createCellStyle();
		headerCellStyle.setFont(headerFont);
		Row headerRow = sheet.createRow(0);
		headerRow.createCell(0).setCellValue("New Price");
		headerRow.createCell(1).setCellValue("Old Price");
		headerRow.createCell(2).setCellValue("Discount");
		int rowNumber = 1;
		// System.out.println("key size is" + set.size());

		for (Integer i : set) {
			System.out.println("inside loop");
			Row row = sheet.createRow(rowNumber);
			List<String> list = map.get(i);
			int columnvalue = 0;
			for (String str : list) {
				// System.out.println("inside other loop");

				row.createCell(columnvalue).setCellValue(str);
				// System.out.println("=======excel value" + str);
				columnvalue++;

			}
			rowNumber++;

		}
		FileOutputStream fileOut = new FileOutputStream(
				"C:\\Users\\amisharm25\\eclipse-workspace\\demo.cucumber\\src\\test\\resources\\data.xlsx");
		workbook.write(fileOut);
		fileOut.close();

		// Closing the workbook
		workbook.close();
	}

	public void clickOrderHistryDetails() {
		// TODO Auto-generated method stub
		SeleniumHelper.waitForElement(historyLink);
		SeleniumHelper.highLightElement(historyLink);
		historyLink.click();
	}

}