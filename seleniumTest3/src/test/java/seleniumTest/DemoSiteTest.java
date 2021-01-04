package seleniumTest;

import static org.junit.Assert.assertEquals;

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
	        driver.get("https://www.hl.co.uk/shares/stock-market-summary/ftse-100");

	        WebElement cookies = driver.findElement(By.id("acceptCookie"));
	        cookies.click();
	        WebElement risers = driver.findElement(By.xpath("//*[@id=\"view-constituents\"]/ul/li[2]/a"));
	        risers.click();
	        
	        WebElement topRiser = driver.findElement(By.xpath("/html/body/main/div/div/div[3]/div[4]/div[1]/div[2]/table/tbody/tr[1]/td[2]"));;  
	        String riser = topRiser.getText();
	        WebElement fallers = driver.findElement(By.xpath("/html/body/main/div/div/div[3]/div[4]/div[1]/div[1]/ul/li[3]/a"));; 
	        fallers.click();
	        WebElement topFaller = driver.findElement(By.xpath("/html/body/main/div/div/div[3]/div[4]/div[1]/div[2]/table/tbody/tr[1]/td[2]"));;  
	        String faller = topFaller.getText();
	       System.out.println(riser);
	       System.out.println(faller);
	    }

	    @After
	    public void tearDown() {
	        driver.close();
	    }
}
