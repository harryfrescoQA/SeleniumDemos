package seleniumTest;




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

	    }

	    @After
	    public void tearDown() {
	        driver.close();
	    }
}
