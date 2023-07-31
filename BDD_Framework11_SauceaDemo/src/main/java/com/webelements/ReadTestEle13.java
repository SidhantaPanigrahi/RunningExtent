package com.webelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReadTestEle13 {
	WebDriver driver ;
	 
	public ReadTestEle13(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	 }
	 @FindBy(id=("user-name"))public WebElement username13;
	 @FindBy(id=("password"))public WebElement password13;
	 @FindBy(id=("login-button"))public WebElement login13;
	 @FindBy(xpath=("//*[@id=\"menu_button_container\"]/div/div[1]/div"))public WebElement dot13;
	 @FindBy(id=("about_sidebar_link"))public WebElement about13;
	 @FindBy(xpath=("//*[@id=\"__next\"]/header/div/div/div[2]/div/div[2]/a/button"))public WebElement request13;
	 @FindBy(id=("FirstName"))public WebElement firstname13;
	 @FindBy(id=("LastName"))public WebElement lastname13;
	 @FindBy(id=("Email"))public WebElement email13;
	 @FindBy(id=("Company"))public WebElement company13;
	 @FindBy(id=("Phone"))public WebElement phone13;
	 @FindBy(id=("Country"))public WebElement country13;
	 @FindBy(id=("Solution_Interest__c"))public WebElement interest13;
	 @FindBy(id=("Sales_Contact_Comments__c"))public WebElement comment13;
	 @FindBy(id=("LblmktoCheckbox_37563_0"))public WebElement checkbox13;
	 @FindBy(xpath=("//button[text()='Submit']"))public WebElement submit13;
}
