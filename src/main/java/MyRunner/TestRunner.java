package MyRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "E:\\Selenium\\Workspace\\FreeCrmBDDFramework\\src\\main\\java\\Features\\taggedhooks.feature",
    glue= {"StepDefinitions"},
    plugin = {"pretty", "html:test-output", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},
    monochrome = true,
    strict = true,
    dryRun = false
 //   tags = {"~@Smoketest", "~@Regressiontest", "~@End2End"}
    	
		)

public class TestRunner{

}



//tags = {"@Smoketest, @Regressiontest"}  -- OR -- execute all tests tagges as @Smoketest OR @Regressiontest
//tags = {"@Smoketest", "@Regressiontest"} -- AND -- execute all tests tagges as @Smoketest AND @Regressiontest