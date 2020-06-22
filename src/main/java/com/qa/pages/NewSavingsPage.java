package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

import io.qameta.allure.Step;

public class NewSavingsPage extends TestBase{

	@FindBy(xpath = "//input[@id='Savings']")
	WebElement checkingAccountType;
	
	@FindBy(xpath = "//input[@id='Joint']")
	WebElement accountOwnership;
	
	@FindBy(xpath = "//input[@id='name']")
	WebElement nameTxt;
	
	@FindBy(xpath = "//input[@id='openingBalance']")
	WebElement depositAmountTxt;
	
	@FindBy(xpath = "//button[@type='submit' and @class='btn btn-primary btn-sm']")
	WebElement submitButton;
	
	public NewSavingsPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	@Step("Test step for Validate the new saving page URL")
	public String validateSavingPageURL() {
		return driver.getCurrentUrl();
	}
	
	@Step("Test step for Validate the new saving page title")
	public String validateSavingPageTitle() {
		return driver.getTitle();
	}
	
	@Step("Test step for Validate the add new saving account")
	public ViewSavingsPage addSavingsAccount(String ac, String id) throws IOException {
		checkingAccountType.click();
		accountOwnership.click();
		nameTxt.sendKeys(ac);
		depositAmountTxt.sendKeys(id);
		submitButton.click();
		return new ViewSavingsPage();
	}
}