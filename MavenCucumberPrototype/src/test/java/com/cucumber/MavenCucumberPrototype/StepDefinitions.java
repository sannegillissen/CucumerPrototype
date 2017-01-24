package com.cucumber.MavenCucumberPrototype;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions extends ChromeWebDriver {

WebDriver driver = getDriver();
	
	@After
	public void testShutdownChrome () {
		driver = closeDriver();
	}
	
	@When("^I navigate to ([^\"]*)$")
	public void shouldNavigateToGoogle(String link) throws Throwable {
		driver.navigate().to(link);
	}
	
	@Then("^the title should be ([^\"]*)$")
	public void the_title_should_be(String title) throws Throwable {
		Assert.assertTrue("Title not OK", driver.getTitle().contains(title));
	}

/*	@Then("^The title should be \"([^\"]*)\"$")
	public void the_title_should_be(String title) throws Throwable {
		Assert.assertTrue("Title not Google", driver.getTitle().contains(title));
	}	
*/

}
