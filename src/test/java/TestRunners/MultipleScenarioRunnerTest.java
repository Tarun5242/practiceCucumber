package TestRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features = {"src/test/java/FeaturesPAck/MultipleScenario.feature"},
		glue = {"StepDefinations"},   
		//tags="@Smoke",    // it will run only somke tag scenario
		//tags="@Regression or @Smoke", // it will run every Scenario which starts with any of these tag
        // tags="@Regression and @Smoke", // Scenario with both these tage will run
		//tags="not @Product",//this particular scenario will excluded
		plugin= {"pretty"},
		monochrome = true
)
public class MultipleScenarioRunnerTest {

}
