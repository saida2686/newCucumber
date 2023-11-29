package StepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class userRegistrationSteps {
@Given("User is on registration page")
    public void user_is_on_registartion_page(){
    System.out.println("user navigates to registration page");

}
@When("User eneters following user details")
    public void user_enters_following_user_details(DataTable dataTable) {
    List<List<String>> userlist = dataTable.asLists(String.class);
    for (List<String> e : userlist) {
        System.out.println(e);
    }

}
   @Then("User registration should be sucessful")
           public void user_registration_should_be_sucessful(){

    System.out.println("registration was sucessful");
}



}
