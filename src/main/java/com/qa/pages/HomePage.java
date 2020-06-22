package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

import io.qameta.allure.Step;

public class HomePage extends TestBase{

	//checking link
	@FindBy(xpath = "//a[text()='Checking']")
	WebElement checking_link;
	
	//New checking link
	@FindBy(xpath = "//a[text()='New Checking']")
	WebElement new_Checking_Link;
	
	//Savings link
	@FindBy(xpath = "//a[text()='Savings']")
	WebElement saving_link;
		
	//New Savings link
	@FindBy(xpath = "//a[text()='New Savings']")
	WebElement new_Savings_Link;
	
	public HomePage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	// click on new checking link
	@Step("Test step for click on new checking link")
	public NewCheckingPage clickOnNewCheckingLink() throws IOException {
		checking_link.click();
		new_Checking_Link.click();
		return new NewCheckingPage();
	}
	
	// click on new checking link
	@Step("Test step for click on new saving link")
	public NewSavingsPage clickOnNewSavingsLink() throws IOException {
		saving_link.click();
		new_Savings_Link.click();
		return new NewSavingsPage();
	}
}
