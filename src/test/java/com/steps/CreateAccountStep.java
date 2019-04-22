package com.steps;

import com.pages.CreateAccountPage;

import cucumber.api.java.en.And;

public class CreateAccountStep {

	Steps steps;
	
	public CreateAccountStep(Steps steps) {
	this.steps=steps;
	}
	
	@And("^user enter firstname as \"([^\"]*)\"$")
	public void enterFirstName(String firstName) {
		System.out.println("First Name Entered");
		
		 
		steps.createAccountPage.enterFirstName(firstName);
	}
	
	@And("^user enter lastname as \"([^\"]*)\"$")
	public void enterLastName(String lastName) {
		
		steps.createAccountPage.enterLastName(lastName);
	}
}
