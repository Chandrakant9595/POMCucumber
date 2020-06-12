package com.qa.stepdefination;

import java.io.IOException;

import org.testng.Assert;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;

public class LoginPageDefination extends TestBase{

	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageDefination() throws IOException {
		super();
	}

	@Before
	public void setUp() throws IOException {
		TestBase.initalization();
		loginPage = new LoginPage();
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	

	@Then("^Validate the URL$")
	public void validate_the_URL() {
		String url = loginPage.validateTheURL();
		Assert.assertEquals("http://dbankdemo.com/login", url);
	}
	
	@Then("^Validate the page title$")
	public void validate_the_page_title() {
		String title = loginPage.validateThePageTitle();
		Assert.assertEquals("Digital Bank", title);
	}
	
	@Then("^User logs in to the application$")
	public void user_logs_in_to_the_application() throws IOException {
	    homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}	
}
