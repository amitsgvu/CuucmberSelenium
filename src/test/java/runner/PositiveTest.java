package runner;

import java.io.File;

import org.testng.annotations.AfterClass;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(plugin = {"json:target/positive/cucumber.json","pretty","com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}, features = "src/test/resources/FeatureFile/SearchDress.feature", glue = "steps", monochrome = true, strict = true)
public class PositiveTest extends AbstractTestNGCucumberTests {
	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File("C:\\Users\\amisharm25\\eclipse-workspace\\demo.cucumber\\src\\main\\resources\\ extent-config.xml"));
	}

	// "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"
	// cucumber doesn't support newer version
	// ,@SearchProduct

}
