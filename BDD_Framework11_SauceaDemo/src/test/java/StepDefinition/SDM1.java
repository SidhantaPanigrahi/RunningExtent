package StepDefinition;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.webelements.ReadTestEle1;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SDM1 {
	
	public WebDriver driver;
	ExtentHtmlReporter extreport;
	ExtentReports report;
	ExtentTest exttest;
	
	
	
	@Before
	public void before1() {

	  extreport=new ExtentHtmlReporter(".//TestReports//SDM1.html");
	report=new ExtentReports();
	report.attachReporter(extreport);
	exttest=report.createTest("SauceDemo"," page related report");
	}

	
	@Given("I launch the browser")
	public void i_launch_the_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		System.out.println("i launch the browser");
		exttest.pass("Successfully launch the browser");
	}

	@And("I navigated to the URL")
	public void i_navigated_to_the_url() throws Exception {
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		System.out.println("i navigated to the website");
		exttest.pass("Successfully navigated to the url");
	}

	@Then("I give Valid username")
	public void i_give_valid_username() throws Exception {
		ReadTestEle1 rdt=new ReadTestEle1(driver);
		Thread.sleep(3000);
		rdt.username1.sendKeys("standard_user");
		System.out.println("Successfully clicked on username1");
		exttest.pass("Successfully clicked on username1 ");
		Thread.sleep(3000);
		
	}

	@And("I give valid password")
	public void i_give_valid_password() throws Exception {
		Thread.sleep(3000);
		ReadTestEle1 rdt=new ReadTestEle1(driver);
		Thread.sleep(3000);
		rdt.password1.sendKeys("secret_sauce");
		Thread.sleep(3000);
		System.out.println("Successfully clicked on password1");
		exttest.pass("Successfully clicked on password1");
	}

	@Then("I click on login button")
	public void i_click_on_login_button() throws Exception {
		Thread.sleep(3000);
		ReadTestEle1 rdt=new ReadTestEle1(driver);
		Thread.sleep(3000);
		rdt.login1.click();
		System.out.println("Successfully clicked on login1");
		exttest.pass("Successfully clicked on login1");
		
	 }
	
		
		 
		 

	@After
	public void close() {
		report.flush();

	}

}
