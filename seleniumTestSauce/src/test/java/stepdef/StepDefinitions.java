package stepdef;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {
	
	@Given("^the correct web address$")
	public void the_correct_web_address() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I enter the correct credentials$")
	public void i_enter_the_correct_credentials() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I can see the inventory page$")
	public void i_can_see_the_inventory_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I log in and add all to cart$")
	public void i_log_in_and_add_all_to_cart() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I can go to checkout and see all items$")
	public void i_can_go_to_checkout_and_see_all_items() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	
// private WebDriver driver;
//	@Before
//	    public void setup() {
//	        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
//	        driver = new ChromeDriver();
//	        driver.manage().window().setSize(new Dimension(1366, 768));
//
//	    }
//
//	    @Test
//	    public void test1() {
//	        driver.get(landingPage.URL);
//	        landingPage landingPage = new landingPage(driver);
//	        landingPage.login("standard_user", "secret_sauce");
//	       
//	        List<WebElement> results = driver.findElements(By.className("inventory_item"));
//	    	 List<String> names = new ArrayList();
//	    	 for(WebElement product : results) {
//	    		 //product = driver.findElement(By.className("inventory_item"));
//	    		 WebElement buttondiv = product.findElement(By.className("pricebar"));
//	    		 WebElement buttoncart = buttondiv.findElement(By.tagName("button"));
//	    		 buttoncart.click();
//	    		 names.add(product.findElement(By.className("inventory_item_name")).getText());
//	    	 }
//	
//	    	 inventoryPage inventoryPage = new inventoryPage(driver);
//	    	 inventoryPage.goToCart();
//	    	 
//	      List<WebElement> results2 = driver.findElements(By.className("cart_item"));
//	    	 List<String> names2 = new ArrayList();
//	    	 for(WebElement product : results2) {
//	    		 //product = driver.findElement(By.className("cart_item"));
//	    		 WebElement buttondiv = product.findElement(By.className("cart_item_label"));
//	    		 names2.add(buttondiv.findElement(By.className("inventory_item_name")).getText());
//	    	 }
//	    	
//	      assertEquals(names,names2);
//	        
//	    }
//
//
//	    @After
//	    public void tearDown() {
//	        driver.close();
//	    }
}
