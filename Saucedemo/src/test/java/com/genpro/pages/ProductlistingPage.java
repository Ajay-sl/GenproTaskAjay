package com.genpro.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductlistingPage {

	@FindBy(xpath ="//select[@class='product_sort_container']")
	public WebElement pricefilter;
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-onesie']")
	public WebElement onesie;
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bike-light']")
	public WebElement bike;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")
	public WebElement Tshirt;
	@FindBy(xpath="//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")
	public WebElement red;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	public WebElement backpack;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-fleece-jacket']")
	public WebElement jacket;
	@FindBy(xpath = "//div[@id='shopping_cart_container']")
	public WebElement cart;
	
	
public ProductlistingPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}

}
