package com.webelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReadTestEle14 {
	WebDriver driver ;
	 
	public ReadTestEle14(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	 }
	 @FindBy(id=("user-name"))public WebElement username14;
	 @FindBy(id=("password"))public WebElement password14;
	 @FindBy(id=("login-button"))public WebElement login14;
	 @FindBy(xpath=("//*[@id=\"menu_button_container\"]/div/div[1]/div"))public WebElement dot14;
	 @FindBy(id=("about_sidebar_link"))public WebElement about14;
	 @FindBy(xpath=("//span[text()='Solutions']"))public WebElement solution14;
	 @FindBy(xpath=("//span[text()='CI/CD tools']"))public WebElement tool14;
	 
}
