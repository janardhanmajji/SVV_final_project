package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/OpenBrowser.feature", glue= {"StepDefinitions"}, monochrome = true,
plugin = {"pretty", "json:target/cucumber-reports/CucumberTestReport.json", "html:target/cucumber-reports/CucumberTestReport.html"}
		)
public class RunnerClass {
	
}
