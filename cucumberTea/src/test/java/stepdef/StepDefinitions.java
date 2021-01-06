package stepdef;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
	private static String URL = "http://www.practiceselenium.com/welcome.html";
	
	@Before
	public void init() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1366, 768));
	}

	@Given("^the correct web address$")
	public void the_correct_web_address() {
		driver.get(URL);
	}

	@When("^I navigate to the 'Menu' page$")
	public void i_navigate_to_the_Menu_page(){
		WebElement menuLink = driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[13]/div/ul/li[3]/a"));
		menuLink.click();
	}

	@Then("^I can browse a list of the available products\\.$")
	public void i_can_browse_a_list_of_the_available_products() {
		assertTrue(driver.getPageSource().contains("Green Tea"));
	}

	
	// 2
	@When("^I click the checkout button$")
	public void i_click_the_checkout_button()
	{
		
		WebElement menuLink = driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[13]/div/ul/li[3]/a"));
		menuLink.click();
		WebElement checkoutButton = driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[16]/div/a/span"));
		checkoutButton.click();
		
	}

	@Then("^I am taken to the checkout page$")
	public void i_am_taken_to_the_checkout_page(){
	    assertEquals("Check Out", driver.getTitle());
	}
	
	@When("^I fill in the form to checkout and submit$")
	public void i_fill_in_the_form_to_checkout_and_submit() {
		WebElement menuLink = driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[13]/div/ul/li[3]/a"));
		menuLink.click();
		WebElement checkoutButton = driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[16]/div/a/span"));
		checkoutButton.click();
	 WebElement email = driver.findElement(By.id("email"));
	 email.sendKeys("emailTest");
	 WebElement name = driver.findElement(By.id("name"));
	 name.sendKeys("nameTest");
	 WebElement button = driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[1]/div/div/form/div/button"));
	 button.click();
	}

	@Then("^I am taken back to the homepage$")
	public void i_am_taken_back_to_the_homepage() {
	    assertEquals("Menu", driver.getTitle());
	}
	 @After
	    public void tearDown() {
	        driver.close();
	    }
}
