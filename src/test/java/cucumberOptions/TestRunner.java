package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (
		
		 features ="src\\test\\java\\featureLayer"
		,glue = "stepDefinations"
		,monochrome = true
		//,tags = "@DataProviderOutline"
		,plugin = {"pretty","html:target/cucumber.html","json:target/cucumberjson.json"}
		//,dryRun = true
		)

public class TestRunner extends AbstractTestNGCucumberTests
{
	

}