package com.genpro.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutInfoPage {
	@FindBy(xpath = "//input[@id='first-name']")
	public WebElement firstname;
	
	@FindBy(xpath = "//input[@id='last-name']")
	public WebElement lastname;
	
	@FindBy(xpath = "//input[@id='postal-code']")
	public WebElement postalcode;
	
	@FindBy(xpath = "//input[@id='continue']")
	public WebElement coninue;
	
	
	
	
	public CheckoutInfoPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}

}
