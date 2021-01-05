package seleniumTest;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.inventoryPage;
import pages.landingPage;

public class DemoSiteTest {
	 private WebDriver driver;

	    @Before
	    public void setup() {
	        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().window().setSize(new Dimension(1366, 768));

	    }

	    @Test
	    public void test1() {
	        driver.get(landingPage.URL);
	        landingPage landingPage = new landingPage(driver);
	        landingPage.login("standard_user", "secret_sauce");
	       
	        List<WebElement> results = driver.findElements(By.className("inventory_item"));
	    	 List<String> names = new ArrayList();
	    	 for(WebElement product : results) {
	    		 //product = driver.findElement(By.className("inventory_item"));
	    		 WebElement buttondiv = product.findElement(By.className("pricebar"));
	    		 WebElement buttoncart = buttondiv.findElement(By.tagName("button"));
	    		 buttoncart.click();
	    		 names.add(product.findElement(By.className("inventory_item_name")).getText());
	    	 }
	
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
