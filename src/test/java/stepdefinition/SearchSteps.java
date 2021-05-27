package stepdefinition;

import org.junit.Assert;

import AmazonImplementation.Product;
import AmazonImplementation.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps {
	
// creating  the implementations	
	Product product;
	Search  search;
	

@Given("I have a  search field on Amazon Page")
public void i_have_a_search_field_on_amazon_page() {
	System.out.println("Step1: I am on the search page");
    // to  achieve  test driven development   approach we shall do the following 
}

@When("I search  for a product with  name {string} and price {int}")
public void i_search_for_a_product_with_name_and_price(String productName, Integer price) {
    
	System.out.println("Step 2: Search  the product with name:"+productName + "price :"+price);
	// to  achieve  test driven development   approach we shall do the following 
	
  product = new Product(productName, price); // same  product name  from the feature  file and passing over here
	
	
}

@Then("Product with name  {string} should  be  displayed")
public void product_with_name_should_be_displayed(String productName) {
	System.out.println("Step 3 : Product "+ productName + "is displayed");
     search = new Search();	
 //   search.displayProduct(product);
     String name = search.displayProduct(product);
     System.out.println(" Search product is :" + name);
     // using  assertion
     
   Assert.assertEquals(product.getProductName(), name);
     
	
    
}
/*
@Then("Order id is {int} and username is  {string}")
public void order_id_is_and_username_is(Integer int1, String string) {
    
} */

}
