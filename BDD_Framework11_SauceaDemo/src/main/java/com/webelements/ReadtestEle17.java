package com.webelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReadtestEle17 {
	WebDriver driver ;
	public ReadtestEle17(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	 }
	 @FindBy(id=("user-name"))public WebElement username17;
	 @FindBy(id=("password"))public WebElement password17;
	 @FindBy(id=("login-button"))public WebElement login17;
	 @FindBy(xpath=("//*[@id=\"menu_button_container\"]/div/div[1]/div"))public WebElement dot17;
	 @FindBy(id=("about_sidebar_link"))public WebElement about17;
	 @FindBy(xpath=("//span[text()='Resources']"))public WebElement resource17;
	 @FindBy(xpath=("//span[text()='Events']"))public WebElement event17; 

}
