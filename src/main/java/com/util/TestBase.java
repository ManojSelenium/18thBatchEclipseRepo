package com.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pages.LandingPage;

public class TestBase implements Setup{

	WebDriver driver;
	
	public WebDriver initilizeBrowser() {
		System.setProperty(CHROME_KEY, CHROME_PATH);
		 driver=new ChromeDriver();
		return driver;
	}
	
	public LandingPage enterURL() {
		driver.get(AUTOMATION_URL);
		return new LandingPage(driver);
	}
}
