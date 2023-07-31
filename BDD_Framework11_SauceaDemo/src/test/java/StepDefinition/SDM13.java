package StepDefinition;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.webelements.ReadTestEle12;
import com.webelements.ReadTestEle13;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SDM13 {
	
	public WebDriver driver;
	ExtentHtmlReporter extreport;
	ExtentReports report;
	ExtentTest exttest;
	
	@Before
	public void before1() {

		  extreport=new ExtentHtmlReporter(".//TestReports//SDM13.html");
		report=new ExtentReports();
		report.attachReporter(extreport);
		exttest=report.createTest("SauceDemo"," page related report");
		}
	
	@Given("I launch the browser13")
	public void i_launch_the_browser13() {
		 WebDriverManager.chromedriver().setup();
		    driver=new ChromeDriver();
		    System.out.println("i launch the browser");
			exttest.pass("Successfully launch the browser");  
	}

	@Then("I open the URL13")
	public void i_open_the_url13() throws Exception {
		 driver.get("https://www.saucedemo.com/");
		   driver.manage().window().maximize();
		   Thread.sleep(3000);
			System.out.println("i navigated to the website");
			exttest.pass("Successfully navigated to the url");
	}

	@And("I give valid username13")
	public void i_give_valid_username13() throws Exception {
		Thread.sleep(3000);
		 ReadTestEle13 rdt=new ReadTestEle13(driver);
		   Thread.sleep(3000);
		   rdt.username13.sendKeys("standard_user");
		   System.out.println("Successfully clicked on username13");
			exttest.pass("Successfully clicked on username13");
			Thread.sleep(3000);
	}

	@And("I give valid password13")
	public void i_give_valid_password13() throws Exception {
		Thread.sleep(3000);
		ReadTestEle13 rdt=new ReadTestEle13(driver);
		   Thread.sleep(3000);
		   rdt.password13.sendKeys("secret_sauce");
		   System.out.println("Successfully clicked on password13");
			exttest.pass("Successfully clicked on password13");
			Thread.sleep(3000);
	}

	@Then("I click on login13")
	public void i_click_on_login13() throws Exception {
		Thread.sleep(3000);
		ReadTestEle13 rdt=new ReadTestEle13(driver);
		   Thread.sleep(3000);
		   rdt.login13.click();
		   System.out.println("Successfully clicked on login13");
			exttest.pass("Successfully clicked on login13");
			Thread.sleep(3000);
	}

	@And("I click on {int} dot13")
	public void i_click_on_dot13(Integer int1) throws Exception {
		Thread.sleep(3000);
		ReadTestEle13 rdt=new ReadTestEle13(driver);
		   Thread.sleep(3000);
		   rdt.dot13.click();
		   System.out.println("Successfully clicked on dot13");
			exttest.pass("Successfully clicked on dot13");
			Thread.sleep(3000);
	}

	@Then("I click on About13")
	public void i_click_on_about13() throws Exception {
		Thread.sleep(3000);
		ReadTestEle13 rdt=new ReadTestEle13(driver);
		   Thread.sleep(3000);
		   rdt.about13.click();
		   System.out.println("Successfully clicked on about13");
			exttest.pass("Successfully clicked on about13");
			Thread.sleep(3000);
	}

	@And("I click on request a demo13")
	public void i_click_on_request_a_demo13() throws Exception {
		Thread.sleep(3000);
		ReadTestEle13 rdt=new ReadTestEle13(driver);
		   Thread.sleep(3000);
		   rdt.request13.click();
		   System.out.println("Successfully clicked on req13");
			exttest.pass("Successfully clicked on req13");
			Thread.sleep(3000);
	}

	@Then("I provide firstname13")
	public void i_provide_firstname13() throws Exception {
		Thread.sleep(3000);
		ReadTestEle13 rdt=new ReadTestEle13(driver);
		   Thread.sleep(3000);
		   rdt.firstname13.sendKeys("sidhanta");
		   System.out.println("Successfully clicked on firstname13");
			exttest.pass("Successfully clicked on firstname13");
			Thread.sleep(3000);
	}

	@Then("I provide lastname13")
	public void i_provide_lastname13() throws Exception {
		Thread.sleep(3000);
		ReadTestEle13 rdt=new ReadTestEle13(driver);
		   Thread.sleep(3000);
		   rdt.lastname13.sendKeys("panigrahi");
		   System.out.println("Successfully clicked on lastname13");
			exttest.pass("Successfully clicked on lastname13");
			Thread.sleep(3000);
	}

	@Then("I provide Businessmail13")
	public void i_provide_businessmail13() throws Exception {
		Thread.sleep(3000);
		ReadTestEle13 rdt=new ReadTestEle13(driver);
		   Thread.sleep(3000);
		   rdt.email13.sendKeys("psidhanta@enhops.com");
		   System.out.println("Successfully clicked on email13");
			exttest.pass("Successfully clicked on email13");
			Thread.sleep(3000);
	}

	@Then("I provide company")
	public void i_provide_company() throws Exception {
		Thread.sleep(3000);
		ReadTestEle13 rdt=new ReadTestEle13(driver);
		   Thread.sleep(3000);
		   rdt.company13.sendKeys("enhops");
		   System.out.println("Successfully clicked on company13");
			exttest.pass("Successfully clicked on company13");
			Thread.sleep(3000);
	}

	@Then("i provide phone number")
	public void i_provide_phone_number() throws Exception {
		Thread.sleep(3000);
		ReadTestEle13 rdt=new ReadTestEle13(driver);
		   Thread.sleep(3000);
		   rdt.phone13.sendKeys("9439149446");
		   System.out.println("Successfully clicked on phone13");
			exttest.pass("Successfully clicked on phone13");
			Thread.sleep(3000);
	}

	@Then("I select country")
	public void i_select_country() throws Exception {
		Thread.sleep(3000);
		ReadTestEle13 rdt=new ReadTestEle13(driver);
		   Thread.sleep(3000);
		   Select slct=new Select(rdt.country13);
		   slct.selectByIndex(3);
		   System.out.println("Successfully clicked on country13");
			exttest.pass("Successfully clicked on country13");
			Thread.sleep(3000);
	}

	@Then("i select interest")
	public void i_select_interest() throws Exception {
		Thread.sleep(3000);
		ReadTestEle13 rdt=new ReadTestEle13(driver);
		   Thread.sleep(3000);
		   Select slct=new Select(rdt.interest13);
		   slct.selectByIndex(3);
		   System.out.println("Successfully clicked on interest13");
			exttest.pass("Successfully clicked on interest13");
			Thread.sleep(3000);
	}

	@Then("i provide comment")
	public void i_provide_comment() throws Exception {
		Thread.sleep(3000);
		ReadTestEle13 rdt=new ReadTestEle13(driver);
		   Thread.sleep(3000);
		   rdt.comment13.sendKeys("Successfully clicked fill the form");
		   System.out.println("Successfully fill the form13");
			exttest.pass("Successfully fill the form13");
			Thread.sleep(3000);
	}

	@Then("i select check box")
	public void i_select_check_box() throws Exception {
		Thread.sleep(3000);
		ReadTestEle13 rdt=new ReadTestEle13(driver);
		   Thread.sleep(3000);
		   rdt.checkbox13.click();
		   System.out.println("Successfully clicked check box13");
			exttest.pass("Successfully clicked checkbox13");
			Thread.sleep(3000);
	}

	@And("I click on submit")
	public void i_click_on_submit() throws Exception {
		Thread.sleep(3000);
		ReadTestEle13 rdt=new ReadTestEle13(driver);
		   Thread.sleep(3000);
		   rdt.submit13.click();
		   System.out.println("Successfully clicked submit13");
			exttest.pass("Successfully clicked submit13");
	}

	 
	 @After
		public void close() {
			report.flush();

		}

}

