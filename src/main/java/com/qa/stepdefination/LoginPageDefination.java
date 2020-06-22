package com.qa.stepdefination;

import java.io.IOException;

import org.testng.Assert;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.pages.NewCheckingPage;
import com.qa.pages.NewSavingsPage;
import com.qa.pages.ViewCheckingPage;
import com.qa.pages.ViewSavingsPage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class LoginPageDefination extends TestBase{

	LoginPage loginPage;
	HomePage homePage;
	NewCheckingPage newCheckingPage;
	ViewCheckingPage viewCheckingPage;
	NewSavingsPage newSavingsPage;
	ViewSavingsPage viewSavingsPage;
	
	public LoginPageDefination() throws IOException {
		super();
	}

	@Severity(SeverityLevel.BLOCKER)
	@Description("Test case pre-conditions")
	@Before
	public void setUp() throws IOException {
		initalization();
		loginPage = new LoginPage();
	}
	
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test case post-conditions")
	@After
	public void tearDown() {
		driver.quit();
	}	

	@Severity(SeverityLevel.NORMAL)
	@Description("Test case for validate the login page URL")
	@Then("^Validate the URL$")
	public void validate_the_URL() {
		String url = loginPage.validateTheURL();
		Assert.assertEquals("http://dbankdemo.com/login", url);
	}
	
	@Severity(SeverityLevel.NORMAL)
	@Description("Test case for validate the login page Title")
	@Then("^Validate the page title$")
	public void validate_the_page_title() {
		String title = loginPage.validateThePageTitle();
		Assert.assertEquals("Digital Bank", title);
	}
	
	@Severity(SeverityLevel.NORMAL)
	@Description("Test case for validate the login login functionality")
	@Then("^User logs in to the application$")
	public void user_logs_in_to_the_application() throws IOException {
	    homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}	


	
	
	@Severity(SeverityLevel.NORMAL)
	@Description("Test case for validate the Checking page URL")
	@Then("^Validate the New Checking page URL$")
	public void validate_the_New_Checking_page_URL() throws IOException {
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		newCheckingPage = homePage.clickOnNewCheckingLink();
		String url = newCheckingPage.validateThePageURL();
		Assert.assertEquals(url, "http://dbankdemo.com/account/checking-add", "Home page URL is not correct");
	}

	@Severity(SeverityLevel.NORMAL)
	@Description("Test case for validate the Checking page Title")
	@Then("^Validate the New Checking page title$")
	public void validate_the_New_Checking_page_title() throws IOException {
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		newCheckingPage = homePage.clickOnNewCheckingLink();
		String title = newCheckingPage.validateThePageTitle();
		Assert.assertEquals(title, "Digital Bank", "Title is not correct");
	}

	@Severity(SeverityLevel.NORMAL)
	@Description("Test case for clicking on New Checking link")
	@When("^Click on New checking link$")
	public void click_on_New_checking_link() throws IOException {
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		newCheckingPage = homePage.clickOnNewCheckingLink();
	}

	@Severity(SeverityLevel.NORMAL)
	@Description("Test case for validation of add New Checking accounts ")
	@Then("^Add \"([^\"]*)\" and \"([^\"]*)\" click on Save button$")
	public void add_and_click_on_Save_button(String accountName, String depositAmount) throws IOException {
	    viewCheckingPage = newCheckingPage.addNewCheckingAccount(accountName, depositAmount);
	}



	
	@Severity(SeverityLevel.NORMAL)
	@Description("Test case for validate the Savings page URL")
	@Then("^Validate the New Savings page URL$")
	public void validate_the_New_Savings_page_URL() throws IOException {
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		newSavingsPage = homePage.clickOnNewSavingsLink();
		String url = newSavingsPage.validateSavingPageURL();
		Assert.assertEquals(url, "http://dbankdemo.com/account/savings-add", "Savings pageURL is not correct");
	}

	@Severity(SeverityLevel.NORMAL)
	@Description("Test case for validate the Savings page Title")
	@Then("^Validate the New Savings page title$")
	public void validate_the_New_Savings_page_title() throws IOException {
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		newSavingsPage = homePage.clickOnNewSavingsLink();
		String title = newSavingsPage.validateSavingPageTitle();
		Assert.assertEquals(title, "Digital Bank", "savings page title is incorrect");
	}

	@Severity(SeverityLevel.NORMAL)
	@Description("Test case for clicking on New Savings link")
	@When("^Click on New savings link$")
	public void click_on_New_savings_link() throws IOException {
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		newSavingsPage = homePage.clickOnNewSavingsLink();
	}

	@Severity(SeverityLevel.NORMAL)
	@Description("Test case for validation of add New Savings accounts ")
	@Then("^Add \"([^\"]*)\" and \"([^\"]*)\" and click on Save button$")
	public void add_and_and_click_on_Save_button(String accountName, String initialDeposit) throws IOException {
	    viewSavingsPage = newSavingsPage.addSavingsAccount(accountName, initialDeposit);
	}
}
