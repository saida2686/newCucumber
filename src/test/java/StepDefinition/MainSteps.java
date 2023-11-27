package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainSteps {
    @Given("^User is on NetBanking landing page$")
    public void user_is_on_net_banking_landing_page(){
        System.out.println("user landed on netbanking page");

    }
    @When("^User login into application$")
    public void user_login_into_application(){
        System.out.println("user login into applictaion");


    }
    @Then("^ Home Page is displayed$")
    public void home_page_is_displayed(){
        System.out.println("home page dispayed");

    }
    @Then("^Cards are displyed$")
    public void cards_are_displayed(){
        System.out.println("cards are dislayed ");
    }
}
