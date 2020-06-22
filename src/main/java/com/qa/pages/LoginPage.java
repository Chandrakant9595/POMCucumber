package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

import io.qameta.allure.Step;

public class LoginPage extends TestBase{
	
	//define all web elements
	//username
	@FindBy(xpath = "//input[@name='username']")
	WebElement userName;
	
	//password
	@FindBy(xpath = "//input[@name='password']")
	WebElement password;
	
	//sign in button
	@FindBy(xpath = "//button[@id='submit']")
	WebElement signButton;
	
	//initialized the all web-elements in coustructor
	public LoginPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	//define actions
	@Step("Test step for Login functionality")
	public HomePage login(String un, String pass) throws IOException {
		userName.clear();
		userName.sendKeys(un);
		
		password.clear();
		password.sendKeys(pass);
		
		signButton.click();
		
		return new HomePage();
	}

	@Step("Test step for validate the URL of login page")
	public String validateTheURL() {
		return driver.getCurrentUrl();
	}
	
	@Step("Test step for validate the Title of login page")
	public String validateThePageTitle() {
		return driver.getTitle();
	}
}
