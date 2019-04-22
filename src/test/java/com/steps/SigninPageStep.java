package com.steps;

import com.pages.SigninPage;

import cucumber.api.java.en.And;

public class SigninPageStep {

	SigninPage page;
	Steps steps;
	
	public SigninPageStep(Steps steps) {
		this.steps=steps;
	}
	
	@And("^user enter email address as \"([^\"]*)\"$")
	public void enterEmailAddrss(String emailAddress) {
		 
		steps.signinPage.enterEmailAddress(emailAddress);
	}
	
	@And("^user click on create account button$")
	public void clickCreateAccountButton() {
		steps.createAccountPage=steps.signinPage.clickCreateAccuntButton();
		
	}
}
