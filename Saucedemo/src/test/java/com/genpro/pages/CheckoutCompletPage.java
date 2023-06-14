package com.genpro.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutCompletPage {
	
	
	
	@FindBy(xpath="//button[@id='back-to-products']")
	public WebElement backbutton;
	
	
	public CheckoutCompletPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	
	}

	

}
