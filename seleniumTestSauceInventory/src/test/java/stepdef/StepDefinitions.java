package stepdef;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

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
import pages.inventoryPage;
import pages.landingPage;

public class StepDefinitions {
	private WebDriver driver;
	 List<WebElement> results;
	 List<String> names;
	@Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1366, 768));

    }
	
	// Go to site 
	@Given("^the correct web address$")
	public void the_correct_web_address() {
		  driver.get(landingPage.URL);
	}

	// Log in
	@When("^I enter the correct credentials$")
	public void i_enter_the_correct_credentials() {
		 landingPage landingPage = new landingPage(driver);
        landingPage.login("standard_user", "secret_sauce");
	}

	// Check to see page
	@Then("^I can see the inventory page$")
	public void i_can_see_the_inventory_page() throws Throwable {
	    assertEquals("https://www.saucedemo.com/inventory.html",driver.getCurrentUrl());
	}
	
	// Add all to cart
	@When("^I log in and add all to cart$")
	public void i_log_in_and_add_all_to_cart() throws Throwable {
		landingPage landingPage = new landingPage(driver);
        landingPage.login("standard_user", "secret_sauce");
        results = driver.findElements(By.className("inventory_item"));
   	    names = new ArrayList();
   	 for(WebElement product : results) {
   		 //product = driver.findElement(By.className("inventory_item"));
   		 WebElement buttondiv = product.findElement(By.className("pricebar"));
   		 WebElement buttoncart = buttondiv.findElement(By.tagName("button"));
   		 buttoncart.click();
   		 names.add(product.findElement(By.className("inventory_item_name")).getText());
   	 }
	}

	// Check if items are in cart
	@Then("^I can go to checkout and see all items$")
	public void i_can_go_to_checkout_and_see_all_items() {
		 inventoryPage inventoryPage = new inventoryPage(driver);
    	 inventoryPage.goToCart();
    	 
      List<WebElement> results2 = driver.findElements(By.className("cart_item"));
    	 List<String> names2 = new ArrayList();
    	 for(WebElement product : results2) {
    		 //product = driver.findElement(By.className("cart_item"));
    		 WebElement buttondiv = product.findElement(By.className("cart_item_label"));
    		 names2.add(buttondiv.findElement(By.className("inventory_item_name")).getText());
    	 }
    	
      assertEquals(names,names2);
	}

	    @After
	    public void tearDown() {
	        driver.close();
	    }
}
