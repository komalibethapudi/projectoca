package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashBoardPage {
	
	private By logoutLocator=By.linkText("Logout");
	
	private WebDriver driver;
	
	public DashBoardPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//logout click
	public void clickOnLogout()
	{
		driver.findElement(logoutLocator).click();
	}
}
