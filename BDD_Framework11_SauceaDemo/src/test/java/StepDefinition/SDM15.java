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
import com.webelements.ReadTestEle14;
import com.webelements.ReadTestEle15;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SDM15 {
	
	public WebDriver driver;
	ExtentHtmlReporter extreport;
	ExtentReports report;
	ExtentTest exttest;
	
	@Before
	public void before1() {

		  extreport=new ExtentHtmlReporter(".//TestReports//SDM15.html");
		report=new ExtentReports();
		report.attachReporter(extreport);
		exttest=report.createTest("SauceDemo"," page related report");
		}
	
	@Given("I launch the browser15")
	public void i_launch_the_browser15() {
		 WebDriverManager.chromedriver().setup();
		    driver=new ChromeDriver();
		    System.out.println("i launch the browser");
			exttest.pass("Successfully launch the browser"); 
	}

	@Then("I open the URL15")
	public void i_open_the_url15() throws Exception {
		driver.get("https://www.saucedemo.com/");
		   driver.manage().window().maximize();
		   Thread.sleep(3000);
			System.out.println("i navigated to the website");
			exttest.pass("Successfully navigated to the url");
	}

	@And("I give valid username15")
	public void i_give_valid_username15() throws Exception {
		Thread.sleep(3000);
		ReadTestEle15 rdt=new ReadTestEle15(driver);
		   Thread.sleep(3000);
		   rdt.username15.sendKeys("standard_user");
		   System.out.println("Successfully clicked on username15");
			exttest.pass("Successfully clicked on username15");
			Thread.sleep(3000);
	}

	@And("I give valid password15")
	public void i_give_valid_password15() throws Exception {
		Thread.sleep(3000);
		ReadTestEle15 rdt=new ReadTestEle15(driver);
		   Thread.sleep(3000);
		   rdt.password15.sendKeys("secret_sauce");
		   System.out.println("Successfully clicked on password15");
			exttest.pass("Successfully clicked on password15");
			Thread.sleep(3000);
	}

	@Then("I click on login15")
	public void i_click_on_login15() throws Exception {
		Thread.sleep(3000);
		ReadTestEle15 rdt=new ReadTestEle15(driver);
		   Thread.sleep(3000);
		   rdt.login15.click();
		   System.out.println("Successfully clicked on login15");
			exttest.pass("Successfully clicked on login15");
			Thread.sleep(3000);
	}

	@And("I click on {int} dot15")
	public void i_click_on_dot15(Integer int1) throws Exception {
		Thread.sleep(3000);
		ReadTestEle15 rdt=new ReadTestEle15(driver);
		   Thread.sleep(3000);
		   rdt.dot15.click();
		   System.out.println("Successfully clicked on dot15");
			exttest.pass("Successfully clicked on dot15");
			Thread.sleep(3000);
	}

	@Then("I click on About15")
	public void i_click_on_about15() throws Exception {
		Thread.sleep(3000);
		ReadTestEle15 rdt=new ReadTestEle15(driver);
		   Thread.sleep(3000);
		   rdt.about15.click();
		   System.out.println("Successfully clicked on about15");
			exttest.pass("Successfully clicked on about15");
			Thread.sleep(3000);
	}

	@Then("I goto solutions and select visual testing")
	public void i_goto_solutions_and_select_visual_testing() throws Exception {
		Thread.sleep(3000);
		ReadTestEle15 rdt=new ReadTestEle15(driver);
		   Thread.sleep(3000);
		   Actions act=new Actions(driver);
		   act.moveToElement(( rdt.solution15)).perform();
		   act.moveToElement(( rdt.visual5)).perform();
		   Thread.sleep(3000);
		    rdt.visual5.click();
		   System.out.println("Successfully clicked on tools14");
			exttest.pass("Successfully clicked on tools14");
	}

	
	 @After
		public void close() {
			report.flush();

		}
}
