package seleniumTest;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import pages.inventoryPage;
import pages.landingPage;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/cuke/DemoSite.feature", monochrome=true,glue = {"stepdef"})
public class DemoSiteTest {
	

//	 
}
