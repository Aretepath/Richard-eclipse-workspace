package stepDefinitions;

import org.junit.runner.RunWith;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefinitions {
	
	@Given("User is on landing page")
	public void user_is_on_landing_page() {
	    System.out.println("User is on landing page");
	   
	}
	@When("User login application with username and password")
	public void user_login_application_with_username_and_password() {
		 System.out.println("User login application with username and passwor");
	    
	}
	@Then("Home page is populated")
	public void home_page_is_populated() {
		 System.out.println("Home page is populated");
	  
	}
	@Then("Cards are displayed")
	public void cards_are_displayed() {
		 System.out.println("Cards are displayed");
	   
	}

   

	
}
