package com.webelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReadTestEle9 {
	WebDriver driver ;
	 
	 public ReadTestEle9(WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(id=("user-name"))public WebElement username9;
	 @FindBy(id=("password"))public WebElement password9;
	 @FindBy(xpath=("//input[@type='submit']"))public WebElement login9;
	 @FindBy(id=("add-to-cart-sauce-labs-backpack"))public WebElement addtocart9;
	 @FindBy(xpath=("//*[@id=\"shopping_cart_container\"]/a"))public WebElement cartimage9;
	 @FindBy(id=("checkout"))public WebElement checkout9;
	 @FindBy(id=("first-name"))public WebElement firstname9;
	 @FindBy(id=("last-name"))public WebElement lastname9;
	 @FindBy(id=("postal-code"))public WebElement postalcode9;
	 @FindBy(id=("continue"))public WebElement continu9;
	 @FindBy(id=("finish"))public WebElement finish9;
}
