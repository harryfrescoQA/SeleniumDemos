package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signIn {

    private WebDriver driver;

    public signIn(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    @FindBy(id = "email_create")
    private WebElement emailInput;

    @FindBy(id = "SubmitCreate")
    private WebElement signupbutton1;


    public void clickSignIn(String[][] users, int userNum) {
    	emailInput.sendKeys(users[userNum][0]);
    	signupbutton1.click();
    }
}
