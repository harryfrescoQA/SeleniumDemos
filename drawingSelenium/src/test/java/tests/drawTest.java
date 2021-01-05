package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import pages.landingPage;

public class drawTest {
	private static RemoteWebDriver driver;
	
	
	  @Before
	    public void setup() {
	        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().window().setSize(new Dimension(1300, 768));

	    }
	  

	    @After
	    public void tearDown() {
	        driver.close();
	    }
	    @Test
	    public void test1() {
	    		 driver.get(landingPage.URL);
	    		 landingPage landingPage = new landingPage(driver);
	    		 landingPage.clickBrush();
	    		 landingPage.drawInitials();
	    }
	    
	    

}
