package com.webelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReadTestEle12 {
	WebDriver driver ;
	 
	 public ReadTestEle12(WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 @FindBy(id=("user-name"))public WebElement username12;
	 @FindBy(id=("password"))public WebElement password12;
	 @FindBy(id=("login-button"))public WebElement login12;
	 @FindBy(xpath=("//*[@id=\"menu_button_container\"]/div/div[1]/div"))public WebElement dot12;
	 @FindBy(id=("about_sidebar_link"))public WebElement about12;
	 @FindBy(xpath=("//span[text()='Pricing']"))public WebElement pricing12;
	 
}
