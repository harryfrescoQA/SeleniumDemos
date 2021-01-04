package seleniumTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;

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
	    	 driver.get("http://automationpractice.com/index.php");
	         WebElement searchBar = driver.findElement(By.id("search_query_top"));
	         String searchTerm = "blouse";
	         searchBar.sendKeys(searchTerm);
	         searchBar.submit();

	      WebElement results = driver.findElement(By.cssSelector("#center_column > ul > li > div > div.right-block > h5 > a"));

	             assertEquals("Blouse", results.getText());
//	             if (!productName.contains(searchTerm)) {
//	                 fail("Non-relevant item returned");
//	             }
	         
	    }

	    @After
	    public void tearDown() {
	        driver.close();
	    }
}
