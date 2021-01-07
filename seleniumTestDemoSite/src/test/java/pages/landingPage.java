package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class landingPage {
	 public final static String URL = "http://thedemosite.co.uk/";

	    private WebDriver driver;

	    public landingPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }


	    @FindBy(xpath = "/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[3]")
	    private WebElement createButton;



	    public void clickCreate() {
	    	createButton.click();
	    }

	   
}
