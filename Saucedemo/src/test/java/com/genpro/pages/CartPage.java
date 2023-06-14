package com.genpro.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	
	
	
	@FindBy(xpath = "//button[@id='remove-sauce-labs-backpack']")
	public WebElement removebackpack;
	
	@FindBy(xpath = "//button[@id='remove-sauce-labs-bike-light']")
	public WebElement removebike;
	
	@FindBy(xpath = "//button[@id='remove-sauce-labs-bolt-t-shirt']")
	public WebElement removeshirt;
	
	@FindBy(xpath = "//button[@id='remove-sauce-labs-fleece-jacket']")
	public WebElement removejacket;
	
	@FindBy(xpath = "//button[@id='remove-sauce-labs-onesie']")
	public WebElement removeinesie;
	
	@FindBy(xpath = "//button[@id='remove-test.allthethings()-t-shirt-(red)']")
	public WebElement removered;
	
	
	@FindBy(xpath="//div[text()='7.99']")
	public WebElement onesieprice;

	@FindBy(xpath="//div[text()='9.99']")
	public WebElement bikeprice;

	@FindBy(xpath="(//div[text()='15.99'])[1]")
	public WebElement tshirtprice;

	@FindBy(xpath="(//div[text()='15.99'])[2]")
	public WebElement redtprice;

	@FindBy(xpath="//div[text()='29.99']")
	public WebElement backprice;
	

	@FindBy(xpath="//div[text()='49.99']")
	public WebElement jacketprice;

	@FindBy(xpath="//button[@id='checkout']")
	public WebElement check;
	
public CartPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}

}
