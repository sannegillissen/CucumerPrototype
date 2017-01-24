package com.cucumber.MavenCucumberPrototype;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"html:target/test-reports/html", "junit:target/test-reports/junit-report.xml"}, features = "src/test/resource")

public class RunnerTest {
	
}
