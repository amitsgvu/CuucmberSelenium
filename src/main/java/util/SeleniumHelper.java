package util;

import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumHelper {

	public static boolean isElementPresent(WebElement webElement) {
		try {
			boolean isPresent = webElement.isDisplayed();
			return isPresent;
		} catch (NoSuchElementException e) {
			return false;
		}

	}

	public static void scrollBottom() {
		JavascriptExecutor js = ((JavascriptExecutor) SeleniumDriver.getDriver());
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

	public static void scrollDown() {
		JavascriptExecutor js = ((JavascriptExecutor) SeleniumDriver.getDriver());
		js.executeScript("window.scrollBy(0,500)", "");
	}

	public static void selectValue(WebElement ele, String value) {/// WebElement dropdown=ele;

		Select select = new Select(ele);
		select.selectByVisibleText(value);
	}

	public static WebElement waitForElement(WebElement element) {
		
		WebElement ele = element;
		WebDriverWait wait = new WebDriverWait(SeleniumDriver.getDriver(), 10);
		ele=wait.until(ExpectedConditions.elementToBeClickable(ele));
		return ele; 
	}

	public static void hooverProduct(WebElement element) {
		Actions action = new Actions(SeleniumDriver.getDriver());
		action.moveToElement(element).build().perform();
		;
	}
	
	public static void highLightElement(WebElement element)
	{
	JavascriptExecutor js=(JavascriptExecutor)SeleniumDriver.getDriver(); 

	js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);

	try 
	{
	Thread.sleep(500);
	} 
	catch (InterruptedException e) {

	System.out.println(e.getMessage());
	} 

	js.executeScript("arguments[0].setAttribute('style','border: solid 2px white');", element); 

	}
public static void ReadPdfText () {
	try {
        //load the pdf document
        PDDocument pdDocument=PDDocument.load("C:\\Users\\amisharm25\\Downloads\\test.pdf");
        //count total pages
        int totalPages= pdDocument.getNumberOfPages();
        //print out total page numbers
        System.out.println("Total pages: " +totalPages);
        //define a PDF file stripper object
        PDFTextStripper stripper = new PDFTextStripper();
        //set start page to 1
        stripper.setStartPage( 1 );
        //set end page to total pages
        stripper.setEndPage( totalPages );
      String extractedText= stripper.getText(pdDocument);
      
      //  System.out.println(extractedText);
        String stringArr[] = extractedText.split("\\r?\\n");
        for(String str:stringArr) {
        	//System.out.println("==========pdf text is"+str);
        	if(str.contains("BSMPOODAE")||str.contains("$28.00")) {
        		System.out.println("=============MATCHING==========");
        		
        	}
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
}
}

