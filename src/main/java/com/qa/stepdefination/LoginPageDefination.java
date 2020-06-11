package com.qa.stepdefination;

import java.io.IOException;

import org.testng.Assert;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginPageDefination extends TestBase{

	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageDefination() throws IOException {
		super();
	}

	@Given("^User opened the browser$")
	public void user_opened_the_browser() throws IOException {
		TestBase.initalization();
		loginPage = new LoginPage();
	}

	@Then("^User is on login page$")
	public void user_is_on_login_page() {
	    String currentURL = loginPage.validateTheURL();
	    Assert.assertEquals("http://dbankdemo.com/login", currentURL);
	}

	@Then("^User logs in to the application$")
	public void user_logs_in_to_the_application() throws IOException {
	    homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}	
}
