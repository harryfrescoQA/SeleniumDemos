package seleniumTest;

import static org.junit.Assert.assertEquals;

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
	        driver.get("http://thedemosite.co.uk/");

	        WebElement create = driver.findElement(By.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[3]"));; 
	        create.click();
	        WebElement usernameCreate = driver.findElement(By.name("username"));; 
	        WebElement passwordCreate = driver.findElement(By.name("password"));;   
	        
	        usernameCreate.sendKeys("TestUser");
	        passwordCreate.sendKeys("TestPass");
	        
	        WebElement createButton = driver.findElement(By.name("FormsButton2"));;  
	        createButton.click();
	        
//	        WebElement createUserCheck = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/blockquote/blockquote[2]/blockquote/text()[1]"));
//	        WebElement createPassCheck = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/blockquote/blockquote[2]/blockquote/text()[2]"));
//	        
	        WebElement login = driver.findElement(By.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[4]"));; 
	        login.click();
	        
	        WebElement usernameLogin = driver.findElement(By.name("username"));; 
	        WebElement passwordLogin = driver.findElement(By.name("password"));;   
	        
	        usernameLogin.sendKeys("TestUser");
	        passwordLogin.sendKeys("TestPass");
	        
	        WebElement loginButton = driver.findElement(By.name("FormsButton2"));;  
	        loginButton.click();
	        
	        WebElement checkLogin = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b"));
	       assertEquals("**Successful Login**", checkLogin.getText());
	    }

	    @After
	    public void tearDown() {
	        driver.close();
	    }
}
