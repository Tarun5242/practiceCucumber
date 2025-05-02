package TestRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features = {"src/test/java/FeaturesPAck/Demo3.feature"},
		glue = {"StepDefinations"}, 
	    //dryRun = true,
		monochrome = true,
		plugin= {
		"pretty","html:target/HtmlReports/index.html",
		//"json:target/JSONReports/report3.json",
		//"junit:target/JUnitReports/report3.xml"
		}
		)
public class demo3Runners {

}
//Monochrome=makes the console output for Cucumber tests more readable: 
//dryRun= verifies the compilation of Step Definition and Feature files
//Pretty Plugin: Prints feature files in a human-readable format 
/*HTML Plugin: Generates HTML reports with the results of Cucumber tests 
JUnit Plugin: Generates JUnit XML reports that can be integrated with CI/CD tools

*/