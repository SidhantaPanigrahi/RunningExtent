package com.webelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReadTestEle18 {
	WebDriver driver ;
	 
	 public ReadTestEle18(WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(id=("user-name"))public WebElement username18;
	 @FindBy(id=("password"))public WebElement password18;
	 @FindBy(xpath=("//input[@type='submit']"))public WebElement login18;
	 @FindBy(xpath=("//*[@id=\"menu_button_container\"]/div/div[1]/div"))public WebElement dot18;
	 @FindBy(xpath=("//a[text()='Logout']"))public WebElement Logout18;
}
