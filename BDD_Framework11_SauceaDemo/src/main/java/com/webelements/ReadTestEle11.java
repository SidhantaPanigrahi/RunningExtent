package com.webelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReadTestEle11 {
	WebDriver driver ;
	 
	 public ReadTestEle11(WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(id=("user-name"))public WebElement username11;
	 @FindBy(id=("password"))public WebElement password11;
	 @FindBy(xpath=("//input[@type='submit']"))public WebElement login11;
	 @FindBy(id=("react-burger-menu-btn"))public WebElement dot11;
	 @FindBy(id=("about_sidebar_link"))public WebElement about11;
}
