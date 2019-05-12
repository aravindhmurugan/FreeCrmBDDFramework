package StepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TaggedHooksStepDefinition {
	
	@Before(order=0)
	public void setUp() {
		System.out.println("Launch FF");
		System.out.println("Enter the url for free crm app");
	}
	
	@After(order=0)
	public void tearDown() {
		System.out.println("Close the browser");
	}
	
	@Before(order=1)
	public void setUp4() {
		System.out.println("second setup");
	}
	
	@After(order=1)
	public void tearDown5() {
		System.out.println("second teardown");
	}
	
	@Before("@First")
	public void setUp1() {
		System.out.println("Only before first scenario");
	}
	
	@After("@First")
	public void tearDown1() {
		System.out.println("Only after first scenario");
	}
	
	@Before("@Second")
	public void setUp2() {
		System.out.println("Only before second scenario");
	}
	
	@After("@Second")
	public void tearDown2() {
		System.out.println("Only after second scenario");
	}
	
	@Before("@Third")
	public void setUp3() {
		System.out.println("Only before third scenario");
	}
	
	@After("@Third")
	public void tearDown3() {
		System.out.println("Only after third scenario");
	}
	
	@Given("^this is the first step$")
	public void this_is_the_first_step() throws Throwable {
		System.out.println("1st step");
	}

	@When("^this is the second step$")
	public void this_is_the_second_step() throws Throwable {
		System.out.println("2nd step");
	}

	@Then("^this is the third step$")
	public void this_is_the_third_step() throws Throwable {
		System.out.println("3rd step");
	}

}
