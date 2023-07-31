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
import com.webelements.ReadTestEle7;
import com.webelements.ReadTestEle8;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SDM8 {
	
	public WebDriver driver;
	ExtentHtmlReporter extreport;
	ExtentReports report;
	ExtentTest exttest;
	
	@Before
	public void before1() {

	  extreport=new ExtentHtmlReporter(".//TestReports//SDM8.html");
	report=new ExtentReports();
	report.attachReporter(extreport);
	exttest=report.createTest("SauceDemo"," page related report");
	}
	
	@Given("I launch the browser8")
	public void i_launch_the_browser8() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		System.out.println("i launch the browser");
		exttest.pass("Successfully launch the browser"); 
	}

	@And("I navigated to the URL8")
	public void i_navigated_to_the_url8() throws Exception {
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		System.out.println("i navigated to the website");
		exttest.pass("Successfully navigated to the url");
	}

	@Then("I give Valid username8")
	public void i_give_valid_username8() throws InterruptedException {
		Thread.sleep(3000);
		ReadTestEle8 rdt=new ReadTestEle8(driver);
		Thread.sleep(3000);
		rdt.username8.sendKeys("standard_user");
		System.out.println("Successfully clicked on username8");
		exttest.pass("Successfully clicked on username8");
		Thread.sleep(3000);
	}

	@And("I give valid password8")
	public void i_give_valid_password8() throws Exception {
		Thread.sleep(3000);
		ReadTestEle8 rdt=new ReadTestEle8(driver);
		Thread.sleep(3000);
		rdt.password8.sendKeys("secret_sauce");
		System.out.println("Successfully clicked on password8");
		exttest.pass("Successfully clicked on password8");
		Thread.sleep(3000);
	}

	@Then("I click on login button8")
	public void i_click_on_login_button8() throws Exception {
		Thread.sleep(3000);
		ReadTestEle8 rdt=new ReadTestEle8(driver);
		Thread.sleep(3000);
		rdt.login8.click();
		System.out.println("Successfully clicked on login8");
		exttest.pass("Successfully clicked on login8");
		Thread.sleep(3000);
	}

	@Then("I click on add to cart button8")
	public void i_click_on_add_to_cart_button8() throws Exception {
		Thread.sleep(3000);
		ReadTestEle8 rdt=new ReadTestEle8(driver);
		Thread.sleep(3000);
		rdt.addtocart8.click();
		System.out.println("Successfully clicked on login8");
		exttest.pass("Successfully clicked on login8");
		Thread.sleep(3000);
	}

	@And("I click on cartimage8")
	public void i_click_on_cartimage8() throws Exception {
		Thread.sleep(3000);
		 ReadTestEle8 rdt=new ReadTestEle8(driver);
		    Thread.sleep(3000);
		    rdt.cartimage8.click();
		    System.out.println("Successfully clicked on cartimage");
			exttest.pass("Successfully clicked on cartimage");
			Thread.sleep(3000);
	}

	@Then("I click on continue shopping button8")
	public void i_click_on_continue_shopping_button8() throws Exception {
		Thread.sleep(3000);
	    ReadTestEle8 rdt=new ReadTestEle8(driver);
	    Thread.sleep(3000);
	    rdt.continueshopping8.click();
	    System.out.println("Successfully clicked on continue shopping");
		exttest.pass("Successfully clicked on continue shopping");
	}
	
	  

	 @After
	 public void close() {
	 report.flush();

	}
}
