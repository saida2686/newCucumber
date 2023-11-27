package StepDefinitions;

import AmozonImplementation.Product;
import AmozonImplementation.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class steps {
    Product product;
    Search search;
    @Given("I have a search field on Amazon Page")
    public void i_have_a_search_field_on_amazon_page() {
        System.out.println("this is step1 ");

    }

    @When("I search for a product with name {string} and price {int}")
    public void i_search_for_a_product_with_name_and_price(String productName, Integer price) {
        System.out.println("this is step2");
        product = new Product(productName, price);
    }

    @Then("Product with name {string} should be displayed")
    public void product_with_name_should_be_displayed(String string) {
        System.out.println("this is step 3");
        search=new Search();
       String name=search.displayProduct(product);
        System.out.println("searched product is:"+ name);

    }
}