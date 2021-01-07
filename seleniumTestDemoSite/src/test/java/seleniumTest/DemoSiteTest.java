package seleniumTest;

import static org.junit.Assert.assertEquals;

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
import pages.createUser;
import pages.landingPage;
import pages.login;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/cuke/DemoSite.feature", monochrome=true,glue = {"stepdef"})
public class DemoSiteTest {


	 




}
