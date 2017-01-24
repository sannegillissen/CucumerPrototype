package com.cucumber.MavenCucumberPrototype;

import java.io.File;
import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

@RunWith(Suite.class)
@SuiteClasses(StepDefinitions.class)

public class ChromeService {
	
	public static String URL;
	
	static {
		URL ="C:\\Users\\s.gillissen\\webdrivers\\chromedriver.exe";
	}
	  private static ChromeDriverService service = new ChromeDriverService.Builder()
			  .usingDriverExecutable(new File(URL))
			  .usingAnyFreePort()
			  .build();
	  public WebDriver driver = new RemoteWebDriver(service.getUrl(),
	        DesiredCapabilities.chrome());

	  @BeforeClass
	  public static void createAndStartService() throws IOException {
	
	    service.start();
	  }

	  @AfterClass
	  public static void createAndStopService() {
	    service.stop();
	  }

	  @Before
	  public void createDriver() {
	    driver = new RemoteWebDriver(service.getUrl(),
	        DesiredCapabilities.chrome());
	  }

	  @After
	  public void quitDriver() {
	    driver.quit();
	  }

}
