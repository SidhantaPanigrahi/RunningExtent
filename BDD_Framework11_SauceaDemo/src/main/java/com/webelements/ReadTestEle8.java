package com.webelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReadTestEle8 {
	WebDriver driver ;
	 
	 public ReadTestEle8(WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(id=("user-name"))public WebElement username8;
	 @FindBy(id=("password"))public WebElement password8;
	 @FindBy(xpath=("//input[@type='submit']"))public WebElement login8;
	 @FindBy(id=("add-to-cart-sauce-labs-backpack"))public WebElement addtocart8;
	 @FindBy(xpath=("//*[@id=\"shopping_cart_container\"]/a"))public WebElement cartimage8;
	 @FindBy(id=("continue-shopping"))public WebElement continueshopping8;
}
