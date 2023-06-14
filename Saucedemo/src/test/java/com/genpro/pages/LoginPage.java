package com.genpro.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
	@FindBy(xpath = "//input[@id='user-name']")
	public WebElement username;

	@FindBy(xpath = "//input[@id='password']")
	public WebElement password;
	
	@FindBy(xpath = "//input[@id='login-button']")
	public WebElement logbutton;
	
	@FindBy(xpath = "//button[text()='Open Menu']")
	public WebElement openmenu;
	
	@FindBy(xpath = "//a[@id='logout_sidebar_link']")
	public WebElement logout;
	
	
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	
}
