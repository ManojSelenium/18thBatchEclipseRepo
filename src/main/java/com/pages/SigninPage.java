package com.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.objrepo.SigninPageProperties;
import com.util.WebDriverUtils;

public class SigninPage extends WebDriverUtils implements SigninPageProperties{

	WebDriver driver;
	
	public SigninPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	public void enterEmailAddress(String emailAddrees) {
		
		
		enterText(EMAILADDRESS_LOCATOR, emailAddrees);
	
	}
	
	public CreateAccountPage clickCreateAccuntButton() {
		click(CREATEACCOUNT_LOCATOR);
		return new CreateAccountPage(driver);
	}
}
