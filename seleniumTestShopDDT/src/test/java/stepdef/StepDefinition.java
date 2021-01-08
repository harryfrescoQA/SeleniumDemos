package stepdef;

import static org.junit.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	 private WebDriver driver;
	 private String nameCheck;
	 private int userNum=0;
	 // Using Apache POI
	 // Create four users and assert they can log in
	 // Username, password, assertion(what it's checking), status(passed)
	 @Before
	    public void setup() {
	        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().window().setSize(new Dimension(1366, 768));
	    }

	 public String[][] loginRead() throws IOException {
		 String[][] users = new String[4][9];
		 FileInputStream file = new FileInputStream("src/test/resources/data.xlsx");
		 XSSFWorkbook workbook = new XSSFWorkbook(file);
		 XSSFSheet sheet = workbook.getSheetAt(0);
		 
		 for (int rowNum = 0; rowNum < sheet.getPhysicalNumberOfRows(); rowNum++) {
	
			 for(int colNum = 0; colNum < 8; colNum++) {
				 XSSFCell cell = sheet.getRow(rowNum).getCell(colNum);
				 cell.setCellType(Cell.CELL_TYPE_STRING);
				 String userCell = cell.getStringCellValue().toString();
				 //output
				 
				users[rowNum][colNum]=userCell;
				//System.out.println(users[rowNum][colNum]);
			 }
		 }
		 return users;
	 }
	 
	 public void createUser() throws IOException {
		 String[][] users = loginRead();


			  nameCheck = users[userNum][1] + " " + users[userNum][2];
				   WebElement signin = driver.findElement(By.className("login"));
				   signin.click();
				   WebElement emailInput = driver.findElement(By.id("email_create"));
				   emailInput.sendKeys(users[userNum][0]);
				   WebElement signupbutton1 = driver.findElement(By.id("SubmitCreate"));
				   signupbutton1.click();
				   driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
				   WebElement name = driver.findElement(By.id("customer_firstname"));
				   name.sendKeys(users[userNum][1]);
				   WebElement name2 = driver.findElement(By.id("customer_lastname"));
				   name2.sendKeys(users[userNum][2]);
				   WebElement pass = driver.findElement(By.id("passwd"));
				   pass.sendKeys(users[userNum][3]);

				   WebElement address = driver.findElement(By.id("address1"));
				   address.sendKeys(users[userNum][4]);
				   WebElement city = driver.findElement(By.id("city"));
				   city.sendKeys(users[userNum][5]);
				   Select state = new Select(driver.findElement(By.id("id_state")));
				   state.selectByVisibleText("California");
				   WebElement pcode = driver.findElement(By.id("postcode"));
				   pcode.sendKeys(users[userNum][6]);
				   WebElement phone = driver.findElement(By.id("phone_mobile"));
				   phone.sendKeys(users[userNum][7]);
				   
				   WebElement submit = driver.findElement(By.id("submitAccount"));
				   submit.click();
				 
				  // 	System.out.println(users[x][y]);
				   
				   
	 }
	 
	 // Go to site
	@Given("^the correct web address$")
	public void the_correct_web_address() {
		 driver.get("http://automationpractice.com/index.php");
		 }


	@When("^I create a user$")
	public void i_create_a_user() throws IOException {
		
		 
		createUser();
		 userNum++;
	}

	@Then("^I can log in with credentials$")
	public void i_can_log_in_with_credentials() throws IOException {
		WebElement check = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a"));
		System.out.println(check.getText());
		assertEquals(nameCheck, check.getText());
		if(userNum < 4) {
			driver.manage().deleteAllCookies();
			the_correct_web_address();
			i_create_a_user();
			i_can_log_in_with_credentials();
		}
		
	}
	
	
    @After
    public void tearDown() {
        driver.close();
    }
}
