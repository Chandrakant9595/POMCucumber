package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

import io.qameta.allure.Step;

public class NewCheckingPage extends TestBase{

	@FindBy(xpath = "//input[@id='Interest Checking']")
	WebElement accountType;
	
	@FindBy(xpath = "//input[@id='Joint']")
	WebElement accountOwnership;
	
	@FindBy(xpath = "//input[@id='name']")
	WebElement nameTxt;
	
	@FindBy(xpath = "//input[@id='openingBalance']")
	WebElement depositAmountTxt;
	
	@FindBy(xpath = "//button[@type='submit' and @class='btn btn-primary btn-sm']")
	WebElement submitButton;
	
	public NewCheckingPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	@Step("Test step for Validate the new checking page URL")
	public String validateThePageURL() {
		return driver.getCurrentUrl();
	}
	
	@Step("Test step for Validate the new checking page title")
	public String validateThePageTitle() {
		return driver.getTitle();
	}
	
	@Step("Test step for Validate the add new Checking account")
	public ViewCheckingPage addNewCheckingAccount(String ac, String da) throws IOException {
		accountType.click();
		accountOwnership.click();
		nameTxt.sendKeys(ac);
		depositAmountTxt.sendKeys(da);
		submitButton.click();
		return new ViewCheckingPage();
	}
}