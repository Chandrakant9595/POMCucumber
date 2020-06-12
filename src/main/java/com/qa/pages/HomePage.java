package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class HomePage extends TestBase{

	//checking link
	@FindBy(xpath = "//a[text()='Checking']")
	WebElement checking_link;
	
	//New checking link
	@FindBy(xpath = "//a[text()='New Checking']")
	WebElement new_Checking_Link;
	
	public HomePage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	public String validateTheHomePageURL() {
		return driver.getCurrentUrl();
	}
	
}
