package com.webelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReadTestEle7 {
	WebDriver driver ;
	 
	 public ReadTestEle7(WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(id=("user-name"))public WebElement username7;
	 @FindBy(id=("password"))public WebElement password7;
	 @FindBy(xpath=("//input[@type='submit']"))public WebElement login7;
	 @FindBy(id=("add-to-cart-sauce-labs-backpack"))public WebElement addtocart7;
	 @FindBy(xpath=("//*[@id=\"shopping_cart_container\"]/a"))public WebElement cartimage7;
	 @FindBy(id=("remove-sauce-labs-backpack"))public WebElement remove7;
}
