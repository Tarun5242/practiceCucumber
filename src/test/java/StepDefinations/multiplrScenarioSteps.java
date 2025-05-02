package StepDefinations;

import io.cucumber.java.en.*;

public class multiplrScenarioSteps {
	
	
	
	@Given("select car type {string} from ober application")
	public void select_car_type_from_ober_application(String cartype) {
	    System.out.println(cartype);
	}

	@When("pick uppoint {string} and drop point {string}")
	public void pick_uppoint_and_drop_point(String pickpoint, String droppoint) {
	    System.out.println(pickpoint +" "+droppoint);
	}

	@Then("driver starts the jounary")
	public void driver_starts_the_jounary() {
	   System.out.println("give me otp");
	}

	@And("Dricer ened the jounary")
	public void dricer_ened_the_jounary() {
	    System.out.println("give me rating bhai");
	}

	@Then("total fare is {int}")
	public void total_fare_is(Integer fare) {
	    System.out.println("you total fare is "+fare);
	}
}
