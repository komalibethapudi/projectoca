package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private By emailLocator=By.id("input-email");
	private By passwordLocator=By.id("input-password");
	private By LoginLocator=By.xpath("//input[@value='Login']");

private WebDriver driver;

public LoginPage(WebDriver driver)
{
	this.driver=driver;
}

//enter email and go to password
	public void enteremail(String email)
	{
	driver.findElement(emailLocator).sendKeys(email);
	}

	//enter password
	public void enterpassword(String password)
	{
	driver.findElement(passwordLocator).sendKeys(password);
	}

	//click on login
	public void clickOnLogin()
	{
	driver.findElement(LoginLocator).click();
	}
	}

