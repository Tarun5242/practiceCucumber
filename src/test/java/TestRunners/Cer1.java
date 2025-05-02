package TestRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions
(
		features = {"src/test/java/FeatureBackGround/Certificate.feature"},
		glue = {"StepDefinations"}, 
	    //dryRun = true,
		monochrome = true,
		plugin= {"pretty"}	,
		tags="@Youtube"

		)
public class Cer1 {

}
