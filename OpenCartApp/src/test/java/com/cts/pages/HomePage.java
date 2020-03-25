package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HomePage {

	private By myAccLocator = (By.xpath("//a[@title='My Account']"));
	private By RegisterLocator = (By.xpath("//a[text()='Register']"));
	private By LoginLocator = (By.xpath("//a[text()='Login']"));

	private WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//my account click
	public void clickOnMyAccount() 
	{
		driver.findElement(myAccLocator).click();
	}

	//click on register
	public void clickOnRegister() 
	{
		driver.findElement(RegisterLocator).click();

	}
	
	//print title after successful registration
	public String getRegisterTitle()
	{
		String actualTitle=driver.findElement(By.xpath("//h1[text()='Your Account Has Been Created!']")).getText();
		return actualTitle;
	}
	
	//print error message if the registered user again register
	public String getInvalidRegisterTitle()
	{
		String actualTitle=driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText();
		return actualTitle;
	}

	//login click
	public void clickOnLogin() 
	{
		driver.findElement(LoginLocator).click();

	}
	
	//click on software
	public void clickOnSoftware()
	{
		driver.findElement(By.linkText("Software")).click();
	}
	
	//print the title that appears after clicking on software
	public String getSoftwareTitle()
	{
		String actualTitle=driver.findElement(By.xpath("//p[text()='There are no products to list in this category.']")).getText();
		return actualTitle;
	}
	
	//click on mp3 players
	public void clickOnMP3Players()
	{
		driver.findElement(By.linkText("MP3 Players")).click();
	}
	
	//click on all mp3 players
	public  void clickOnAllMP3()
	{
		Actions actions =new Actions(driver);
	     actions.moveToElement(driver.findElement(By.linkText("Show All MP3 Players"))).pause(1000).doubleClick().build().perform();
	}
	
	//print the title that appears after clicking on all mp3 players
	public String getAllMP3Title()
	{
		String actualTitle=driver.findElement(By.xpath("//h2[text()='MP3 Players']")).getText();
		return actualTitle;
	}
	
	//click on ipod wishlist
	public void clickOnipodTouchWishList()
	{
		driver.findElement(By.xpath("(//button[@type='button'])[19]"));
	}
	
	//click on laptop wishlist
	public void clickOnlaptopWishList()
	{
		driver.findElement(By.xpath("(//button[@type='button'])[21]")).click();
	}
	
	
	//checking the wishlist
	public void CheckInWishList()
	{
		driver.findElement(By.xpath("(//span[@class='hidden-xs hidden-sm hidden-md'])[4]")).click();
	}
	
	//printing the Wishlist title
	public String getWishListTitle()
	{
		String actualTitle=driver.findElement(By.xpath("//h2[text()='My Wish List']")).getText();
		return actualTitle;
	}
	}
		
	
	
	
	
	
	
	
	
	
	
	

