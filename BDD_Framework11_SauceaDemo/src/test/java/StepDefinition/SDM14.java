package StepDefinition;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.webelements.ReadTestEle13;
import com.webelements.ReadTestEle14;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SDM14 {
	
	public WebDriver driver;
	ExtentHtmlReporter extreport;
	ExtentReports report;
	ExtentTest exttest;
	
	@Before
	public void before1() {

		  extreport=new ExtentHtmlReporter(".//TestReports//SDM14.html");
		report=new ExtentReports();
		report.attachReporter(extreport);
		exttest=report.createTest("SauceDemo"," page related report");
		}
	
	@Given("I launch the browser14")
	public void i_launch_the_browser14() {
		 WebDriverManager.chromedriver().setup();
		    driver=new ChromeDriver();
		    System.out.println("i launch the browser");
			exttest.pass("Successfully launch the browser"); 
	}

	@Then("I open the URL14")
	public void i_open_the_url14() throws Exception {
		 driver.get("https://www.saucedemo.com/");
		   driver.manage().window().maximize();
		   Thread.sleep(3000);
			System.out.println("i navigated to the website");
			exttest.pass("Successfully navigated to the url");
	}

	@And("I give valid username14")
	public void i_give_valid_username14() throws Exception {
		Thread.sleep(3000);
		ReadTestEle14 rdt=new ReadTestEle14(driver);
		   Thread.sleep(3000);
		   rdt.username14.sendKeys("standard_user");
		   System.out.println("Successfully clicked on username14");
			exttest.pass("Successfully clicked on username14");
			Thread.sleep(3000);
	}

	@And("I give valid password14")
	public void i_give_valid_password14() throws Exception {
		Thread.sleep(3000);
		ReadTestEle14 rdt=new ReadTestEle14(driver);
		   Thread.sleep(3000);
		   rdt.password14.sendKeys("secret_sauce");
		   System.out.println("Successfully clicked on password14");
			exttest.pass("Successfully clicked on password14");
			Thread.sleep(3000);
	}

	@Then("I click on login14")
	public void i_click_on_login14() throws Exception {
		Thread.sleep(3000);
		ReadTestEle14 rdt=new ReadTestEle14(driver);
		   Thread.sleep(3000);
		   rdt.login14.click();
		   System.out.println("Successfully clicked on login14");
			exttest.pass("Successfully clicked on login14");
			Thread.sleep(3000);
	}

	@And("I click on {int} dot14")
	public void i_click_on_dot14(Integer int1) throws Exception {
		Thread.sleep(3000);
		ReadTestEle14 rdt=new ReadTestEle14(driver);
		   Thread.sleep(3000);
		   rdt.dot14.click();
		   System.out.println("Successfully clicked on dot14");
			exttest.pass("Successfully clicked on dot14");
			Thread.sleep(3000);
	}

	@Then("I click on About14")
	public void i_click_on_about14() throws Exception {
		Thread.sleep(3000);
		ReadTestEle14 rdt=new ReadTestEle14(driver);
		   Thread.sleep(3000);
		   rdt.about14.click();
		   System.out.println("Successfully clicked on about14");
			exttest.pass("Successfully clicked on about14");
			Thread.sleep(3000);
	}

	@Then("I goto solutions and select CI\\/CD tools")
	public void i_goto_solutions_and_select_ci_cd_tools() throws Exception {
		Thread.sleep(3000);
		ReadTestEle14 rdt=new ReadTestEle14(driver);
		   Thread.sleep(3000);
		   Actions act=new Actions(driver);
		   act.moveToElement(( rdt.solution14)).perform();
		   act.moveToElement(( rdt.tool14)).perform();
		    rdt.tool14.click();
		   System.out.println("Successfully clicked on tools14");
			exttest.pass("Successfully clicked on tools14");
	}
	
	
	 @After
		public void close() {
			report.flush();

		}
}
