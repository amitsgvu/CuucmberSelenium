package steps;




import cucumber.api.java.Before;
import util.SeleniumDriver;

public class BeforeActions  {

	@Before
    public static void setUp() {
		//ExtentCucumberFormatter.initiateExtentCucumberFormatter();
    	System.out.println("Before scenario");
       SeleniumDriver.setUpDriver();
    }
}
