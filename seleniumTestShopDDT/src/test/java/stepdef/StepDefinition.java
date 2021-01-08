package stepdef;

import static org.junit.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
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
import pages.homePage;
import pages.signIn;
import pages.createUser;

public class StepDefinition {
	 private WebDriver driver;
	 private String nameCheck;
	 private int userNum=0;
	 String[][] users;
	 // Using Apache POI
	 // Create four users and assert they can log in
	 // Username, password, assertion(what it's checking), status(passed)
	 @Before
	    public void setup() {
	        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().window().setSize(new Dimension(1366, 768));
	    }

	 // Read from xlsx
	 public String[][] loginRead() throws IOException {
	
		 FileInputStream file = new FileInputStream("src/test/resources/data.xlsx");
		 XSSFWorkbook workbook = new XSSFWorkbook(file);
		 XSSFSheet sheet = workbook.getSheetAt(0);
		 users = new String[sheet.getPhysicalNumberOfRows()][sheet.getRow(0).getPhysicalNumberOfCells()];
		 for (int rowNum = 0; rowNum < sheet.getPhysicalNumberOfRows(); rowNum++) {
	
			 for(int colNum = 0; colNum < sheet.getRow(rowNum).getPhysicalNumberOfCells(); colNum++) {
			
				 XSSFCell cell = sheet.getRow(rowNum).getCell(colNum);
				 if(cell != null) {
					 	 cell.setCellType(Cell.CELL_TYPE_STRING);
						 String userCell = cell.getStringCellValue().toString();
							users[rowNum][colNum]=userCell;
				 }
			
			

				 //output
			
			 }
		 }
		 return users;
	 }
	 public void writeToFile(List<Boolean> results) throws IOException {
			
		 FileInputStream file = new FileInputStream("src/test/resources/data.xlsx");
		 XSSFWorkbook workbook = new XSSFWorkbook(file);
		 XSSFSheet sheet = workbook.getSheetAt(0);
		 
		 XSSFRow row = sheet.getRow(0);
		 
		 if(row != null) {
	
			 int resultNum = 0;
			 for(Boolean result : results) {
				 
				 XSSFCell cell = row.getCell(users[resultNum].length);
				 
				 if(cell == null) {
					 	cell = row.createCell(users[resultNum].length);
				 }
				 if(result == true) {
					 cell.setCellValue("Passed");
				 }
				 else {
					 cell.setCellValue("Failed");
				 }
				 resultNum++;
				 row = sheet.getRow(resultNum);
			 }
			
			 
			 
			 FileOutputStream fileOut = new FileOutputStream("src/test/resources/data.xlsx");
			 workbook.write(fileOut);
			 fileOut.flush();
			 fileOut.close();
			 file.close();
		 }
		
		 
	 }
	 
	 public void createUser() throws IOException {
		 String[][] users = loginRead();
	
		  nameCheck = users[userNum][1] + " " + users[userNum][2];
			  
		  homePage homePage = new homePage(driver);
		  homePage.clickSignIn();
		  
		  signIn signIn = new signIn(driver);
		 
		  signIn.clickSignIn(users, userNum);

				   
		  driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		  
		  createUser createUser = new createUser(driver);
		  createUser.createAccountForm(users, userNum);
				  // 	System.out.println(users[x][y]);
				   
				   
	 }
	 
	 // Go to site
	@Given("^the correct web address$")
	public void the_correct_web_address() {
		 driver.get(homePage.URL);
	}


	@When("^I create a user$")
	public void i_create_a_user() throws IOException {
		createUser();
		 userNum++;
	}

	@Then("^I can log in with credentials$")
	public void i_can_log_in_with_credentials() throws IOException {
		WebElement check = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a"));
		//System.out.println(check.getText() + " " + nameCheck);
		List<Boolean> results = new ArrayList<Boolean>();;
		results.add(nameCheck.equals(check.getText()));
		
		assertEquals(nameCheck, check.getText());
		

		if(userNum < users.length) {
			driver.manage().deleteAllCookies();
			the_correct_web_address();
			i_create_a_user();
			i_can_log_in_with_credentials();
		}
		writeToFile(results);
	}
	
	
    @After
    public void tearDown() {
        driver.close();
    }
}
