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
import com.webelements.ReadTestEle4;
import com.webelements.ReadTestEle5;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SDM5 {
	
	public WebDriver driver;
	ExtentHtmlReporter extreport;
	ExtentReports report;
	ExtentTest exttest;
	
	
	@Before
	public void before1() {

	  extreport=new ExtentHtmlReporter(".//TestReports//SDM5.html");
	report=new ExtentReports();
	report.attachReporter(extreport);
	exttest=report.createTest("SauceDemo"," page related report");
	}
	
	@Given("I launch the browser5")
	public void i_launch_the_browser5() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		System.out.println("i launch the browser");
		exttest.pass("Successfully launch the browser"); 
	}

	@And("I navigated to the URL5")
	public void i_navigated_to_the_url5() throws Exception {
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		System.out.println("i navigated to the website");
		exttest.pass("Successfully navigated to the url");
	}

	@Then("I give Valid username5")
	public void i_give_valid_username5() throws Exception {
		Thread.sleep(3000);
		ReadTestEle5 rdt=new ReadTestEle5(driver);
		Thread.sleep(3000);
		rdt.username5.sendKeys("sidhanta");
		System.out.println("Successfully clicked on username5");
		exttest.fail("username5 is not supported");
		Thread.sleep(3000);
	}

	@Then("I give valid password5")
	public void i_give_valid_password5() throws Exception {
		Thread.sleep(3000);
		ReadTestEle5 rdt=new ReadTestEle5(driver);
		Thread.sleep(3000);
		rdt.password5.sendKeys("panigrahi");
		System.out.println("Successfully clicked on password5");
		exttest.fail("password5 is not supported");
		Thread.sleep(3000);
	}

	@Then("I click on login button5")
	public void i_click_on_login_button5() throws Exception {
		Thread.sleep(3000);
		ReadTestEle5 rdt=new ReadTestEle5(driver);
		Thread.sleep(3000);
		rdt.login5.click();
		System.out.println("Successfully clicked on login5");
		exttest.fail("login5 is not supported");
	}
	
	
	  @After(order = 1) public void screenshotS(Scenario scenario) throws Exception
	  { if (scenario.isFailed()) { String screenshot; screenshot =
	  scenario.getName().replaceAll(" ", "_"); File src = ((TakesScreenshot)
	  driver).getScreenshotAs(OutputType.FILE); File Dest = new File(
	  "C:\\Users\\SidhantaPanigrahi\\eclipse-workspace\\FRAMEWORKS\\BDD_Framework11_SauceaDemo\\Screenshots"
	  + screenshot + ".png"); FileUtils.copyFile(src, Dest);
	  exttest.fail("Failed Test" + exttest.addScreenCaptureFromPath(
	  "C:\\Users\\SidhantaPanigrahi\\eclipse-workspace\\FRAMEWORKS\\BDD_Framework11_SauceaDemo\\Screenshots"
	  + screenshot + ".png")); } }
	 
	
	@After
	 public void close() {
	 report.flush();

	}
}
