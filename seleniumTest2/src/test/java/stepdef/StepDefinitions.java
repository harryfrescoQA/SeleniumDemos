package stepdef;


import static org.junit.Assert.assertEquals;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.createUser;
import pages.landingPage;
import pages.login;

public class StepDefinitions {
	 private WebDriver driver;
	

	   @Before
	    public void setup() {
	        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().window().setSize(new Dimension(1366, 768));

	    }
	    @After
	    public void tearDown() {
	        driver.close();
	    }

	        

	     

	    
	    @Given("^the correct web address$")
	    public void the_correct_web_address(){
	    	driver.get(landingPage.URL);
	        
	    }

	    @When("^I navigate to the 'Add a User' page$")
	    public void i_navigate_to_the_Add_a_User_page() throws Throwable {
	    	 landingPage landingPage = new landingPage(driver);
	    	landingPage.clickCreate();
	    }

	    @Then("^I can see a form to create a user$")
	    public void i_can_see_a_form_to_create_a_user()  {
	        
	    }

	    @When("^I click add user button and fill in the form and submit$")
	    public void i_click_add_user_button_and_fill_in_the_form_and_submit(){
	    	landingPage landingPage = new landingPage(driver);
	    	landingPage.clickCreate();
	    	createUser createUser = new createUser(driver);
	        createUser.createForm();
	    }

	    @Then("^the user is created$")
	    public void the_user_is_created(){
	       
	    }

	    @When("^I log in with the credentials$")
	    public void i_log_in_with_the_credentials() throws Throwable {
	   	 createUser createUser = new createUser(driver);
	    	   createUser.login();
	    }

	    @Then("^the success message is shown$")
	    public void the_success_message_is_shown() throws Throwable {

	        login login = new login(driver);
	        login.login();
	        
	       assertEquals("**Successful Login**", login.checkLogin());
	    }
}
