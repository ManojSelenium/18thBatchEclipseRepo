package com.steps;

import org.openqa.selenium.WebDriver;

import com.pages.LandingPage;
import com.pages.SigninPage;
import com.util.TestBase;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class LandingPageStep {


	TestBase base;
	LandingPage landingPage;
	
	Steps steps;
	
	public LandingPageStep(Steps steps) {
		this.steps=steps;
	}
	
	
	@Given("^user launch the browser$")
	public void userLaunchBrowser() {

		steps.tesBase=new TestBase();
		 steps.tesBase.initilizeBrowser();
	}

	@When("^user enter url$")
	public void enterURL() {
		 steps.landingPage=steps.tesBase.enterURL();
	}
	
	@And("^user click on signin link$")
	public void clickSignin() {

		//LandingPage landingPage=new LandingPage(driver);
		steps.signinPage=steps.landingPage.clickSignin();
		
	}
}
