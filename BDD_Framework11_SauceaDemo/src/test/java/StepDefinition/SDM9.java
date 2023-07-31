package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.webelements.ReadTestEle8;
import com.webelements.ReadTestEle9;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SDM9 {
	
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
	
	@Given("I launch the browser9")
	public void i_launch_the_browser9() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		System.out.println("i launch the browser");
		exttest.pass("Successfully launch the browser"); 
	}

	@And("I navigated to the URL9")
	public void i_navigated_to_the_url9() throws Exception {
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		System.out.println("i navigated to the website");
		exttest.pass("Successfully navigated to the url");
	}

	@Then("I give Valid username9")
	public void i_give_valid_username9() throws InterruptedException {
		Thread.sleep(3000);
		ReadTestEle9 rdt=new ReadTestEle9(driver);
		Thread.sleep(3000);
		rdt.username9.sendKeys("standard_user");
		System.out.println("Successfully clicked on username9");
		exttest.pass("Successfully clicked on username9");
		Thread.sleep(3000);
	}

	@And("I give valid password9")
	public void i_give_valid_password9() throws Exception {
		Thread.sleep(3000);
		ReadTestEle9 rdt=new ReadTestEle9(driver);
		Thread.sleep(3000);
		rdt.password9.sendKeys("secret_sauce");
		System.out.println("Successfully clicked on password9");
		exttest.pass("Successfully clicked on password9");
		Thread.sleep(3000);
	}

	@Then("I click on login button9")
	public void i_click_on_login_button9() throws Exception {
		Thread.sleep(3000);
		ReadTestEle9 rdt=new ReadTestEle9(driver);
		Thread.sleep(3000);
		rdt.login9.click();
		System.out.println("Successfully clicked on login9");
		exttest.pass("Successfully clicked on login9");
		Thread.sleep(3000);
	}

	@Then("I click on add to cart button9")
	public void i_click_on_add_to_cart_button9() throws Exception {
		Thread.sleep(3000);
		ReadTestEle9 rdt=new ReadTestEle9(driver);
		Thread.sleep(3000);
		rdt.addtocart9.click();
		System.out.println("Successfully clicked on addtocart9");
		exttest.pass("Successfully clicked on addtocart9");
		Thread.sleep(3000);
	}

	@And("I click on cartimage9")
	public void i_click_on_cartimage9() throws Exception {
		Thread.sleep(3000);
		ReadTestEle9 rdt=new ReadTestEle9(driver);
		Thread.sleep(3000);
		rdt.cartimage9.click();
		System.out.println("Successfully clicked on cartimage9");
		exttest.pass("Successfully clicked on addtocart9");
		Thread.sleep(3000);
	}

	@Then("I click on checkout button9")
	public void i_click_on_checkout_button9() throws Exception {
		Thread.sleep(3000);
		ReadTestEle9 rdt=new ReadTestEle9(driver);
		Thread.sleep(3000);
		rdt.checkout9.click();
		System.out.println("Successfully clicked on checkout9");
	    exttest.pass("Successfully clicked on checkout9");
		Thread.sleep(3000);
	}

	@And("I provide first name9")
	public void i_provide_first_name9() throws Exception {
		Thread.sleep(3000);
		ReadTestEle9 rdt=new ReadTestEle9(driver);
		Thread.sleep(3000);
		rdt.firstname9.sendKeys("sidhanta");
		System.out.println("Successfully clicked on firstname9");
		exttest.pass("Successfully clicked on firstname9");
		Thread.sleep(3000);
	}

	@Then("I provide last name9")
	public void i_provide_last_name9() throws Exception {
		Thread.sleep(3000);
		ReadTestEle9 rdt=new ReadTestEle9(driver);
		Thread.sleep(3000);
		rdt.lastname9.sendKeys("panigrahi");
		System.out.println("Successfully clicked on lastname9");
		exttest.pass("Successfully clicked lastname9");
		Thread.sleep(3000);
	}

	@And("I provide postalcode9")
	public void i_provide_postalcode9() throws Exception {
		Thread.sleep(3000);
		ReadTestEle9 rdt=new ReadTestEle9(driver);
		Thread.sleep(3000);
		rdt.postalcode9.sendKeys("760010");
		System.out.println("Successfully clicked on postalcode9");
		exttest.pass("Successfully clicked postalcode9");
		Thread.sleep(3000);
	}

	@Then("I click on continue9")
	public void i_click_on_continue9() throws Exception {
		Thread.sleep(3000);
		ReadTestEle9 rdt=new ReadTestEle9(driver);
		Thread.sleep(3000);
		rdt.continu9.click();
		System.out.println("Successfully clicked on continue9");
		exttest.pass("Successfully clicked continue9");
		Thread.sleep(3000);
	}

	@And("I click on finish9")
	public void i_click_on_finish9() throws Exception {
		Thread.sleep(3000);
		ReadTestEle9 rdt=new ReadTestEle9(driver);
		Thread.sleep(3000);
		rdt.finish9.click();
		System.out.println("Successfully clicked on finish9");
		exttest.pass("Successfully clicked finish9");
		Thread.sleep(3000);
	}
	 @After
	 public void close() {
	 report.flush();

	}
}



