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
import com.webelements.ReadTestEle6;
import com.webelements.ReadTestEle7;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SDM7 {
	
	public WebDriver driver;
	ExtentHtmlReporter extreport;
	ExtentReports report;
	ExtentTest exttest;
	
	@Before
	public void before1() {

	  extreport=new ExtentHtmlReporter(".//TestReports//SDM7.html");
	report=new ExtentReports();
	report.attachReporter(extreport);
	exttest=report.createTest("SauceDemo"," page related report");
	}

@Given("I launch the browser7")
public void i_launch_the_browser7() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	System.out.println("i launch the browser");
	exttest.pass("Successfully launch the browser"); 
}

@And("I navigated to the URL7")
public void i_navigated_to_the_url7() throws Exception {
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	System.out.println("i navigated to the website");
	exttest.pass("Successfully navigated to the url");
}

@Then("I give Valid username7")
public void i_give_valid_username7() throws InterruptedException {
	Thread.sleep(3000);
	ReadTestEle7 rdt=new ReadTestEle7(driver);
	Thread.sleep(3000);
	rdt.username7.sendKeys("standard_user");
	System.out.println("Successfully clicked on username7");
	exttest.pass("Successfully clicked on username7");
	Thread.sleep(3000);
}

@And("I give valid password7")
public void i_give_valid_password7() throws Exception {
	Thread.sleep(3000);
	ReadTestEle7 rdt=new ReadTestEle7(driver);
	Thread.sleep(3000);
	rdt.password7.sendKeys("secret_sauce");
	System.out.println("Successfully clicked on password7");
	exttest.pass("Successfully clicked on password7");
	Thread.sleep(3000);
}

@Then("I click on login button7")
public void i_click_on_login_button7() throws Exception {
	Thread.sleep(3000);
	ReadTestEle7 rdt=new ReadTestEle7(driver);
	Thread.sleep(3000);
	rdt.login7.click();
	System.out.println("Successfully clicked on login7");
	exttest.pass("Successfully clicked on login7");
	Thread.sleep(3000);
}

@Then("I click on add to cart button7")
public void i_click_on_add_to_cart_button7() throws Exception {
	Thread.sleep(3000);
	ReadTestEle7 rdt=new ReadTestEle7(driver);
	Thread.sleep(3000);
	rdt.addtocart7.click();
	System.out.println("Successfully clicked on add to cart button");
	exttest.pass("Successfully clicked on add to cart button");
	Thread.sleep(3000);
}

@And("I click on cartimage7")
public void i_click_on_cartimage7() throws Exception {
	Thread.sleep(3000);
    ReadTestEle7 rdt=new ReadTestEle7(driver);
    Thread.sleep(3000);
    rdt.cartimage7.click();
    System.out.println("Successfully clicked on cartimage");
	exttest.pass("Successfully clicked on cartimage");
	Thread.sleep(3000);
    
}

@Then("I click on remove button7")
public void i_click_on_remove_button7() throws Exception {
	Thread.sleep(3000);
	ReadTestEle7 rdt=new ReadTestEle7(driver);
    Thread.sleep(3000);
    rdt.remove7.click();
    System.out.println("Successfully clicked on remove button");
   	exttest.pass("Successfully clicked on remove button");
       
}


 

 @After
 public void close() {
 report.flush();

}


}
