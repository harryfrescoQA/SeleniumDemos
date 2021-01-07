package seleniumTest;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/cuke/DemoSite.feature",plugin = {"pretty",
"html:src/test/resources/reports/htmlReports" }, monochrome=true,glue = {"stepdef"})
public class DemoSiteTest {
	

//	 
}
