package com.cts.stepdefintion;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.cts.pages.DashBoardPage;
import com.cts.pages.HomePage;
import com.cts.pages.LoginPage;
import com.cts.pages.RegisterPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {

	WebDriver driver;

	//launching web browser
	@Given("I have browser with opencartpage")
	public void i_have_browser_with_opencartpage() {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");

		ChromeOptions chrome = new ChromeOptions();
		chrome.setAcceptInsecureCerts(true);
		driver = new ChromeDriver(chrome);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://opencart.abstracta.us/");

	}

	@When("I enter {string} and {string} and {string} and {string} and enter {string} and {string} and {string} and {string} and {string} and enter {string} and {string}")
	public void i_enter_and_and_and_and_enter_and_and_and_and_and_enter_and(String firstname, String lastname,
			String email, String telephone, String address, String city, String postcode, String countryname,
			String Regionname, String password, String cnfrmpwd) {

		HomePage homepage = new HomePage(driver);

		//click on my account
		homepage.clickOnMyAccount();

		//click on register
		homepage.clickOnRegister();

		RegisterPage registerpage = new RegisterPage(driver);
		
		//enter mandatory details
		registerpage.enterfirstname(firstname);

		registerpage.enterlastname(lastname);

		registerpage.enteremail(email);

		registerpage.entertelephone(telephone);

		registerpage.enteraddress(address);

		registerpage.entercity(city);

		registerpage.postcode(postcode);

		registerpage.country(countryname);

		registerpage.explicitWaiting();

		registerpage.Region(Regionname);

		registerpage.password(password);

		registerpage.confirmpassword(cnfrmpwd);

		registerpage.checkbox();

		registerpage.Continue();

	}

	@Then("my account has created")
	public void my_account_has_created() {

		HomePage homepage = new HomePage(driver);
		String actualTitle = homepage.getRegisterTitle();
		Assert.assertEquals("Your Account Has Been Created!", actualTitle);
		System.out.println(actualTitle);
		driver.quit();
	}

	@When("user enter {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string}")
	public void user_enter_and_and_and_and_and_and_and_and_and_and(String firstname, String lastname, String email,
			String telephone, String address, String city, String postcode, String countryname, String Regionname,
			String password, String cnfrmpwd) {

		HomePage homepage = new HomePage(driver);

		homepage.clickOnMyAccount();

		homepage.clickOnRegister();

RegisterPage registerpage = new RegisterPage(driver);
		
		registerpage.enterfirstname(firstname);

		registerpage.enterlastname(lastname);

		registerpage.enteremail(email);

		registerpage.entertelephone(telephone);

		registerpage.enteraddress(address);

		registerpage.entercity(city);

		registerpage.postcode(postcode);

		registerpage.country(countryname);

		registerpage.explicitWaiting();

		registerpage.Region(Regionname);

		registerpage.password(password);

		registerpage.confirmpassword(cnfrmpwd);

		registerpage.checkbox();

		registerpage.Continue();

	}

	@Then("I get Invalid credentials")
	public void i_get_Invalid_credentials() {

		HomePage homepage = new HomePage(driver);
		String actualTitle = homepage.getInvalidRegisterTitle();
		Assert.assertEquals("Warning: E-Mail Address is already registered!", actualTitle);
		System.out.println(actualTitle);
		driver.quit();

	}

	@When("I click on the product Software")
	public void i_click_on_the_product_Software() {

		HomePage homepage = new HomePage(driver);
		homepage.clickOnSoftware();
	}

	@Then("I should get the text")
	public void i_should_get_the_text() {

		HomePage homepage = new HomePage(driver);
		String actualTitle = homepage.getSoftwareTitle();
		Assert.assertEquals("There are no products to list in this category.", actualTitle);
		System.out.println(actualTitle);
		driver.quit();
	}

	@When("I click on the product MP3 Players")
	public void i_click_on_the_product_MP3_Players() {

		HomePage homepage = new HomePage(driver);

		homepage.clickOnMP3Players();

		homepage.clickOnAllMP3();

		homepage.clickOnlaptopWishList();
	}

	@Then("I should get all MP3 Players")
	public void i_should_get_all_MP3_Players() {

		HomePage homepage = new HomePage(driver);
		String actualTitle = homepage.getAllMP3Title();
		Assert.assertEquals("MP3 Players", actualTitle);
		System.out.println(actualTitle);
		driver.quit();
	}

	@When("I enter {string} and {string} and click on WishList")
	public void i_enter_and_and_click_on_WishList(String username, String password) {

		HomePage homepage = new HomePage(driver);

		homepage.clickOnMyAccount();

		homepage.clickOnLogin();
		
		LoginPage loginpage=new LoginPage(driver);

		loginpage.enteremail(username);

		loginpage.enterpassword(password);

		loginpage.clickOnLogin();

		homepage.clickOnMP3Players();

		homepage.clickOnAllMP3();

		homepage.clickOnipodTouchWishList();

		homepage.CheckInWishList();

	}

	@Then("I should get My WishList")
	public void i_should_get_My_WishList() {
		HomePage homepage = new HomePage(driver);
		String actualTitle = homepage.getWishListTitle();
		Assert.assertEquals("My Wish List", actualTitle);
		System.out.println(actualTitle);
		driver.quit();
	}

	@When("I enter {string} and {string} and click on logout")
	public void i_enter_and_and_click_on_logout(String username, String password) {

		HomePage homepage = new HomePage(driver);
		
		homepage.clickOnMyAccount();

		homepage.clickOnLogin();

		LoginPage loginpage=new LoginPage(driver);
		
		loginpage.enteremail(username);

		loginpage.enterpassword(password);

		loginpage.clickOnLogin();

		homepage.clickOnMyAccount();

		DashBoardPage dashboardpage = new DashBoardPage(driver);
		dashboardpage.clickOnLogout();
	}

	@Then("I should logout from the page")
	public void i_should_logout_from_the_page() {

		driver.quit();
	}
}
