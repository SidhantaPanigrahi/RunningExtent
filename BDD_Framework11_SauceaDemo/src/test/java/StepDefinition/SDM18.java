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
import com.webelements.ReadTestEle18;
import com.webelements.ReadtestEle17;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SDM18 {
	
	public WebDriver driver;
	ExtentHtmlReporter extreport;
	ExtentReports report;
	ExtentTest exttest;
	
	@Before
	public void before1() {

		  extreport=new ExtentHtmlReporter(".//TestReports//SDM18.html");
		report=new ExtentReports();
		report.attachReporter(extreport);
		exttest=report.createTest("SauceDemo"," page related report");
		}
	
	@Given("I launch the browser18")
	public void i_launch_the_browser18() {
		 WebDriverManager.chromedriver().setup();
		    driver=new ChromeDriver();
		    System.out.println("i launch the browser");
			exttest.pass("Successfully launch the browser"); 
	}

	@And("I navigated to the URL18")
	public void i_navigated_to_the_url18() throws Exception {
		driver.get("https://www.saucedemo.com/");
		   driver.manage().window().maximize();
		   Thread.sleep(3000);
			System.out.println("i navigated to the website");
			exttest.pass("Successfully navigated to the url");
	}

	@Then("I give Valid username18")
	public void i_give_valid_username18() throws InterruptedException {
		Thread.sleep(3000);
		ReadTestEle18 rdt=new ReadTestEle18(driver);
		   Thread.sleep(3000);
		   rdt.username18.sendKeys("standard_user");
		   System.out.println("Successfully clicked on username18");
			exttest.pass("Successfully clicked on username18");
			Thread.sleep(3000);
	}

	@And("I give valid password18")
	public void i_give_valid_password18() throws Exception {
		Thread.sleep(3000);
		ReadTestEle18 rdt=new ReadTestEle18(driver);
		   Thread.sleep(3000);
		   rdt.password18.sendKeys("secret_sauce");
		   System.out.println("Successfully clicked on password18");
			exttest.pass("Successfully clicked on password18");
			Thread.sleep(3000);
	}

	@Then("I click on login button18")
	public void i_click_on_login_button18() throws Exception {
		Thread.sleep(3000);
		ReadTestEle18 rdt=new ReadTestEle18(driver);
		   Thread.sleep(3000);
		   rdt.login18.click();
		   System.out.println("Successfully clicked on login18");
			exttest.pass("Successfully clicked on login18");
			Thread.sleep(3000);
	}

	@And("I click on {int} dot18")
	public void i_click_on_dot18(Integer int1) throws Exception {
		Thread.sleep(3000);
		ReadTestEle18 rdt=new ReadTestEle18(driver);
		   Thread.sleep(3000);
		   rdt.dot18.click();
		   System.out.println("Successfully clicked on dot18");
			exttest.pass("Successfully clicked on dot18");
			Thread.sleep(3000);
	}

	@Then("I click on logout18")
	public void i_click_on_logout18() throws Exception {
		Thread.sleep(3000);
		ReadTestEle18 rdt=new ReadTestEle18(driver);
		   Thread.sleep(3000);
		   rdt.Logout18.click();
		   System.out.println("Successfully clicked on logout18");
			exttest.pass("Successfully clicked on logout18");
	}





@After
public void close() {
	report.flush();

}
}
