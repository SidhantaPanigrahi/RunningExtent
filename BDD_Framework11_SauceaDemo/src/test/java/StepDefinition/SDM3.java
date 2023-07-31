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
import com.webelements.ReadTestEle2;
import com.webelements.ReadTestEle3;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SDM3 {
	
	public WebDriver driver;
	ExtentHtmlReporter extreport;
	ExtentReports report;
	ExtentTest exttest;
	
	
	@Before
	public void before1() {

	  extreport=new ExtentHtmlReporter(".//TestReports//SDM3.html");
	report=new ExtentReports();
	report.attachReporter(extreport);
	exttest=report.createTest("SauceDemo"," page related report");
	}
	
	
	@Given("I launch the browser3")
	public void i_launch_the_browser3() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		System.out.println("i launch the browser");
		exttest.fail("Successfully launch the browser");
	}

	@And("I navigated to the URL3")
	public void i_navigated_to_the_url3() throws Exception {
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		System.out.println("i navigated to the website");
		exttest.fail("Successfully navigated to the url");
	}

	@Then("I give Valid username3")
	public void i_give_valid_username3() throws Throwable {
		Thread.sleep(3000);
		ReadTestEle3 rdt=new ReadTestEle3(driver);
		Thread.sleep(3000);
		rdt.username3.sendKeys("problem_user");
		System.out.println("Successfully clicked on username3");
	    exttest.fail("Successfully clicked on username3");
		Thread.sleep(3000);
	}

	@And("I give valid password3")
	public void i_give_valid_password3() throws Exception {
		ReadTestEle3 rdt=new ReadTestEle3(driver);
		Thread.sleep(3000);
		rdt.password3.sendKeys("secret_sauce");
		System.out.println("Successfully clicked on password3");
		exttest.fail("Successfully clicked on password3");
		Thread.sleep(3000);
	}

	@Then("I click on login button3")
	public void i_click_on_login_button3() throws Exception {
		Thread.sleep(3000);
		ReadTestEle3 rdt=new ReadTestEle3(driver);
		Thread.sleep(3000);
		rdt.login3.click();
		System.out.println("Successfully clicked on login3");
		exttest.fail("Successfully clicked on login3");
	}

	
	 
	 
	 @After
	 public void close() {
	 report.flush();

	}
  }

