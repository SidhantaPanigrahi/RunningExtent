package StepDefinition;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.webelements.ReadTestEle15;
import com.webelements.ReadTestEle16;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SDM16 {
	
	public WebDriver driver;
	ExtentHtmlReporter extreport;
	ExtentReports report;
	ExtentTest exttest;
	
	@Before
	public void before1() {

		  extreport=new ExtentHtmlReporter(".//TestReports//SDM16.html");
		report=new ExtentReports();
		report.attachReporter(extreport);
		exttest=report.createTest("SauceDemo"," page related report");
		}
	
	@Given("I launch the browser16")
	public void i_launch_the_browser16() {
		 WebDriverManager.chromedriver().setup();
		    driver=new ChromeDriver();
		    System.out.println("i launch the browser");
			exttest.pass("Successfully launch the browser"); 
	}

	@Then("I open the URL16")
	public void i_open_the_url16() throws Exception {
		driver.get("https://www.saucedemo.com/");
		   driver.manage().window().maximize();
		   Thread.sleep(3000);
			System.out.println("i navigated to the website");
			exttest.pass("Successfully navigated to the url");
	}

	@And("I give valid username16")
	public void i_give_valid_username16() throws Exception {
		Thread.sleep(3000);
		ReadTestEle16 rdt=new ReadTestEle16(driver);
		   Thread.sleep(3000);
		   rdt.username16.sendKeys("standard_user");
		   System.out.println("Successfully clicked on username16");
			exttest.pass("Successfully clicked on username16");
			Thread.sleep(3000);
	}

	@And("I give valid password16")
	public void i_give_valid_password16() throws Exception {
		Thread.sleep(3000);
		ReadTestEle16 rdt=new ReadTestEle16(driver);
		   Thread.sleep(3000);
		   rdt.password16.sendKeys("secret_sauce");
		   System.out.println("Successfully clicked on password16");
			exttest.pass("Successfully clicked on password16");
			Thread.sleep(3000);
	}

	@Then("I click on login16")
	public void i_click_on_login16() throws Exception {
		Thread.sleep(3000);
		ReadTestEle16 rdt=new ReadTestEle16(driver);
		   Thread.sleep(3000);
		   rdt.login16.click();
		   System.out.println("Successfully clicked on login16");
			exttest.pass("Successfully clicked on login16");
			Thread.sleep(3000);
	}

	@And("I click on {int} dot16")
	public void i_click_on_dot16(Integer int1) throws Exception {
		Thread.sleep(3000);
		ReadTestEle16 rdt=new ReadTestEle16(driver);
		   Thread.sleep(3000);
		   rdt.dot16.click();
		   System.out.println("Successfully clicked on dot16");
			exttest.pass("Successfully clicked on dot16");
			Thread.sleep(3000);
	}

	@Then("I click on About16")
	public void i_click_on_about16() throws Exception {
		Thread.sleep(3000);
		ReadTestEle16 rdt=new ReadTestEle16(driver);
		   Thread.sleep(3000);
		   rdt.about16.click();
		   System.out.println("Successfully clicked on about16");
			exttest.pass("Successfully clicked on about16");
			Thread.sleep(3000);
	}

	@Then("I goto resources and select documentation")
	public void i_goto_resources_and_select_documentation() throws Exception {
		Thread.sleep(3000);
		ReadTestEle16 rdt=new ReadTestEle16(driver);
		   Thread.sleep(3000);
		   Actions act=new Actions(driver);
		   act.moveToElement(( rdt.resource16)).perform();
		   act.moveToElement(( rdt.document16)).perform();
		   Thread.sleep(3000);
		    rdt.document16.click();
		   System.out.println("Successfully clicked on tools14");
			exttest.pass("Successfully clicked on tools14");
	}
	 
	 @After
		public void close() {
			report.flush();

		}
}
