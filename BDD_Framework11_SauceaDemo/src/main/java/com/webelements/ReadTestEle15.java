package com.webelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReadTestEle15 {
	WebDriver driver ;
	 
	public ReadTestEle15(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	 }
	 @FindBy(id=("user-name"))public WebElement username15;
	 @FindBy(id=("password"))public WebElement password15;
	 @FindBy(id=("login-button"))public WebElement login15;
	 @FindBy(xpath=("//*[@id=\"menu_button_container\"]/div/div[1]/div"))public WebElement dot15;
	 @FindBy(id=("about_sidebar_link"))public WebElement about15;
	 @FindBy(xpath=("//span[text()='Solutions']"))public WebElement solution15;
	 @FindBy(xpath=("//*[@id=\"__next\"]/header/div/div/div[1]/div[2]/div/div[2]/div[2]/div/div/div[1]/div[1]/div[2]/div[2]/div[2]/a/div"))public WebElement visual5;
	 
	 
}
