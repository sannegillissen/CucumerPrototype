package com.cucumber.MavenCucumberPrototype;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeWebDriver {

	protected static WebDriver driver;
	protected WebDriver getDriver() {
		
			if (driver == null) {
					System.setProperty("webdriver.chrome.driver","C:\\Users\\s.gillissen\\webdrivers\\chromedriver.exe");	
					driver = new ChromeDriver();
			}
			return driver;	
			
	}

	protected WebDriver closeDriver() {
		  if (driver != null) { //instanciated driver for the first time
			  		driver.quit();
		  }
		  return driver=null;
	}


}
