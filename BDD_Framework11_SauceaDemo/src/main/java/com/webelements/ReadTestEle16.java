package com.webelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReadTestEle16 {
	WebDriver driver ;
	public ReadTestEle16(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	 }
	 @FindBy(id=("user-name"))public WebElement username16;
	 @FindBy(id=("password"))public WebElement password16;
	 @FindBy(id=("login-button"))public WebElement login16;
	 @FindBy(xpath=("//*[@id=\"menu_button_container\"]/div/div[1]/div"))public WebElement dot16;
	 @FindBy(id=("about_sidebar_link"))public WebElement about16;
	 @FindBy(xpath=("//span[text()='Resources']"))public WebElement resource16;
	 @FindBy(xpath=("//span[text()='Documentation']"))public WebElement document16;
}
