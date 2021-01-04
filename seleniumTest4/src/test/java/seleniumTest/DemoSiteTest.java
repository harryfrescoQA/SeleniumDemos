package seleniumTest;

import static org.junit.Assert.assertEquals;
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
import org.openqa.selenium.support.ui.Select;

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
	    	 driver.get("http://demo.guru99.com/test/newtours/");
	         WebElement register = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a"));
	      
	         register.click();
	         
	         WebElement userNameRegister = driver.findElement(By.id("email"));
	         WebElement passwordRegister = driver.findElement(By.id("password"));
	         WebElement confirmPasswordRegister = driver.findElement(By.id("confirmPassword"));
	         WebElement submitRegister = driver.findElement(By.id("submit"));
	         
	         userNameRegister.sendKeys("senduser");
	         passwordRegister.sendKeys("sendpass");
	        confirmPasswordRegister.sendKeys("sendpass");
	        
	        submitRegister.click();
	        
	        WebElement signIn = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font/a"));
	        signIn.click();
	        
	        
	        
	         WebElement userNameLogin = driver.findElement(By.name("userName"));
	         WebElement passwordLogin = driver.findElement(By.name("password"));

	         WebElement submitLogin = driver.findElement(By.name("submit"));
	         
	         userNameLogin.sendKeys("senduser");
	         passwordLogin.sendKeys("sendpass");

	         submitLogin.click();
	        
	         
	         WebElement flightFinder = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]/a"));
	         flightFinder.click();
	         
	         Select dropdownPassenger = new Select(driver.findElement(By.name("passCount")));
	         dropdownPassenger.selectByVisibleText("2");
	        
	         Select dropdownfrom = new Select(driver.findElement(By.name("fromPort")));
	         dropdownPassenger.selectByVisibleText("London");
	         Select dropdownto = new Select(driver.findElement(By.name("toPort")));
	         dropdownPassenger.selectByVisibleText("Paris");
	         
	         WebElement classSelect = driver.findElement(By.name("servClass"));
	         classSelect.click();

	         Select dropdownAirline = new Select(driver.findElement(By.name("airline")));
	         dropdownPassenger.selectByVisibleText("Unified Airlines");
	         
	         
	         WebElement findButton = driver.findElement(By.name("findFlights"));
	         findButton.click();

	    }

	    @After
	    public void tearDown() {
	        driver.close();
	    }
}
