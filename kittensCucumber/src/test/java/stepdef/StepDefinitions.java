package stepdef;


import static org.junit.Assert.assertEquals;

import org.junit.Test;
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

public class StepDefinitions {
	private WebDriver driver;
	private static String URL = "https://www.google.co.uk/";
	
	@Before
	public void init() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1366, 768));
	}

	// Go to google
	@Given("^Google is navigated to$")
	public void google_is_navigated_to() {
		driver.get(URL);
		assertEquals("Google", driver.getTitle());
	}

	// Search for hamsters
	@When("^i search for hamsters$")
	public void i_search_for_hamsters() {
		WebElement input = driver.findElement(By.name("q"));
		input.sendKeys("hamsters");
		input.submit();
	}

	// Check hamsters are shown
	@Then("^I should see images of hamsters$")
	public void i_should_see_images_of_hamsters(){
			driver.findElement(By.name("q")).clear();
			driver.getPageSource().contains("hamsters");
	}
	 @After
	    public void tearDown() {
	        driver.close();
	    }
}
