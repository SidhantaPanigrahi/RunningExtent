package com.webelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReadTestEle10 {
	WebDriver driver ;
	 
	 public ReadTestEle10(WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(id=("user-name"))public WebElement username10;
	 @FindBy(id=("password"))public WebElement password10;
	 @FindBy(xpath=("//input[@type='submit']"))public WebElement login10;
	 @FindBy(xpath=("//*[@id=\"header_container\"]/div[2]/div/span/select"))public WebElement price10;
}
