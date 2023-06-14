package com.genpro.execute;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.genpro.baseclass.BaseClass;
import com.genpro.pages.CartPage;
import com.genpro.pages.CheckoutCompletPage;
import com.genpro.pages.CheckoutInfoPage;
import com.genpro.pages.CheckoutOverviewPage;
import com.genpro.pages.LoginPage;
import com.genpro.pages.ProductlistingPage;

public class Execute extends BaseClass {
	@BeforeMethod
	public void before() {
		
		drivers();
		geturl("https://www.saucedemo.com/");
		
	}
	
	@Test
	public void testcase1() throws InterruptedException {
		LoginPage lp=new LoginPage(driver);
		ProductlistingPage plp=new ProductlistingPage(driver);
		CheckoutInfoPage cip=new CheckoutInfoPage(driver);
		CheckoutOverviewPage cop=new CheckoutOverviewPage(driver);
		CheckoutCompletPage ccp=new CheckoutCompletPage(driver);
		CartPage cp=new CartPage(driver);
		textbox(lp.username,"standard_user");
		textbox(lp.password,"secret_sauce");
		clickButton(lp.logbutton);
		driver.manage().window().maximize();
		dropDown(plp.pricefilter,"lohi");
		clickButton(plp.onesie);
		clickButton(plp.bike);
		clickButton(plp.red);
		clickButton(plp.jacket);
		clickButton(plp.backpack);
		clickButton(plp.Tshirt);
		clickButton(plp.cart);

			Thread.sleep(2000);
			clickButton(cp.removeinesie);
			Thread.sleep(2000);
			clickButton(cp.removebike);
		
			clickButton(cp.check);
			textbox(cip.firstname,"Ajay");
			textbox(cip.lastname,"S");
			textbox1(cip.postalcode,"629169");
			clickButton(cip.coninue);
			clickButton(cop.finishbutton);
			
			clickButton(ccp.backbutton);
			clickButton(lp.openmenu);
			clickButton(lp.logout);
			
		
	}
	
	
	@Test
	public void testcase2() throws IOException, InterruptedException{
		LoginPage lp=new LoginPage(driver);
		ProductlistingPage plp=new ProductlistingPage(driver);
		CheckoutInfoPage cip=new CheckoutInfoPage(driver);
		CheckoutOverviewPage cop=new CheckoutOverviewPage(driver);
		CheckoutCompletPage ccp=new CheckoutCompletPage(driver);
		CartPage cp=new CartPage(driver);
		driver.manage().window().maximize();
		textbox(lp.username,"locked_out_user");
		textbox(lp.password,"secret_sauce");
		clickButton(lp.logbutton);
		screenshot("loginError");
		driver.manage().window().maximize();
		dropDown(plp.pricefilter,"lohi");
		clickButton(plp.onesie);
		clickButton(plp.bike);
		clickButton(plp.red);
		clickButton(plp.jacket);
		clickButton(plp.backpack);
		clickButton(plp.Tshirt);
		clickButton(plp.cart);
		Thread.sleep(2000);
		clickButton(cp.removeinesie);
		Thread.sleep(2000);
		clickButton(cp.removebike);
	
		clickButton(cp.check);
		textbox(cip.firstname,"Ajay");
		textbox(cip.lastname,"S");
		textbox1(cip.postalcode,"629169");
		clickButton(cip.coninue);
		clickButton(cop.finishbutton);
		
		clickButton(ccp.backbutton);
		clickButton(lp.openmenu);
		clickButton(lp.logout);
		
	
		
		
	}
	
	@Test
	public void testcase3()throws IOException, InterruptedException {
		LoginPage lp=new LoginPage(driver);
		ProductlistingPage plp=new ProductlistingPage(driver);
		CheckoutInfoPage cip=new CheckoutInfoPage(driver);
		CheckoutOverviewPage cop=new CheckoutOverviewPage(driver);
		CheckoutCompletPage ccp=new CheckoutCompletPage(driver);
		CartPage cp=new CartPage(driver);
		driver.manage().window().maximize();
		textbox(lp.username,"problem_user");
		textbox(lp.password,"secret_sauce");
		clickButton(lp.logbutton);
		driver.manage().window().maximize();
		dropDown(plp.pricefilter,"lohi");
		screenshot("FilterError");
		clickButton(plp.onesie);
		clickButton(plp.bike);
		clickButton(plp.red);
		clickButton(plp.jacket);
		clickButton(plp.backpack);
		clickButton(plp.Tshirt);
		screenshot("AddcartError");
		clickButton(plp.cart);
		screenshot("removeitemsError");
		Thread.sleep(2000);
		clickButton(cp.removeinesie);
		Thread.sleep(2000);
		clickButton(cp.removebike);
		clickButton(cp.check);
		textbox(cip.firstname,"Ronaldo");
		textbox(cip.lastname,"S");
		screenshot("lastnameError");
		textbox1(cip.postalcode,"629169");
		screenshot("fulldetailsError");
		clickButton(cip.coninue);
		screenshot("DetailsError");
		clickButton(cop.finishbutton);
		clickButton(ccp.backbutton);
		clickButton(lp.openmenu);
		clickButton(lp.logout);
		
	
	
	
	
	}
	
	
	@Test
	public void testcase4() throws IOException, InterruptedException{
		LoginPage lp=new LoginPage(driver);
		ProductlistingPage plp=new ProductlistingPage(driver);
		CheckoutInfoPage cip=new CheckoutInfoPage(driver);
		CheckoutOverviewPage cop=new CheckoutOverviewPage(driver);
		CheckoutCompletPage ccp=new CheckoutCompletPage(driver);
		CartPage cp=new CartPage(driver);
		driver.manage().window().maximize();
		textbox(lp.username,"performance_glitch_user");
		textbox(lp.password,"secret_sauce");
		clickButton(lp.logbutton);
		driver.manage().window().maximize();
		dropDown(plp.pricefilter,"lohi");
		clickButton(plp.onesie);
		clickButton(plp.bike);
		clickButton(plp.red);
		clickButton(plp.jacket);
		clickButton(plp.backpack);
		clickButton(plp.Tshirt);
		clickButton(plp.cart);
		Thread.sleep(2000);
		clickButton(cp.removeinesie);
		Thread.sleep(2000);
		clickButton(cp.removebike);
	
		clickButton(cp.check);
		textbox(cip.firstname,"Messi");
		textbox(cip.lastname,"S");
		textbox1(cip.postalcode,"629169");
		clickButton(cip.coninue);
		clickButton(cop.finishbutton);
		
		clickButton(ccp.backbutton);
		clickButton(lp.openmenu);
		clickButton(lp.logout);
		
	
	
	
	
	}
	@AfterMethod
	public void after() {
		driverclose();
		
	}
	
	
	
	

}
