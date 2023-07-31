package StepDefinition;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.webelements.ReadTestEle10;
import com.webelements.ReadTestEle7;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SDM10 {
	
	public WebDriver driver;
	ExtentHtmlReporter extreport;
	ExtentReports report;
	ExtentTest exttest;
	
	@Before
	public void before1() {

	  extreport=new ExtentHtmlReporter(".//TestReports//SDM10.html");
	report=new ExtentReports();
	report.attachReporter(extreport);
	exttest=report.createTest("SauceDemo"," page related report");
	}
	@Given("I launch the browser10")
	public void i_launch_the_browser10() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		System.out.println("i launch the browser");
		exttest.pass("Successfully launch the browser"); 
	}

	@And("I navigated to the URL10")
	public void i_navigated_to_the_url10() throws Exception {
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		System.out.println("i navigated to the website");
		exttest.pass("Successfully navigated to the url");
	}

	@Then("I give Valid username10")
	public void i_give_valid_username10() throws Exception {
		Thread.sleep(3000);
		ReadTestEle10 rdt=new ReadTestEle10(driver);
		Thread.sleep(3000);
		rdt.username10.sendKeys("standard_user");
		System.out.println("Successfully clicked on username10");
		exttest.pass("Successfully clicked on username10");
		Thread.sleep(3000);
	}

	@And("I give valid password10")
	public void i_give_valid_password10() throws Exception {
		Thread.sleep(3000);
		ReadTestEle10 rdt=new ReadTestEle10(driver);
		Thread.sleep(3000);
		rdt.password10.sendKeys("secret_sauce");
		System.out.println("Successfully clicked on password10");
		exttest.pass("Successfully clicked on password10");
		Thread.sleep(3000);
	}

	@Then("I click on login button10")
	public void i_click_on_login_button10() throws Exception {
		Thread.sleep(3000);
		ReadTestEle10 rdt=new ReadTestEle10(driver);
		Thread.sleep(3000);
		rdt.login10.click();
		System.out.println("Successfully clicked on login10");
		exttest.pass("Successfully clicked on login10");
		Thread.sleep(3000);
	}

	@And("I select price high to low10")
	public void i_select_price_high_to_low10() throws Exception {
		Thread.sleep(3000);
	   ReadTestEle10 rdt=new ReadTestEle10(driver);
	   Select slct=new Select(rdt.price10);
	   slct.selectByIndex(3);
	   System.out.println("Successfully clicked on login10");
	   exttest.pass("Successfully clicked on login10");
	}

	 

	 @After
		public void close() {
			report.flush();

		}
}
