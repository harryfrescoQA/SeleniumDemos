package stepdef;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {
	 private WebDriver driver;
	 
	    @Before
	    public void setup() {
	        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().window().setSize(new Dimension(1366, 768));

	    }
	    
	@Given("^the correct web address$")
	public void the_correct_web_address() {
		 driver.get("https://www.hl.co.uk/shares/stock-market-summary/ftse-100");

	        WebElement cookies = driver.findElement(By.id("acceptCookie"));
	        cookies.click();
	}

	@When("^I navigate to risers$")
	public void i_navigate_to_risers() {
		 WebElement risers = driver.findElement(By.xpath("//*[@id=\"view-constituents\"]/ul/li[2]/a"));
	        risers.click();
	}

	@Then("^I can see the top riser$")
	public void i_can_see_the_top_riser() {
		 WebElement topRiser = driver.findElement(By.xpath("/html/body/main/div/div/div[3]/div[4]/div[1]/div[2]/table/tbody/tr[1]/td[2]"));;  
	        String riser = topRiser.getText();
	        System.out.println(riser);
	}

	@When("^I navigate to fallers$")
	public void i_navigate_to_fallers() {
		 WebElement fallers = driver.findElement(By.xpath("/html/body/main/div/div/div[3]/div/div[4]/div[1]/ul/li[3]/a"));; 
	        fallers.click();
	}

	@Then("^I can see the top faller$")
	public void i_can_see_the_top_faller() {
        WebElement topFaller = driver.findElement(By.xpath("/html/body/main/div/div/div[3]/div[4]/div[1]/div[2]/table/tbody/tr[1]/td[2]"));;  
        String faller = topFaller.getText();
        
       System.out.println(faller);
	}

   @After
	    public void tearDown() {
	        driver.close();
	    }
}
