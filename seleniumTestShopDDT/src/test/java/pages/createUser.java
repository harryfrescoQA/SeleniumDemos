package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class createUser {
    private WebDriver driver;

    public createUser(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    @FindBy(id = "customer_firstname")
    private WebElement name;

    @FindBy(id = "customer_lastname")
    private WebElement name2;

    @FindBy(id = "passwd")
    private WebElement pass;
    
    @FindBy(id = "address1")
    private WebElement address;
    
    @FindBy(id = "city")
    private WebElement city;

//    @FindBy(id = "id_state")
//    private Select state;
    


    @FindBy(id = "postcode")
    private WebElement pcode;
    
    @FindBy(id = "phone_mobile")
    private WebElement phone;   
    
    @FindBy(id = "submitAccount")
    private WebElement submit;  
    


    public void createAccountForm(String[][] users, int userNum) {
 	   name.sendKeys(users[userNum][1]);
 	   name2.sendKeys(users[userNum][2]);
 	   pass.sendKeys(users[userNum][3]);
 	   address.sendKeys(users[userNum][4]);
 	   city.sendKeys(users[userNum][5]);
 	   Select state = new Select(driver.findElement(By.id("id_state")));
 	   state.selectByVisibleText("California");
 	   pcode.sendKeys(users[userNum][6]);
 	   phone.sendKeys(users[userNum][7]);
 	 
 	   submit.click();
    }
}
