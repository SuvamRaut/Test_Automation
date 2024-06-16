package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class FirstTestclass {
	
	@Given("Precondition is given")
	public void precondition_is_given() {
	    System.out.println("Precondition is given");
	}

	@When("Something is done")
	public void something_is_done() {
	    System.out.println("Something is done");
	}

	@Then("Something is expected")
	public void something_is_expected() {
		System.out.println("Something is expected");
	}

	@Given("Another precondition is given")
	public void another_precondition_is_given() {
		System.out.println("Another precondition is given");
	    
	}

	@When("another Something is done again")
	public void something_is_done_again() {
		System.out.println("Something is done again");
	}

	@Then(" another Something is expected again")
	public void something_is_expected_again() {
		System.out.println("Something is expected again");
	}

}
