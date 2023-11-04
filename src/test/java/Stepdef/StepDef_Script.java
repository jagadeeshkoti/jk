package Stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef_Script {
	@Given("enter the url")
	public void enterTheUrl() {
	  
	   System.out.println("URL");
	}
	@When("enter the valid un and pwd")
	public void enterTheValidUnAndPwd() {
	   System.out.println("UN and PWD");
	}
	@Then("click on login button")
	public void clickOnLoginButton() {
	  System.out.println("Button");
	}
	@Then("home page should be displayed")
	public void homePageShouldBeDisplayed() {
	   System.out.println("Ok");
	}
}
