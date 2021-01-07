package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class stockSitePage {
	 private WebDriver driver;
	 public final String URL = "https://www.hl.co.uk/shares/stock-market-summary/ftse-100";
	 
	public stockSitePage(WebDriver driver) {
		this.driver = driver;
        PageFactory.initElements(driver, this);

	}
	
	 @FindBy(id = "acceptCookie")
	    private WebElement cookie;
	 
	 @FindBy(xpath = "//*[@id=\\\"view-constituents\\\"]/ul/li[2]/a")
	    private WebElement risers;
	 
	 @FindBy(xpath = "/html/body/main/div/div/div[3]/div[4]/div[1]/div[2]/table/tbody/tr[1]/td[2]")
	    private WebElement topRiser;
	 
	 @FindBy(xpath = "/html/body/main/div/div/div[3]/div/div[4]/div[1]/ul/li[3]/a")
	    private WebElement fallers;
	 
	 @FindBy(xpath = "/html/body/main/div/div/div[3]/div[4]/div[1]/div[2]/table/tbody/tr[1]/td[2]")
	    private WebElement topFallers;
	 
	 public void clickCookie() {
		 cookie.click();
	 }
	 public String findRiser() {
		 risers.click();
		 return topRiser.getText();
	 }
	 
	 public String findFaller() {
		 fallers.click();
		 return topFallers.getText();
	 }
}
