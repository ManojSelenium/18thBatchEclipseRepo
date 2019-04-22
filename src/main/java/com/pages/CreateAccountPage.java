package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.objrepo.CreateAccountPageProperties;
import com.util.WebDriverUtils;

public class CreateAccountPage extends WebDriverUtils implements CreateAccountPageProperties{

	
	WebDriver driver;
	
	public CreateAccountPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	public void enterFirstName(String firstName) {
		
		enterText(FIRSTNAME_LOCATOR, firstName);
		
	}
	
public void enterLastName(String lastName) {
		
		enterText(LASTNAME_LOCATOR, lastName);
		
	}
}
