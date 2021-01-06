package stepdef;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	 private WebDriver driver;
	 @Before
	    public void setup() {
	        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().window().setSize(new Dimension(1366, 768));
	    }
	@Given("^the correct web address$")
	public void the_correct_web_address() {
		 driver.get("http://automationpractice.com/index.php");
	}

	@When("^I search for blouse$")
	public void i_search_for_blouse() {
		WebElement searchBar = driver.findElement(By.id("search_query_top"));
        String searchTerm = "blouse";
        searchBar.sendKeys(searchTerm);
        searchBar.submit();
	}

	@Then("^I can see the correct result$")
	public void i_can_see_the_correct_result() throws Throwable {
		WebElement results = driver.findElement(By.cssSelector("#center_column > ul > li > div > div.right-block > h5 > a"));
		assertEquals("Blouse", results.getText());
	}
    @After
    public void tearDown() {
        driver.close();
    }
}
