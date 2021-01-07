package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class landingPage {
	 public final static String URL = "https://www.saucedemo.com/";

	    private WebDriver driver;

	    public landingPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    @FindBy(id = "user-name")
	    private WebElement usernameInput;

	
	    @FindBy(id = "password")
	    private WebElement passwordInput;


	    @FindBy(className = "btn_action")
	    private WebElement loginButton;



	    public void login(String username, String password) {
	        usernameInput.sendKeys(username);
	        passwordInput.sendKeys(password);
	        loginButton.click();
	    }

	   
}
