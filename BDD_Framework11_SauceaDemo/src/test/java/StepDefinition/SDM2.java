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
import com.webelements.ReadTestEle1;
import com.webelements.ReadTestEle2;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SDM2 {
	
	public WebDriver driver;
	ExtentHtmlReporter extreport;
	ExtentReports report;
	ExtentTest exttest;
	
	
	@Before
	public void before1() {

	  extreport=new ExtentHtmlReporter(".//TestReports//SDM2.html");
	report=new ExtentReports();
	report.attachReporter(extreport);
	exttest=report.createTest("SauceDemo"," page related report");
	}
	
	@Given("I launch the browser1")
	public void i_launch_the_browser1() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		System.out.println("i launch the browser");
		exttest.fail("Successfully launch the browser");
	}

	@And("I navigated to the URL2")
	public void i_navigated_to_the_url2() throws Exception {
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		System.out.println("i navigated to the website");
		exttest.fail("Successfully navigated to the url");
	}

	@Then("I give Valid username2")
	public void i_give_valid_username2() throws Exception {
		Thread.sleep(3000);
		ReadTestEle2 rdt=new ReadTestEle2(driver);
		Thread.sleep(3000);
		rdt.username2.sendKeys("locked_out_user");
		System.out.println("Successfully clicked on username2");
		exttest.fail("username2 is not supported");
		Thread.sleep(3000);
	}

	@And("I give valid password2")
	public void i_give_valid_password2() throws Exception {
		Thread.sleep(3000);
		ReadTestEle2 rdt=new ReadTestEle2(driver);
		Thread.sleep(3000);
		rdt.password2.sendKeys("secret_sauce");
		System.out.println("Successfully clicked on password2");
		exttest.fail("password2 is not supported");
		Thread.sleep(3000);
	}

	@Then("I click on login button2")
	public void i_click_on_login_button2() throws Exception {
		Thread.sleep(3000);
		ReadTestEle2 rdt=new ReadTestEle2(driver);
		Thread.sleep(3000);
		rdt.login2.click();
		System.out.println("Successfully clicked on login2");
		exttest.fail("login2 is not supported");
		Thread.sleep(3000);
		
	}
	 @After(order = 1)
     public void screenshotS(Scenario scenario) throws Exception {
	 if (scenario.isFailed()) {
	 String screenshot;
     screenshot = scenario.getName().replaceAll(" ", "_");
     File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
     File Dest = new File(
						"C:\\Users\\SidhantaPanigrahi\\eclipse-workspace\\FRAMEWORKS\\BDD_Framework11_SauceaDemo\\Screenshots" + screenshot + ".png");
	 FileUtils.copyFile(src, Dest);
	 exttest.fail("Failed Test" + exttest.addScreenCaptureFromPath(
						"C:\\Users\\SidhantaPanigrahi\\eclipse-workspace\\FRAMEWORKS\\BDD_Framework11_SauceaDemo\\Screenshots" + screenshot + ".png"));
			}
	 }
	 
	 @After
	 public void close() {
	 report.flush();

	}
  }

