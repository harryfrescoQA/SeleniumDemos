package seleniumTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoSiteTest {
	 private WebDriver driver;

	    @Before
	    public void setup() {
	        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().window().setSize(new Dimension(1366, 768));

	    }

	    @Test
	    public void test() throws InterruptedException {
	    	 driver.get("https://www.saucedemo.com/");
	    	 
	    	 WebElement user = driver.findElement(By.id("user-name"));
	    	 WebElement pass = driver.findElement(By.id("password"));
	    	 
	    	 user.sendKeys("standard_user");
	    	 pass.sendKeys("secret_sauce");
	    	 WebElement button = driver.findElement(By.id("login-button"));
	    	  	
	    	 button.click();
	    	 
	    	 List<WebElement> results = driver.findElements(By.className("inventory_item"));
	    	 List<String> names = new ArrayList();
	    	 for(WebElement product : results) {
	    		 //product = driver.findElement(By.className("inventory_item"));
	    		 WebElement buttondiv = product.findElement(By.className("pricebar"));
	    		 WebElement buttoncart = buttondiv.findElement(By.tagName("button"));
	    		 buttoncart.click();
	    		 names.add(product.findElement(By.className("inventory_item_name")).getText());
	    	 }
	
	      WebElement cart = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div[2]/a"));
	      cart.click();
	      
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
