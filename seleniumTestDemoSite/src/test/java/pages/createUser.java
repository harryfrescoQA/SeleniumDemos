package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class createUser {
	 public final static String URL = "http://thedemosite.co.uk/";

	    private WebDriver driver;

	    public createUser(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }


	    @FindBy(name = "username")
	    private WebElement username;

	    @FindBy(name = "password")
	    private WebElement password;

	    @FindBy(name = "FormsButton2")
	    private WebElement button;
	    
	    @FindBy(xpath = "/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[4]")
	    private WebElement login;
	    
	    public void createForm() {
	        username.sendKeys("TestUser");
	        password.sendKeys("TestPass");
	    	button.click();
	    }

	   public void login() {
		   login.click();
	   }
}
