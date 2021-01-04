package seleniumTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

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
	    	 driver.get("http://automationpractice.com/index.php");
	         WebElement tshirts = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/a"));

	         tshirts.click();

	         
	      WebElement results = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[2]/h5/a"));
	      results.click();
	      driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
	      WebElement nameCheck = driver.findElement(By.cssSelector("#center_column > div > div > div.pb-center-column.col-xs-12.col-sm-4 > h1"));
	      String nameCheckVar = nameCheck.getText();
	      WebElement addtocart = driver.findElement(By.name("Submit"));
	      addtocart.click();
	      driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
	      WebElement checkout = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a"));
	      checkout.click();
	      
	      WebElement cartName = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div[2]/table/tbody/tr/td[2]/p/a"));
	      
	      assertEquals(nameCheckVar, cartName.getText());

	    }

	    @After
	    public void tearDown() {
	        driver.close();
	    }
}
