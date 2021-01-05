package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {
	 public final static String URL = "http://thedemosite.co.uk/";

	    private WebDriver driver;

	    public login(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }


	    @FindBy(name = "username")
	    private WebElement username;

	    @FindBy(name = "password")
	    private WebElement password;

	    @FindBy(name = "FormsButton2")
	    private WebElement button;
	    
	    @FindBy(xpath = "/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b")
	    private WebElement checkLogin;
	    
	    public void login() {
	        username.sendKeys("TestUser");
	        password.sendKeys("TestPass");
	    	button.click();
	    }

	    public String checkLogin() {
	    	return checkLogin.getText();
	    }

}
