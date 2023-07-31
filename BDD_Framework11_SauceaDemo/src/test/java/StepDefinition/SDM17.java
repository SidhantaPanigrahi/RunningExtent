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
import com.webelements.ReadTestEle16;
import com.webelements.ReadtestEle17;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SDM17 {
	
	public WebDriver driver;
	ExtentHtmlReporter extreport;
	ExtentReports report;
	ExtentTest exttest;
	
	@Before
	public void before1() {

		  extreport=new ExtentHtmlReporter(".//TestReports//SDM17.html");
		report=new ExtentReports();
		report.attachReporter(extreport);
		exttest=report.createTest("SauceDemo"," page related report");
		}
	
	@Given("I launch the browser17")
	public void i_launch_the_browser17() {
		 WebDriverManager.chromedriver().setup();
		    driver=new ChromeDriver();
		    System.out.println("i launch the browser");
			exttest.pass("Successfully launch the browser"); 
	}

	@Then("I open the URL17")
	public void i_open_the_url17() throws Exception {
		driver.get("https://www.saucedemo.com/");
		   driver.manage().window().maximize();
		   Thread.sleep(3000);
			System.out.println("i navigated to the website");
			exttest.pass("Successfully navigated to the url");
	}

	@And("I give valid username17")
	public void i_give_valid_username17() throws Exception {
		Thread.sleep(3000);
		ReadtestEle17 rdt=new ReadtestEle17(driver);
		   Thread.sleep(3000);
		   rdt.username17.sendKeys("standard_user");
		   System.out.println("Successfully clicked on username17");
			exttest.pass("Successfully clicked on username17");
			Thread.sleep(3000);
	}

	@And("I give valid password17")
	public void i_give_valid_password17() throws Exception {
		Thread.sleep(3000);
		ReadtestEle17 rdt=new ReadtestEle17(driver);
		   Thread.sleep(3000);
		   rdt.password17.sendKeys("secret_sauce");
		   System.out.println("Successfully clicked on password17");
			exttest.pass("Successfully clicked on password17");
			Thread.sleep(3000);
	}

	@Then("I click on login17")
	public void i_click_on_login17() throws Exception {
		Thread.sleep(3000);
		ReadtestEle17 rdt=new ReadtestEle17(driver);
		   Thread.sleep(3000);
		   rdt.login17.click();
		   System.out.println("Successfully clicked on login17");
			exttest.pass("Successfully clicked on login17");
			Thread.sleep(3000);
	}

	@And("I click on {int} dot17")
	public void i_click_on_dot17(Integer int1) throws Exception {
		Thread.sleep(3000);
		ReadtestEle17 rdt=new ReadtestEle17(driver);
		   Thread.sleep(3000);
		   rdt.dot17.click();
		   System.out.println("Successfully clicked on dot17");
			exttest.pass("Successfully clicked on dot17");
			Thread.sleep(3000);
	}

	@Then("I click on About17")
	public void i_click_on_about17() throws Exception {
		Thread.sleep(3000);
		ReadtestEle17 rdt=new ReadtestEle17(driver);
		   Thread.sleep(3000);
		   rdt.about17.click();
		   System.out.println("Successfully clicked on about17");
			exttest.pass("Successfully clicked on about17");
			Thread.sleep(3000);
	}

	@Then("I goto resources and select events")
	public void i_goto_resources_and_select_events() throws Exception {
		Thread.sleep(3000);
		ReadtestEle17 rdt=new ReadtestEle17(driver);
		   Thread.sleep(3000);
		   Actions act=new Actions(driver);
		   act.moveToElement(( rdt.resource17)).perform();
		   act.moveToElement(( rdt.event17)).perform();
		   Thread.sleep(3000);
		    rdt.event17.click();
		   System.out.println("Successfully clicked on event17");
			exttest.pass("Successfully clicked on event17");
	}
	
	 @After
		public void close() {
			report.flush();

		}
}

