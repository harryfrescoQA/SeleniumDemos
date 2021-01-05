package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class landingPage {
	 public final static String URL = "https://www.youidraw.com/apps/painter/";

	    private WebDriver driver;

	    public landingPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    @FindBy(id = "brush")
	    private WebElement brush;

	
	    @FindBy(id = "catch")
	    private WebElement canvas;

	    
	    public void clickBrush() {
	        brush.click();
	        canvas.click();
	    }

	   public void drawInitials() {
		   Actions action = new Actions(driver);
		   action.moveToElement(canvas).clickAndHold().moveByOffset(0, -200).click()
		   	.moveToElement(canvas, 0,-100).clickAndHold().moveByOffset(100, 0).click().moveToElement(canvas,100,0).clickAndHold().moveByOffset(0, -200).click()
		   	.build().perform();
		   
		   action.moveToElement(canvas, 150, 0).clickAndHold().moveByOffset(0, -200).moveByOffset(100, 0).click()
		   .moveToElement(canvas, 150, -100).clickAndHold().moveByOffset(100, 0).build().perform();
				   }
}
