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

import pages.createUser;
import pages.landingPage;
import pages.login;

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
	        driver.get(landingPage.URL);
	        landingPage landingPage = new landingPage(driver);
	        
	        landingPage.clickCreate();

	        

	        createUser createUser = new createUser(driver);
	        createUser.createForm();

	        createUser.login();

	        login login = new login(driver);
	        login.login();
	        
	       assertEquals("**Successful Login**", login.checkLogin());
	    } 

	    @After
	    public void tearDown() {
	        driver.close();
	    }
}
