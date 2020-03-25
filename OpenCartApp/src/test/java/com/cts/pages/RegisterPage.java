package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage {

	private By firstnameLocator = By.id("input-firstname");
	private By LastNameLocator = By.id("input-lastname");
	private By emailLocator = By.id("input-email");
	private By telephoneLocator = By.id("input-telephone");
	private By addressLocator = By.id("input-address-1");
	private By cityLocator = By.id("input-city");
	private By postcodeLocator = By.id("input-postcode");
	private By countryLocator = By.id("input-country");
	private By countryLoc = By.id("input-country");
	private By RegionLocator = By.id("input-zone");
	private By regionLoc = By.id("input-zone");
	private By passwordLocator = By.id("input-password");
	private By confirmpasswordLocator = By.id("input-confirm");
	private By checkLocator = By.xpath("//input[@name='agree']");
	private By ContinueLocator = By.xpath("//input[@value='Continue']");

	
	private WebDriver driver;
	
	public RegisterPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//enter firstname
	public void enterfirstname(String firstname) {
		driver.findElement(firstnameLocator).sendKeys(firstname);
	}

	//enter lastname
	public void enterlastname(String lastname) {
		driver.findElement(LastNameLocator).sendKeys(lastname);
	}

	//enter email
	public void enteremail(String email) {
		driver.findElement(emailLocator).sendKeys(email);
	}

	//enter telephone number
	public void entertelephone(String telephone) {
		driver.findElement(telephoneLocator).sendKeys(telephone);
	}

	//enter address
	public void enteraddress(String address) {
		driver.findElement(addressLocator).sendKeys(address);
	}

	//enter city name
	public void entercity(String city) {
		driver.findElement(cityLocator).sendKeys(city);
	}

	//enter postcode
	public void postcode(String postcode) {
		driver.findElement(postcodeLocator).sendKeys(postcode);
	}

	
	public void explicitWait()
	{
		WebElement country = driver.findElement(countryLoc);
		WebDriverWait wait=new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(countryLoc));
		
	}
	
	//enter country name
	public void country(String countryname) {
		WebElement country = driver.findElement(countryLocator);
		Select selectCountry = new Select(country);
		selectCountry.selectByVisibleText(countryname);
	}

	public void explicitWaiting()
	{
		WebElement country = driver.findElement(regionLoc);
		WebDriverWait wait=new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(regionLoc));	
	}
	
	//enter region
	public void Region(String RegionName) {
		WebElement region = driver.findElement(RegionLocator);
		Select selectRegion = new Select(region);
		selectRegion.selectByVisibleText(RegionName);
	}

	//enter password
	public void password(String password) {
		driver.findElement(passwordLocator).sendKeys(password);
	}

	//confirm password
	public void confirmpassword(String cnfrmpwd) {
		driver.findElement(confirmpasswordLocator).sendKeys(cnfrmpwd);
	}

	//click on checkbox
	public void checkbox() {
		WebElement checkEle = driver.findElement(checkLocator);
		if (!(checkEle.isSelected()))
			checkEle.click();
	}

	//click on continue
	public void Continue() {
		driver.findElement(ContinueLocator).click();
	}
}
