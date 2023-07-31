package com.webelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReadTestEle5 {
	WebDriver driver ;
	 
	 public ReadTestEle5(WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(id=("user-name"))public WebElement username5;
	 @FindBy(id=("password"))public WebElement password5;
	 @FindBy(xpath=("//input[@type='submit']"))public WebElement login5;
}


