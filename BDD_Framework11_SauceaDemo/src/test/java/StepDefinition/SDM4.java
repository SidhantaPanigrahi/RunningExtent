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
import com.webelements.ReadTestEle3;
import com.webelements.ReadTestEle4;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SDM4 {
	
	public WebDriver driver;
	ExtentHtmlReporter extreport;
	ExtentReports report;
	ExtentTest exttest;
	
	
	@Before
	public void before1() {

	  extreport=new ExtentHtmlReporter(".//TestReports//SDM4.html");
	report=new ExtentReports();
	report.attachReporter(extreport);
	exttest=report.createTest("SauceDemo"," page related report");
	}
	
	@Given("I launch the browser4")
	public void i_launch_the_browser4() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		System.out.println("i launch the browser");
		exttest.pass("Successfully launch the browser");
	}

	@And("I navigated to the URL4")
	public void i_navigated_to_the_url4() throws Exception {
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		System.out.println("i navigated to the website");
		exttest.pass("Successfully navigated to the url");
	}

	@Then("I give Valid username4")
	public void i_give_valid_username4() throws Exception {
		Thread.sleep(3000);
		ReadTestEle4 rdt=new ReadTestEle4(driver);
		Thread.sleep(3000);
		rdt.username4.sendKeys("performance_glitch_user");
		System.out.println("Successfully clicked on username4");
		exttest.pass("Successfully clicked on username4");
		Thread.sleep(3000);
	}

	@And("I give valid password4")
	public void i_give_valid_password4() throws Exception {
		Thread.sleep(3000);
		ReadTestEle4 rdt=new ReadTestEle4(driver);
		Thread.sleep(3000);
		rdt.password4.sendKeys("secret_sauce");
		System.out.println("Successfully clicked on password4");
		exttest.pass("Successfully clicked on password4");
		Thread.sleep(3000);
	}

	@Then("I click on login button4")
	public void i_click_on_login_button4() throws Exception {
		Thread.sleep(3000);
		ReadTestEle4 rdt=new ReadTestEle4(driver);
		Thread.sleep(3000);
		rdt.login4.click();
		System.out.println("Successfully clicked on login4");
		exttest.pass("Successfully clicked on login4");
	}
	
	 
	 
	 @After
	 public void close() {
	 report.flush();

	}

}
