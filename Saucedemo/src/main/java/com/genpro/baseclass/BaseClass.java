package com.genpro.baseclass;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
	public WebDriver driver;
	public void drivers() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/main/resources/drivers/chromedriver.exe");
		driver=new ChromeDriver();
		
	}
	public void geturl(String url) {
		
		driver.get(url);
	}
	public void max(WebElement element) {
		driver.manage().window().maximize();
	}
	public void clickButton(WebElement element) {
		element.click();
	}
	
	public void textbox(WebElement elemnt,String con) {
				elemnt.sendKeys(con);;
	}
	public void textbox1(WebElement elemnt,String input) {
		String inpu = String.valueOf(input);
		elemnt.sendKeys(inpu);
	}
	public void RadioButton(WebElement element) {
		element.click();
		
	}
	public void dropDown(WebElement element, String value) {
	
			Select sc = new Select(element);
			sc.selectByValue(value);
		
	}
	public void checkbox(WebElement element) {
		element.click();
	}
	public void driverclose() {
		driver.close();
	}
	public String getText(WebElement element) {
		String text = element.getText();
		return text;
	}
	public void screenshot(String filename) throws IOException {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File target= new File("C:\\Users\\Ajay\\eclipse-workspace\\Saucedemo\\ErrorScreenshots"+"\\"+filename+".jpeg");
		org.openqa.selenium.io.FileHandler.copy(source, target);
	}
	
	
	
	
	
}
