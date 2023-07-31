package com.webelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReadTestEle3 {
	WebDriver driver ;
	 
	 public ReadTestEle3(WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(id=("user-name"))public WebElement username3;
	 @FindBy(id=("password"))public WebElement password3;
	 @FindBy(xpath=("//input[@type='submit']"))public WebElement login3;
	 
}
