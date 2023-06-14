package com.genpro.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutOverviewPage {
	@FindBy(xpath="//button[@id='finish']")
	public WebElement finishbutton;
	
	
	public CheckoutOverviewPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	
	}

}
