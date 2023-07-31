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
import com.webelements.ReadTestEle10;
import com.webelements.ReadTestEle11;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SDM11 {
	
	public WebDriver driver;
	ExtentHtmlReporter extreport;
	ExtentReports report;
	ExtentTest exttest;
	
	@Before
	public void before1() {

		  extreport=new ExtentHtmlReporter(".//TestReports//SDM11.html");
		report=new ExtentReports();
		report.attachReporter(extreport);
		exttest=report.createTest("SauceDemo"," page related report");
		}
	
	@Given("launch the browser11")
	public void launch_the_browser11() {
	   WebDriverManager.chromedriver().setup();
	   driver=new ChromeDriver();
	   System.out.println("i launch the browser");
		exttest.pass("Successfully launch the browser"); 
	}

	@Then("navigated to URL11")
	public void navigated_to_url11() throws Exception {
	   driver.get("https://www.saucedemo.com/");
	   driver.manage().window().maximize();
		Thread.sleep(3000);
		System.out.println("i navigated to the website");
		exttest.pass("Successfully navigated to the url");
	}

	@And("give valid username11")
	public void give_valid_username11() throws Exception {
		Thread.sleep(3000);
		ReadTestEle11 rdt=new ReadTestEle11(driver);
		Thread.sleep(3000);
		rdt.username11.sendKeys("standard_user");
		System.out.println("Successfully clicked on username11");
		exttest.pass("Successfully clicked on username11");
		Thread.sleep(3000);
	}

	@Then("give valid password11")
	public void give_valid_password11() throws Exception {
		Thread.sleep(3000);
		ReadTestEle11 rdt=new ReadTestEle11(driver);
		Thread.sleep(3000);
		rdt.password11.sendKeys("secret_sauce");
		System.out.println("Successfully clicked on password11");
		exttest.pass("Successfully clicked on password11");
		Thread.sleep(3000);
	}

	@And("click on login11")
	public void click_on_login11() throws Exception {
		Thread.sleep(3000);
		ReadTestEle11 rdt=new ReadTestEle11(driver);
		Thread.sleep(3000);
		rdt.login11.click();
		System.out.println("Successfully clicked on login11");
		exttest.pass("Successfully clicked on login11");
		Thread.sleep(3000);
	}

	@Then("click on {int} dot11")
	public void click_on_dot11(Integer int1) throws Exception {
		Thread.sleep(3000);
	   ReadTestEle11 rdt=new ReadTestEle11(driver);
	   Thread.sleep(3000);
		rdt.dot11.click();
		System.out.println("Successfully clicked on dot11");
		exttest.pass("Successfully clicked on dot11");
		Thread.sleep(3000);
	}

	@And("click on about11")
	public void click_on_about11() throws Exception {
		Thread.sleep(3000);
	   ReadTestEle11 rdt=new ReadTestEle11(driver);
	   Thread.sleep(3000);
	   rdt.about11.click();
	   System.out.println("Successfully clicked on about11");
		exttest.pass("Successfully clicked on about11");
	   
	}
	 
	 @After
		public void close() {
			report.flush();

		}
}

