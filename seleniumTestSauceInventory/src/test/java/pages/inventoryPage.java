package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class inventoryPage {
	// public final static String URL = "https://www.saucedemo.com/";

	    private WebDriver driver;

	    public inventoryPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    @FindBy(xpath = "/html/body/div/div[2]/div[1]/div[2]/a")
	    private WebElement cart;

	    public void goToCart() {
	    	cart.click();
	    }

	   
}
