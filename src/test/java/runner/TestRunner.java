package runner;

import io.cucumber.core.filter.Options;
import io.cucumber.core.runner.Runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/main/resources" , glue = "stepsdef" , plugin = {"pretty",  "html:target/reports/reports.html" , "json:target/reports/reports.json"})
public class TestRunner extends AbstractTestNGCucumberTests {
}
