package TestRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features = {"src/test/java/FeaturesPAck"},
		glue = {"StepDefinations"}, 
	    //dryRun = true,
		monochrome = true,
		plugin= {"pretty"}		
		)

public class demoRunner {



}
