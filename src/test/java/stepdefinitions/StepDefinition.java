package stepdefinitions;

import cucumber.api.java.en.Given;

public class StepDefinition {

	@Given("^I'm in first feature file$")
	public void i_m_in_first_feature_file() throws Throwable {

		System.out.println("Hello first feature file");

	}

	@Given("^I'm in second feature file$")
	public void i_m_in_second_feature_file() throws Throwable {

		System.out.println("Hello second feature file");
	}
}
