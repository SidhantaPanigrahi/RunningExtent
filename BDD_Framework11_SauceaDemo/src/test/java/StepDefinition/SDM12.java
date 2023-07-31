package StepDefinition;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.webelements.ReadTestEle12;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SDM12 {
	
	public WebDriver driver;
	ExtentHtmlReporter extreport;
	ExtentReports report;
	ExtentTest exttest;
	
	@Before
	public void before1() {

		  extreport=new ExtentHtmlReporter(".//TestReports//SDM12.html");
		report=new ExtentReports();
		report.attachReporter(extreport);
		exttest=report.createTest("SauceDemo"," page related report");
		}
	 
	@Given("I launch the browser12")
	public void i_launch_the_browser12() {
	    WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    System.out.println("i launch the browser");
		exttest.pass("Successfully launch the browser"); 
	}

	@Then("I open the URL12")
	public void i_open_the_url12() throws Exception {
	   driver.get("https://www.saucedemo.com/");
	   driver.manage().window().maximize();
	   Thread.sleep(3000);
		System.out.println("i navigated to the website");
		exttest.pass("Successfully navigated to the url");
	}

	@And("I give valid username12")
	public void i_give_valid_username12() throws Exception {
		Thread.sleep(3000);
	   ReadTestEle12 rdt=new ReadTestEle12(driver);
	   Thread.sleep(3000);
	   rdt.username12.sendKeys("standard_user");
	   System.out.println("Successfully clicked on username12");
		exttest.pass("Successfully clicked on username12");
		Thread.sleep(3000);
	}

	@And("I give valid password12")
	public void i_give_valid_password12() throws Exception {
		Thread.sleep(3000);
		 ReadTestEle12 rdt=new ReadTestEle12(driver);
		   Thread.sleep(3000);
		   rdt.password12.sendKeys("secret_sauce");
		   System.out.println("Successfully clicked on password12");
			exttest.pass("Successfully clicked on password12");
			Thread.sleep(3000);
	}

	@Then("I click on login12")
	public void i_click_on_login12() throws Exception {
		Thread.sleep(3000);
		 ReadTestEle12 rdt=new ReadTestEle12(driver);
		   Thread.sleep(3000);
		   rdt.login12.click();
		   System.out.println("Successfully clicked on login12");
			exttest.pass("Successfully clicked on login12");
			Thread.sleep(3000);
	}

	@And("I click on {int} dot12")
	public void i_click_on_dot12(Integer int1) throws Exception {
		Thread.sleep(3000);
		ReadTestEle12 rdt=new ReadTestEle12(driver);
		   Thread.sleep(3000);
		   rdt.dot12.click();
		   System.out.println("Successfully clicked on dot12");
			exttest.pass("Successfully clicked on dot12");
			Thread.sleep(3000);
	}

	@Then("I click on About12")
	public void i_click_on_about12() throws Exception {
		Thread.sleep(3000);
		ReadTestEle12 rdt=new ReadTestEle12(driver);
		   Thread.sleep(3000);
		   rdt.about12.click();
		   System.out.println("Successfully clicked on about12");
			exttest.pass("Successfully clicked on about12");
			Thread.sleep(3000);
	}

	@And("I select Pricing")
	public void i_select_pricing() throws Exception {
		Thread.sleep(3000);
		ReadTestEle12 rdt=new ReadTestEle12(driver);
		   Thread.sleep(3000);
		   rdt.pricing12.click();
		   System.out.println("Successfully clicked on pricing12");
			exttest.pass("Successfully clicked on pricing12");
	}
	
	 @After
		public void close() {
			report.flush();

		}
}
