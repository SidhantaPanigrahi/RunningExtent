package StepDefinition;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.webelements.ReadTestEle5;
import com.webelements.ReadTestEle6;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SDM6 {
	
	public WebDriver driver;
	ExtentHtmlReporter extreport;
	ExtentReports report;
	ExtentTest exttest;
	
	@Before
	public void before1() {

	  extreport=new ExtentHtmlReporter(".//TestReports//SDM6.html");
	report=new ExtentReports();
	report.attachReporter(extreport);
	exttest=report.createTest("SauceDemo"," page related report");
	}
	
	@Given("I launch the browser6")
	public void i_launch_the_browser6() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		System.out.println("i launch the browser");
		exttest.pass("Successfully launch the browser"); 
	}
	

	@And("I navigated to the URL6")
	public void i_navigated_to_the_url6() throws Exception {
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		System.out.println("i navigated to the website");
		exttest.pass("Successfully navigated to the url");
	}

	@Then("I give Valid username6")
	public void i_give_valid_username6() throws Exception {
		Thread.sleep(3000);
		ReadTestEle6 rdt=new ReadTestEle6(driver);
		Thread.sleep(3000);
		rdt.username6.sendKeys("standard_user");
		System.out.println("Successfully clicked on username6");
		exttest.pass("Successfully clicked on username6");
		Thread.sleep(3000);
	}

	@And("I give valid password6")
	public void i_give_valid_password6() throws Exception {
		Thread.sleep(3000);
		ReadTestEle6 rdt=new ReadTestEle6(driver);
		Thread.sleep(3000);
		rdt.password6.sendKeys("secret_sauce");
		System.out.println("Successfully clicked on password6");
		exttest.pass("Successfully clicked on password6");
		Thread.sleep(3000);
	}

	@Then("I click on login button6")
	public void i_click_on_login_button6() throws Exception {
		Thread.sleep(3000);
		ReadTestEle6 rdt=new ReadTestEle6(driver);
		Thread.sleep(3000);
		rdt.login6.click();
		System.out.println("Successfully clicked on login6");
	    exttest.pass("Successfully clicked on login6");
		Thread.sleep(3000);
	}

	@Then("I click on add to cart button")
	public void i_click_on_add_to_cart_button() throws Exception {
		Thread.sleep(3000);
		ReadTestEle6 rdt=new ReadTestEle6(driver);
		Thread.sleep(3000);
		rdt.addtocart6.click();
		System.out.println("Successfully clicked on add to cart button");
		exttest.pass("Successfully clicked on add to cart button");
	}
	
	 
	
	@After
	 public void close() {
	 report.flush();

	}
}
